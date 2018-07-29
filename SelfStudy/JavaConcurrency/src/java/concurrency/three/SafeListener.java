package java.concurrency.three;

import java.awt.*;
import java.sql.Connection;
import java.util.EventListener;

public class SafeListener {
    private final EventListener listener;

    private SafeListener() {
        listener = new EventListener() {
            public void  onEvent(Event e) {
                doSomething(e);
            }
        };
    }

    public static SafeListener newInstance(EventSource source) {
        SafeListener safe = new SafeListener();
        source.registerListener(safe.listener);
        return safe;
    }

    public int loadTheArk(Collection<Animal> candidates) {
        SortedSet<Animal> animals;
        int numPairs = 0;
        Animal candidate = null;

        // animal被封闭
        animals = new TreeSet<Animal>(new SpeciesGenderComarartor());
        animals.addAll(candidates);
        for (Animal a : animals) {
            if (candidate == null || !candidate.isPotentialMate(a)) {
                candidate = a;
            } else {
                ark.load(new AnimalPair(candidate, a));
                ++numPairs;
                candidate = null;
            }
        }
    }

    private static ThreadLocal<Connection> connectionHoder = new ThreadLocal<Connection>() {
        public Connection initialValue() {
            return DriveManager.getConnection(DB_URL);
        }
    }

    public static Connection getConnection() {
        return connectionHolder.get();
    }
}

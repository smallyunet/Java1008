package com.ychs.test;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

public class ChemSearch {
    public static void main(String[] args) {
        Mongo connection = new Mongo();
        DB db = connection.getDB("search");
        DBCollection chemicals = db.getCollection("chemicals");

        BasicDBObject doc = new BasicDBObject();
        doc.put("x", 1);
        doc.put("y", "foo");

        BasicDBObject z = new BasicDBObject();
        doc.put("z", z);

        System.out.println(connection);
        System.out.println(db);
        System.out.println(chemicals);
        System.out.println(doc);
    }
}

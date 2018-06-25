
## oop_simplestclass


```python
class Person:
    pass

p = Person()
print(p)
```

    <__main__.Person object at 0x0600A950>
    

## oop_method


```python
class Person:
    def say_hi(self):
        print('Hello, how are you?')

p = Person()
p.say_hi()
```

    Hello, how are you?
    

## oop_init


```python
class Person:
    def __init__(self, name):
        self.name = name
        
    def say_hi(self):
        print('Hello, my name is', self.name)
        
p = Person('Swaroop')
p.say_hi()
```

    Hello, my name is Swaroop
    

## oop_objvar


```python
class Robot:
    """表示有一个带有名字的机器人"""
    population = 0;
    
    def __init__(self, name):
        self.name = name
        print("(Initializing {})".format(self.name))
        
        Robot.population += 1
        
    def die(self):
        """我挂了"""
        print("{} is being destroyed!".format(self.name))
        
        Robot.population -= 1
        
        if Robot.population ==0:
            print("{} was the last one".format(self.name))
        else:
            print("There are still {:d} robots working".format(Robot.population))
    
    def say_hi(self):
        print("{}".format(self.name))
    
    @classmethod
    def how_many(cls):
        """shulaing"""
        print("We have {:d} robots".format(cls.population))
        
droid1 = Robot('R2-D2')
droid1.say_hi()
Robot.how_many()

droid2 = Robot('C-3PO')
droid2.say_hi()
Robot.how_many()

print("\nRobots can do some work here.\n")

print("Robots have finished their work.")
droid1.die()
droid2.die()

Robot.how_many()
```

    (Initializing R2-D2)
    R2-D2
    We have 1 robots
    (Initializing C-3PO)
    C-3PO
    We have 2 robots
    
    Robots can do some work here.
    
    Robots have finished their work.
    R2-D2 is being destroyed!
    There are still 1 robots working
    C-3PO is being destroyed!
    C-3PO was the last one
    We have 0 robots
    

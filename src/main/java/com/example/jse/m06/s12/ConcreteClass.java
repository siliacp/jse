/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s12;

// The type Concrete must implement the inherited abstract method
//public class ConcreteClass extends AbstractClass {
//}

/**
 * A class extending an abstract base class. Since it overrides the base
 * abstract method, the class could be concrete.
 */
public class ConcreteClass extends AbstractClass {
    /** a concrete method overriding an abstract method */
    @Override
    public void anAbstractMethod() {
        System.out.println("not abstract anymore");
    }
}

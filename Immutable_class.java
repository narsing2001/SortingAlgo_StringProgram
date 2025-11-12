/*
Q1.Immutable Class Rules
=>
1.final class → cannot be subclassed.
2.private final fields → cannot change after initialization.
3.Initialize all fields via constructor.
4.No setters → only getters.
5.For mutable fields, return defensive copies.
6.Methods should not modify state.

2.equals() and hashCode()
=>
-Base them on the values of fields.
-Safe for hash-based collections because immutable objects never change, so hashCode is stable.

Q3.Garbage Collection (GC) Benefits
=>
Safe to share across threads → less object churn.
Can cache/reuse objects → reduces GC pressure.
Fewer accidental references → less memory leak risk.

*/
import java.util.Objects;
final class Employee {
    private final int id;
    private final String name;

    // Two-parameter constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // One-parameter constructor
    public Employee(String name) {
        this.id = 0; // default id
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Returns a new Employee object with updated name
    public Employee updateName(String newName) {
        return new Employee(this.id, newName);
    }
	
	      @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class Immutable_class {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Narsing");

        System.out.println("=== Before modification ===");
        System.out.println("Employee Object HashCode: " + System.identityHashCode(e1));
        System.out.println("ID: " + e1.getId());
        System.out.println("Name: " + e1.getName());
        System.out.println("Name Field HashCode: " + e1.getName().hashCode());

        // Createed new object with updated name when assign variable to itself
         //e1=e1.updateName("Patil");
		 
		 //create new object
		 //Employee a1=e1.updateName("Patil");
         
       //object with updated name we are  not store in same object even though the same reference , it  eligible for the garbage collection and original and e1 will point to last refererence value
         e1.updateName("Patil");

        System.out.println("\n=== After modification but not store in any new object/object refernc ===");
        System.out.println("Employee Object HashCode: " + System.identityHashCode(e1));
        System.out.println("ID: " + e1.getId());
        System.out.println("Name: " + e1.getName());
        System.out.println("Name Field HashCode: " + e1.getName().hashCode());
		System.out.println("\n=== After modification but store in any new object/object refernc ===");
		
		  // Modify the same object but store in the refernce 
       Employee a1=e1.updateName("Patil");
	   System.out.println("value with the modified refernce:-------------------------")
	      System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
		System.out.println("new refernce hashcode of the content"+a1.hashCode());             // Uses overridden hashCode()
        System.out.println("hashcode of the a1 refernces:"+System.identityHashCode(a1)); // JVM’s default hashCode for reference

		
		System.out.println("value with the original refernce:---------------------");
        System.out.println("ID: " + e1.getId());
        System.out.println("Name: " + e1.getName());
	   
	   
    }
}
/*
1️.Current situation (immutable class)

final class Employee {
    private final int id;
    private final String name;

    public Employee(int id, String name) { ... }

    public Employee updateName(String newName) {
        return new Employee(this.id, newName); // always returns new object
    }
}


Employee is immutable.
--------------------------------
-Fields id and name are final, so they cannot be changed once set.
-updateName() cannot modify the current object, it must create a new object.

2️.What happens when you do not assign the returned object?
-----------------------------------------------------------------
-Employee e1 = new Employee(101, "Narsing");
-e1.updateName("Patil"); // returned object ignored
-A new Employee object is created inside updateName.
-But you never store it, so it’s immediately eligible for garbage collection. e1 still points to the original object.
---
Output will show the original name "Narsing" because the object was never replaced.

3️.What happens when you assign the returned object?
------------------------------------------------------------------------------------------------------------------
e1 = e1.updateName("Patil");
-The new Employee object returned by updateName is stored in e1.
-Now e1 points to the new object with the updated name "Patil".
The original object still exists in memory until garbage collected, but e1 no longer refers to it.

✅ This is the correct way to “modify” immutable objects.
4️.Why immutable classes work this way
----------------------------------------------------------
-You cannot change the existing object because final fields prevent it.Any “update” must return a new object.
This ensures thread safety, predictability, and no side effects.
--------------------------------------------------------------------
=== Before modification ===
Employee Object HashCode: 705927765
ID: 101
Name: Narsing
Name Field HashCode: -903317490

=== After modification ===
Employee Object HashCode: 705927765
ID: 101
Name: Narsing
Name Field HashCode: -903317490
=======================================================================================================
=== Before modification ===
Employee Object HashCode: 705927765
ID: 101
Name: Narsing
Name Field HashCode: -903317490

=== After modification but not store in any new object/object refernc ===
Employee Object HashCode: 705927765
ID: 101
Name: Narsing
Name Field HashCode: -903317490

=== After modification but store in any new object/object refernc ===
value with the modified refernce:
ID: 101
Name: Patil
value with the original refernce:
ID: 101
Name: Narsing

Important::=======================================================================================================================================
1️.Default hashCode() behavior
=.
-Every class in Java implicitly extends Object.
-Object has a hashCode() method.

-Default hashCode() in Object: public native int hashCode();
-This returns a number derived from the object’s memory address (or an internal reference identity).
-So if you don’t override hashCode(), it does not use your fields at all.

2.Effect on references
Employee e1 = new Employee(101, "Narsing");
Employee e2 = new Employee(101, "Narsing");

System.out.println(e1.hashCode()); // default Object.hashCode()
System.out.println(e2.hashCode());
System.out.println(e1 == e2);      // false, different references


e1.hashCode() and e2.hashCode() will likely be different, even though the content is the same.

== checks reference equality, not content.

3️.Why we override hashCode()
=>
-Collections like HashMap, HashSet, HashTable use hashCode() to find objects.
-If you don’t override it for a class with meaningful fields:

Employee e1 = new Employee(101, "Narsing");
Employee e2 = new Employee(101, "Narsing");

HashSet<Employee> set = new HashSet<>();
set.add(e1);
set.add(e2);

System.out.println(set.size()); // 2, because default hashCode differs
Even though content is the same, both objects are considered different.
By overriding hashCode() using the fields, you ensure content-based equality works with hash-based collections.

4️.Quick summary
Case	hashCode() used	Result
Not overridden	Object’s default	Based on memory address/reference
Overridden	Custom (e.g., Objects.hash(id, name))	Based on fields/content

✅ Important note:
System.identityHashCode(obj) always returns the default JVM hash (reference-based), even if hashCode() is overridden.

*/
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
*/
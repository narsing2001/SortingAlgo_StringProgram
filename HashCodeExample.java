public class HashCodeExample {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1 == s2: " + (s1 == s2));

        System.out.println("s1.hashCode(): " + s1.hashCode());
        System.out.println("s2.hashCode(): " + s2.hashCode());

        System.out.println("System.identityHashCode(s1): " + System.identityHashCode(s1));
        System.out.println("System.identityHashCode(s2): " + System.identityHashCode(s2));
    }
}

/*
🧠 Expected Output (approx)
s1.equals(s2): true
s1 == s2: false
s1.hashCode(): 2301506
s2.hashCode(): 2301506
System.identityHashCode(s1): 1836019240
System.identityHashCode(s2): 1028566121

🔍 Explanation (how to say it in an interview)

✅ s1.equals(s2) → true
Because both strings have the same content (“Java”). The String class overrides equals() to compare content.

✅ s1 == s2 → false
Because they are two different objects in memory (new String("Java") creates separate instances).

✅ s1.hashCode() and s2.hashCode() → same
Because the String class overrides hashCode() to return a value based on the string’s content.
Even though they’re different objects, their contents are the same, so hash codes are identical.

✅ System.identityHashCode(s1) and System.identityHashCode(s2) → different
Because this method ignores overrides and returns a hash code based on the object’s identity (like its memory reference).
It’s what you’d get if hashCode() were not overridden.

🗣️ How to Answer in an Interview

Here’s a strong, concise way to phrase it:

“The hashCode() method can be overridden to provide a logical hash code — usually based on an object’s content.
But System.identityHashCode() always returns the hash code based on the object’s identity, as if Object.hashCode() were used directly.
So if a class overrides hashCode(), both methods may return different values for the same object.”
*/
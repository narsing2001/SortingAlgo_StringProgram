// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateHashmapUse {
    public static void main(String[] args) {
        String str="java is a good programming language";
        char [] c=str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(Character c1:c){
            map.put(c1,map.getOrDefault(c1,0)+1);
        }
       // map.forEach((e1,e2)-> System.out.println(e1+":"+e2));

        for(Map.Entry<Character,Integer>m1:map.entrySet()){
            if(m1.getValue()>1){		
                   System.out.println("Duplicate element in given string:"+m1.getKey());
			
			}
            }
 }
}
}

/*output:
Duplicate element in given string: 
Duplicate element in given string:a
Duplicate element in given string:g
Duplicate element in given string:i
Duplicate element in given string:m
Duplicate element in given string:n
Duplicate element in given string:o
Duplicate element in given string:r


*/
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RemoveDuplicateMultipleArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,8};
        int[] arr3={8,9,10,11,12};
        int size=arr1.length+arr2.length+arr3.length;
        //Method:declare array to store the element of arr1,arr2,arr3
        int [] arr4=new int[size];
           int index=0;
        //arr1---------------------------------------------------------------------------
        for(int i=0;i<arr1.length;i++){
            arr4[index++]=arr1[i];
        }
        //arr2-----------------------------------------------------------------------------
        for(int i=0;i<arr2.length;i++){
            arr4[index++]=arr2[i];
        }
        //arr3-----------------------------------------------------------------------
        for(int i=0;i<arr3.length;i++){
            arr4[index++]=arr3[i];
        }
        System.out.println("arr1 and arr2 and arr3 combine:"+Arrays.toString(arr4));

        Set<Integer> s=new HashSet<>();
        int dupCnt=0;
       for(int e:arr4){
           if (s.contains(e)) {
               dupCnt++;
           }

           s.add(e);
       }

     int []arr5=new int[arr4.length];

       int j=0;
        for(Integer a:s){
            arr5[j]=a;
            j++;
        }
        System.out.println("removal of the duplicate will array print array default value 0:"+Arrays.toString(arr5));
        int []arr6=Arrays.copyOf(arr5,arr5.length-dupCnt);
        System.out.println("duplicate array element removal without default array value in place of the duplicate:"+Arrays.toString(arr6));
//------------------------------------------------------------------------------------------------------------------------------------


// method-2 using hashmap and the arraylist----------------------------------------------------------
        System.out.println("manage memory dynamcially so that it will not print manually default value after removal of the duplicate value:");
        HashMap<Integer,Integer> map=new HashMap();
        for(int num:arr5) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> array=new ArrayList<>();

        for(Map.Entry<Integer,Integer> map1:map.entrySet()){
            if(map1.getValue()==1){
                array.add(map1.getKey());
            }
        }

        System.out.println("array element without duplicate:"+array);
    }
}
/*
arr1 and arr2 and arr3 combine:[1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 8, 9, 10, 11, 12]
removal of the duplicate will array print array default value 0:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0]
duplicate array element removal without default array value in place of the duplicate:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
manage memory dynamcially so that it will not print manually default value after removal of the duplicate value:
array element without duplicate:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12] 
 
 */
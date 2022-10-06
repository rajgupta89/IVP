import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] a={1,3};
        int[] b={4,6};
        HashMap<Integer,Integer>li=new HashMap<>();
        // li.put("My", 200);
        // li.put("Name", 300);
        // li.put("is", 400);
        // li.put("Raj", 36000);
        for (int i = 0; i < a.length; i++) {
            li.put(a[i], b[i]);
        }
        System.out.println(li);
        // if (li.containsKey("Raj")) {   // to get value by using key
        //     System.out.println(li.get("Raj"));
        // }
        for (int i = 2; i < 5; i++) {
            if(li.containsKey(i)){
                System.out.print(i+" "+li.get(i)+"\n");
            }
        }        
    }
}

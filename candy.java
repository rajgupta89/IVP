import java.util.HashMap;
import java.util.Scanner;

public class candy {
    public int buyCandies(int input1,String[] input2,int[] input3, int input4){
       int[] input5=new int[input4];
       int sum=0,sum1=0;
       HashMap<Integer,Integer> li=new HashMap<>();
       for (int i = 0; i < input4; i++) {
           input5[i]=Integer.parseInt(input2[i],2);
           li.put(input5[i], i);
       }
       for (int i = 0; i < input4; i++) {
           if(li.get(15-input5[i]) != null && li.get(15-input5[i])!=i){
            sum=input5[i];
            sum1=15-input5[i];
           }
       }
       int total=0,maxx=-1;
       for (int i = 0; i < input4; i++) {
           if(input5[i]==sum){
              total+=input3[i];
           }
           if(input5[i]==sum1){
               total+=input3[i];
           }
       }
       if(total>0)
       return total;
       else
       return maxx;

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input4=in.nextInt();
        String[] input2=new String[input4];
        for (int i = 0; i < input4; i++) {
            input2[i]=in.next();
        }
        int[] input3=new int[input4];
        for (int i = 0; i < input4; i++) {
            input3[i]=in.nextInt();
        }
        int input1=in.nextInt();
        candy obj=new candy();
        System.out.println(obj.buyCandies(input1, input2, input3, input4));
    }
}

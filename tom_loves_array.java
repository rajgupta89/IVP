import java.util.Scanner;

public class tom_loves_array {
    public int total(int input1,int input2,int[] input3){
        while(input2-->0){
         int[] b=new int[input1];
         for (int i = 0; i < input1; i++) {
             int val=0;
             for (int j = 0; j < input1; j++) {
                 val+=input3[j]*(Math.abs((i+1)-(j+1)));
             }
             b[i]=val;
         }
         for (int i = 0; i < input1; i++) {
             input3[i]=b[i];
         }
        }
        int sum=0;
        for (int i = 0; i < input1; i++) {
            sum+=input3[i];
        }
         return sum%1000000007;
    }
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int input1=in.nextInt();
         int input2=in.nextInt();
         int[] input3=new int[input1];
         for (int i = 0; i < input1; i++) {
             input3[i]=in.nextInt();
         }
         tom_loves_array obj=new tom_loves_array();
         System.out.println(obj.total(input1, input2, input3));
    }
}

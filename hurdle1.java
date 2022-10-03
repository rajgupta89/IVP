import java.util.*;
class hurdle1{
    public int maximisePoints(int[] input1,int input2,int[] input3,int input4,int[] input5,int input6,int[] input7,int input8){
        int height=input3[0];
        int sum=0;
        for (int i = 1; i < input2; i++) {
           sum+=input1[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input2=in.nextInt();
        int[] input1=new int[input2];
        for (int i = 0; i < input2; i++) {
            input1[i]=in.nextInt();
        }
        int input4=in.nextInt();
        int[] input3=new int[input4];
        for (int i = 0; i < input4; i++) {
            input3[i]=in.nextInt();
        }
        int input6=in.nextInt();
        int[] input5=new int[input6];
        for (int i = 0; i < input6; i++) {
            input5[i]=in.nextInt();
        }
        int input8=in.nextInt();
        int[] input7=new int[input8];
        for (int i = 0; i < input8; i++) {
            input7[i]=in.nextInt();
        }
        hurdle1 obj=new hurdle1();
        System.out.println(obj.maximisePoints(input1, input2, input3, input4, input5, input6, input7, input8));
        // int height=input3[0];
        
    }
}
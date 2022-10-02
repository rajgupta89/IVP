import java.util.*;
class hurdle{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int[] a1=new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i]=in.nextInt();
        }
        int n2=in.nextInt();
        int[] a2=new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i]=in.nextInt();
        }
        int n3=in.nextInt();
        int[] a3=new int[n3];
        for (int i = 0; i < n3; i++) {
            a3[i]=in.nextInt();
        }
        int n4=in.nextInt();
        int[] a4=new int[n4];
        for (int i = 0; i < n4; i++) {
            a4[i]=in.nextInt();
        }
        // int height=a2[0];
        int height=0;
        int sum=0;
        for (int i = 0; i < n1; i++) {
            if(i==(a3[0]-1) || i==(a3[1]-1)){
                 if(height<a4[0])
                 height+=a2[i];
                 else 
                   sum+=a1[i];
                if(height<a4[1])
                height+=a2[i];
                else 
                   sum+=a1[i];
            }
            else{
              sum+=a1[i];
            }
        }
        System.out.println(sum-(a1[a3[0]-1])-(a1[a3[1]-1]));
        // System.out.println(height);
    }
}
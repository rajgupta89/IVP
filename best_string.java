import java.util.Scanner;

public class best_string {
    public int beststring(int input1,String[] input2, int[] input3,int input4){
        String s="";
        for (int i = 0; i < input1; i++) {
            
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String[] s=new String[n];
        for (int i = 0; i < n; i++) {
            s[i]=in.next();
        }
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        int k=in.nextInt();
        best_string obj=new best_string();
        System.out.println(obj.beststring(n, s, a, k));
    }
}

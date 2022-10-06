import java.util.*;
public class bob_array {
    public int hardness(int n,int k,int[] arr){
        if(n==0 || n==1){
            return 0;
        }
        int hard=0;
        ArrayList<Integer> li=new ArrayList<>();
        for (int i = 1; i < n; i++) {
            li.add(Math.abs(arr[i]-arr[i-1]));
        }
        hard=Collections.max(li);
        int min=Collections.min(li);

        int count=0;
        for (int i = 1; i < n; i++) {
            if(arr[i]>arr[i-1]){
                  arr[i]=arr[i-1];
                  count++;
            }
            if(count==k)
              break;
        }
        int hard1=0;
        ArrayList<Integer> li1=new ArrayList<>();
        for (int i = 1; i < n; i++) {
            li1.add(Math.abs(arr[i]-arr[i-1]));
        }
        hard1=Collections.max(li1);
        ArrayList<Integer> old=new ArrayList<>();
        old.add(hard);
        old.add(hard1);
        old.add(min);
        return(Collections.min(old));
    }
        
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        bob_array obj=new bob_array();
        System.out.println(obj.hardness(n,k,arr));
    }
}

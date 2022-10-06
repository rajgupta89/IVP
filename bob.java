import java.util.*;
public class bob {
    public int maximum(int input1,int[] input3){
        int max=0;
        for (int i = 0; i < input1; i++) {
            max=Math.max(max, input3[i]);
        }
        return max;
    }
    public int hardness(int input1,int input2,int[] input3){
        if(input1==0 || input1==1){
            return 0;
        }
        int hard=0;
        ArrayList<Integer> li=new ArrayList<>();
        for (int i = 1; i < input1; i++) {
            li.add(Math.abs(input3[i]-input3[i-1]));
        }
        hard=Collections.max(li);
        int[] arr1=new int[input1];
        for (int i = 0; i < input1; i++) {
            arr1[i]=input3[i];
        }
        Arrays.sort(arr1);
        int count=0;
        int count1=0;
        System.out.println();

        for (int i = 0; i < input2; i++) {
            int max=maximum(input1, input3);
            for (int j = 0; j < input1; j++) {
                if(input3[j]==max){
                    count++;
                    input3[j]=arr1[0];
                }
                if(count==input2){
                    count1++;
                    break;
                }
            }
            if(count1>0){
                break;
            }
        }
        int hard1=0;
        ArrayList<Integer> li1=new ArrayList<>();
        for (int i = 1; i < input1; i++) {
            li1.add(Math.abs(input3[i]-input3[i-1]));
        }
        for (int i = 0; i < input1; i++) {
            System.out.print(input3[i]+" ");
        }
        System.out.println();
        System.out.println(li);
        System.out.println(li1);
        hard1=Collections.max(li1);
        System.out.println(hard+" "+hard1);
        return(Math.min(hard, hard1));
    }
        
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1=in.nextInt();
        int input2=in.nextInt();
        int[] input3=new int[input1];
        for (int i = 0; i < input1; i++) {
            input3[i]=in.nextInt();
        }
        bob obj=new bob();
        System.out.println(obj.hardness(input1,input2,input3));
    }
}

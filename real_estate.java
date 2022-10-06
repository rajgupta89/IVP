import java.util.*;

public class real_estate {
    public int estate(int input1,int input2,int input3,int[] input4){
        ArrayList<Integer> li=new ArrayList<>();
        for (int i = 0; i < input1; i++) {
            li.add(input4[i]);
        }
        Collections.sort(li,Collections.reverseOrder());
        long sum=0;
        int j=0;
        for (int i = 0; i < input1; i++) {
            if(input2-(li.get(i)*Math.pow(2, j))>0){
                 input2-=(li.get(i)*Math.pow(2, j));
                 j++;
                 sum+=li.get(i);
            }
        }
        return (int)(sum*(Math.pow(2, input3)));
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1=in.nextInt();
        int input2=in.nextInt();
        int input3=in.nextInt();
        int[] input4=new int[input1];
        for (int i = 0; i < input1; i++) {
            input4[i]=in.nextInt();
        }
        real_estate obj=new real_estate();
        System.out.println(obj.estate(input1, input2, input3, input4));
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class codingchallenge {
    public int summ(int i){
        int sum=0;
        while (i>0) {
            sum=sum+(i%10);
            i/=10;
        }
        return sum;
    }
    public int coding(String input1,String input2,int input3){
          int left=Integer.parseInt(input1);
          int right=Integer.parseInt(input2);
          ArrayList<Integer> li=new ArrayList<>();
          for (int i = left; i <=right; i++) {
              if(i%input3==0){
                  if(summ(i)%input3==0){
                      li.add(i);
                  }
              }
          }
          return(li.size());
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1=in.next();
        String input2=in.next();
        int input3=in.nextInt();
        codingchallenge obj=new codingchallenge();
        System.out.println(obj.coding(input1, input2, input3));
    }
}

import java.util.Scanner;

public class AddString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String num1=in.nextLine();
        String num2=in.nextLine();
        StringBuilder str=new StringBuilder();
        int a=num1.length()-1;
        int b=num2.length()-1;
        int carry=0;
        while(a>=0 ||b>=0||carry!=0){
            int val1=(a>=0)? num1.charAt(a)-'0':0;
            int val2=(b>=0)? num2.charAt(b)-'0':0;
            int sum= val1+val2+carry;
            str.append(sum%10);
            carry=sum/10;
            a--;
            b--;
        }
        System.out.println(str.reverse());
    }
}

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            rev+=ch;
        }
        System.out.println(rev);
        System.out.println(rev+""+1+2);
        System.out.println(rev+1+2);
    }
}

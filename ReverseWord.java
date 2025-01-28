import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str1=str.trim();
        String arr[]=str1.split("//s+");
        StringBuilder string=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            string.append(arr[i]+" ");
        }
        string.trimToSize();
        System.out.println(string);
    }
}

import java.util.Scanner;

public class OptimalPartisionSring {
    public static void main(String[] args) {
        Scanner in=new  Scanner(System.in);
        String str1=in.nextLine();
        int count=0;
        String str=str1.toLowerCase();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);

    }
}

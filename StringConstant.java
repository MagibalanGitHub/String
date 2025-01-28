import java.util.Scanner;

public class StringConstant {
    public static void main(String[] args) {
        Scanner in=new  Scanner(System.in);
        String str1=in.nextLine();
        int count=0;
        String str=str1.toLowerCase();
        String res1="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){
                res1+=ch;
            }
        }
        System.out.println(res1);
        String res2="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                continue;
            }
            res2+=ch;
        }

        System.out.println(res2);
    }
}

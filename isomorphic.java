import java.util.Scanner;

public class isomorphic {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        String str=in.nextLine();


        System.out.println(str.startsWith("Java"));
        System.out.println(str.endsWith("Programming"));

        char target=in.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==target){
                count++;
            }
        }
        System.out.println(count);
        in.nextLine();
        int c=0;
        int max=0;
        System.out.println("Enter the String");

        String s=in.nextLine();
        String str1[]=s.split("\\ ,");
        for(int i=0;i<str1.length;i++){
            int r=str1[i].length();
            c=r;
            max=Math.max(c,max);
        }
        System.out.println(max);


        for(int i=0;i<str1.length;i++){
            if(str1[i].length()==max){
                System.out.println(str1[i]);
            }
        }
    }
}

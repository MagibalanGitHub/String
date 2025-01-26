import java.util.Scanner;

public class Cop {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String str1=in.nextLine();
        String str2=str;
        System.out.println(str2);

        if(str.equals(str1)){
            System.out.println(" Two string are equals");
        }

        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            rev+=c;
        }
        System.out.println(rev);

        if(str.equals(rev)){
            System.out.println(" Two strings are Equals");
        }
        else{
            System.out.println(" Not equal");
        }

        int count =0;
        // vowel count
        for(int i=0;i<str.length();i++){
            char d=str.charAt(i);

            if (d == 'a'||d=='e'||d=='i'||d=='o'||d=='u') {
                count++;
            }
        }
        System.out.println(count);
    }

}

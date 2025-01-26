import java.util.Scanner;

public class AllMethods {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println(" Enter you Choice : ");
        System.out.println(" 1. Length");
        System.out.println(" 2. Index");
        System.out.println(" 3. Comparision");
        System.out.println(" 4. ToUpperCase");
        System.out.println(" 5. ToLowerCase");
        System.out.println(" 6. SubString");
        System.out.println(" 7. Concatenation");
        int a=in.nextInt();

        switch(a){
            case 1:
                System.out.println(" Enter the String");
                String str=in.next();
                System.out.println("The Length of the String is "+str.length());
                break;
            case 2:
                System.out.println(" Enter the String");
                String str1=in.next();
                System.out.println(" Enter the index to find");
                int index=in.nextInt();
                System.out.println("The Index of the String is "+str1.charAt(index));
                break;

            case 3:
                System.out.println(" Enter the String 1 ");
                String str2=in.next();
                System.out.println(" Enter the String 2 ");
                String str3=in.next();
                if(str2.equals(str3)){
                    System.out.println(" Two strings are Equals");
                }
                else{
                    System.out.println(" Two strings are Not Equals");
                }
                break;

            case 4:
                System.out.println(" Enter the String");
                String str4=in.next();
                System.out.println("The UpperCase of the String is "+str4.toUpperCase());
                break;
            case 5:
                System.out.println(" Enter the String");
                String str5=in.next();
                System.out.println("The LowerCase of the String is "+str5.toLowerCase());
                break;
            case 6:
                System.out.println(" Enter the String");
                String str6=in.next();
                System.out.println(" Enter upto Slice");
                int b=in.nextInt();
                System.out.println("The Substring of the String " +b+"is "+str6.substring(b));
                break;
            case 7 :
                System.out.println(" Enter the String 1 ");
                String str7=in.next();
                System.out.println(" Enter the String 2 ");
                String str8=in.next();
                String r=str7+str8;
                System.out.println(" The Concatenation of Two String is "+r);
            default:
                System.out.println(" Invalid Input");
        }
    }
}

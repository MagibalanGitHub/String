import java.util.HashSet;
import java.util.Scanner;

public class FindDifference {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();
        char strarr1[]=str1.toCharArray();
        char strarr2[]=str2.toCharArray();
        HashSet<Character> set1=new HashSet<>();
        HashSet<Character> set2=new HashSet<>();
        for(char num:strarr1){
            set1.add(num);
        }
        for(char num:strarr2){
            set2.add(num);
        }
        boolean res=true;
        for(char num:set2){
            if(!set1.contains(num)){
                System.out.println("The difference is : "+num);
                res=false;
            }
        }
        if(res){
            System.out.println("There is no Difference");
        }
    }
}

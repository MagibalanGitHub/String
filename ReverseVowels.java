import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseVowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String rev = "";
        char ch1[] = str.toCharArray();
        int i = 0;
        System.out.println(Arrays.toString(ch1));
        int j = str.length() - 1;
        while (i < j) {

            if (ch1[i] != 'a' && ch1[i] != 'e' && ch1[i] != 'i' && ch1[i] != 'o' && ch1[i] != 'u') {
                i++;
                continue;
            }
            if (ch1[j] != 'a' && ch1[j] != 'e' && ch1[j] != 'i' && ch1[j] != 'o' && ch1[j] != 'u'){
                j--;
             continue;
        }
            char temp=ch1[i];
            ch1[i]=ch1[j];
            ch1[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(ch1));
        ArrayList<Character> list=new ArrayList<>();
        char ch2[] = str.toCharArray();
        for(int k=0;k<ch2.length;k++){
            if(ch2[k]=='a' ||ch2[k]=='e'||ch2[k]=='i'||ch2[k]=='o'||ch2[k]=='u'){
                list.add(ch2[k]);
            }
        }

        int r=0;
        for(int k=ch2.length-1;k>=0;k--){
            if(ch2[k]=='a' ||ch2[k]=='e'||ch2[k]=='i'||ch2[k]=='o'||ch2[k]=='u') {
                ch2[k]=list.get(r);
                r++;
            }
        }
        System.out.println(Arrays.toString(ch2));
    }
}

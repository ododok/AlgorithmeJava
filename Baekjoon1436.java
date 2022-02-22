//https://www.acmicpc.net/problem/1436
import java.util.Scanner;

public class Main {

    public static boolean check(long nb){
        String str1 = String.valueOf(nb);
        for(int i=0; i<str1.length()-2; i++){
            if(str1.charAt(i)=='6' && str1.charAt(i+1)=='6' &&str1.charAt(i+2)=='6'){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        long ch=0L;

        for(i=0; i<n; i++){
            do{
                ch++;
            }while(!check(ch));
        }
        System.out.println(ch);


    }
}

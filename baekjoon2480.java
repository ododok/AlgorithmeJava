
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1==n2 && n2==n3){
            System.out.println(10000+n1*1000);
        } else if(n1==n2 || n2==n3 || n1==n3){
            int x;
            if(n1==n2) x=n1;
            else if(n1==n3) x=n1;
            else x=n2;
            System.out.println(1000+x*100);

        } else {
            int max;
            max=n1;
            if(max<n2) max=n2;
            if(max<n3) max=n3;
            System.out.println(max*100);
        }
    }
}

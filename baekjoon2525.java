//https://www.acmicpc.net/problem/2525

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        n2+=n3;

        while(n2>=60){
            n2-=60;
            n1++;
            if(n1>=24) n1=0;
        }
        
        System.out.println(n1 +" "+n2);
    }
}

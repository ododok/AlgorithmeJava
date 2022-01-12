//https://www.acmicpc.net/problem/11720

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();


        String[] str2 = str.split("");

        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=Integer.parseInt(String.valueOf(str.charAt(i))); // !! 
        }
        System.out.println(sum);
    }
}

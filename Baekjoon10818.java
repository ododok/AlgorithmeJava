//https://www.acmicpc.net/problem/10818

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] str2 = str.split(" ");

        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(str2[i]);
        }
        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<N; i++){
            if(max<arr[i]) max=arr[i];
            if(min>arr[i]) min=arr[i];
        }
        System.out.println(min+" "+max);


    }
}

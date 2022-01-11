//https://www.acmicpc.net/problem/2562

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int idx = 0;
        int t;
        for(int i=0; i<9; i++){
            t=sc.nextInt();
            if(t>max){
                max=t;
                idx=i;
            }
        }
        System.out.println(max+"\n"+(idx+1));
    }
}

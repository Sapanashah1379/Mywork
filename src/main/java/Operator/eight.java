package Operator;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        int i,sum = 0;
        System.out.println("enter number");
        for(i=0; i<5; i++) {
            Scanner sc = new Scanner(System.in);
             int num = sc.nextInt();
            sum = sum+num;
        }

        int average = sum/5;
        System.out.println("average:"+average);
    }
}

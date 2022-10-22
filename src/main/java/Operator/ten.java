package Operator;

import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        System.out.println("enter first integer:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter second integer:");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Integers are equal");
        }
        else{
            System.out.println("Integers are not equal");
        }

    }
}

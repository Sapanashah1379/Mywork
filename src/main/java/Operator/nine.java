package Operator;

import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        System.out.println("enter length of 1st side");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter length of 2nd side");
        int b = sc.nextInt();
        System.out.println("enter length of 3rd side");
        int c = sc.nextInt();

        if( a==b&&a==c){
            System.out.println("triangle is equilateral");
        }
        else{
            System.out.println("triangle is not equilateral");
        }
    }
}

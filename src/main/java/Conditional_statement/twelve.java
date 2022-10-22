package Conditional_statement;

import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=0){
            System.out.println("number is positive");
        }
        else{
            System.out.println("number is negative");
        }

    }
}

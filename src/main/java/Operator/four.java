package Operator;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }


}

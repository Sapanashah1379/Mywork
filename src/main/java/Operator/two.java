package Operator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        if(a<=0 && b<=0){
            System.out.println("Invalid number");
        }
        else{
            int sum = a + b;
            System.out.println("sum:"+sum);

            int mul = a * b;
            System.out.println("mul:"+mul);

            int difference = a - b;
            System.out.println("difference:"+difference);

            int quotient = a / b ;
            System.out.println("quotient:"+quotient);

            int remainder = a % b;
            System.out.println("remiander:"+remainder);
        }
    }
}

package Conditional_statement;

import java.util.Scanner;

public class twenty {
    public static void main(String[] args) {
        System.out.println("ENTER THE ANGLE OF TRIANGLE");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        if(sum==180){
            System.out.println("Triangle is formed");
        }
        else{
            System.out.println("Triangle is not valid");
        }
    }
}

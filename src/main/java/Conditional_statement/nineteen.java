package Conditional_statement;

import java.util.Scanner;

public class nineteen {
    public static void main(String[] args) {
        System.out.println("Enter the length of one side of triangle");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the length of second side of triangle");
        int b = sc.nextInt();
        System.out.println("Enter the length of third side of triangle");
        int c = sc.nextInt();
        if(a==b&& a==c){
            System.out.println("Triangle is equilateral");
        }
        else if(a==b){
            System.out.println("Triangle is isoscless");
        }
        else{
            System.out.println("Triangle is scalene");
        }
    }
}

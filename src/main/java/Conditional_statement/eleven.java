package Conditional_statement;

import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2 == 0) {
            System.out.println("Number is even");
        }
            else{
                System.out.println("Number is odd");
            }
        }
    }


package Conditional_statement;
import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        System.out.println("enter age of voter:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<18) {
            System.out.println("not eligible to cast a vote");
        }
         else{
                System.out.println("eligible to cast a vote");
            }

        }
    }


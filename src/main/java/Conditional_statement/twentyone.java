package Conditional_statement;

import java.util.Scanner;

public class twentyone {
    public static void main(String[] args) {
        int i;
        System.out.println("Enter two values:");
        Scanner sc = new Scanner(System.in);
        int fromNumber = sc.nextInt();
        int toNumber = sc.nextInt();
        if(fromNumber>toNumber){
            int temp = fromNumber;
            fromNumber = toNumber;
            toNumber = temp;
            System.out.println("values after swapping is fromNumber & toNumber:"+fromNumber+" "+toNumber);

            }
        for(i=1; i<toNumber; i++){
            System.out.println("print values excluding toNumber:"+i);
        }

            }
    }


package Operator;

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        System.out.println("enter a length");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double area = a*a;
        System.out.println("area of square:"+area);

        double perimeter = 4 * a;
        System.out.println("perimeter of square:"+perimeter);
    }
}

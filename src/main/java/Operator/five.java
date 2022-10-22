package Operator;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        System.out.println("enter a length");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter a breadth");
        int b = sc.nextInt();

        int Area = a * b;
        System.out.println("area of rectangle:"+Area);

        int peremeter = 2*(a + b);
        System.out.println("peremeter of rectangle:"+peremeter);
    }
}

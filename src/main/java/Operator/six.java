package Operator;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        System.out.println("enter a radius");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

       double Area = (r * r)*Math.PI;
        System.out.println("Area of circle:"+Area);

       double perimeter = 2 * Math.PI * r ;
        System.out.println("perimeter of circle:"+perimeter);
    }
}

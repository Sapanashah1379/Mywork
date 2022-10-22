package Conditional_statement;
import java.util.Scanner;
public class fourteen {
    public static void main(String[] args) {

        System.out.println("enter height of person in feet:");
        Scanner sc = new Scanner(System.in);
        float heightinfeet = sc.nextFloat();

       float Height = (float) ((heightinfeet)*30.48);
        System.out.println("height of person converted from feet to centimeter:"+Height);
    }
}

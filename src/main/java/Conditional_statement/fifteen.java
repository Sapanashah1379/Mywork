package Conditional_statement;
import java.util.Scanner;
public class fifteen {
    public static void main(String[] args) {
        System.out.println("enter coordinates x and y:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x>=0&&y>=0) {
            System.out.println("lies on first quadrant!");
        }
        else if(x<0&&y>=0){
            System.out.println("lies on second quadrant!");
        }
        else if(x<0&&y<0){
            System.out.println("lies on third quadrant!");
        }
        else{
            System.out.println("lies on fourth quadrant!");
        }
    }
}

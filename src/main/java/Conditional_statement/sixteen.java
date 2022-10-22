package Conditional_statement;

import java.util.Scanner;

public class sixteen {
    public static void main(String[] args) {
        float total = 0;
        System.out.println("marks obtained in 5 subject:");
        System.out.println("marks obtained in maths:");
        Scanner sc = new Scanner(System.in);
        float math = sc.nextFloat();
        System.out.println("marks obtained in social:");
        float social = sc.nextFloat();
        System.out.println("marks obtained in science:");
        float science = sc.nextFloat();
        System.out.println("marks obtained in optional math:");
        float optionalmath = sc.nextFloat();
        System.out.println("marks obtained in Nepali:");
        float Nepali = sc.nextFloat();

        if(math<0&&math>100){
            System.out.println("error!");
        }
        else{
            System.out.println("mark of math:"+math);
        }
        total =  math + total;

        if(social<0&&social>100){
            System.out.println("error!");
        }
        else{
            System.out.println("mark of social:"+math);
        }
        total =  social + total;

        if(science<0&&science>100){
            System.out.println("error!");
        }
        else{
            System.out.println("mark of science:"+math);
        }
        total =  science + total;

        if( optionalmath <0&& optionalmath >100){
            System.out.println("error!");
        }
        else{
            System.out.println("mark of  optionalmath :"+math);
        }
        total =   optionalmath  + total;

        if( Nepali <0&& Nepali >100){
            System.out.println("error!");
        }
        else{
            System.out.println("mark of  Nepali :"+math);
        }
        total =   Nepali  + total;
        float grandTotal = total ;
        System.out.println("Grandtotal of all subjects:"+grandTotal);
        float marksinpercentage=(grandTotal/500)*100;
        float marksinGPA = (marksinpercentage/20)-1;
        System.out.println("marks in GPA:"+marksinGPA);
    }
}

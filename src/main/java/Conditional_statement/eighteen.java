package Conditional_statement;

import java.util.Scanner;

public class eighteen {
    public static void main(String[] args) {
        System.out.println("Enter character:");
        Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);
        if(character== 'a' || character=='e'|| character=='i' || character=='o' || character=='u'){
            System.out.println("character is vowel");
        }
        else{
            System.out.println("character is consonant");
        }
    }
}

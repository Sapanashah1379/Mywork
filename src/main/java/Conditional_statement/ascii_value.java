package Conditional_statement;

import java.util.Scanner;

public class ascii_value {
    public static void main(String[] args) {
        int i;
        String incrementstr = " ";
        System.out.println("Enter string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("you have entered:" + str);
        for (i = 0; i < str.length(); i++) {
            int asciiValue = str.charAt(i);
         if((str.charAt(i)>=97 && str.charAt(i)<=122) || (str.charAt(i)>=65 && str.charAt(i)<=90)){
            incrementstr+= (char)(str.charAt(i)+1);

            }
         else{
             incrementstr+= (char)str.charAt(i);
         }
        }
        System.out.println("incremented string is: "+incrementstr);
    }

}

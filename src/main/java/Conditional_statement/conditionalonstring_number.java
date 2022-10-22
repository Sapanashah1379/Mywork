package Conditional_statement;

import java.util.Scanner;

public class conditionalonstring_number {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("enter a string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("your entered string:"+str);
        System.out.println("Enter your number:");
        int number = sc.nextInt();
        char schar = str.charAt(0);
        System.out.println("your entered number:"+number);
            for(int i=0;i<=str.length();i++){
                  if((str.charAt(i)== 'a') | (str.charAt(i)== 'b') | (str.charAt(i)== 's') | (str.charAt(i)== 'p')){
                  count++;
                }
            }
            if(number%2==0){
                if(str.length() >=5 & str.length() <=10){
                    if(!(schar=='x') | (schar=='y') | (schar=='z')){
                        if(count == str.length()){
                            if(count>=2 & count<=4){
                              if(count%2==0){
                                  System.out.println("Eurreka");
                              }
                            }
                        }
                    }
                }
            }
        }
    }


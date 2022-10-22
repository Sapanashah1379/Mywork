package Conditional_statement;

import java.util.Scanner;

public class seventeen {
    public static void main(String[] args) {
        String item;
        int price = 0;
        System.out.println("List of Items with prices:");
        System.out.println("1. Momo chicken: 150");
        System.out.println("2. Momo Buff: 120");
        System.out.println("3. Momo Veg: 100");
        System.out.println("4. Burger chicken: 150");

        System.out.println("How many order do you want to give?");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i;
        int total = 0;
        for(i=0;i<a;i++) {

            System.out.println("Enter your choices:");
            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("1. Momo chicken: 150");
                    total += 150;
                    break;

                case 2:
                    System.out.println("2. Momo Buff: 120");
                    total += 120;
                    break;
                case 3:
                    System.out.println("3. Momo Veg: 100");
                    total += 100;
                    break;
                case 4:
                    System.out.println("4. Burger chicken: 150");
                    total += 150;
                    break;

                // default case
                default:
                    System.out.println("Unknown");
            }

        }
        System.out.println("total price:"+total);
        }
        }




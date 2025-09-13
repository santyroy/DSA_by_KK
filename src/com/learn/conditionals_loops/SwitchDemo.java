package com.learn.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String fruit = sc.next();
            String msg;
//            if (fruit.equalsIgnoreCase("mango")) {
//                msg = "King of fruit!";
//            } else if (fruit.equalsIgnoreCase("apple")) {
//                msg = "An apple a day, keeps doctor away!";
//            } else if (fruit.equalsIgnoreCase("orange")) {
//                msg = "Rich in Vitamin C";
//            } else {
//                msg = "Not in stock";
//            }

            // Switch Statement
//            switch(fruit) {
//                case "mango":
//                    msg = "King of fruit!";
//                    break;
//                case "apple":
//                    msg = "An apple a day, keeps doctor away!";
//                    break;
//                case "orange":
//                    msg = "Rich in Vitamin C";
//                    break;
//                default:
//                    msg = "Not in stock";
//            }

            // Enhanced Switch statement
            switch (fruit) {
                case "mango" -> msg = "King of fruit!";
                case "apple" -> msg = "An apple a day, keeps doctor away!";
                case "orange" -> msg = "Rich in Vitamin C";
                default -> msg = "Not in stock";
            }
            System.out.println(msg);

            msg = switch (fruit) {
                case "mango" -> "King of fruit!";
                case "apple" -> "An apple a day, keeps doctor away!";
                case "orange" -> "Rich in Vitamin C";
                default -> "Not in stock";
            };
            System.out.println(msg);

            String msg2 = switch (fruit) {
                case "mango" -> {
                    System.out.println("Mango selected");
                    yield "King of fruit!";
                }
                case "apple" -> {
                    System.out.println("Apple selected");
                    yield "An apple a day, keeps doctor away!";
                }
                case "orange" -> {
                    System.out.println("Orange selected");
                    yield "Rich in Vitamin C";
                }
                default -> {
                    System.out.println("Default case");
                    yield "Not in stock";
                }
            };
            System.out.println(msg2);


            int day = sc.nextInt();
            switch (day) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Weekday");
                    break;
                case 6:
                case 7:
                    System.out.println("Weekend");
                    break;
            }

            switch (day) {
                case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
                case 6, 7 -> System.out.println("Weekend");
            }


            // Nested Switch Case
            int empId = sc.nextInt();
            String department = sc.next();

            switch (empId) {
                case 1:
                    System.out.println("John Doe");
                    break;
                case 2:
                    System.out.println("Mark Henry");
                    break;
                case 3:
                    System.out.println("Employee ID: 3 selected");
                    switch (department) {
                        case "IT":
                            System.out.println("IT department");
                            break;
                        case "Admin":
                            System.out.println("Admin department");
                            break;
                        default:
                            System.out.println("No department matched");
                    }
                    System.out.println("Marry Wilson");
                    break;
                default:
                    System.out.println("Invalid Employee Id");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}

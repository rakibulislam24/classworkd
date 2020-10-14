package classwork1;

import java.util.Scanner;

public class CheckingNumber {


        public static void main(String[]args){

            Scanner stdin=new Scanner(System.in);
            System.out.println("Enter the first number");
            double a=stdin.nextDouble();
            System.out.println("Enter the second number");
            double b=stdin.nextDouble();
            System.out.println("Enter the third number");
            double c=stdin.nextDouble();

            if(a>b&&b>c){
                System.out.println("Decreasing");
            }else if(a<b&&b<c) {
                System.out.println("Increasing1");
            }else{
                    System.out.println("Neither increasing or decreasing order");
                }

            }

        }

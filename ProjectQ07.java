package project01;

public class ProjectQ07 {

         public static void main(String[] args) {

        // Write a Java Program to print the first 10 numbers of Fibonacci series
             int a=1;
             int b=0;
             int c=0;
            for(int i=1;i<=10;i++){
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;

            }


    }
}

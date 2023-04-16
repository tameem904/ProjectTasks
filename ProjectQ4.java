package project01;

public class ProjectQ4 {

    public static void main(String[] args) {

        /*Create a 2D array of integers. Develop a program
          which will calculate the sum of even and odd numbers
          for that array.*/

        int num[][]={
            {1,2,3,4,5},
            {6,7,8,9,10}
        };
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if(num[i][j]%2==0){
                    sum=num[i][j]+sum;
                }
                }}System.out.println("Sum of even numbers are "+ sum);
          sum=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 != 0) {
                    sum = num[i][j] + sum;
                }

            }}
        System.out.println("Sum of odd numbers are "+ sum);







    }
}

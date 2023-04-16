package project01;

public class ProjectQ08 {

    public static void main(String[] args) {

        /*
        Maximum and minimum number in the array?
         */

        int num[]={1,2,3,4,5};
        int min=num[0];
        int max=0;
        for (int i = 1; i < num.length; i++) {
            if(num[i]>max){
                max=num[i];
            }
            else{
                min=num[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }
}

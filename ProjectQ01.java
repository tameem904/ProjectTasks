package project01;

public class ProjectQ01 {

    public static void main(String[] args) {
        /*
        Create a program that uses an array to store a list of
        temperatures for a week, and then uses a loop to find
        the highest and lowest temperature for the week.
         */

        int temp[]={89,109,65,91,119,78,61};
        int lowest=0;
        int highest=temp[0];

        for( int i = 0; i < temp.length; i++){
            if(temp[i]>highest){
                highest=temp[i];

        }else{
            lowest=temp[i];
        }



    }
        System.out.println(lowest);
        System.out.println(highest);
    }
}

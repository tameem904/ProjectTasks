package project01;

public class ProjectQ10 {

    public static void main(String[] args) {

  //Write a program to print out duplicate elements from an Array of Strings?
        String words[]={"Math","Chemistry","English","English","Math","History"};

        for(int i=0;i< words.length;i++){
            for(int j=1+i;j<words.length;j++){
                  if(words[i]==words[j]){
                    System.out.println(words[i]);
                }
            }
        }




    }
}

import java.util.Scanner;

public class StudentGradeCalculator{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of subject: ");
    int n = sc.nextInt();
    double sum=0;
    int arr[]=new int[n];

    System.out.println("Enter number of "+ n +" subject one by one :- ");

    for(int i=0;i<n; i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n; i++){
        sum= sum + arr[i];
    }
    float per= (float) sum/n;
    System.out.println(sum);
    System.out.println("Total percentage :"+per+"%");
     if(per>=75){
      System.out.println("grade :-\'A\'");
    }
    else if(per>=60||per<=74.99){

       System.out.println("grade :-\'B\'");
    }
    else if(per>=45||per<=59.99){
            System.out.println("grade :-\'C\'");

    }
    else if(per>=33||per<=44.99){
            System.out.println("grade :-\'D\'");

    }
    else{
            System.out.println("FAIL");

    }



    
    
   
  }

}
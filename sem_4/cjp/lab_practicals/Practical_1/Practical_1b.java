import java.util.Scanner;

public class Practical_1b{
  public static void main(String[] args){
    System.out.println("Please enter a number: "); 
    Scanner sc = new Scanner(System.in);
    int usr_inp = sc.nextInt();

    int count = 0;
    for(int i = 1; i<= usr_inp; i++){
      if(usr_inp % i == 0){
        count++;
      }
    }
    if(count == 2){
      System.out.println("It is a Prime Number");
    }
    else{
      System.out.println("It is not a Prime Number");
    }
  }
}


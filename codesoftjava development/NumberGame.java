import java.util.Random;
import java.util.Scanner;

public class NumberGame {

  public static void main(String[] args) {
    Game g1 = new Game();
    
    g1.noOfGuesses(3);
  }
}

class Game {

  int x = 0;
  int y = 0;

  Game() {
    Random RN = new Random();

    int RandomNum = RN.nextInt(100);
    y = RandomNum;

    System.out.println(
      "Random number which is ganeerated by computer :- " + RandomNum
    );
  }

  public void takeUserInput() {
    Scanner sc = new Scanner(System.in);
    System.out.println(
      "Please enter a number to compare with the number given by the computer :- "
    );
    int num = sc.nextInt();
    x = num;
  }

  public void iscorrectNumber() {
    if (x == y) {
      System.out.println("Both numbers are same and the Number is : " + y);
      
    } else if (x < y) {
      System.out.println("Number is too Low");
    } else if (x > y) {
      System.out.println("Number is too High");
    }
  }

  public void noOfGuesses(int n) {
    int i;
    for (i = 1; i <= n; i++) {
      takeUserInput();

      iscorrectNumber();

      if (x == y) {
        System.out.println(
          "Congratulations you  won the GAME. \nUSER'S SCORE : " + i
        );
        break;
      }
    }

    i = i > n ? n : i;
    if (i == n) {
      System.out.println(
        "You have lost in all your attempts.\ntotal number of attempt : " + i
      );
    }
  }
}

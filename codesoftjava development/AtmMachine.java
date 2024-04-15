import java.util.Scanner;

public class AtmMachine {

  public static void main(String[] args) {
    UserBankAccount obj = new UserBankAccount();
  }
}



class UserBankAccount {


  int pin = 1234;
  int Balance;
// counstructer.
  UserBankAccount() {
    System.out.print("Enter your PIN.");
    Scanner sc = new Scanner(System.in);
    int enteredPin = sc.nextInt();
    if (enteredPin == pin) {
      menu();
    } else {
      System.out.println("Enter Valide pin");
    }
  }

// 
  public void menu() {
    System.out.println("Hi..\n");
    System.out.println(
      "Enter the number for whatever function you want to perform. -"
    );

    System.out.println("1. Withdraw");
    System.out.println("2. Deposit");
    System.out.println("3. CheckBalance");
    System.out.println("4. Exit");

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n == 1) {
      withdraw();
      System.out.println(
        "if you want to go main menu than press 1 ,or exit press 2"
      );

      int w = sc.nextInt();
      if (w == 1) {
        menu();
      } else if (w == 2) {
        System.out.println("Have a nice day. Thank you for using us.");
      }
    } else if (n == 2) {
      deposit();
      System.out.println(
        "if you want to go main menu than press 1 ,or exit press 2"
      );
      int w = sc.nextInt();
      if (w == 1) {
        menu();
      } else if (w == 2) {
        System.out.println("Have a nice day. Thank you for using us.");
      }
    } else if (n == 3) {
      CheckBalance();
      System.out.println(
        "if you want to go main menu than press 1 ,or exit press 2"
      );
      int w = sc.nextInt();
      if (w == 1) {
        menu();
      } else if (w == 2) {
        System.out.println("Have a nice day. Thank you for using us.");
      }
    } else if (n == 4) {
      System.out.println("Have a nice day. Thank you for using us.");
    } else {
      System.out.println(
        "Enter correct option which are present on ATM screen."
      );
    }
    //sc.close();
  }

  public void withdraw() {
    System.out.println("Enter the amount you want to withdraw.");
    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
    if (amount > Balance) {
      System.out.println(
        "You don't have enough money in your account for withdrowling."
      );
    } else {
      Balance = Balance - amount;
      System.out.println("Your withdrawalprocess is successful.");
    }
  }

  public void deposit() {
    System.out.println(
      "Please enter the amount of money you wish to deposit into your account."
    );
    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
    Balance = Balance + amount;
    System.out.println("Your Diposite process is successful.");
  }

  public void CheckBalance() {
    System.out.println("Currrent Balance in your Account is - " + Balance);
    System.out.println("Your process of Balance check is successfull");
  }
}

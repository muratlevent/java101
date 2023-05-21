import java.util.Scanner;

public class AtmProject {

    static double balance = 1000;
    static String userName = "murat";
    static String userPassword = "test123";

    public int digitCheck(String number) {

        if (number.matches("\\d+")) {
            return Integer.parseInt(number);
        } else {
            System.out.println("Input should only contain digits and should be positive. Please try again!");
            System.exit(0);
        }
        return 0;
    }

    public void userCheck(String nameCheck, String passwordCheck) {

        if (nameCheck.equals(userName) && passwordCheck.equals(userPassword)) {
            System.out.println("Login successful!");
            System.out.println("""
                    1 - Deposit
                    2 - Withdraw
                    3 - Balance
                    4 - Exit""");
            System.out.println("Please enter the operation : ");

            Scanner scanner = new Scanner(System.in);
            int operation = scanner.nextInt();
            operationCalculate(operation);
        } else {
            System.out.println("Wrong username or password!");
        }
    }

    private void operationCalculate(int operationToCheck) {

        Scanner scanner = new Scanner(System.in);
        switch (operationToCheck) {
            case 1 -> {
                System.out.print("Please enter the deposit amount : ");
                String deposit = scanner.nextLine();
                balance = balance + digitCheck(deposit);
                System.out.print("You have successfully deposit your money. Your new balance is : " + balance);
            }
            case 2 -> {
                System.out.println("Please enter the withdraw amount : ");
                String withdraw = scanner.nextLine();
                balance = balance - digitCheck(withdraw);
                System.out.print("You have successfully withdrawn your money. Your new balance is : " + balance);
            }
            case 3 -> System.out.println("Your balance is : " + balance);
            case 4 -> System.out.println("You have successfully logged out!");
            default -> {
                System.out.println("Invalid input. Please try again!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AtmProject atm = new AtmProject();

        System.out.print("Please enter the username : ");
        String checkUserName = scanner.nextLine();
        System.out.print("Please enter the password : ");
        String checkPassword = scanner.nextLine();
        atm.userCheck(checkUserName, checkPassword);
    }
}
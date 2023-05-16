import java.util.Scanner;

public class UserLogin {

    public void loginCheck(String userName, String userPassword) {

        if (userName.equals("muratlevent") && userPassword.equals("test123")) {
            System.out.print("Login successful!");
        } else if (userName.equals("muratlevent")){
            System.out.println("Do you want to reset your password?");
            System.out.println("1-Yes\n2-No");
            Scanner input = new Scanner(System.in);
            String userAnswer = input.nextLine();
            if (userAnswer.equals("1")){

            }
        } else {
            System.out.println("Wrong username or password!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserLogin user = new UserLogin();

        System.out.print("Please enter the Username : ");
        String userName = input.nextLine();
        System.out.print("Please enter the password : ");
        String userPassword = input.nextLine();
        user.loginCheck(userName, userPassword);
    }
}
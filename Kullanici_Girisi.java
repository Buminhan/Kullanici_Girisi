import java.util.Scanner;

public class Kullanici_Girisi{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "Bumin123";
        String a;
        System.out.println("Please enter your password.");
        a = input.nextLine();
        boolean compare = a.equals(password);

        if(compare == true){
            System.out.println("Your password is correct.");
        }
        else{
            System.out.println("Your password is incorrect. Please enter your new password");
            String b;
            b = input.nextLine();
            boolean compare1 = b.equals(password);
            if(compare1 == true){
                System.out.println("Password could not create.Please enter different password.");
            }
            else{
                System.out.println("Password created.");
            }
        }

    }
}

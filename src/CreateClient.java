import java.util.Scanner;

public class CreateClient {



    public static int peopleCount = 0;
    public static String clientName;

    public static void main(String[] args) {
        CreateClient client = new CreateClient();
        client.typeYourName();
        client.updatePeopleCount();


    }

    public void typeYourName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type your name");
        clientName = scan.nextLine();
        System.out.println("Thanks! Your name is " + clientName);

    }

    public void updatePeopleCount(){
        peopleCount = peopleCount + 1;
        System.out.println("Total people count in the system is: " + peopleCount);



    }




}

import java.util.Scanner;

public class CreateClient {
    /*
    Переменные необходимы для хранения в них данных и последующего их применения в других местах нашего кода.
    Проследить зависимость можно спеременными "peopleCount".
    Вначале мы создаем статическую переменную, которая отображает количество пользователей в системе.
    В дальнейшем мы ее используем в других методах,после создания нового клиента в системе.
    Также можно проследить за "clientName" переменной. Мы просим ввести пользователя свое имя, присваиваем это
    значение переменной и в дальнейшем ипользуем это значение чтобы вывести его имя на экран.
     */

    public static int peopleCount = 0;
    public static String clientName;

    public static void main(String[] args) {
        CreateClient client = new CreateClient();
        client.typeYourName();
        client.updatePeopleCount();

        /*
        Методы нам необходимы для проведения каких-либо разарнее описанных действий в нашей программе.
        Примеры можно увидеть в "typeYourName" и "updatePeopleCount".
        Первый метод мы используем чтобы попросить пользователя ввести его имя и вывести его на экран.
        Второй метод мы ипользуем для того чтобы увеличить знчение переменной с количеством заведенных клиентов в системе.
        Благодоря методам нам не надо копипасть кучу раз одно и то же, мы можем просто переиспользовать их.
        */
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

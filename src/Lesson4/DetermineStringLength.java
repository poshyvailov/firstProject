package Lesson4;


import java.util.Scanner;

public class DetermineStringLength {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your name");
        String userName = scanner.nextLine();

        if(userName.isEmpty()) {
            while (userName.isEmpty()) {
                System.out.println("You sent empty field. Please try again");
                userName = scanner.nextLine();
            }
        }
        System.out.println("Thanks! Your name is: " + userName);

        // Здесь я попытался привести пример использования метода isEmpty.
        // В данном случае мы просим ввести пользователя его имя и проверяем не пришла ли пустая строка.
        // Если пришла пустая строка, то мы снова просим ввести его имя, пока не получим значения.
        // По поводу метода lenght() я приводил пример в классе "FindingCharactersAndSubstrings".
        // Мы используем метод lenght для определения длины строки. К примеру можем использовать в циклах
        // для перебора значений строки или для присваивания значений в массивы и т.д.













    }
}

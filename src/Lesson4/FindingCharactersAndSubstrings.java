package Lesson4;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class FindingCharactersAndSubstrings {
    public static int totalLetterCount = 0;  // Создал статическую переменную, которая будет показывать длину текста в строке cityName.
                                             // будем ее использовать ниже


    public static void main(String[] args) {


        String cityName = "Some long text with cities names: Dnipro, New York, London, Dnipro etc"; // Пример строки с текстом,которую будем обрабатывать.


        for (int a = 0; a < cityName.length(); a++) {
            totalLetterCount++;
        }
        System.out.println(cityName.substring(0, totalLetterCount));
        // В этом цикле мы используем метод substring и цикл фор. Мы берем нашу тестовую строку
        // и бегаем по ней чтобы определить ее длину, каждый раз увеличивая нашу totalLetterCount переменную.
        // После завершения цикла, пользуясь substring методом, мы просим вывести значения с индексом от 0
        // до последнего значения,которое мы получили в цикле. - пользуемся totalLetterCount.
        // В итоге мы получаем всю строку с первого по поледние значения.



        System.out.println(cityName.indexOf("Dnipro"));
        // Здесь мы используем indexOf метод. Этот метод пробегается по нашей строке и выводит
        // индекс первлой буквы с которой начинается заданное слово или буква. У нас это - 'Dnipro'.
        // Если в строке встречается много раз одно и то же слово, то мы получим индекс слова,
        // которое находится первым в строке (первым встречается в строке).


        System.out.println(cityName.substring(34, totalLetterCount));
        // В данном примере мы, в продолжение темы, используем substring метод.
        // В предыдущих шагах мы узнали длину строки и узнали, что наш город первый раз встречается в строке под индексом 34.
        // Тепеоь мы решили вывести часть стрики,которая начинается с нашего слова - Dnipro (34 индекс )
        // и до конца строки (Используем нашу переменню totalLetterCount ).





    }
}

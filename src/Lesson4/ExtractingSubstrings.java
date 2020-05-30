package Lesson4;


public class ExtractingSubstrings {

    public static void main(String[] args) {

        int totalCharacterCount = 0;   // Переменная чтобы мы погли в нее положить общую длину нашей тестовой строки

        String someText = "Some text or some big description bla bla bla"; // Строка с которой мы будем работать. К примеру с описанием чего-нибудь - Тестовая строка.

        for(int a = 0; a <someText.length(); a++){                         // В этом цикле мы считаем длину тестовой строки и задаем это значение переменной totalCharacterCount
            totalCharacterCount++;
        }

        System.out.println("length of the someText string is: " + totalCharacterCount);  // Выводим длину тестовой строки. Просто чтобы видеть что происходит




        int halfTextSize = totalCharacterCount / 2;   // Я решил поделить тесторвую строку на две, более короткие, поровну.
                                                      // Для этого я создал переменнуюю halfTextSize.
                                                      // Ей я буду присваивать значение общей длины строки деленной на 2




        String firstHalfOfText = someText.substring(0, halfTextSize);     // Создал строку (firstHalfOfText) и присваиваю ей значения для первой половины тестовой строки
                                                                          // Пользуясь substring я присваиваю ей значения от 0 до halfTextSize переменной - ( первая половина всей строки,тестовой)
        System.out.println("First half of text is: " + firstHalfOfText);  // Вывожу первую половину тестовой строки



        String secondHalfOfText = someText.substring(halfTextSize, someText.length());  //Создал строку (secondHalfOfText) и присваиваю ей значения  второй половины тестовой строки
                                                                                        // Пользуясь substring я присваиваю ей значения от halfTextSize (половина всей тестовой строки) до конца тестовой строки (someText.length())
        System.out.println("Second half of text is: " + secondHalfOfText);              // Вывожу вторую половину тестовой строки



        // Получилось запутанный пример,но пытался придумать практическое применение.
        // В данном примере у нас есть стринга с описанием чего-нибудь (возможно длинный текст)
        // Решено было поделить эту строку на две. Делить решил поровну, на две части
        // Для этого сначала узнал длину встрей строки
        // Потом создал переменную, которая  определит половину длины тестовой строки (halfTextSize)
        // Потом создал стрингу firstHalfOfText чтобы в нее поместить первую часть тестовой строки строки.
        // - использовал substring метод, где указал что этой строке надо присвоить значения от 0 до halfTextSize (половина длины всей тестовой строки)
        // Потом создал secondHalfOfText переменную, чтобы в нее поместить вторую половину тестовой строки.
        // - использовал substring метод, где указал что этой строке надо присвоить значения от второй половины всей длины тестовой строки (halfTextSize переменная) до конца встрей строки someText.length()







    }
}

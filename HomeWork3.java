package lesson3.hw;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

        public static void main (String...args){

            Scanner input = new Scanner(System.in);
            Random numbers = new Random(); // инициализация
            int try3 =0; //инициализация переменной для 3х попыток
            int random = numbers.nextInt(9); //команда генерирует разные числа, вперемешку, от 0 до 9 включительно.
            System.out.print("Угадай число с трех раз,"); // выводим текст на экран

            while (try3 < 3) { //ограничиваем результат до 3х попыток.
                System.out.print("введи от 0 до 9: ");
                int number = input.nextInt(); //инициализация переменной которую должен ввести пользователь, т.е любое число от 0 до 9

                if (number > random) {
                    System.out.println("Слишком много! давай поменьше:");
                    System.out.println("");
                } else if (number < random) {
                    System.out.println("Маловато, давай побольше:");
                    System.out.println("");
                } else if (number == random) {
                    System.out.println("Ты отгадал!");
                    System.out.println("");
                }
                try3++; /* приращение на +1 происходит до тех пор, пока не дойдет до
                    ограничения прописанного в While (try3 <3)т.е 3 попытки 0,1,2  */
            }
            System.out.print("К сожалению, ваши попытки закончились. Начать игру заново? Да? жми 1; Нет? нажми 0:");

            String userData = input.next(); //ввод данных пользователя
            if(userData.equals("1")){ // сравниваем данные(0 или 1)введеные игроком с 1, совпало? происходит возврат к методу main
                // если введеные данные не = 1, например 0 или другое число, то программа заканчивается.
                main(null);
            }
        }
}

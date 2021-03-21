package lesson2.hw;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String args[]) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1()
    {int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };// создать целочисленный массив состоящий из 1 и 0
        for (int i = 0; i < arr.length; i++) // цикл с условием для замены 1 на 0, 0 на 1
            if (arr [i] == 0){
                System.out.println(arr [i] + 1);
            } else System.out.println(arr [i] * 0);}

    public static void task2()
    {int [] arr = new int[8];// создать пустой целочисленный массив размером 8
    for (int i = 0; i < 8; i++)// цикл для заполнения массива значениями 0 3 6 9 12 15 18 21
    {
        arr[i] = i*3;
        System.out.println("arr["+ i +"] = " + arr[i]);
    }}

    public static void task3()
    {int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }; // создать массив 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1
        for (int i = 0; i < arr.length; i++) //цикл с условием значения меньше 6 умножаем на 2
            if (arr [i] < 6) { arr [i] = arr [i] * 2;}
        else { arr [i] = arr [i] ;}
        System.out.println(Arrays.toString(arr));}

    public static void task4()
    {
        int[][] arr = new int[4][4];// создать пустой двумерный массив размером 4 на 4
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }// два цикла с условием для заполнения диагоналей значением 1
    }
}
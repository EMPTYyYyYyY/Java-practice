import java.util.Arrays;
import java.util.Random;

public class pr_1 {
    public static void main(String[] args) {
        int[] mass = {1, 4, 5, 7, 98, 4, 1, 3, 6, 10}; // объявление массива, заполнение ручками
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " "); // вывод массива (ПУНКТ 4)
        }
        System.out.println(" "); // для красоты
        int sum1 = 0; // переменная куда будет складываться сумма эл. массива
        for (int i = 0; i < mass.length; i++) { // через for (ПУНКТ 3)
            sum1 += mass[i];
        }
        System.out.println(sum1); // сумма элем. массива
        int i = 0;
        int sum2 = 0;
        while (i < mass.length) { // через while (ПУНКТ 3)
            sum2 += mass[i];
            i++;
        }
        System.out.println(sum2);
        int[] mass2 = {1, 4, 5, 7, 98, 4, 1, 3, 6, 10}; // второй массив объявленный ручками
        int n = 0;
        int sum3 = 0;
        do { // через do while (ПУНКТ 3)
            sum3 += mass2[n];
            n++;
        } while (n < mass2.length);
        System.out.println(sum3);
        for (int j = 1; j < 11; j++) { // первые 10 чисел гармонического ряда (ПУНКТ 5)
            System.out.print(1. / j + " ");
        }
        System.out.println(" ");
        int[] mass3 = new int[10]; // создание массива и выделение памяти под него
        for (int m = 0; m < 10; m++) {
            mass3[m] = ((int) (Math.random() * 100)); // генерит случайные числа в диапозоне от 0 (включительно) до 100 (невключительно) (ПУНКТ 6)
            System.out.print(mass3[m] + " ");
        }
        System.out.println(" ");
        Arrays.sort(mass3);
        for (int m = 0; m < 10;m++){ // сортировка и вывод отсортированного массива (ПУНКТ 6)
            System.out.print(mass3[m] + " ");
        }
        System.out.println(" ");
        int[] mass4 = new int[10];
        Random rnd = new Random();
        for (int k = 0; k < mass4.length; k++) {
            mass4[k] = rnd.nextInt(100); // рандомом (ПУНКТ 6)
            System.out.print(mass4[k] + " ");
        }
        System.out.println(" ");
        Arrays.sort(mass4); // сортировка (ПУНКТ 6)
        for (int m = 0; m < 10;m++){
            System.out.print(mass4[m] + " ");
        }
    }
}

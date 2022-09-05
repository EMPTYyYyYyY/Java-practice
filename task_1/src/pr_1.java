public class pr_1 {
    public static void main(String[] args) {
        int[] mass = { 1, 4, 5, 7, 98, 4, 1, 3, 6, 10 }; // объявление массива, заполнение ручками
        for (int i = 0; i < mass.length; i++){
            System.out.print(mass[i] + " "); // вывод массива
        }
        System.out.println(""); // для красоты
        int sum = 0; // переменная куда будет складываться сумма эл. массива
        for (int i = 0; i < mass.length; i++){
            sum += mass[i];
        }
        System.out.print(sum); // сумма эл. массива
    }
}

import java.util.Scanner;

public class Main {
    //    Создайте перечисление для угощений в снек-автомате (3-4 позиции).
//    Пользователь вводит номер снека.
//    Программа должна вывести название снека, который выдал автомат.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите номер снека: ");
        int numSnack = scn.nextInt();
        if (numSnack == 1) {
            System.out.println(snackAutomat.ALIONKA);
        }
        if (numSnack == 2) {
            System.out.println(snackAutomat.KORONA);
        }
        if (numSnack == 3) {
            System.out.println(snackAutomat.LAIMA);
        }
        if (numSnack == 4) {
            System.out.println(snackAutomat.BUMER);
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();

        int sum = firstNumber + secondNumber;
        int multi = firstNumber * secondNumber;
        int sub = firstNumber - secondNumber;
        double quotient = (double) firstNumber/secondNumber;
        System.out.println("Cумма чисел = " + sum);
        System.out.println("Произведение чисел = " + multi);
        System.out.println("Разность чисел = " + sub);
        System.out.println("Частное чисел = " + quotient);
    }
}

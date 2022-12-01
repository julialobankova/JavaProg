//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args){
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int fact = 1;
        int t = 1;
        while(n > 1){
            fact = n * fact;
            t =  n + t;
            n = n - 1;     
        }
        System.out.println(String.format("Факториал - %s, Треугольное число -  %s; ", fact, t));

    }
}

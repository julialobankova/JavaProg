package JavaProg.HW.hw1;
import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n1 = sc.nextInt();
        System.out.println("Введите операцию: ");
        System.out.println(" '+' - 1 ");
        System.out.println("'-' - 2 ");
        System.out.println("'*' - 3 ");
        System.out.println("'/' - 4 ");
        int operation = sc.nextInt();
        System.out.println("Введите число: ");
        int n2 = sc.nextInt();
        int res = 0;
        
        if(operation == 1){
            res = n1 + n2;
        }
        if(operation == 2){
            res = n1 - n2;
        }
        if(operation == 3){
            res = n1 * n2;
        }
        if(operation == 4){
            res = n1 / n2;
        }

        System.out.println("Ваш результат: " + res);
    }
    }


package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount demir = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        demir.deposit(20000.0);

        while (true){
            System.out.println(" Ввeдите сумму: " );
            int sum = scanner.nextInt();

            try {
                demir.withDraw(sum);
                System.out.println("Ваш баланс: " + demir.getAmount());
            } catch (LimitEx error) {
                System.err.println(error.getMessage());
                System.out.println("На вашем балансе только: " + demir.getAmount());

                try {
                    demir.withDraw((int)(error.getRemainingAmount()));
                }catch (LimitEx error1){
                    System.out.println(error.getMessage());
                }
            }break;

        }


    }
}

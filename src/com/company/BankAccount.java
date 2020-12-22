package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return this.amount;
    }
    public void deposit(double sum){
        this.amount += sum;

        System.out.println(" Ваш баланс: " + getAmount() );
    }

    public void withDraw(int sum) throws LimitEx {
        if ( sum > this.amount){
            throw new LimitEx("Не хватает средств в депозите: ", this.amount);

        }
        this.amount = this.amount - sum;
        System.out.println("C Вашего баланся было снято: " + this.amount);
    }
}

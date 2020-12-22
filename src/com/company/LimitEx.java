package com.company;

public class LimitEx extends  Exception{


        private double remainingAmount;
        public LimitEx(String message, double remainingAmount) {
            super(message);
            this.remainingAmount = remainingAmount;
        }

        public double getRemainingAmount() {
            return remainingAmount;
        }
}

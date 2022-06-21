package ru.netology.sqr;

public class SQRService {

    public int calculateNumber(int min, int max) {
        int number = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= min) {
                if (square <= max) {
                    number++;
                }

            }


        }
        return number;
    }
}

package ru.netology.sqr;

public class SQRService {
    public int calculate(int number) {
        int j = 0;
        {
            for (int i = 10; i <= 99; i++) {
                if (i * i >= 200 && i * i <= 300) {
                    return number;
                }
            }

        }
        return 0;
    }
}

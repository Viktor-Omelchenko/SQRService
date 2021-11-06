package ru.netology.sqr;

public class SQRService {
    public int sqrService(int sqr){
        int namber = 0;
        for (int i = 10; i < 99; i++) {
            if (200<=i*i && i*i <=300){
                namber++;
            }
          }
        return namber;
    }

}

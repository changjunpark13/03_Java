package com.ohgiraffers.section01.array;

import java.util.Random;

public class Application5 {
    public static void main(String[] args) {

        String[] shape = {"SPADE", "HEART", "DIAMOND", "CLUB"};
        String[] cardNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        int randomShapeIndex = (int)(Math.random()* shape.length);// 0~3 //new Random().nextInt(cardNumber.length);
        int readomcardNumberIndex = (int)(Math.random()* cardNumber.length); // 0~ 13

        System.out.println("당신이 뽑은 카드는 " + shape[randomShapeIndex] + " " + cardNumber[readomcardNumberIndex] + "카드 입니다");
    }
}

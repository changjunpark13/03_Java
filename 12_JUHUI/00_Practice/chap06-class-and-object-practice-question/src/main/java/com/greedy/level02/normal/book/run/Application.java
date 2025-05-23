package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {

    public static void main(String[] args) {

        BookDTO book1 = new BookDTO(); // 객체를 생성해서 생성자 출력

        // 매개변수가 있는 생성자를 이용해 생성시점부터 값을 초기화하고 시작한는 방법
        // 넣기는 쉽지만, 인텔리제이가 자동해서 알려주는거라 구분하기 쉽지만 평소엔 보이지 않아 구별 어려움.
        BookDTO book2 = new BookDTO("자바의 정석", "도우출판","남궁성");
        BookDTO book3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        // 생성자에 값을 넣어주어 초기화 해주는 작업임.

        //출력을 위해 필요함.
        book1.printInformation();
        book2.printInformation();
        book3.printInformation();




    }
}

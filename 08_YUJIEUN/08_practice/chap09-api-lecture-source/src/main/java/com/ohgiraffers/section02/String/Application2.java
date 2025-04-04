package com.ohgiraffers.section02.String;




public class Application2 {

    public static void main(String[] args) {


    /**
     * 문다열 객체를 만드는 방법
     * """리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다.
     * new String("문자열") :매번 새로운 인스턴스를 생성한다.
     */

    String str1 = "java";
    String str2 = "java";
    String str3 = new String("java");
    String str4 = new String("java");


        System.out.println("str1 == str2 :" +  (str1 ==str2));
        System.out.println("str2 == str3 :" +  (str2 ==str3));
        System.out.println("str3 == str4 :" +  (str3 ==str4));

        System.out.println("str1.hashCode() = "+str1.hashCode());
        System.out.println("str2.hashCode() = "+str2.hashCode());
        System.out.println("str3.hashCode() = "+str3.hashCode());
}


}

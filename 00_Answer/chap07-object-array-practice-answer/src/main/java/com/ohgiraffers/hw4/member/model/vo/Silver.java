package com.ohgiraffers.hw4.member.model.vo;

public class Silver {

    private String name;
    private String grade;
    private int point;

    public Silver() {
    }

    public Silver(String name, String grade, int point) {
        this.name = name;
        this.grade = grade;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public double getEjapoint() {
        return point * 0.02;
    }
}

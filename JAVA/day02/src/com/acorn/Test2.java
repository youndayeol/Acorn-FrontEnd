package com.acorn;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 국어 점수 입력
        System.out.print("국어점수:>>>");
        int nlpoint = sc.nextInt();

        // 영어 점수 입력
        System.out.print("영어점수:>>>");
        int elpoint = sc.nextInt();

        // 수학 점수 입력
        System.out.print("수학점수:>>>");
        int matlpoint = sc.nextInt();

        // 국어, 영어, 수학 점수 합산
        int sum = nlpoint + elpoint + matlpoint;

        // 평균 값 계산
        double average = (double) sum / 3;

        // 점수 합 및 평균 출력
        System.out.println();
        System.out.println("전체 점수의 합: " + sum);
        System.out.println("전체 점수의 평균: " + average);

        // 과락 기준 설정
        int passScore = 60;
        double passAverage = 60.0;

        // 합격/불합격 여부 결정
        boolean fuckScore = (nlpoint < passScore) || (elpoint < passScore) || (matlpoint < passScore);
        boolean fuckAverage = average < passAverage;

        // 불합격일 때 조건
        if (fuckScore || fuckAverage) {
            System.out.println("불합격입니다.");

            if (fuckScore) {
                System.out.println("과락 기준에 부합하지 않습니다.");
            }

            if (fuckAverage) {
                System.out.println("평균 점수 기준에 부합하지 않습니다.");
            }
        } else {
            // 합격일 때 조건
            System.out.println("합격입니다.");
        }

        sc.close();
    }
}


package com.acorn;

import java.util.Scanner;

public class study01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("중간고사 점수: ");
        double midtermScore = scanner.nextDouble();
        
        System.out.print("기말고사 점수: ");
        double finalScore = scanner.nextDouble();
        
        System.out.print("과제 점수: ");
        double assignmentScore = scanner.nextDouble();
        
        System.out.print("출석 횟수: ");
        int attendanceCount = scanner.nextInt();
        
        double totalScore = (midtermScore * 0.2) + (finalScore * 0.3) + (assignmentScore * 0.3);
        
//        if (attendanceCount < attendanceCount - (0.3 * totalDays)) {
//            System.out.println("출석 횟수 부족으로 Fail");
//        } else if (totalScore <= 70) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail");
//        }
        
        if ( (totalScore >= 70) && (attendanceCount > 30) ) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        
        
        
        scanner.close();
    }
}

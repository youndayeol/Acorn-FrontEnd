package com.acorn;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ���� ���� �Է�
        System.out.print("��������:>>>");
        int nlpoint = sc.nextInt();

        // ���� ���� �Է�
        System.out.print("��������:>>>");
        int elpoint = sc.nextInt();

        // ���� ���� �Է�
        System.out.print("��������:>>>");
        int matlpoint = sc.nextInt();

        // ����, ����, ���� ���� �ջ�
        int sum = nlpoint + elpoint + matlpoint;

        // ��� �� ���
        double average = (double) sum / 3;

        // ���� �� �� ��� ���
        System.out.println();
        System.out.println("��ü ������ ��: " + sum);
        System.out.println("��ü ������ ���: " + average);

        // ���� ���� ����
        int passScore = 60;
        double passAverage = 60.0;

        // �հ�/���հ� ���� ����
        boolean fuckScore = (nlpoint < passScore) || (elpoint < passScore) || (matlpoint < passScore);
        boolean fuckAverage = average < passAverage;

        // ���հ��� �� ����
        if (fuckScore || fuckAverage) {
            System.out.println("���հ��Դϴ�.");

            if (fuckScore) {
                System.out.println("���� ���ؿ� �������� �ʽ��ϴ�.");
            }

            if (fuckAverage) {
                System.out.println("��� ���� ���ؿ� �������� �ʽ��ϴ�.");
            }
        } else {
            // �հ��� �� ����
            System.out.println("�հ��Դϴ�.");
        }

        sc.close();
    }
}


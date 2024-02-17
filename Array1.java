package bitstudy;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = {90, 80, 70, 60, 50};
        int sum=0;
        for(int i=0;i<score.length; i++) {
            sum = sum + score[i];
        }
        int A=sum/5;
        System.out.println("점수 총합 : " + sum);
        System.out.println("점수 평균 : " + A);
        }
    }

package bitstudy;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        /*2번문제
        -	50, 30, 20 세 숫자의 합계와 평균을 구하기.
         -	합계, 평균 변수의 타입은 int로 설정*/
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해주세요");
        int a = sc.nextInt();
        System.out.println("두번째 숫자를 입력해주세요");
        int b = sc.nextInt();
        System.out.println("세번째 숫자를 입력해주세요");
        int c = sc.nextInt();
        int plus = a+b+c;
        int average = (a+b+c)/3;
        System.out.println("합계" +plus);
        System.out.println("평균" +average);

    }
}

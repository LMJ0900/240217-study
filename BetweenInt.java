package bitstudy;

import java.util.Scanner;

public class BetweenInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요");
        int num = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요");
        int num2 = sc.nextInt();
        System.out.print("두 숫자 사이의 정수는 : ");
        if (num < num2) {
            for (int i = num; i < num2; i++) {
                System.out.print(i);
            }
        } else {
            for (int i = num2; i < num; i++) {
                System.out.print(i+" ,");
            }
        }
    }
}
package bitstudy;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단의 단 수를 입력해주세요");
        int num = sc.nextInt();
        for(int i=1; i<10; i++){
        int result = num*i;
            System.out.println(num+ " X " + i + " = " +result);
        }
    }
}

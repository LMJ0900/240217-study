package bitstudy;

import java.util.Scanner;

public class Betweenint2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요.");
        int num1 = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요");
        int num2 = sc.nextInt();

        int temp;
        if(num1>num2){
            temp=num1;
            num1=num2;
            num2=temp;
        }
        System.out.println("두 숫자 사이의 모든 정수 : ");
        for(int i = num1; i<=num2; i++){
            System.out.print(i);
            if(i != num2){
                System.out.print(",");
            }
        }
    }
}

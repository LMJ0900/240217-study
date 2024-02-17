package bitstudy;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] score = new int[5];
        for(int i=0; i<5; i++) {
            System.out.println("숫자를 입력하세요");
            score[i] = sc.nextInt();
        }
        int sum=0;
        int av=0;
        for(int i=0; i<5; i++){
            sum = sum+score[i];
        }
        av=sum/5;
        System.out.println("입력한 정수의 합계 : " +sum);
        System.out.println("입력한 정수의 평균 : " +av);

    }
}

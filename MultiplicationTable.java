package bitstudy;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단을 출력합니다");
        for(int i = 2; i<10; i++){
            System.out.println(i + "단" );
            for(int j = 2; j < 10; j++){
                System.out.println(i+" X "+ j + " = " + i*j);
            }
        }
    }
}

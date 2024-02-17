package bitstudy;

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 받을 숫자의 개수를 입력하세요");
        int num1 = sc.nextInt();
        int[] arr = new int[num1];
        int num2 = 0;
        System.out.println(num1 +"개의 정수를 입력하세요 : ");
        for(int i=0; i<num1; i++){
            arr[i] = sc.nextInt();
            }
        }


    }

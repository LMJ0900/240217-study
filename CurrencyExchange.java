package bitstudy;

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("환전할 달러를 입력하세요");
        int dol = sc.nextInt();
        int dollar = dol*1300;
        System.out.println("dollar : " + dol);
        if(dol<=0){
            System.out.println("올바른 값이 아닙니다");
        }else{
            System.out.println("환전 금액은" +dollar+ "입니다.");
        }


    }
}

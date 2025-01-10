package com.example.calculator1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int first = 0, second = 0;
            boolean validInput = false;

            // 첫 번째 숫자 입력 처리
            while (!validInput) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                try {
                    first = scanner.nextInt();
                    if(first < 0) {
                        System.out.println("양의 정수를 입력해주세요.(0 포함): ");
                        continue;
                    }
                    validInput = true; // 유효한 입력이므로 루프 종료
                } catch (InputMismatchException e) {
                    System.out.println("오류: 숫자를 입력해야 합니다.");
                    scanner.nextLine(); // 잘못된 입력 처리
                }
            }

            validInput = false; // 두 번째 숫자 입력을 위한 초기화

            // 두 번째 숫자 입력 처리
            while (!validInput) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                try {
                    second = scanner.nextInt();
                    if(second < 0) {
                        System.out.println("양의 정수를 입력해주세요.(0 포함): ");
                        continue;
                    }
                    validInput = true; // 유효한 입력이므로 루프 종료
                } catch (InputMismatchException e) {
                    System.out.println("오류: 숫자를 입력해야 합니다.");
                    scanner.nextLine(); // 잘못된 입력 처리
                }
            }
            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = scanner.next();

            int result = 0;
            boolean flag = true; // 잘못된 연산일 경우 result 출력 방지 플래그


            switch (operator) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "/":
                    if (second == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        flag = false;
                        break;
                    }
                    result = first / second;
                    break;
                default:
                    System.out.println("오류: 잘못된 연산자입니다. (+, -, *, / 중에서 선택하세요)");
                    flag = false;
                    break;
            }
            if (flag) {
                System.out.println(result);
            }
            scanner.nextLine(); //한 줄 비우기
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = scanner.nextLine();
            if ("exit".equals(answer)) { //null safe하게 작성해야 함
                break;
            }
        }
    }

}

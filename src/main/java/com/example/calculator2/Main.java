package com.example.calculator2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();

    while(true) {
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
                System.out.println("오류: 숫자를 입력해주세요.");
                scanner.nextLine(); // 잘못된 입력 처리
            }
        }

        validInput = false; // 두 번째 숫자 입력을 위한 초기화!

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
                System.out.println("오류: 숫자를 입력해주세요.");
                scanner.nextLine(); // 잘못된 입력 처리
            }
        }

        validInput = false; //사칙연산 기호를 위한 초기화!
        char operator = ' ';

        while (!validInput) {
            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
            operator = scanner.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                validInput = true; // 유효한 연산자 입력 시 루프 종료
            } else {
                System.out.println("오류: 올바른 사칙연산 기호를 입력해주세요. (+, -, *, /)");
            }
        }


        double result = calculator.calculate(first, second, operator);
        calculator.setResults(result);


        System.out.println("결과: " + result);

        scanner.nextLine(); //nextInt()가 남긴 줄바꿈 문자 처리 (scanner.nextInt()는 정수만 읽고, 엔터 키(\n)를 입력 버퍼에 남긴다.)

        System.out.print("가장 먼저 저장된 데이터를 삭제하시겠습니까? (y): ");
        String deleteAnswer = scanner.nextLine();
        if (deleteAnswer.equalsIgnoreCase("y")) {
            calculator.removeFirstResult();
            System.out.println("삭제 후 결과: " + calculator.getResults());
        }


        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        String answer = scanner.nextLine();
        if("exit".equalsIgnoreCase(answer)) {
            break;
        }
    }
    scanner.close();

    }
}
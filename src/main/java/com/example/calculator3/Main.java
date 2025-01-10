package com.example.calculator3;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArithmeticCalculator<Number> arithmeticCalculator = new ArithmeticCalculator<>();
    while(true) {
        double first = 0, second = 0;
        boolean validInput = false;

        // 첫 번째 숫자 입력 처리
        while (!validInput) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            try {
                first = scanner.nextDouble();
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
                second = scanner.nextDouble();
                validInput = true; // 유효한 입력이므로 루프 종료
            } catch (InputMismatchException e) {
                System.out.println("오류: 숫자를 입력해주세요.");
                scanner.nextLine(); // 잘못된 입력 처리
            }
        }

        validInput = false; // 사칙연산 기호를 위한 초기화!
        OperatorType operator = null;

        while (!validInput) {
            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
            char symbol = scanner.next().charAt(0);
            try {
                operator = OperatorType.search(symbol);
                validInput = true; // 유효한 연산자 입력 시 루프 종료
            } catch (IllegalArgumentException e) {
                System.out.println("오류: " + e.getMessage());
            }
        }

        double result = arithmeticCalculator.calculate(first, second, operator);
        arithmeticCalculator.setResults(result);


        System.out.println("결과: " + result);

        scanner.nextLine(); //nextInt()가 남긴 줄바꿈 문자 처리 (scanner.nextInt()는 정수만 읽고, 엔터 키(\n)를 입력 버퍼에 남긴다.)

        System.out.print("가장 먼저 저장된 데이터를 삭제하시겠습니까? (y): ");
        String deleteAnswer = scanner.nextLine();
        if (deleteAnswer.equalsIgnoreCase("y")) {
            arithmeticCalculator.removeFirstResult();
            System.out.println("삭제 후 결과: " + arithmeticCalculator.getResults());
        }

        validInput = false;
        while(!validInput){
            System.out.print("입력받는 수보다 큰 연산 값들 출력: ");
            try {
                double referenceValue = scanner.nextDouble();
                List<Number> greaterResults = arithmeticCalculator.searchBiggerNumbers(referenceValue);
                System.out.println("입력값보다 큰 결과값들: " + greaterResults);
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요");
                scanner.nextLine(); // nextDouble()이 남긴 줄바꿈 문자 처리
            }
        }
        scanner.nextLine(); // nextDouble()이 남긴 줄바꿈 문자 처리

        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        String answer = scanner.nextLine();
        if("exit".equalsIgnoreCase(answer)) {
            break;
        }
    }
    scanner.close();
    }
}
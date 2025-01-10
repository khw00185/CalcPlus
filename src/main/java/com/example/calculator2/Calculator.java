package com.example.calculator2;

import java.util.ArrayList;

public class Calculator {
    private final ArrayList<Double> resultList = new ArrayList<>();

    public Calculator() {
    }

    public double calculate(int first, int second, char operator) throws IllegalArgumentException{

        double result = 0;
        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                if(second == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }
                result = (double) first / second;
                break;
            default:
                throw new IllegalArgumentException("오류: 잘못된 연산자입니다. (+, -, *, / 중에서 선택하세요)");
        }
        return result;
    }

    // 연산 결과를 가져오는 Getter
    public ArrayList<Double> getResults() {
        return new ArrayList<>(resultList); // 캡슐화: 복사본 반환
    }
    // 연산 결과를 저장하는 Setter
    public void setResults(double result) {
        resultList.add(result);
    }

    // 가장 먼저 저장된 결과를 삭제하는 메서드
    public void removeFirstResult() {
        if (!resultList.isEmpty()) {
            resultList.remove(0);
        } else {
            System.out.println("삭제할 데이터가 없습니다.");
        }
    }
}

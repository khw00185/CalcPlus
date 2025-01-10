package com.example.calculator2;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> resultList;

    public Calculator() {
        resultList = new ArrayList<>();
    }

    public int calculate(int first, int second, char operator) {

        int result = 0;
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
                result = first / second;
                break;
            default:
                System.out.println("오류: 잘못된 연산자입니다. (+, -, *, / 중에서 선택하세요)");
                break;
        }
        return result;
    }

    // 연산 결과를 가져오는 Getter
    public ArrayList<Integer> getResults() {
        return new ArrayList<>(resultList); // 캡슐화: 복사본 반환
    }
    // 연산 결과를 저장하는 Setter
    public void setResults(int result) {
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

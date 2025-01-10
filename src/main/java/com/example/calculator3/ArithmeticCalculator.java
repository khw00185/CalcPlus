package com.example.calculator3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {
    //연산결과 저장 리스트
    private final List<T> resultList = new ArrayList<>();


    public double calculate(T first, T second, OperatorType operator) {
        double result = 0;
        double firstNum = first.doubleValue(); //T를 double형으로 변환
        double secondNum = second.doubleValue();
        switch (operator) {
            case ADD:
                result = firstNum + secondNum;
                break;
            case SUBTRACT:
                result = firstNum - secondNum;
                break;
            case MULTIPLY:
                result = firstNum * secondNum;
                break;
            case DIVIDE:
                if(secondNum == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }
                result = firstNum / secondNum;
                break;
            default:
                throw new IllegalArgumentException("오류: 잘못된 연산자입니다. (+, -, *, / 중에서 선택하세요)");
        }
        return result;
    }

    // 연산 결과를 가져오는 Getter
    public List<T> getResults() {
        return new ArrayList<>(resultList);
    }
    // 연산 결과를 저장하는 Setter
    public void setResults(T result) {
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
    //입력 받은 기준 값보다 큰 값 반환
    public List<T> searchBiggerNumbers(T value) {
        return resultList.stream()
                .filter(num -> num.doubleValue() > value.doubleValue())
                .collect(Collectors.toList());
    }
}

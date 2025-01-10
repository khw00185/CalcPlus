package com.example.calculator3;

public enum OperatorType {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');
    private final char symbol;
    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public static OperatorType search(char symbol) {
        for (OperatorType type : values()) { // 모든 열거형 상수를 순회
            if (type.getSymbol() == symbol) {
                return type;
            }
        }
        throw new IllegalArgumentException("잘못된 연산자입니다. (+, -, *, / 중에서 선택하세요)");
    }


}

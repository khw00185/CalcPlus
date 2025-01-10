이 프로젝트는 Java로 작성된 다양한 계산기 프로그램들을 포함하고 있으며, 각 계산기마다 서로 다른 기능과 구조를 제공합니다.

프로젝트 구조

<img width="616" alt="image" src="https://github.com/user-attachments/assets/8c051e59-4974-4436-b1e1-ee980d6d35ac" />

	•	calculator1: 기본적인 사칙연산 계산기
	•	calculator2: 사칙연산 결과를 저장하고 관리하는 확장된 계산기
	•	calculator3: 제네릭 타입을 활용하여 더 다양한 연산과 결과 비교 기능을 제공하는 고급 계산기

 폴더별 설명

1. calculator1

기본적인 사칙연산 계산기입니다.
사용자가 두 개의 정수를 입력하고, 사칙연산(+, -, *, /) 기호를 입력하면 결과를 출력합니다.
잘못된 입력에 대해 예외 처리가 되어 있으며, 사용자가 원하는 경우 반복적으로 연산을 수행할 수 있습니다.

	•	주요 기능
 
	•	두 개의 양의 정수를 입력받아 사칙연산을 수행
 
	•	나눗셈 연산에서 0으로 나눌 경우 오류 메시지 출력
 
	•	exit 입력 시 프로그램 종료

 2. calculator2

사칙연산 결과를 리스트에 저장하고 관리할 수 있는 확장된 계산기입니다.
사용자가 연산을 수행한 후 결과를 리스트에 저장하며, 필요 시 가장 오래된 결과를 삭제할 수 있습니다.

	•	주요 기능
 
	•	두 개의 양의 정수를 입력받아 사칙연산을 수행
 
	•	연산 결과를 리스트에 저장 및 조회
 
	•	가장 먼저 저장된 결과를 삭제하는 기능 제공
 
	•	exit 입력 시 프로그램 종료

 3. calculator3

고급 기능을 제공하는 계산기입니다.
이 계산기는 제네릭 타입을 활용하여 다양한 숫자 타입을 지원하며, 연산 결과를 리스트에 저장하고 기준 값보다 큰 결과를 검색할 수 있습니다.
또한, 연산자를 **열거형(enum)**으로 관리하여 가독성과 유지보수성을 향상시켰습니다.

	•	주요 기능
 
	•	제네릭 타입을 사용하여 int, double 등 다양한 숫자 타입 지원
 
	•	연산 결과를 리스트에 저장 및 조회
 
	•	입력받은 기준 값보다 큰 결과들을 필터링하여 출력
 
	•	열거형을 활용하여 연산자 관리
 
	•	exit 입력 시 프로그램 종료

 실행 방법

	1.	프로젝트 클론
 <img width="617" alt="image" src="https://github.com/user-attachments/assets/b83597c4-82bd-4d92-ae7c-a3e8bb9a2d34" />

 2.	Java 컴파일 및 실행
<img width="619" alt="image" src="https://github.com/user-attachments/assets/d5f5a217-1497-49aa-8468-9a771d6be91c" />


사용 예시

1. calculator1 사용 예시
<img width="617" alt="image" src="https://github.com/user-attachments/assets/73f7a278-8bc0-4062-80e7-1ce1d944030a" />

2. calculator2 사용 예시
<img width="620" alt="image" src="https://github.com/user-attachments/assets/ccb0edad-ca19-4375-adaa-a3f815cd9f33" />

3. calculator3 사용 예시
<img width="616" alt="image" src="https://github.com/user-attachments/assets/95f44847-3f4c-4247-8466-8f4eb8032347" />


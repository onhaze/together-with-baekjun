## 📍 문제 정보

- [#25314. 코딩은 체육과목 입니다](https://www.acmicpc.net/problem/25314)
  <img src="https://static.solved.ac/tier_small/1.svg" width="16" height="16">

- **🏷️ 문제 유형**: 구현

---

## 문제

> 오늘은 혜아의 면접 날이다. 면접 준비를 열심히 해서 앞선 질문들을 잘 대답한 혜아는 이제 마지막으로 칠판에 직접 코딩하는 문제를 받았다. 혜아가 받은 문제는 두 수를 더하는 문제였다.
C++ 책을 열심히 읽었던 혜아는 간단히 두 수를 더하는 코드를 칠판에 적었다.

그런데 면접관이 물었다.
“만약, 입출력이 N바이트 크기의 정수라면 프로그램을 어떻게 구현해야 할까요?”

혜아는 책에서 본 내용을 떠올렸다. long int는 4바이트, long long int는 8바이트.
그럼 long을 하나 더 붙일 때마다 4바이트씩 증가한다고 생각하고,
N바이트까지 저장 가능한 자료형이라면 "long"을 N/4번 적고 마지막에 "int"를 붙였다.

혜아가 쓴 자료형 이름을 출력하는 프로그램을 작성하자.

## 입력

> 정수 N이 주어진다.
> 4 ≤ N ≤ 1000, N은 4의 배수

## 출력

> long을 N/4번 출력하고, 마지막에 int를 붙여 출력한다.

> long과 int 사이에는 공백이 하나 있어야 한다.

## 예제 입력

> 4

## 예제 출력

> long int

---

## 📊 풀이 정보

- **⏱️ 소요 시간**: 15분
- **🔄 시도 횟수**: 1회
- **📅 풀이 날짜**: 2025-07-25

---

## 💭 풀이 과정 (ETC)

- 문제 자체는 단순 구현이라 어렵지 않았고, for문을 이용해서 "long "을 반복 출력한 뒤 "int"를 붙이면 끝나는 구조였다.

- Java에서 for문을 처음 사용해봤고, 반복문으로 문자열을 출력하는 법을 연습할 수 있었다.


## 🔥 풀이 핵심:  
- for문 학습: int i = 0; i < N; i++ 형식으로 반복 실행 구조 익힘
- 문제 설명에서 C++의 int, long, long long 자료형 크기와 Java의 int, long의 차이를 비교할 수 있어서 두 언어의 자료형 차이점도 자연스럽게 공부하게 되었다.

  - 정수 기본형: C++ `int`  = Java `int`
  - 더 큰 정수: C++ `long`, `long long` = Java `long`
  - 실수형:     C++ `float`, `double` = Java `float`, `double`
  - 문자형:     C++ `char` = Java `char`
  - 문자열:     C++ `std::string` = Java `String`

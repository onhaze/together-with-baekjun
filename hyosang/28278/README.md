## 📌 문제 링크

[#28278. 스택 2](https://www.acmicpc.net/problem/28278) <img src="https://static.solved.ac/tier_small/7.svg" width="16" height="16">

---

## 📝 문제 설명

정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하는 문제입니다.

---

## 📌 문제 정보

- **문제 번호:** 28278번
- **문제 유형:** 자료구조, 스택
- **풀이 날짜:** 2025년 7월 24일
- **소요 시간:** 약 55분
- **시도 횟수:** 총 4회

---

## ✅ 입출력 예시

**입력 예시**
9
4
1 3
1 5
3
2
5
2
2
5

**출력 예시**
1
2
5
3
3
-1
-1

---

## 💡 풀이 과정

처음 문제를 봤을 때 막힘 없이 풀어나갔는데 문제를 제출했을 때 자잘한 컴파일 에러와 가장 중요한
런타임 에러가 발생해서 그 문제를 해결하는데 시간이 더 소요했습니다. 결과적으로 입출력 I/O 방식을
기존에 Scanner 를 사용해서 진행하던 것을 BufferedReader, StringTokenizer를 사용하여 시간을
단축해서 해결할 수 있었습니다!

---

## ✏️ 풀이 핵심

- 스위치를 사용해서 주어진 경우의 수를 처리하는 것과 입출력의 시간을 단축하는 것이 핵심입니다.
- ArrayList<> 자료형을 사용하여 함수를 통해 구현하는 것이 중요한 요인이었습니다.

---

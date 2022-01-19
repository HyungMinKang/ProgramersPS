
## 크레인 인형뽑기 게임
https://programmers.co.kr/learn/courses/30/lessons/64061

### 문제이해
+ boards: 인형이 담겨있는 2차원 배열
+ moves: 크레인이 움직일 위치를 담고 있는 배열
+ answer: 터트려져 사라진 인형의 개수
+ 가장 최근에 담은 인형과 가져오는 인형이 같은지 확인할 필요가 있다
+ 따라서 Stack에 인형을 담으면서 , top과 가져오는 인형이 같은지 확인하며 처리 

### 구현
+ moves에 원소를 하나씩 가져온다
+ board [row][column]에서 column은 moves에 의해 결정,  row은 for문을 통해 순회
+ row를 순회하면서 가장위에 있는 인형을 가져옴  
+ 그리고 가져온 인형과 stack의 top과 비교( stack이 비어있지 않다는 조건) 
+ 같다면, stack에서 pop()을 하고, answer에 2를 더해줌
+ 같지 않다면, stack에 가져온 인형 push

##  모의고사
https://programmers.co.kr/learn/courses/30/lessons/42840
### 문제이해
+ answer: 문제의 정답을 담고 있는 배열
+ retunr값: 가장 문제를 많이 맞춘 수포자의 인덱스를 ascedning order로 담고 있는 배열 

### 구현
+ 수포자1,2,3의 찍는 패턴을 추출해 배열에 저장 (math1, math2, math3)
+ 각 수포자별 맞힌 개수를 저장하기 위한 solCount배열 선언
+ answer로 부터 원소를 하나씩 가져옴 (forEachIndexed 문을 통해, index와 value 모두 가져옴)
+ index를 각 수포자별 찍는 패턴의 길이로 모듈러 연산을 한다
+ 그 index를 math1,math2,math3에 적용하면 해당 answer에 대한 각 수포자의 답을 알 수 있다
+ 만약 answer와 같다면 solCount의 각 수포자별 인덱스 증가 
+ answer 배열을 모두 돌고나서 max 함수를 이용해 solCount의 max값을 알아냄
+ solCount를 순회하며 max값과 같은 문제를 맞춘 수포자의 인덱스를 결과 배열리스트에 담음(add를 하면 자동으로 ascending order가 됨)


## 이상한 문자 만들기
https://programmers.co.kr/learn/courses/30/lessons/12930
### 문제이해
+ String s: 여러 단어를 담고있는 문자열
+ answer: 각 단어 기준 홀수 인덱스는 소문자 짝수문자는 대문자로 변환한 문자열

### 구현
+ words:  주어진 문자열을 공백 기준으로 분할 -> 문자열 배열 리턴
+ map함수를 이용해 문자열에서 각 단어를 추출
+ word를 mapIndexed를 통해  word의 각 index와 char을 접근
+  index%2==0 이면 대문자  !=0이면 소문자로 변환
+  변환후 joinToString("")을 통해 다시 word로 합침
+  word들을 모두 변환후, word들을 jointToString(" ")을 통해 공백을 두고 합치기


# K번째수
https://programmers.co.kr/learn/courses/30/lessons/42748
### 문제이해
+ commands: 배열 자를 시작 위치, 끝 위치,  정렬한 뒤 가져올 인덱스를 순서대로 담고있는 배열을 담고 있는 2차원 배열
+ array: 자를 문자열 
+ answer: 결과값을 담을 배열 

### 구현
+ command in commands를 통해 2차원 배열에서 배열을 하나씩 가져옴
+ i= command[0]-1
+ j=command[1]-1
+ k= command[2]-1 을 통해 index정보를 저장함
+ 주어진 array를 SliceArray(IntRange(start,end))를 통해 자름
+ 그 결과를 sorted한 후, k번째 인덱스를 리턴할 배열에 저장   ( array.SliceArray(IntRange(i,j)).sorted()[k]를 result에 add) 


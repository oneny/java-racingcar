## Keep in mind
* 모든 로직에 단위 테스트 구현(핵심 로직 구현 코드와 UI 담당 로직 구분하기)
* 컨벤션 지키기
* else 예약어, switch/case 쓰지 않기

## TODO
* ~~UI 코드 구현하기~~
    * ~~입력값은 Scanner~~
    * ~~자동차 대수, 시도할 회수 변수화하기~~
* 로직 코드 구현하기
    * ~~Random값은 java.util.Random 클래스의 nextInt(10) 메소드 활용~~
    * ~~output 출력 main 메서드~~
    * ~~자동차 이동 메서드~~

**1차 피드백**
* ~~Java 컨벤션 리팩토링~~
* 클래스 분리하기
  * ~~멤버변수, 상수 분리하기~~
  * ~~Car의`일급컬렉션` Cars 구현하기~~

**2차 피드백**
* 객체 클래스 역할 나누기
  * ~~전략패턴 사용해 Car 내 전진 조건 수정하기~~ 
* ~~CarRace setter 생성 시점에 받아오기~~
* ~~Message Inputview 클래스로 묶기~~
* ~~CarRace 메서드 Cars 클래스로 역할 나누기~~

**3차 피드백**
* 도메인 객체만 테스트하기
  * ~~Car~~
  * ~~Cars~~
  * CarRace
* ~~while -> for문~~
  - 조건이 없을 경우(loop가 언제 끝날지 아는경우) for문을 쓰는게 나음
* ~~createCarList() Cars 클래스에 위임~~
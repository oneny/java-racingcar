# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 기능 요구사항
[x] 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
[x] 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
[x] 사용자는 게임에 참여할 자동차 대수를 입력받는다.
[x] 사용자는 게임 횟수를 입력받는다.
[x] 자동차의 상태를 화면에 출력한다.

## 프로그래밍 요구사항
[x] UI와 핵심로직을 분리한다. (InputView, OutputView, Car)
[x] 모든 로직에 단위 테스트를 구현한다.
[x] README.md 파일에 구현할 기능 목록을 정리해 추가한다.
[] 자바 코드 컨벤션을 지키면서 프로그래밍한다.
[x] else 예약어를 쓰지 않는다.
[x] 종류를 구분하여 commit message 작성한다.
## 🚀 기능 요구사항
- 기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.
- 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 낫싱이란 힌트를 얻고, 그 힌트를
이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.
  - [예] 상대방(컴퓨터)의 수가 425일 때,
  - 123을 제시한 경우 : 1스트라이크 
  - 456을 제시한 경우 : 1볼 1스트라이크 
  - 789를 제시한 경우 : 낫싱 
- 위 숫자 야구게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다. 게임 플 레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고, 컴퓨터는 게임 플레이어가 입력한 숫자에 대한 결과를 출력한다.
- 이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
- 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다.

# 구현 기능 목록
### ✅ RandomNumberGenerator
- 각 자리는 1~9까지의 수로 이루어져 있다. 
- 각 자리는 서로 다른 수로 이루어져 있다.
- 3자리 수보다 적거나 많은 자리의 수는 허용하지 않는다.
- 랜덤 값은 ArrayList<Integer>로 반환한다. (get)
- camp.nextstep.edu.missionutils.Randoms의 pickNumberInRange()를 이용하여 랜덤 값을 생성한다.

###  ✅ Referee
- RandomNumberGenerator에서 생성한 난수와 Player가 입력한 수의 게임 결과(GameResult)를 판별한다.

### ✅ Player
- player가 입력한 글자의 수를 검사하는 함수가 포함된다.
- player가 입력한 글자의 중복 값을 검사하는 함수가 포함된다.
- player가 입력한 글자가 숫자인지 검사하는 함수가 포함된다.

### ✅ GameState
- Restart, Quit의 값이 존재한다.

### ✅ MatchType
- Strike, Ball, Nothing의 값의 존재한다.

### ✅ GameRule
- 서로 다른 3자리로 이루어진다.
- 제일 작은 수는 1이다.
- 제일 큰 수는 9이다.

### ✅ GameResult
- Map<MatchType, Integer> 형태의 값을 리턴한다.
- Type에 따라 값을 갱신하는 함수를 만든다.

### ✅ UserInputView
- camp.nextstep.edu.missionutils.Console의 readLine()을 이용해서 사용자가 입력하는 값을 얻는다.

### ✅ WrongPlayerNumberException
- Player에게 숫자를 입력받을 때 발생할 수 있는 예외를 만든다.
- 글자수가 초과되었을 경우
- 중복값이 있을 경우
- 숫자가 아닌 경우

### ✅ GameRunner
- 게임 한판을 실행

### ✅ OpinitionInput
- 게임을 계속할 것인지 Player에게 의견을 받는다.
- 받은 의견이 유효한 의견인지 검증하는 함수를 만든다.


package racingcarwinner;

import racingcarwinnerexception.CarMovingCountException;
import racingcarwinnerexception.NameIsEmptyNullException;
import racingcarwinnerexception.NameOutOfLengthException;

import java.util.Scanner;

public class InputView {

    private Scanner sc = new Scanner(System.in);
    private String[] participantNames;

    public String enterParticipantName() throws NameOutOfLengthException, NameIsEmptyNullException {
        String enterName = sc.nextLine();
        NameLengthZero(enterName);
        participantNames = enterName.split(",");
        for (String name : participantNames) {
            NameLengthZero(name);
            NameLengthDiscrimination(name);
        }
        return enterName;
    }

    public int enterCarMovingCount() throws CarMovingCountException {
        int enterCarMoveCount = sc.nextInt();
        if (enterCarMoveCount < 1) {
            throw new CarMovingCountException("시도회수는 1이상 이여야합니다.");
        }
        return enterCarMoveCount;
    }

    private void NameLengthDiscrimination(String name) throws NameOutOfLengthException {
        if (name.length() > 5) {
            throw new NameOutOfLengthException("자동차 이름은 5글자를 넘길 수 없습니다.");
        }
    }

    private void NameLengthZero(String name) throws NameIsEmptyNullException {
        if (name == null || name.isBlank()) {
            throw new NameIsEmptyNullException("자동차 이름은 빈값이 들어올 수 없습니다.");
        }
        if (name.charAt(name.length() - 1) == ',') {
            throw new NameIsEmptyNullException("자동차 이름은 빈값이 들어올 수 없습니다.");
        }
    }
}
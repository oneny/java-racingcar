package racingcar.domain.movingcondition;

import java.util.Random;

public class RandomMovingCondition implements MovingCondition {

    private static final int RANDOM_MAGIC_NUMBER = 10;
    private static final int FORWARD_CONDITION_NUMBER = 4;
    private final Random random = new Random();

    public boolean canMove() {
        return generateRandomIntValue() >= FORWARD_CONDITION_NUMBER;
    }

    private int generateRandomIntValue() {
        return random.nextInt(RANDOM_MAGIC_NUMBER);
    }
}
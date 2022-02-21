package cz.mendelu.pjj.JavaGame2;

import java.util.Random;

public enum TypLokace {
    SKALA,
    OHEN,
    BAZEN,
    LES,
    KRYSTAL;
    private static final TypLokace[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static TypLokace getRandomTyp()  {
        return VALUES[RANDOM.nextInt(SIZE)];
    }

}

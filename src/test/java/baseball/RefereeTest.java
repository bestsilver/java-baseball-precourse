package baseball;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RefereeTest {
    @Test
    public void checkVictory() {
        ArrayList<Integer> computerNum = new ArrayList<Integer> () {{
            add(1);
            add(2);
            add(3);
        }};

        ArrayList<Integer> playerNum = new ArrayList<Integer> () {{
            add(1);
            add(2);
            add(3);
        }};

        assertEquals(3, new Referee(computerNum, playerNum).getGameResult().getStrikeCnt());
    }

}

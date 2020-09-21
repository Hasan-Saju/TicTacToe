import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDefensiveAIClass {
    @Test
    public void test_aiMove_FirstRowFirstElement()
    {
        int[] trackHumanOrAI={-1,  -1,1,1, -1,-1,-1, -1,-1,-1};
        AI ai=new DefensiveAI();
        int actual=ai.aiMove(trackHumanOrAI);
        int expected=1;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test_aiMove_FirstRowSecondElement()
    {
        int[] trackHumanOrAI={-1,   1,-1,1, -1,-1,-1, -1,-1,-1};
        AI ai=new DefensiveAI();
        int actual=ai.aiMove(trackHumanOrAI);
        int expected=2;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test_aiMove_FirstRowThirdElement()
    {
        int[] trackHumanOrAI={-1,   1,1,-1, -1,-1,-1, -1,-1,-1};
        AI ai=new DefensiveAI();
        int actual=ai.aiMove(trackHumanOrAI);
        int expected=3;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test_aiMove_SecondRowSecondElement()
    {
        int[] trackHumanOrAI={-1,  -1,-1,-1, 1,-1,1, -1,-1,-1};
        AI ai=new DefensiveAI();
        int actual=ai.aiMove(trackHumanOrAI);
        int expected=5;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test_aiMove_SecondRowThirdElement()
    {
        int[] trackHumanOrAI={-1,  -1,-1,-1, 1,1,-1, -1,-1,-1};
        AI ai=new DefensiveAI();
        int actual=ai.aiMove(trackHumanOrAI);
        int expected=6;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test_aiMove_ThirdRowFirstElement()
    {
        int[] trackHumanOrAI={-1,  -1,-1,-1, -1,-1,-1, -1,1,1};
        AI ai=new DefensiveAI();
        int actual=ai.aiMove(trackHumanOrAI);
        int expected=7;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test_aiMove_ThirdRowSecondElement()
    {
        int[] trackHumanOrAI={-1,  -1,-1,-1, -1,-1,-1, 1,-1,1};
        AI ai=new DefensiveAI();
        int actual=ai.aiMove(trackHumanOrAI);
        int expected=8;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void test_aiMove_ThirdRowThirdElement()
    {
        int[] trackHumanOrAI={-1,  -1,-1,-1, -1,-1,-1, 1,1,-1};
        AI ai=new DefensiveAI();
        int actual=ai.aiMove(trackHumanOrAI);
        int expected=9;

        Assertions.assertEquals(expected,actual);
    }

}

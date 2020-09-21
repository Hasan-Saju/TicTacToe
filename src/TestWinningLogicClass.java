import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestWinningLogicClass {

    @Test
    public void testIsWin_FirstRow()
    {
        int[] trackHumanOrAI={-1,  1,1,1,-1,-1,-1, -1,-1,-1};
        WinningLogic winningLogic=new WinningLogic();
        boolean actual=winningLogic.isWin(trackHumanOrAI);
        boolean expected=true;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testIsWin_SecondRow()
    {
        int[] trackHumanOrAI={-1, -1, -1, -1, 1, 1, 1, -1, -1, -1};
        WinningLogic winningLogic=new WinningLogic();
        boolean actual=winningLogic.isWin(trackHumanOrAI);
        boolean expected=true;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testIsWin_ThirdRow()
    {
        int[] trackHumanOrAI={-1, -1, -1, -1, -1, -1, -1, 1, 1, 1};
        WinningLogic winningLogic=new WinningLogic();
        boolean actual=winningLogic.isWin(trackHumanOrAI);
        boolean expected=true;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testIsWin_FirstColumn()
    {
        int[] trackHumanOrAI={-1, 1, -1, -1, 1, -1, -1, 1, -1, -1};
        WinningLogic winningLogic=new WinningLogic();
        boolean actual=winningLogic.isWin(trackHumanOrAI);
        boolean expected=true;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testIsWin_SecondColumn()
    {
        int[] trackHumanOrAI={-1, -1, 1, -1, -1, 1, -1, -1, 1, -1};
        WinningLogic winningLogic=new WinningLogic();
        boolean actual=winningLogic.isWin(trackHumanOrAI);
        boolean expected=true;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testIsWin_ThirdColumn()
    {
        int[] trackHumanOrAI={-1, -1, -1, 1, -1, -1, 1, -1, -1, 1};
        WinningLogic winningLogic=new WinningLogic();
        boolean actual=winningLogic.isWin(trackHumanOrAI);
        boolean expected=true;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testIsWin_FirstDiagonal()
    {
        int[] trackHumanOrAI={-1, 1, -1, -1, -1, 1, -1, -1, -1, 1};
        WinningLogic winningLogic=new WinningLogic();
        boolean actual=winningLogic.isWin(trackHumanOrAI);
        boolean expected=true;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testIsWin_SecondDiagonal()
    {
        int[] trackHumanOrAI={-1, -1, -1, 1, -1, 1, -1, 1, -1, -1};
        WinningLogic winningLogic=new WinningLogic();
        boolean actual=winningLogic.isWin(trackHumanOrAI);
        boolean expected=true;

        Assertions.assertEquals(expected,actual);
    }


}

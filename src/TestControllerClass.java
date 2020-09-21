import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestControllerClass {

    @Test
    public void testIsHumanPosssible()
    {
        Controller controller=new Controller();
        Controller.totalHumanMove=3;
        controller.classicRadio=true;
        controller.forrestRadio=false;
        controller.contrastRadio=false;
        controller.opponentRandomAI=true;
        controller.opponentDefensiveAI=false;

        boolean expected=true;
        boolean actual=controller.isHumanMovePossible();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testIsAIMovePossibe()
    {
        Controller controller=new Controller();
        Controller.totalAIMove=3;
        controller.classicRadio=false;
        controller.forrestRadio=true;
        controller.contrastRadio=false;
        controller.opponentRandomAI=false;
        controller.opponentDefensiveAI=true;

        boolean expected=true;
        boolean actual=controller.isHumanMovePossible();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testDefensiveAI_FirstRowFirstElement()
    {
        int[] trackHumanOrAI={-1,  -1,1,1, -1,-1,-1, -1,-1,-1};
        AI ai=new DefensiveAI();
        int actual=ai.aiMove(trackHumanOrAI);
        int expected=1;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testDefensiveAI_FirstRowSecondElement()
    {
        int[] trackHumanOrAI={-1,   1,-1,1, -1,-1,-1, -1,-1,-1};
        AI ai=new DefensiveAI();
        int actual=ai.aiMove(trackHumanOrAI);
        int expected=2;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testDefensiveAI_FirstRowThirdElement()
    {
        int[] trackHumanOrAI={-1,   1,1,-1, -1,-1,-1, -1,-1,-1};
        AI ai=new DefensiveAI();
        int actual=ai.aiMove(trackHumanOrAI);
        int expected=3;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testDefensiveAI_SecondRowSecondElement()
    {
        int[] trackHumanOrAI={-1,  -1,-1,-1, 1,-1,1, -1,-1,-1};
        AI ai=new DefensiveAI();
        int actual=ai.aiMove(trackHumanOrAI);
        int expected=5;

        Assertions.assertEquals(expected,actual);
    }

 @Test
    public void testDefensiveAI_SecondRowThirdElement()
    {
        int[] trackHumanOrAI={-1,  -1,-1,-1, 1,1,-1, -1,-1,-1};
        AI ai=new DefensiveAI();
        int actual=ai.aiMove(trackHumanOrAI);
        int expected=6;

        Assertions.assertEquals(expected,actual);
    }

 @Test
    public void testDefensiveAI_ThirdRowFirstElement()
    {
        int[] trackHumanOrAI={-1,  -1,-1,-1, -1,-1,-1, -1,1,1};
        AI ai=new DefensiveAI();
        int actual=ai.aiMove(trackHumanOrAI);
        int expected=7;

        Assertions.assertEquals(expected,actual);
    }

 @Test
    public void testDefensiveAI_ThirdRowSecondElement()
    {
        int[] trackHumanOrAI={-1,  -1,-1,-1, -1,-1,-1, 1,-1,1};
        AI ai=new DefensiveAI();
        int actual=ai.aiMove(trackHumanOrAI);
        int expected=8;

        Assertions.assertEquals(expected,actual);
    }

 @Test
    public void testDefensiveAI_ThirdRowThirdElement()
    {
        int[] trackHumanOrAI={-1,  -1,-1,-1, -1,-1,-1, 1,1,-1};
        AI ai=new DefensiveAI();
        int actual=ai.aiMove(trackHumanOrAI);
        int expected=9;

        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void testCheckWinningState_FirstRow()
    {
        int[] trackHumanOrAI={-1,  1,1,1,-1,-1,-1, -1,-1,-1};
        WinningLogic winningLogic=new WinningLogic();
        boolean actual=winningLogic.isWin(trackHumanOrAI);
        boolean expected=true;

        Assertions.assertEquals(expected,actual);
    }

 @Test
    public void testCheckWinningState_SecondRow()
    {
        int[] trackHumanOrAI={-1, -1, -1, -1, 1, 1, 1, -1, -1, -1};
        WinningLogic winningLogic=new WinningLogic();
        boolean actual=winningLogic.isWin(trackHumanOrAI);
        boolean expected=true;

        Assertions.assertEquals(expected,actual);
    }

 @Test
    public void testCheckWinningState_ThirdRow()
    {
        int[] trackHumanOrAI={-1, -1, -1, -1, -1, -1, -1, 1, 1, 1};
        WinningLogic winningLogic=new WinningLogic();
        boolean actual=winningLogic.isWin(trackHumanOrAI);
        boolean expected=true;

        Assertions.assertEquals(expected,actual);
    }

 @Test
    public void testCheckWinningState_FirstColumn()
    {
        int[] trackHumanOrAI={-1, 1, -1, -1, 1, -1, -1, 1, -1, -1};
        WinningLogic winningLogic=new WinningLogic();
        boolean actual=winningLogic.isWin(trackHumanOrAI);
        boolean expected=true;

        Assertions.assertEquals(expected,actual);
    }

 @Test
    public void testCheckWinningState_SecondColumn()
    {
        int[] trackHumanOrAI={-1, -1, 1, -1, -1, 1, -1, -1, 1, -1};
        WinningLogic winningLogic=new WinningLogic();
        boolean actual=winningLogic.isWin(trackHumanOrAI);
        boolean expected=true;

        Assertions.assertEquals(expected,actual);
    }

 @Test
    public void testCheckWinningState_ThirdColumn()
    {
        int[] trackHumanOrAI={-1, -1, -1, 1, -1, -1, 1, -1, -1, 1};
        WinningLogic winningLogic=new WinningLogic();
        boolean actual=winningLogic.isWin(trackHumanOrAI);
        boolean expected=true;

        Assertions.assertEquals(expected,actual);
    }

 @Test
    public void testCheckWinningState_FirstDiagonal()
    {
        int[] trackHumanOrAI={-1, 1, -1, -1, -1, 1, -1, -1, -1, 1};
        WinningLogic winningLogic=new WinningLogic();
        boolean actual=winningLogic.isWin(trackHumanOrAI);
        boolean expected=true;

        Assertions.assertEquals(expected,actual);
    }

 @Test
    public void testCheckWinningState_SecondDiagonal()
    {
        int[] trackHumanOrAI={-1, -1, -1, 1, -1, 1, -1, 1, -1, -1};
        WinningLogic winningLogic=new WinningLogic();
        boolean actual=winningLogic.isWin(trackHumanOrAI);
        boolean expected=true;

        Assertions.assertEquals(expected,actual);
    }



}

/*
        int [] box_1 = {0,  -1,1,1, -1,-1,-1, -1,-1,-1};
        int [] box_2 = {0,   1,-1,1, -1,-1,-1, -1,-1,-1};
        int [] box_3 = {0,   1,1,-1, -1,-1,-1, -1,-1,-1};
        int [] box_4 = {0,  -1,-1,-1, -1,1,1, -1,-1,-1};
        int [] box_5 = {0,  -1,-1,-1, 1,-1,1, -1,-1,-1};
        int [] box_6 = {0,  -1,-1,-1, 1,1,-1, -1,-1,-1};
        int [] box_7 = {0,  -1,-1,-1, -1,-1,-1, -1,1,1};
        int [] box_8 = {0,  -1,-1,-1, -1,-1,-1, 1,-1,1};
        int [] box_9 = {0,  -1,-1,-1, -1,-1,-1, 1,1,-1};
*/
import javafx.scene.control.Button;
import javafx.scene.shape.Line;

public class DrawingWinningLine {
    public void drawWinningLine(int[] trackHumanOrAI, Line[] winLine, Button[] button)
    {
        winInRow(trackHumanOrAI,winLine);
        winInColumn(trackHumanOrAI,winLine);
        winInDiagonal(trackHumanOrAI,winLine);

        Controller.totalAIMove=4;                             //AI can't take new move after game end ,totalAImove=4,means Ai can't make any other move
        for (int i=1;i<=9;i++)
            button[i].setDisable(true);

    }

    private void winInRow(int[] trackHumanOrAI, Line[] winLine)
    {
        boolean win=false;
        for(int i=1,winlineNumber=1; i<=9&&winlineNumber<=3 ; i+=3,winlineNumber++)
        {
            win=isWinPossible(i,i+1,i+2,trackHumanOrAI);
            if(win)winLine[winlineNumber].setVisible(true);
        }
    }

    private void winInColumn(int[] trackHumanOrAI, Line[] winLine)
    {
        boolean win=false;
        for(int i=1,winlineNumber=4; i<=3&&winlineNumber<=6; i++,winlineNumber++)
        {
            win=isWinPossible(i,i+3,i+6,trackHumanOrAI);
            if(win)winLine[winlineNumber].setVisible(true);
        }
    }

    private void winInDiagonal(int[] trackHumanOrAI, Line[] winLine)
    {
        boolean win=false;

        win= isWinPossible(1,5,9,trackHumanOrAI);
        if(win)winLine[7].setVisible(true);
        win= isWinPossible(3,5,7,trackHumanOrAI);
        if(win)winLine[8].setVisible(true);
    }

    private boolean isWinPossible(int firstValue,int secondValue,int thirdValue,int[] trackHumanOrAI)
    {
        int first=trackHumanOrAI[firstValue], second=trackHumanOrAI[secondValue], third=trackHumanOrAI[thirdValue];
        if(first==second && second==third && first!=-1)
        {
            return true;
        }
        return false;
    }


}

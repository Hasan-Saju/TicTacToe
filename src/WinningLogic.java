public class WinningLogic {

    public boolean isWin(int[] trackHumanOrAI)
    {
        boolean winRow=false,winColumn=false,winDiagonal=false;

        winRow=winInRow(trackHumanOrAI);
        winColumn=winInColumn(trackHumanOrAI);
        winDiagonal=winInDiagonal(trackHumanOrAI);

        if(winRow||winColumn||winDiagonal) return true;
        else return false;

    }

    //for checking win rows
    private boolean winInRow(int[] trackHumanOrAI)
    {
        boolean win=false;
        for(int i=1;i<=9;i+=3)
        {
            win=isWinPossible(i,i+1,i+2,trackHumanOrAI);
            if(win)return win;                              //if true returning immediately
        }
        return win;
    }

    //for checking win in columns
    private boolean winInColumn(int[] trackHumanOrAI)
    {
        boolean win=false;
        for(int i=1;i<=3;i++)
        {
            win=isWinPossible(i,i+3,i+6,trackHumanOrAI);
            if(win)return win;
        }
        return win;
    }

    //for checking win in diagonals
    private boolean winInDiagonal(int[] trackHumanOrAI)
    {
        boolean win=false;

        win= isWinPossible(1,5,9,trackHumanOrAI);
        if(win)return win;
        win= isWinPossible(3,5,7,trackHumanOrAI);
        if(win)return win;

        return win;
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

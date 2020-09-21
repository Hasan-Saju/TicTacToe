public class DefensiveAI implements AI {
    @Override
    public int aiMove(int[] trackHumanOrAI) {
        return defensiveAIMove(trackHumanOrAI);
    }

    private int defensiveAIMove(int[] trackHumanOrAI)
    {
        int defenseMove=-1;

        defenseMove=defenseInRow(trackHumanOrAI);
        if(defenseMove!=-1)return defenseMove;

        defenseMove=defenseInColumn(trackHumanOrAI);
        if(defenseMove!=-1)return defenseMove;

       defenseMove=defenseInDiagonal(trackHumanOrAI);
        if(defenseMove!=-1)return defenseMove;

        RandomAI randomAI=new RandomAI();
        return randomAI.aiMove(trackHumanOrAI);                              //when defensive AI doesn't have any move  returning randomAI()

    }

    //for checking defensive move in rows
    private int defenseInRow(int[] trackHumanOrAI)
    {
        int rowMove=-1;
        for(int i=1;i<=9;i+=3)
        {
             rowMove=isdefensiveAIPossible(i,i+1,i+2,trackHumanOrAI);
             if(rowMove!=-1)return rowMove;                     //return the move if found
        }
        return rowMove;
    }

    //for checking defensive move in columns
    private int defenseInColumn(int[] trackHumanOrAI)
    {
        int columnMove=-1;
        for(int i=1;i<=3;i++)
        {
            columnMove=isdefensiveAIPossible(i,i+3,i+6,trackHumanOrAI);
            if(columnMove!=-1)return columnMove;
        }
        return columnMove;
    }

     //for checking defensive move in diagonals
    private int defenseInDiagonal(int[] trackHumanOrAI)
    {
        int diagonalMove=-1;

        diagonalMove= isdefensiveAIPossible(1,5,9,trackHumanOrAI);
        if(diagonalMove!=-1)return diagonalMove;
        diagonalMove= isdefensiveAIPossible(3,5,7,trackHumanOrAI);
        if(diagonalMove!=-1)return diagonalMove;

        return diagonalMove;
    }


    private int isdefensiveAIPossible(int firstValue,int secondValue,int thirdValue,int[] trackHumanOrAI)
    {
        int first=trackHumanOrAI[firstValue], second=trackHumanOrAI[secondValue], third=trackHumanOrAI[thirdValue];
        if(first==second&&first==1 || second==third&&second==1 || first==third&&first==1)       //confirming is there are two human moves in a line
        {
            if(first==-1)
                return firstValue;          //move for defensiveAI
            else if(second==-1)
                return secondValue;
            else if(third==-1)
                return thirdValue;
        }
        return -1;                          //defensive AI doesn't have any move
    }

}

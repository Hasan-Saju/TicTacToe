import javafx.scene.control.Button;
import javafx.scene.shape.Line;

public class Controller {
    public Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    public Line horizontal1,horizontal2,vertical1,vertical2;
    public Line winHorizontal1,winHorizontal2,winHorizontal3,winVertical1,winVertical2,winVertical3,winDiagonal1,winDiagonal2;
    public static int totalAIMove=0,totalHumanMove=0;
    boolean classicRadio=false,forrestRadio=false,contrastRadio=false;
    boolean opponentRandomAI=false,opponentDefensiveAI=false;
    String changeButtonColor=null,changeLineColor=null,changeHumanMove=null,changeAIMove=null;

    Button button[]=new Button[10];
    Line winLine[]=new Line[9];
    Line boardLine[]=new Line[5];
    int[] trackHumanOrAI={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};           //if trackHumanOrAI[i]==1 -> human  trackHumanOrAI[i]==0 ->AI

    public void initializeGame()
    {

        button[1]=btn1;
        button[2]=btn2;
        button[3]=btn3;
        button[4]=btn4;
        button[5]=btn5;
        button[6]=btn6;
        button[7]=btn7;
        button[8]=btn8;
        button[9]=btn9;

        boardLine[1]=horizontal1;
        boardLine[2]=horizontal2;
        boardLine[3]=vertical1;
        boardLine[4]=vertical2;

        winLine[1]=winHorizontal1;
        winLine[2]=winHorizontal2;
        winLine[3]=winHorizontal3;
        winLine[4]=winVertical1;
        winLine[5]=winVertical2;
        winLine[6]=winVertical3;
        winLine[7]=winDiagonal1;
        winLine[8]=winDiagonal2;
    }


    public void click_1() {
        clickOnGameBoard(1);
    }
    public void click_2() {
        clickOnGameBoard(2);
    }
    public void click_3() {
        clickOnGameBoard(3);
    }
    public void click_4() {
        clickOnGameBoard(4);
    }
    public void click_5() {
        clickOnGameBoard(5);
    }
    public void click_6() {
        clickOnGameBoard(6);
    }
    public void click_7() {
        clickOnGameBoard(7);
    }
    public void click_8() {
        clickOnGameBoard(8);
    }
    public void click_9() {
        clickOnGameBoard(9);
    }

    public void clickOnGameBoard(int buttonClicked)
    {
        initializeGame();

        if(isHumanMovePossible())
        {
            gethumanMove(button[buttonClicked]);
            trackHumanOrAI[buttonClicked]=1;
            button[buttonClicked].setDisable(true);
            button[buttonClicked].setOpacity(1);
            if(checkWinningState())
                drawWinLine();
        }
        if(isAIMovePossible())
        {
            int AIMove=-1;
            if(opponentRandomAI)
                AIMove =randomAI();
            else if(opponentDefensiveAI)
                AIMove=defensiveAI();

            getAIMove(button[AIMove]);
            trackHumanOrAI[AIMove]=0;
            button[AIMove].setDisable(true);
            button[AIMove].setOpacity(1);
            if(checkWinningState())
                drawWinLine();
        }
    }


    public void gethumanMove(Button button)
    {
        totalHumanMove++;
        if(classicRadio)
            button.setText("X");
        else if(forrestRadio)
            button.setText("\uD83C\uDF3A");
        else if(contrastRadio)
        {
            button.setText("");
            button.setStyle("-fx-background-color: black");
        }

    }
    public void getAIMove(Button button)
    {
        totalAIMove++;
        if(classicRadio)
            button.setText("O");
        else if(forrestRadio)
            button.setText("\uD83C\uDF4E");
        else if(contrastRadio)
        {
            button.setText("");
            button.setStyle("-fx-background-color: white");
        }

    }


    public boolean isHumanMovePossible()
    {
        if(totalHumanMove<=4 && (classicRadio||forrestRadio||contrastRadio) && (opponentRandomAI||opponentDefensiveAI) )return true;
        else return false;
    }
    public boolean isAIMovePossible()
    {
        if(totalAIMove<=3 && (classicRadio||forrestRadio||contrastRadio) && (opponentRandomAI||opponentDefensiveAI) )return true;
        else return false;
    }


    public int randomAI()
    {
        AI ai=new RandomAI() ;
        int randomMove=ai.aiMove(trackHumanOrAI);
        return randomMove;
    }
    public int defensiveAI()
    {
        AI ai=new DefensiveAI();
        int defensiveMove=ai.aiMove(trackHumanOrAI);
        return defensiveMove;
    }


    public boolean checkWinningState()
    {
        WinningLogic winningLogic=new WinningLogic();
        return winningLogic.isWin(trackHumanOrAI);
    }
    public void drawWinLine()
    {
        DrawingWinningLine drawingWinningLine=new DrawingWinningLine();
        drawingWinningLine.drawWinningLine(trackHumanOrAI,winLine,button);
    }


    //DESIGN PART


    public void click_classic() {

        classicRadio=true;
        forrestRadio=false;
        contrastRadio=false;
        classicTheme();
    }
    public void click_forrest() {

        classicRadio=false;
        forrestRadio=true;
        contrastRadio=false;
        forrestTheme();
    }
    public void click_highContrast() {

        classicRadio=false;
        forrestRadio=false;
        contrastRadio=true;
        highContrastTheme();
    }


    public void classicTheme() {
        initializeGame();
        Theme theme=new ClassicTheme();
        changeButtonColor="-fx-background-color: white";
        changeLineColor="-fx-stroke: black";
        changeHumanMove="X";
        changeAIMove="O";
        changeTheme(button,boardLine,trackHumanOrAI,theme,changeButtonColor,changeLineColor,changeHumanMove,changeAIMove);
    }
    public void forrestTheme()
    {
        initializeGame();
        Theme theme=new ForrestTheme();
        changeButtonColor="-fx-background-color: lightgreen";
        changeLineColor="-fx-stroke: darkgreen";
        changeHumanMove="\uD83C\uDF3A";
        changeAIMove="\uD83C\uDF4E";
        changeTheme(button,boardLine,trackHumanOrAI,theme,changeButtonColor,changeLineColor,changeHumanMove,changeAIMove);
    }
    public void highContrastTheme()
    {
        initializeGame();
        Theme theme=new HighContrastTheme();
        changeButtonColor="-fx-background-color: darkgrey";
        changeLineColor="-fx-stroke: lightgrey";
        changeHumanMove="";
        changeAIMove="";
        changeTheme(button,boardLine,trackHumanOrAI,theme,changeButtonColor,changeLineColor,changeHumanMove,changeAIMove);
    }
    public void changeTheme(Button[] button,Line[] boardLine,int[] trackHumanOrAI,Theme theme,String changeButtonColor,String changeLineColor,String changeHumanMove,String changeAIMove)
    {
        theme.changeButtonBackground(button,changeButtonColor);
        theme.changeLineColor(boardLine,changeLineColor);
        theme.changeMoveSign(button,trackHumanOrAI,changeHumanMove,changeAIMove);
    }


    public void click_randomAI() {
        newGame();
        opponentRandomAI=true;
        opponentDefensiveAI=false;
    }
    public void click_defensiveAI() {
        newGame();
        opponentDefensiveAI=true;
        opponentRandomAI=false;
    }


    public void newGame()
    {
        initializeGame();
        for(int i=1;i<=9;i++)
        {
            button[i].setDisable(false);                    // All the buttons active for new Game
            button[i].setText("");
            trackHumanOrAI[i]=-1;                           // all moves are unused
            opponentRandomAI=false;
            opponentDefensiveAI=false;                      //game is started from first
            totalHumanMove=0;
            totalAIMove=0;

            if(i<=8)winLine[i].setVisible(false);
        }
        highContrastTheme();
        if(classicRadio)classicTheme();
        else if (forrestRadio)forrestTheme();
        else if(contrastRadio)highContrastTheme();

    }

}







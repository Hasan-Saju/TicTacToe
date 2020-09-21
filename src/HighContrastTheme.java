import javafx.scene.control.Button;
import javafx.scene.shape.Line;

public class HighContrastTheme extends Theme {

    public void changeButtonBackground(Button[] button,String buttonColor)
    {
        super.changeButtonBackground(button,buttonColor);
    }
    public void changeLineColor(Line[] boardLine,String lineColor)
    {
        super.changeLineColor(boardLine,lineColor);
    }
    public void changeMoveSign(Button[] button, int[] trackHumanOrAI,String humanMove,String aiMove)
    {
        super.changeMoveSign(button,trackHumanOrAI,humanMove,aiMove);

        for (int i=1;i<=9;i++)
        {
            if(trackHumanOrAI[i]==1)
                button[i].setStyle("-fx-background-color: black");
            else if(trackHumanOrAI[i]==0)
                button[i].setStyle("-fx-background-color: white");

        }
    }

}

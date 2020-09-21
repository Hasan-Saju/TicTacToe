import javafx.scene.control.Button;
import javafx.scene.shape.Line;

public class Theme {
    public void changeButtonBackground(Button[] button,String buttonColor)
    {
        for (int i=1;i<=9;i++) {
            button[i].setStyle(buttonColor);
        }
    }
    public void changeLineColor(Line[] boardLine,String lineColor)
    {
        for (int i=1;i<=4;i++)
        {
            boardLine[i].setStyle(lineColor);
        }
    }
    public void changeMoveSign(Button[] button, int[] trackHumanOrAI,String humanMove,String aiMove)
    {
        for (int i=1;i<=9;i++)
        {
            if(trackHumanOrAI[i]==1)
                button[i].setText(humanMove);
            else if(trackHumanOrAI[i]==0)
                button[i].setText(aiMove);
        }
    }
}

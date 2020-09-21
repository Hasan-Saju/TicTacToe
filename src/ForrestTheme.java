import javafx.scene.control.Button;
import javafx.scene.shape.Line;

public class ForrestTheme extends Theme {

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
    }

}

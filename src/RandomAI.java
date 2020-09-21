import java.util.Random;

public class RandomAI implements AI{
    @Override
    public int aiMove(int[] trackHumanOrAI) {
        return randomAIMove(trackHumanOrAI);
    }

    private int randomAIMove(int[] trackHumanOrAI) {
        Random random = new Random();
        while(true)
        {
            int randomAImove = random.nextInt(9) + 1;      //It will create 0-8 random number but I need 1-9 that's why i just add 1
            if (trackHumanOrAI[randomAImove] == -1) {
                return randomAImove;
            }
        }
    }


}

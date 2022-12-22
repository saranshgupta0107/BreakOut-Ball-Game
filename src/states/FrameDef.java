package states;
import javax.swing.*;

public class FrameDef extends JFrame
{
    FrameDef()
    {
        this.setTitle("Breakout Ball Game");

        GamePlay gamePlay = new GamePlay();
        this.add(gamePlay);

        this.setSize(700,600);
        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}

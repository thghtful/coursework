import javafx.scene.text.Text;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        GameArena arena = new GameArena(1000,1000);

        Ball ball = new Ball(arena.getArenaWidth() / 4,arena.getArenaHeight() / 2,20,"FF0000");

        Ball ball2 = new Ball(arena.getArenaWidth() / 1.5,arena.getArenaHeight() / 2,20,"FF0000");

        arena.addBall(ball);

        arena.addBall(ball2);





        while(true)
        {
            arena.pause();

            double ballXpos = ball.getXPosition();

            double ballYpos = ball.getYPosition();

            double ballXpos2 = ball2.getXPosition();

            double ballYpos2 = ball2.getYPosition();

            if(arena.rightPressed())
            {
                ball2.setXPosition(ballXpos2 + 5.0);
            }

            if(arena.leftPressed())
            {
                ball2.setXPosition(ballXpos2 + -5.0);
            }

            if(arena.upPressed())
            {
                ball2.setYPosition(ballYpos2 + -5.0);
            }
            if(arena.downPressed())
            {
                ball2.setYPosition(ballYpos2  + 5.0);
            }



        }

    }
}

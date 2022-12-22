package states;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GamePlay extends JPanel implements ActionListener, KeyListener
{
    private boolean play = false;
    private int score = 0;
    private int totalBrick = 21;
    private Timer timer;  //A Timer in Java is a process that enables threads to schedule tasks for later execution. Scheduling is done by keeping a specific process in the queue such that when the execution time comes, the processor can suspend other processes and run the task.
    private int delay = 4;
    private int ballposX = 120;
    private int ballposY = 350;
    private int ballXdir = 1;
    private int ballYdir = 2;
    private int playerX = 350; // initial x coordinate of paddle
    private MapGenerator mapref;

    public GamePlay()
    {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);

        timer = new Timer(delay,this);
        timer.start();

        mapref = new MapGenerator(3,7);
    }

    public void paint(Graphics g)
    {
        //black canvas
        g.setColor(Color.black);
        g.fillRect(1,1,692,592);

        //yellow border
        g.setColor(Color.yellow);
        g.fillRect(0,0,692,3);
        g.fillRect(0,3,3,592);
        g.fillRect(685,3,3,592);

        //paddle
        g.setColor(Color.green);
        g.fillRect(playerX,550,100,8);

        //bricks
        mapref.draw((Graphics2D) g);


        //ball
        g.setColor(Color.red);
        g.fillOval(ballposX, ballposY,20,20);

        //score
        g.setColor(Color.green);
        g.setFont(new Font("serif",Font.BOLD,20));
        g.drawString("Score: "+score,580,30);

        //gameover
        if(ballposY >= 570)
        {
            play = false;
            ballXdir = 0;
            ballYdir = 0;

            g.setColor(Color.green);
            g.setFont(new Font("serif",Font.BOLD,30));
            g.drawString("GameOver!!",280,300);
            g.drawString("Final Score: " + score,260,350);

            g.setFont(new Font("serif",Font.BOLD,25));
            g.drawString("Press Enter to Restart",230,450);
        }

        if(totalBrick <= 0)
        {
            play = false;
            ballXdir = 0;
            ballYdir = 0;

            g.setColor(Color.green);
            g.setFont(new Font("serif",Font.BOLD,30));
            g.drawString("Congratulations You Won!!",170,300);
            g.drawString("Final Score: "+ score, 250,350);

            g.setFont(new Font("serif",Font.BOLD,25));
            g.drawString("Press Enter to Restart",230,450);
        }

        if(totalBrick == 21 && play == false && ballposY < 570)
        {
            g.setColor(Color.green);
            g.setFont(new Font("serif",Font.BOLD,25));
            g.drawString("Press ENTER to start game",230,350);
        }
    }

    private void moveLeft()
    {
       if(play == true) playerX -= 20;
    }

    private void moveRight()
    {
       if(play == true) playerX += 20;
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            if(playerX <= 3)
            {
                playerX = 3;
            }
            else moveLeft();
        }

        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            if(playerX >= 585)
            {
                playerX = 585;
            }
            else moveRight();
        }

        if(e.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(!play)
            {
                score = 0;
                totalBrick = 21;
                ballposX = 120;
                ballposY = 350;
                ballXdir = 1;
                ballYdir = 2;
                playerX = 320;

                mapref = new MapGenerator(3,7);

                play = true;
            }
        }
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(play)
        {
            if(ballposX <= 3)
            {
                ballXdir = -ballXdir;
            }

            if(ballposX >= 665)
            {
                ballXdir = -ballXdir;
            }

            if(ballposY <= 3)
            {
                ballYdir = -ballYdir;
            }

            Rectangle ballRect = new Rectangle(ballposX, ballposY,20,20);
            Rectangle paddleRect = new Rectangle(playerX,550,100,8);

            if(ballRect.intersects(paddleRect))
            {
                ballYdir = -ballYdir;
            }

           A:for(int i = 0; i < mapref.map.length; i++)
            {
                for(int j = 0; j < mapref.map[0].length; j++)
                {
                    if(mapref.map[i][j] > 0)
                    {
                        int width = mapref.brickWidth;
                        int height = mapref.brickHeight;
                        int brickXpos = 80 + j * width;
                        int brickYpos = 50 + i * height;

                        Rectangle brickRect = new Rectangle(brickXpos, brickYpos, width, height);

                        if(ballRect.intersects(brickRect))
                        {
                            mapref.setBrick(0, i, j);
                            totalBrick--;
                            score += 5;

                            if((ballposX + 19) <= brickXpos || (ballposX + 1) >= (brickXpos + width))
                            {
                                ballXdir = -ballXdir;
                            }
                            else ballYdir = -ballYdir;

                            break A;
                        }
                    }
                }
            }
            ballposX += ballXdir;
            ballposY += ballYdir;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e){}

    @Override
    public void keyTyped(KeyEvent e){}
}



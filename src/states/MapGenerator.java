package states;

import java.awt.*;
public class MapGenerator
{
    public int map[][]; // 2D array named 'map'
    public int brickWidth;
    public int brickHeight;

    public MapGenerator(int row, int col) //constructor with 2 arguments
    {
        map = new int[row][col];

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                map[i][j] = 1; //initial value in every brick is 1
            }
        }

        brickWidth = 540 / col;    // to automatically set the brickWidth according to the value of columns passed
        brickHeight = 150 / row;   // to automatically set the brickHeight according to the value of rows passed
    }

    public void setBrick(int value, int r, int c) //change initial value of brick to value so that brick disappears on hitting
    {
        map[r][c] = value;
    }

    public void draw(Graphics2D g) //Graphics2D is a child class of Graphics class which is used mainly to draw 2D shapes in java
    {
        for(int i = 0; i < map.length; i++) //2Darrayname.length gives number of rows so here map.length gives number of rows in map array
        {
            for(int j = 0; j < map[0].length; j++) // map[0].length gives number of columns as it is the size of first row
            {
                if(map[i][j] > 0) // checking value of brick, if it is more than 0 then only make the brick else no need to make
                {
                    g.setColor(Color.white); // set color of each brick as white
                    g.fillRect(j * brickWidth + 80 ,i * brickHeight + 50, brickWidth, brickHeight); // filling the rectangles with white color

                    g.setColor(Color.black); // color of boundary = black
                    g.setStroke(new BasicStroke(3)); // width of boundary = 3
                    g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight); // drawing the rectangle only boundaries

                }
            }
        }
    }


}

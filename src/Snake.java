import java.awt.*;
import java.util.ArrayList;

public class Snake {

    private ArrayList<Body> SnakeBody; //ArrayList儲存蛇的每一個身體節點

    public Snake(){ //設定蛇的長度(頭到尾)
        SnakeBody = new ArrayList<>();
        SnakeBody.add(new Body(80,0));
        SnakeBody.add(new Body(60,0));
        SnakeBody.add(new Body(40,0));
        SnakeBody.add(new Body(20,0));
    }
    public void DrawSnake(Graphics g){ //畫出蛇的身體
        g.setColor(Color.YELLOW);
        for(Body n : SnakeBody){ //設定Body為n，且遍歷蛇的每個身體節點
            g.fillOval(n.x,n.y,Main.Cell_Size,Main.Cell_Size);
        }
    }
}

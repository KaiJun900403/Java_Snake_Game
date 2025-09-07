import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    public static final int Cell_Size = 20; //每個格子的大小設定final Key為20
    public static int Width = 400;
    public static int Height = 400;
    public static int row = Height / Cell_Size; //面板列的部分
    public static int column = Width / Cell_Size; //面板欄的部分
    private Snake snake;

    public Main(){
        snake = new Snake();
    }
    @Override
    public void paintComponent(Graphics g){ //設定視窗內容
        //g.fillRect(0,0,Width,Height); //面板畫出黑色背景
        ImageIcon img = new ImageIcon("grass.jpg");
        img.paintIcon(null,g,0,0);
        snake.DrawSnake(g); //呼叫蛇物件的繪圖方法，把蛇畫在面板上。
    }

    @Override
    public Dimension getPreferredSize(){ //用來回傳這個元件的建議大小
        return new Dimension(Width,Height);
    }

    public static void main(String[] args) { //設定視窗元件
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Main());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);//把視窗顯示在螢幕正中央
        frame.setResizable(false); //視窗大小鎖定，無法用滑鼠拖拉改變視窗的寬或高。
        frame.pack(); //根據getPreferredSize()，自動調整視窗大小。
    }
}

import java.awt.*;
import javax.swing.*;

public class Gui04 {
    private static void createAndShowGUI(){
        //创建一个名为Flowlayout的窗体
        JFrame f=new JFrame("Flowlayout");
        //设置窗体中的布局管理器为Flowlayout
        //所有组件左对齐，水平间距为20，垂直间距为30
        f.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
        f.setSize(400,200);
        f.setLocation(300,300);         //窗体显示的位置
        //向容器添加组件
        f.add(new JButton("第1个按钮"));
        f.add(new JButton("第2个按钮"));
        f.add(new JButton("第3个按钮"));
        f.add(new JButton("第4个按钮"));
        f.add(new JButton("第5个按钮"));
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(Gui04::createAndShowGUI);
    }
}

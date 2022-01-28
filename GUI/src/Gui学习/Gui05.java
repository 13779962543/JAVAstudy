package Gui学习;

import java.awt.*;
import javax.swing.*;
public class Gui05 {
    private static void createAndShowGUI() {
        //创建一个名为GridLayout的窗体
        JFrame f=new JFrame("GridLayout");
        f.setLayout(new GridLayout(3,3));
        f.setSize(300,300);
        f.setLocation(400,300);
        //下面的代码是循环添加8个按钮组件到GridLayout容器中
        for (int i=1;i<9;i++){
            Button btn=new Button("btn"+i);
            f.add(btn);
        }
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(Gui05::createAndShowGUI);
    }
}

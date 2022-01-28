package Gui学习;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui09 {
    private static void createAndShowGUI(){
        JFrame f=new JFrame("KeyEvent");
        f.setLayout(new FlowLayout());
        f.setSize(400,300);
        f.setLocation(300,200);
        JTextField tf=new JTextField(30);   //创建文本对象
        f.add(tf);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //为文本框添加键盘事件监听器
        tf.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                //获取对应的键盘字符
                char KeyChar=e.getKeyChar();
                //获取对应的键盘字符代码
                int KeyCode=e.getKeyCode();
                System.out.println("键盘按下的字符内容为"+KeyChar);
                System.out.println("键盘按下的字符代码为"+KeyCode);
            }
        });
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(Gui09::createAndShowGUI);
    }
}

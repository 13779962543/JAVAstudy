package Gui学习;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Gui08 {
    private static void createAndShowGUI(){
        JFrame f=new JFrame("MouseEvent");
        f.setLayout(new FlowLayout());          //为窗体设置布局
        f.setSize(300,200);
        f.setLocation(300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton but=new JButton("Button");      //创建按钮对象
        f.add(but);                                 //在窗口添加按钮条件
        //为按钮添加鼠标事件监听器
        but.addMouseListener(new MouseListener (){
            public void mouseReleased(MouseEvent e){
                System.out.println("mouseReleased--鼠标放开事件");
            }
            public void mousePressed(MouseEvent e){
                System.out.println("mousePressed--鼠标按下事件");
            }
            public void mouseExited(MouseEvent e){
                System.out.println("mouseExited--鼠标移除按钮区域事件");
            }
            public void mouseEntered(MouseEvent e){
                System.out.println("mouseEnter--鼠标进入按钮区域事件");
            }
            public void mouseClicked(MouseEvent e){
                System.out.println("mouseClicked--鼠标完成单机事件");
            }
        });
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(Gui08::createAndShowGUI);
    }
}

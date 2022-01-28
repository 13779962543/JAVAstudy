package Gui学习;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui14 {
    private static void createAndShowGUI() {
        JFrame f = new JFrame("JFrame窗口");
        f.setLayout(new BorderLayout());
        f.setSize(300, 300);
        f.setLocation(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //创建一个JLabel标签组件，标签文字居中对齐
        JLabel label = new JLabel("Hello World！", JLabel.CENTER);
        label.setFont(new Font("宋体", Font.PLAIN, 20));
        //创建一个JPanel面板组件
        JPanel panel = new JPanel();
        //创建一个ButtonGroup按钮组组件
        ButtonGroup group=new ButtonGroup();
        //创建两个JRadioButton单选按钮组件
        JRadioButton italic=new JRadioButton("Italic");
        JRadioButton bold=new JRadioButton("Bold");
        //将两个JRadioButton单选按钮添加到同一个ButtonGroup组
        group.add(italic);
        group.add(bold);
        //为两个JRadioButton单选按钮组件注册动作监听器
        ActionListener listener=new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int mode=0;
                if(bold.isSelected())
                    mode+=Font.BOLD;
                if(italic.isSelected())
                    mode+=Font.ITALIC;
                label.setFont(new Font("宋体",mode,20));
            }
        };
        //为两个复选框添加监听器
        italic.addActionListener(listener);
        bold.addActionListener(listener);
        //在JPanel面板添加复选框
        panel.add(italic);
        panel.add(bold);
        //向JFrame窗口容器中加入居中的JLabel标签组件和页尾的JPanel面板组件
        f.add(label);
        f.add(panel,BorderLayout.PAGE_END);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(Gui14::createAndShowGUI);
    }
}

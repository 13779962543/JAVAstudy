package UI;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    public void view()
    {
        ViewAction exwpAction=new ViewAction(this);//提前定义好动作对象
//        setLayout(new FlowLayout(FlowLayout.CENTER,60,50));//使用BorderLayout布局
        setSize(400,450);//设置界面大小
        setLocation(200,100);
        JFrame frame=new JFrame();
        this.setTitle("数学计算能力训练系统");
        JButton a=new JButton("加法训练");//设置切换的按钮a
        JButton b=new JButton("减法训练");//设置切换的按钮b
        JButton c=new JButton("乘法训练");//设置切换的按钮c
        JButton d=new JButton("除法训练");//设置切换的按钮d
        JLabel tip_l=new JLabel("数学计算能力训练系统",0);//界面的内容，这里用一个标签来替代具体内容，后面的“0”是为了使这个标签居中对齐
        a.addActionListener(exwpAction);//为abcd这个按钮添加按键监听
        b.addActionListener(exwpAction);
        c.addActionListener(exwpAction);
        d.addActionListener(exwpAction);
        add(tip_l, BorderLayout.PAGE_START);//将tip_l这个标签添加到布局的
        add(a, BorderLayout.WEST);//将按钮a添加到布局的下方
        add(b,BorderLayout.CENTER);
        add(c,BorderLayout.EAST);
        add(d,BorderLayout.SOUTH);
        setVisible(true);//使视图可视化
    }
    public void view1()
    {
        ViewAction exwpAction=new ViewAction(this);
        setLayout(new BorderLayout());
        setSize(400,400);
        setLocation(200,100);
        this.setTitle("加法训练");
        JButton a=new JButton("数学计算能力训练系统");
        JLabel tip_l=new JLabel("加法训练",0);
        JLabel label=new JLabel("欢迎进入加法训练",JLabel.CENTER);
        JTextField tf=new JTextField(30);   //创建文本对象
        a.add(tf);
        a.addActionListener(exwpAction);
        add(tip_l, BorderLayout.PAGE_START);
        add(label,BorderLayout.CENTER);
        add(a, BorderLayout.SOUTH);
        setVisible(true);
    }
    public void view2()
    {
        ViewAction exwpAction=new ViewAction(this);
        setLayout(new BorderLayout());
        setSize(400,400);
        setLocation(200,100);
        this.setTitle("减法训练");
        JButton b=new JButton("数学计算能力训练系统");
        JLabel tip_l=new JLabel("减法训练",0);
        JLabel label=new JLabel("欢迎进入减法训练",JLabel.CENTER);
        JTextField tf=new JTextField(30);   //创建文本对象
        b.add(tf);
        b.addActionListener(exwpAction);
        add(tip_l, BorderLayout.PAGE_START);
        add(b, BorderLayout.SOUTH);
        setVisible(true);
    }
    public void view3()
    {
        ViewAction exwpAction=new ViewAction(this);
        setLayout(new BorderLayout());
        setSize(400,400);
        setLocation(200,100);
        this.setTitle("乘法训练");
        JButton c=new JButton("数学计算能力训练系统");
        JLabel tip_l=new JLabel("乘法训练",0);
        JLabel label=new JLabel("欢迎进入乘法训练",JLabel.CENTER);
        JTextField tf=new JTextField(30);   //创建文本对象
        c.add(tf);
        c.addActionListener(exwpAction);
        add(tip_l, BorderLayout.PAGE_START);
        add(c, BorderLayout.SOUTH);
        setVisible(true);
    }
    public void view4()
    {
        ViewAction exwpAction=new ViewAction(this);
        setLayout(new BorderLayout());
        setSize(400,400);
        setLocation(200,100);
        this.setTitle("除法训练");
        JButton d=new JButton("数学计算能力训练系统");
        JLabel tip_l=new JLabel("除法训练",0);
        JLabel label=new JLabel("欢迎进入除法训练",JLabel.CENTER);
        JTextField tf=new JTextField(30);   //创建文本对象
        d.add(tf);
        d.addActionListener(exwpAction);
        add(tip_l, BorderLayout.PAGE_START);
        add(d, BorderLayout.SOUTH);
        setVisible(true);
    }
}
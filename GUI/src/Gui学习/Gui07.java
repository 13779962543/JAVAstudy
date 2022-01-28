package Gui学习;

import java.awt.event.*;
import javax.swing.*;

public class Gui07 {
    private static void createAndShowGUI(){
        JFrame f=new JFrame("WindowsEvent");
        f.setSize(400,300);
        f.setLocation(300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //使用内部类创建WindowListener实例对象，监听窗体事件.
        f.addWindowListener(new WindowListener(){
            public void windowOpened(WindowEvent e){
                System.out.println("windowOpened---窗体打开事件");
            }
            public void windowIconified(WindowEvent e){
                System.out.println("windowIconified---窗口图标化事件");
            }
            public void windowDeiconified(WindowEvent e) {
                System.out.println("windowDeiconified---窗体取消图标事件");
            }
            public void windowDeactivated(WindowEvent e){
                System.out.println("windowDeactivated---窗体暂停事件");
            }
            public void windowClosing(WindowEvent e){
                System.out.println("windowClosing---窗体正在关闭事件");
            }
            public void windowClosed(WindowEvent e){
                System.out.println("windowClosed---窗体关闭事件");
            }
            public void windowActivated(WindowEvent e){
                System.out.println("windowActivated---窗口激活事件");
            }
        });
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(Gui07::createAndShowGUI);
    }
}

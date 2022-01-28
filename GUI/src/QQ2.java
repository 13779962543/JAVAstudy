//import java.awt.*;
//import javax.swing.*;
//
//public class QQLogin {
//    //为QQ登录界面整体初始化一个JFrame窗口
//    private static JFrame jf=new JFrame();
//    //qq登录窗口初始化方法
//    public static void initLogin(){
//        jf.setSize(426,300);
//        jf.setLocation(497,242);
//        jf.setUndecorated(true);        //设置JFrame窗口边框不显示
//        jf.setResizable(false);         //禁止改变窗口大小
//        //根据QQ登录界面效果，进行布局分析
//        BorderLayout border_layout=new BorderLayout();
//        jf.setLayout(border_layout);
//        //创建并加入顶部面板
//        JPanel panel_north=CreatePanel.CreateNorthPanel(jf);
//        jf.add(panel_north,BorderLayout.PAGE_START);
//        //创建并加入中部面板
//        JPanel panel_center=CreatePanel.CrateCenterPanel(jf);
//        jf.add(panel_center,BorderLayout.CENTER);
//        //创建并加入左侧面板
//        JPanel panel_west=CreatePanel.CreateWestPanel();
//        jf.add(panel_west,BorderLayout.LINE_START);
//        //创建并加入底部面板
//        JPanel panel_south=CreatePanel.CreateSouthPanel();
//        jf.add(panel_south,BorderLayout.PAGE_END);
//        //创建并加入右侧面板
//        JPanel panel_east=CreatePanel.CrateEastPanel();
//        jf.add(panel_east,BorderLayout.LINE_END);
//        jf.setVisible(true);                //设置窗口可见
//    }
//
//    public static void main(String[] args){
//        SwingUtilities.invokeLater(QQLogin::initLogin);
//    }
//}

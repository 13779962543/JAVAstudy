import java.awt.*;
import javax.swing.*;

public class Gui12 {
    private static void createAndShowGUI(){
        JFrame f=new JFrame("JFrame窗口");
        f.setLayout(new BorderLayout());
        f.setSize(1000,500);
        f.setLocation(300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //创建一个JLabel标签组件,用来展示图片
        JLabel label1=new JLabel();
        //创建一个ImageIcon图标组件,并加入JLabel中
        ImageIcon icon=new ImageIcon("timing.jpg");
        Image img=icon.getImage();
        //用于设置图片大小尺寸
        img=img.getScaledInstance(500,300,Image.SCALE_DEFAULT);
        icon.setImage(img);
        label1.setIcon(icon);
        //创建一个页尾JPanel面板，并加入JLabel标签组件
        JPanel panel=new JPanel();
        JLabel label2=new JLabel("欢迎光临",JLabel.CENTER);
        panel.add(label2);
        //向JFrame聊天窗口容器的顶部和尾部分别加入JLabel和JPanel组件
        f.add(label1,BorderLayout.PAGE_START);
        f.add(label2,BorderLayout.PAGE_END);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(Gui12::createAndShowGUI);
    }
}

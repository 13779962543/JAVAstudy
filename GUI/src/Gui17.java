import java.awt.event.*;
import javax.swing.*;

public class Gui17 {
    private static void createAndShowGUI(){
        JFrame f = new JFrame("JFrame窗口");
        f.setSize(350, 300);
        f.setLocation(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //创建JPopupMenu弹出式菜单
        JPopupMenu popupMenu=new JPopupMenu();
        //创建两个JMenuItem菜单项，并加入到JPopupMenu组件中
        JMenuItem item1=new JMenuItem("查看");
        JMenuItem item2=new JMenuItem("刷新");
        popupMenu.add(item1);
        popupMenu.addSeparator();
        popupMenu.add(item2);
        //为JFrame窗口添加鼠标事件监听
        f.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                //如果单机的是鼠标左键，显示JPopupMenu菜单
                if(e.getButton()==MouseEvent.BUTTON3){
                    popupMenu.show(e.getComponent(),e.getX(),e.getY());
                }
            }
        });
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(Gui17::createAndShowGUI);
    }
}

package Gui学习;

import java.awt.*;
import javax.swing.*;

public class Gui15 {
    private static void createAndShowGUI(){
        JFrame f = new JFrame("JFrame窗口");
        f.setLayout(new BorderLayout());
        f.setSize(350, 300);
        f.setLocation(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //创建一个页头的JPanel面板，用来封装JComboBox下拉框组件
        JPanel panel=new JPanel();
        //创建JComboBox下拉框组件
        JComboBox<String>comboBox=new JComboBox<>();
        comboBox.addItem("请选择城市");
        comboBox.addItem("北京");
        comboBox.addItem("天津");
        comboBox.addItem("南京");
        comboBox.addItem("上海");
        //创建JTextField单行文本框组件，用来展示用户选择项
    JTextField textField=new JTextField(20);
    //为JComboBox下拉框组件注册动作监视器
    comboBox.addActionListener(e->{
        String item=(String) comboBox.getSelectedItem();
        if("请选择城市".equals(item)){
            textField.setText("");
        }else{
            textField.setText("您的城市是:"+item);
        }
    });
    //将JComboBox组件和JTextField组件加入到JPanel面板组件中
    panel.add(comboBox);
    panel.add(textField);
    f.add(panel,BorderLayout.PAGE_START);
       }
       public static void main(String[] args){
        SwingUtilities.invokeLater(Gui15::createAndShowGUI);
       }
}


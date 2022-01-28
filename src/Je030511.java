//演示finalize的应用
import javax.swing.*;
    class TestFinalize{
  static int Created=0;
  int i;
  public TestFinalize(){
      i=++Created;
      System.out.println("start class testFinalize"+i);
  }
  protected void finalize(){
      JOptionPane.showMessageDialog(new JFrame(),"close class testFinalize"+i);
  }
    }
public class Je030511 {
      public static void main(String args []){
          while(true){
              TestFinalize tf=new TestFinalize();

      }
}
}
package Student;

interface ISmartPhonePrice{
    public void cheapPrice();
}
interface ISmartPhoneLooking{
    public void goodLooking();
}
interface ISmartPhoneFunction{
    public void richFunction();
}
abstract class SmartPhone implements  ISmartPhonePrice,ISmartPhoneLooking,ISmartPhoneFunction{
    public void cheapPrice(){
        System.out.println("这手机便宜");
    }
    public void gookLooking(){
        System.out.println("这手机外观真好看");
    }
    public void richFunction(){
        System.out.println("这手机功能真多");
    }
}
class BSmartPhone extends SmartPhone implements ISmartPhoneLooking{
    public void goodLooking(){
        System.out.println("这手机外观真好看");
    }
}
class YoungUser{
    private SmartPhone phone;
    public YoungUser(SmartPhone phone){
        this.phone=phone;
    }
    public void userPhone(){
        phone.cheapPrice();
        phone.gookLooking();
        phone.richFunction();
    }
}
class BussinessUser{
    private SmartPhone phone;
    public BussinessUser(BSmartPhone phone){
        this.phone=phone;
    }
    public void userPhone(){
        phone.gookLooking();
    }
}
public class T3 {
    public static void main(String[] args){
        SmartPhone sp= new SmartPhone() {
            @Override
            public void goodLooking() {

            }
        };
        YoungUser yu=new YoungUser(sp);
        yu.userPhone();
        BSmartPhone bsp=new BSmartPhone();
        BussinessUser bu=new BussinessUser(bsp);
        bu.userPhone();

    }
}

package Based;

import java.util.Scanner;

public class Product {
    //��Ա����
    static String[] names={"iphones","��Ϊ","С��","oppo","vivo"};
    static double[] price={8999,5399,2399,4399,3999};
    static int[] numbers={50,20,80,120,90};
    public static void main(String[] args){
        /*
        1.��Ʒ�б�
        2.��Ʒ¼��
        3.��Ʒ��ѯ
        4.ͳ����Ϣ
        5.�˳�
         */
        //��ѭ����ʾ�˵�
        outer:
        while(true){
            //��ʾ�˵��������ѡ���ֵ
            int c=menu();
            switch(c){
                case 1:f1();break;
                case 2:f2();break;
                case 3:f3();break;
                case 4:f4();break;
                case 5:break outer;
            }
        }
    }
    private static int menu(){
        System.out.println("--------------------");
        System.out.println("1.��Ʒ�б�");
        System.out.println("2.��Ʒ¼��");
        System.out.println("3.��Ʒ��ѯ");
        System.out.println("4.ͳ����Ϣ");
        System.out.println("5.�˳�");
        System.out.println("--------------------");
        System.out.println("w��:>");
        return new Scanner(System.in).nextInt();
    }
    private static void f1(){
        /*
        names
        ["A","B","C"]
        prices
        [2,8,3]
        numbers
        [200,300,180]
          0  1   2
         */
        for(int i=0;i<names.length;i++){
            String n=names[i];
            double p=price[i];
            int b=numbers[i];
            System.out.println((i+1)+".����"+n+",�۸�:"+p+",����:"+b);
        }
    }
    private static void f2(){
        for(int i=0;i<names.length;i++){
            System.out.println("¼���"+(i+1)+"����Ʒ");
            System.out.println("����:");
            String n=new Scanner(System.in).nextLine();
            System.out.println("�۸�:");
            double p=new Scanner(System.in).nextDouble();
            System.out.println("����:");
            int b=new Scanner(System.in).nextInt();
            names[i]=n;
            price[i]=p;
            numbers[i]=b;
        }
        f1();
    }
    private static void f3(){
        System.out.println("�����ѯ����Ʒ��:");
        String n=new Scanner(System.in).nextLine();
        //��������
        for(int i=0;i<names.length;i++){
            //n��names[i]���
            if(n.equals(names[i])){
                String name=names[i];
                double p=price[i];
                int b=numbers[i];
                System.out.println((i+1)+".����"+n+",�۸�:"+p+",����:"+b);
                return;
            }
        }
        //ѭ��������û���ҵ���Ҫ��ѯ����Ʒ
        System.out.println("�Ҳ�����Ʒ");
    }
    private static void f4(){
        double spzj=0;  //��Ʒ�ܼ�
        double djzj=0;  //�����ܼ�
        double zgdj=0;  //��ߵ���
        double zgzj=0;  //����ܼ�
        //��������
        for(int i=0;i<names.length;i++){
            spzj+=price[i]*numbers[i];
            djzj+=price[i];
            //������,�ҵ������ֵ
            if(price[i]>zgdj){
                zgdj=price[i];
            }
            if(price[i]*numbers[i]>zgzj){
                zgzj=price[i]*numbers[i];
            }
        }
        System.out.println("��Ʒ�ܼ�:"+spzj);
        System.out.println("���۾���:"+djzj/names.length);
        System.out.println("��ߵ���:"+zgdj);
        System.out.println("����ܼ�:"+zgzj);
    }
}

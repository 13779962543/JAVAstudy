package study01;

public class SingleInstanceDemo02 {
    public static void main(String[] args){
        SingleInstance02 s1=SingleInstance02.getInstance();
        SingleInstance02 s2=SingleInstance02.getInstance();
        System.out.println(s1==s2);

    }
}
    //�����������һ�����ģʽ����
    class SingleInstance02{
        //2.����һ����̬��Ա�������ڴ洢һ������(������������ֱ�Ӵ������󣬱�����Ҫ��ʱ��Ŵ���)
        public static SingleInstance02 ins;
        //1.������˽��
        private SingleInstance02(){

        }
        //3.ͨ����������һ�����󣬲����ڶ���Ŵ���һ������
        public static SingleInstance02 getInstance(){
            if(ins==null){
//                ��һ����ȡ���󣬴���һ������
                ins=new SingleInstance02();
            }
        return ins;
    }
}

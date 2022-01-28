package 课堂作业;

import 课堂作业.OuterClass;
import 课堂作业.OuterClass.MemberInner;

public class Test {
    public static void main(String[] args) {

        MemberInner om = new OuterClass().new MemberInner();
        om.testMemberInner();
        OuterClass.StaticInner osi =new OuterClass.StaticInner();
        osi.testdStatic();
        osi.testStatic();
        OuterClass out = new OuterClass();
        out.testMethodClass();

    }
}

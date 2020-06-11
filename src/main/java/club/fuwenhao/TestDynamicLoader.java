package club.fuwenhao;

/**
 * 动态加载过程
 * @author fwh
 * @email fuwenhao594@163.com
 * @date 2020/6/11 10:57 上午
 */
public class TestDynamicLoader {
    static {
        System.out.println("*************load TestDynamicLoad************");
    }
    public static void main(String[] args) {
        new A();
        System.out.println("*************load test************");
//        B b = null;  //B不会加载，除非这里执行 new B()
        B b = new B();
    }
}

class A {
    static {
        System.out.println("*************load A************");
    }
    public A() {
        System.out.println("*************initial A************");
    }
}

class B {
    static {
        System.out.println("*************load B************");
    }
    public B() {
        System.out.println("*************initial B************");
    }
}

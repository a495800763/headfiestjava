package com.liumq.simplejava.innerclass;

/**
 * 内部类访问实例变量的顺序解析
 */
public class DiscernVariable {
    private String prop = "外部类的实例变量";

    private class innerClass {
        private String prop = "内部类的实例变量";

        public void info() {
            String prop = "方法中的局部变量";
            //通过外部类类名.this.varName访问外部类的实例变量
            System.out.println("指定访问外部类的实例变量：" + DiscernVariable.this.prop);
            //通过this.varName访问
            System.out.println("指定访问内部类的实例变量：" + this.prop);
            //访问局部变量
            System.out.println("访问局部变量：" + prop);
        }

    }

    public void test() {
        innerClass ic = new innerClass();
        ic.info();
    }

    public static void main(String[] args) {
        new DiscernVariable().test();
    }
}

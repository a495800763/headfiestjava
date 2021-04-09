package com.liumq.simplejava.classheadfirst;
import static java.lang.System.*;
import static java.lang.Math.*;

public class StaticImport {
    public static void main(String[] args) {
        //使用静态引入之后在程序中使用就不需要在指定明确的包名
        out.println(PI);
        out.println(sqrt(144));
    }
}

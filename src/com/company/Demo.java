package com.company;

public class Demo {
    public static void main(String[] args) {

       System.out.println(80*4+75*0.6);
        System.out.println(80*4+75*0.6);
        System.out.println(80*4+75*0.6);




        System.out.println(calc(80, 75));
        System.out.println(calc(80, 75));
        System.out.println(calc(80, 75));
        System.out.println(calc(80, 75));
    }

    // 方法的封装 把复杂的操作放在一个函数里，

    public static double calc(int pingshi, int qimo) {
        return pingshi * 0.4 + qimo * 0.6;
    }

}

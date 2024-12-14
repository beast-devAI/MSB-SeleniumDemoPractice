package com.dt.intermediate;

public class MethodChaining {

    public static void main(String[] args) {

        DemoTest obj = new DemoTest();

       obj.m1().m1()
                  .m1()
                     .m1()
                        .m1()
                           .m2()
                             .m2()
                               .m1()
                                   .m1();

    }
}

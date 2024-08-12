package com.donggua.test.testproject06.test;

import cn.hutool.core.util.NumberUtil;
import com.donggua.test.testproject06.reflection.MetaObject;
import com.donggua.test.testproject06.reflection.SystemMetaObject;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class Test01 {

    public static void main(String[] args) {

        List<String> list  = null;

        Optional<?> optional = Optional.ofNullable(list);

        optional.ifPresent(o -> System.out.println(o));

        String aa = "1111.ddd.d";
        int delim = aa.indexOf('.');
        System.out.println(aa.substring(0, delim));

        User user = new User(1, "gua");

        MetaObject metaObject = SystemMetaObject.forObject(user);

        metaObject.setValue("name", "guae");
        System.out.println(metaObject.getValue("name"));


        BigDecimal a11 = new BigDecimal("10");
        BigDecimal a22 = new BigDecimal("3");


        double te1 = 123456.123456;
        double te2 = 123456.128456;

        te1  = te1 + 0.004;
        te2  = te2 + 0.004;
        BigDecimal b2 = NumberUtil.round(te1, 0);//结果:123456.1235
        BigDecimal b3 = NumberUtil.round(te2, 0);//结果:123456.1285

        System.out.println(b2);
        System.out.println(b3);
    }
}

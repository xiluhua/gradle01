package com.atguigu;

import groovy.lang.GroovyClassLoader;

/**
 * @since 2020-12-24
 * @author xiluhua
 * @from https://www.cnblogs.com/yydone/p/10184971.html
 * java & groovy 混合编程-类加载方式
 */
public class Main01 {
    public static void main(String[] args) {
        try {
            Class clazz;
            try (GroovyClassLoader loader = new GroovyClassLoader()) {
                clazz = loader.loadClass("com.atguigu.Foo");
            }
            IFoo foo = (IFoo) clazz.newInstance();
            System.out.println(foo.add(new Integer(2), new Integer(3)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

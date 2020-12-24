package com.atguigu;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyCodeSource;
import groovy.lang.GroovyObject;

import java.io.File;
import java.util.Date;

/**
 * @since 2020-12-24
 * @author xiluhua
 * @from https://www.iteye.com/blog/shift-alt-ctrl-1938238
 * java & groovy 混合编程-scr code加载方式
 */
public class Main02 {
    public static void main(String[] args) throws Exception {
        Main02.parse();
    }

    public static void parse() throws Exception{
        String pathname = "C:\\Users\\Administrator.DESKTOP-S92EN3R\\Desktop\\Foo.groovy";
        GroovyClassLoader classLoader = new GroovyClassLoader(Thread.currentThread().getContextClassLoader());
        File sourceFile = new File(pathname);//文本内容的源代码
        Class clazz = classLoader.parseClass(new GroovyCodeSource(sourceFile));
        IFoo foo = (IFoo) clazz.newInstance();
        System.out.println(foo.add(new Integer(2), new Integer(3)));
    }
}

package com.zzf.software.design.pattern.observer;

/**
 * 观察者模式（发布-订阅模式）
 * @author zhaozhifei
 * @className BellEventTest
 * @date 2022/3/23
 */
public class BellEventTest {
    public static void main(String[] args) {

        BellEventSource bellEventSource = new BellEventSource();

        StuEventListener stuEventListener = new StuEventListener();
        TeachEventListener teach1 = new TeachEventListener("语文老师");
        //学生订阅
        bellEventSource.addPersonListener(stuEventListener);
        //老师订阅
        bellEventSource.addPersonListener(teach1);
        bellEventSource.ring(true);

        //学生下不了课了，取消订阅

        System.out.println("-----四十分钟后-----");
        bellEventSource.ring(false);
        bellEventSource.delPersonListener(teach1);

        System.out.println("-----十分钟后-----");
        TeachEventListener teach2 = new TeachEventListener("数学老师");
        bellEventSource.addPersonListener(teach2);
        bellEventSource.ring(true);
    }
}

package com.zzf.software.design.pattern.observer;

/**
 * 具体观察者类：学生事件监听器
 * @author zhaozhifei
 * @className StuEventListener
 * @date 2022/3/23
 */
public class StuEventListener implements BellEventListener {
    @Override
    public void heardBell(RingEvent e) {
        if (e.getSound()) {
            System.out.println("同学们，上课了...");
        } else {
            System.out.println("同学们，下课了...");
        }
    }
}

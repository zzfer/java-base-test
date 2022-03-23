package com.zzf.software.design.pattern.observer;

/**
 * 具体观察者类：老师事件监听器
 * @author zhaozhifei
 * @className TeachEventListener
 * @date 2022/3/23
 */
public class TeachEventListener implements BellEventListener {

    public String name;

    public TeachEventListener(String name) {
        this.name = name;
    }

    @Override
    public void heardBell(RingEvent e) {
        if (e.getSound()) {
            System.out.println(this.name + "老师上课了...");
        } else {
            System.out.println(this.name + "老师下课了...");
        }
    }
}

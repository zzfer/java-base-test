package com.zzf.software.design.pattern.observer;

import java.util.EventListener;

/**
 * 抽象观察者类：铃声事件监听器
 *
 * @author zhaozhifei
 * @className RingEvent
 * @date 2022/3/23
 */
public interface BellEventListener extends EventListener {
    /**
     * 事件处理方法，听到铃声
     * @param e
     */
    public void heardBell(RingEvent e);
}

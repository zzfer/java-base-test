package com.zzf.software.design.pattern.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 目标类：事件源，铃
 *
 * @author zhaozhifei
 * @className BellEventSource
 * @date 2022/3/23
 */
public class BellEventSource {

    private List<BellEventListener> listenerList;

    public BellEventSource() {
        listenerList = new ArrayList<BellEventListener>();
    }

    /**
     * 添加订阅
     * @param bellEventListener
     */
    public void addPersonListener(BellEventListener bellEventListener) {
        listenerList.add(bellEventListener);
    }

    /**
     * 取消订阅
     * @param bellEventListener
     */
    public void delPersonListener(BellEventListener bellEventListener) {
        listenerList.remove(bellEventListener);
    }

    /**
     * 事件触发器：敲钟，当铃声sound的值发生变化时，触发事件。
     * @param sound
     */
    public void ring(boolean sound) {
        String type = sound ? "上课铃" : "下课铃";
        System.out.println(type + "响啦！");
        RingEvent ringEvent = new RingEvent(this, sound);
        notifies(ringEvent);
    }

    /**
     * 迭代器循环订阅者
     * @param e
     */
    protected void notifies(RingEvent e){
        BellEventListener ren = null;
        Iterator<BellEventListener> iterator = listenerList.iterator();
        while (iterator.hasNext()){
            ren = iterator.next();
            ren.heardBell(e);
        }
    }
}

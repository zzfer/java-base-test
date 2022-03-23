package com.zzf.software.design.pattern.observer;

import java.util.EventObject;

/**
 * 事件类
 *
 * @author zhaozhifei
 * @className RingEvent
 * @date 2022/3/23
 */
public class RingEvent extends EventObject {

    private static final long serialVersionUID = 1L;
    private boolean sound;
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public RingEvent(Object source, boolean sound) {
        super(source);
        this.sound = sound;
    }

    public boolean getSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }
}

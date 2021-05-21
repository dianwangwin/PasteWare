package me.eskid.nhacks.event.events;

import me.eskid.nhacks.event.EventStage;
import me.eskid.nhacks.features.setting.Setting;

public class ValueChangeEvent
        extends EventStage {
    public Setting setting;
    public Object value;

    public ValueChangeEvent(Setting setting, Object value) {
        this.setting = setting;
        this.value = value;
    }
}


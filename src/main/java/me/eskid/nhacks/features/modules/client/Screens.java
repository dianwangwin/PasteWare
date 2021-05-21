package me.eskid.nhacks.features.modules.client;

import me.eskid.nhacks.features.modules.Module;
import me.eskid.nhacks.features.setting.Setting;

public class Screens
        extends Module {
    public static Screens INSTANCE;
    public Setting<Boolean> mainScreen = this.register(new Setting<Boolean>("MainScreen", true));

    public Screens() {
        super("Screens", "Controls custom screens used by the client", Module.Category.CLIENT, true, false, false);
        INSTANCE = this;
    }

    @Override
    public void onTick() {
    }
}


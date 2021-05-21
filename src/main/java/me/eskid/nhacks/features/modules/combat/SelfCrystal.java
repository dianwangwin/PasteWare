package me.eskid.nhacks.features.modules.combat;

import me.eskid.nhacks.features.modules.Module;

public class SelfCrystal
        extends Module {
    public SelfCrystal() {
        super("SelfCrystal", "Best module", Module.Category.COMBAT, true, false, false);
    }

    @Override
    public void onTick() {
        if (AutoCrystal.getInstance().isEnabled()) {
            AutoCrystal.target = SelfCrystal.mc.player;
        }
    }
}


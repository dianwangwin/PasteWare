package me.eskid.nhacks.features.modules.movement;

import me.eskid.nhacks.features.modules.Module;

public class ReverseStep
        extends Module {
    public ReverseStep() {
        super("ReverseStep", "Screams chinese words and teleports you", Module.Category.MOVEMENT, true, false, false);
    }

    @Override
    public void onUpdate() {
        if (ReverseStep.mc.player.onGround) {
            ReverseStep.mc.player.motionY -= 1.0;
        }
    }
}


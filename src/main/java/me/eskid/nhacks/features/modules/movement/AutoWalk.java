package me.eskid.nhacks.features.modules.movement;

import me.eskid.nhacks.features.modules.Module;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class AutoWalk
        extends Module {
    public AutoWalk() {
        super("AutoWalk", "Automatically walks in a straight line", Module.Category.MOVEMENT, true, false, false);
    }

    @SubscribeEvent
    public void onUpdateInput(InputUpdateEvent event) {
        event.getMovementInput().moveForward = 1.0f;
    }
}


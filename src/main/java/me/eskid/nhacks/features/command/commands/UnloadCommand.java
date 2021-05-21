package me.eskid.nhacks.features.command.commands;

import me.eskid.nhacks.NHacksWare;
import me.eskid.nhacks.features.command.Command;

public class UnloadCommand
        extends Command {
    public UnloadCommand() {
        super("unload", new String[0]);
    }

    @Override
    public void execute(String[] commands) {
        NHacksWare.unload(true);
    }
}


package me.eskid.nhacks.features.command.commands;

import me.eskid.nhacks.NHacksWare;
import me.eskid.nhacks.features.command.Command;

public class ReloadCommand
        extends Command {
    public ReloadCommand() {
        super("reload", new String[0]);
    }

    @Override
    public void execute(String[] commands) {
        NHacksWare.reload();
    }
}


package me.eskid.nhacks.features.command.commands;

import me.eskid.nhacks.NHacksWare;
import me.eskid.nhacks.features.command.Command;

public class HelpCommand
        extends Command {
    public HelpCommand() {
        super("commands");
    }

    @Override
    public void execute(String[] commands) {
        HelpCommand.sendMessage("You can use following commands: ");
        for (Command command : NHacksWare.commandManager.getCommands()) {
            HelpCommand.sendMessage(NHacksWare.commandManager.getPrefix() + command.getName());
        }
    }
}


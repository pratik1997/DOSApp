/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dosapp.command;

import java.util.HashMap;

/**
 *
 * @author Prakriti
 */
public class DosCommandFactory {

    private static HashMap<String, DosCommand> commands = initCommands();

    private static HashMap<String, DosCommand> initCommands() {
        HashMap<String, DosCommand> cmds = new HashMap<>();
        cmds.put("dir", new DirCommand());
        cmds.put("md", new MDCommand());
        cmds.put("rd", new RDCommand());
        cmds.put("copy", new CopyCommand());
        cmds.put("rename", new Rename());
        cmds.put("type", new TypeCommand());

        return cmds;

    }

    public static DosCommand get(String key) {
        if (commands.containsKey(key)) {
            return commands.get(key);
        }
        return null;
    }
}

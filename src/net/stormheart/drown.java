/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.java.JavaPlugin
 */
package net.stormheart;

import net.stormheart.PlayerListener;
import org.bukkit.plugin.java.JavaPlugin;

public class drown
extends JavaPlugin {
    public void onEnable() {
        new PlayerListener(this);
    }

    public void onDisable() {
    }
}


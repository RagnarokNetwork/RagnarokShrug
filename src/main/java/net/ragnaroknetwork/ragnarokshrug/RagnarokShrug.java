package net.ragnaroknetwork.ragnarokshrug;

import org.bukkit.plugin.java.JavaPlugin;

public final class RagnarokShrug extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("shrug").setExecutor(new Command());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

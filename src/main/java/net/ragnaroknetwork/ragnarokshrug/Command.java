package net.ragnaroknetwork.ragnarokshrug;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Command implements CommandExecutor {
    Plugin plugin = RagnarokShrug.getPlugin(RagnarokShrug.class);

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        player.chat("¯\\_(ツ)_/¯");
        return true;
    }
}

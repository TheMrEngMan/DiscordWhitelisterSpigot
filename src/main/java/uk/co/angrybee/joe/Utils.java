package uk.co.angrybee.joe;

import de.myzelyam.api.vanish.VanishAPI;
import org.bukkit.entity.Player;
import org.bukkit.metadata.MetadataValue;

import static uk.co.angrybee.joe.DiscordWhitelister.essentialsPlugin;

public class Utils {

    // Check if player is vanished
    public static boolean isVanished(Player player) {

        // For Essentials
        if(essentialsPlugin != null) {
            if(essentialsPlugin.getUser(player).isVanished()) return true;
        }

        // For SuperVanish / PremiumVanish
        if(VanishAPI.getPlugin() != null) {
            if(VanishAPI.isInvisible(player)) return true;
        }

        // For VanishNoPacket / possibly more
        for (MetadataValue meta : player.getMetadata("vanished")) {
            if (meta.asBoolean()) return true;
        }

        // Otherwise, player is not vanished
        return false;

    }

}


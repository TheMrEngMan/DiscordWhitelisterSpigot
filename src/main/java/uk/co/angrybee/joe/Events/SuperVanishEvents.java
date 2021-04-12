package uk.co.angrybee.joe.Events;

import de.myzelyam.api.vanish.PlayerHideEvent;
import de.myzelyam.api.vanish.PlayerShowEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import uk.co.angrybee.joe.DiscordWhitelister;

public class SuperVanishEvents implements Listener {

    @EventHandler
    public void onPlayerShowEvent(PlayerShowEvent event){
        DiscordWhitelister.getPlugin().getLogger().info("Player " + event.getPlayer().getDisplayName() + " un-vanished via SuperVanish");
        VanishEvents.onPlayerShow(event.getPlayer().getDisplayName());
    }

    @EventHandler
    public void onPlayerHideEvent(PlayerHideEvent event){
        DiscordWhitelister.getPlugin().getLogger().info("Player " + event.getPlayer().getDisplayName() + " vanished via SuperVanish");
        VanishEvents.onPlayerHide(event.getPlayer().getDisplayName());
    }

}

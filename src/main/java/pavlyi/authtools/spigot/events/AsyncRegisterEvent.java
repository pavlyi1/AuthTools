package pavlyi.authtools.spigot.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import pavlyi.authtools.spigot.authentication.User;
import pavlyi.authtools.spigot.storages.Variables;

public class AsyncRegisterEvent extends Event {
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private final Player player;
    private final User user;
    private final String code;
    private final String secretKey;

    public AsyncRegisterEvent(Player player, String code, String secretKey) {
        this.player = player;
        this.user = Variables.getUser(player.getUniqueId());
        this.code = code;
        this.secretKey = secretKey;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public Player getPlayer() {
        return player;
    }

    public User getUser() {
        return user;
    }

    public String getCode() {
        return code;
    }

    public String getSecretKey() {
        return secretKey;
    }
}

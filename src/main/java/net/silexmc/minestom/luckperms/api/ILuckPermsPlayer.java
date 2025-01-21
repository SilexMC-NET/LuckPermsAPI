package net.silexmc.minestom.luckperms.api;

import net.kyori.adventure.text.Component;
import net.minestom.server.entity.Player;
import net.minestom.server.network.player.GameProfile;
import net.minestom.server.network.player.PlayerConnection;
import org.jetbrains.annotations.NotNull;

public abstract class ILuckPermsPlayer extends Player {
    public ILuckPermsPlayer(@NotNull PlayerConnection connection, @NotNull GameProfile profile) {
        super(connection, profile);
    }

    public abstract boolean hasPermission(String permission);

    public abstract Component getPrefix();

    public abstract Component getSuffix();
}

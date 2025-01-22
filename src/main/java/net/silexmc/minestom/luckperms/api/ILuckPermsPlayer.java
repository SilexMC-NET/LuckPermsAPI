package net.silexmc.minestom.luckperms.api;

import net.kyori.adventure.text.Component;

public interface ILuckPermsPlayer {
    boolean hasPermission(String permission);

    String getPrefix();

    String getSuffix();
}

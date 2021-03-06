package me.vemacs.ghettoenchants.event;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class ArmorWornEvent extends ArmorEvent {
    private static final HandlerList handlers = new HandlerList();

    public ArmorWornEvent(Player who, ItemStack itemStack) {
        super(who, itemStack);
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    @SuppressWarnings("unused")
    public static HandlerList getHandlerList() {
        return handlers;
    }
}

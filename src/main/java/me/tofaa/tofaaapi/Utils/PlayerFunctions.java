package me.tofaa.tofaaapi.Utils;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class PlayerFunctions {

    public static void setXP(Player player, float xp){
        player.setExp(xp);
    }

    public static void setXPLevel(Player player, int level){
        player.setLevel(level);
    }

    public static void sendActionbar(Player player, String message){

        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(message));
    }

    public static void setArmor(Player player, ItemStack helmet, ItemStack chestplate, ItemStack leggings, ItemStack boots){
        player.getInventory().setHelmet(helmet);
        player.getInventory().setHelmet(chestplate);
        player.getInventory().setHelmet(leggings);
        player.getInventory().setHelmet(boots);
    }
}

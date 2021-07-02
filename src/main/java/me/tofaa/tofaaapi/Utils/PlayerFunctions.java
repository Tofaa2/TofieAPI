package me.tofaa.tofaaapi.Utils;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;


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

}

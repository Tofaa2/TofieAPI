package me.tofaa.tofaaapi.ItemsCreator;

import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ItemsCreator {


    public static void setName(ItemStack item, String name) {
        ItemMeta itemStackMeta = item.getItemMeta();
        itemStackMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        item.setItemMeta(itemStackMeta);
    }


    private static List<String> multiLineLore(String lore) {
        List<String> loreList = Arrays.asList(lore.split("\\\\n"));
        ListIterator<String> itr = loreList.listIterator();
        while (itr.hasNext()) {
            itr.set(ChatColor.translateAlternateColorCodes( '&' ,itr.next()));
        }
        return loreList;
    }


    public static void setLore(ItemStack itemStack, String name) {
        String lore = ChatColor.translateAlternateColorCodes('&', name);
        List<String> loreList = multiLineLore(lore);
        ItemMeta itemStackMeta = itemStack.getItemMeta();
        itemStackMeta.setLore(loreList);
        itemStack.setItemMeta(itemStackMeta);
    }

    public static void addLore(ItemStack itemStack, String loreString) {
        List<String> lore = itemStack.getItemMeta().getLore();

        if (lore == null) {
            setLore(itemStack, loreString);
        } else {
            List<String> newLore = multiLineLore(loreString);
            lore.addAll(newLore);
            ItemMeta itemStackMeta = itemStack.getItemMeta();
            itemStackMeta.setLore(lore);
            itemStack.setItemMeta(itemStackMeta);
        }
    }

    public static void removeLore(ItemStack item, int n) {
        ItemMeta itemStackMeta = item.getItemMeta();
        if (itemStackMeta.hasLore() && (n != -1)) {
            List<String> list = itemStackMeta.getLore();
            if (list.size() >= (n + 1)) {
                list.remove(n);
                itemStackMeta.setLore(list);
            }
        } else {
            itemStackMeta.setLore(null);
        }
        item.setItemMeta(itemStackMeta);
    }


}

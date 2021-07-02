package me.tofaa.tofaaapi.ItemsCreator;


import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class Enchants {

    public static void addEnchant(ItemStack item, Enchantment enchantment, int level){
        item.addUnsafeEnchantment(enchantment, level);
    }
    public static void removeEnchant(ItemStack item, Enchantment enchantment){
        item.removeEnchantment(enchantment);
    }




}


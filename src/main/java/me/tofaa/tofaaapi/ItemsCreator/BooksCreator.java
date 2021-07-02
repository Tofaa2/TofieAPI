package me.tofaa.tofaaapi.ItemsCreator;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

public class BooksCreator {

    public static ItemStack unSignBook(ItemStack book) {
        BookMeta oldMeta = (BookMeta) book.getItemMeta();
        ItemStack unsigned;
        try {
            unsigned = new ItemStack(Material.WRITABLE_BOOK, 1);
        } catch (NoSuchFieldError e) {
            unsigned = new ItemStack(Material.matchMaterial("BOOK_AND_QUILL"), 1);
        }
        BookMeta newMeta = (BookMeta) unsigned.getItemMeta();
        newMeta.setPages(oldMeta.getPages());
        unsigned.setItemMeta(newMeta);
        return unsigned;

    }

    public static void setBookAuthor(ItemStack book, String name) {
        BookMeta meta = (BookMeta) book.getItemMeta();
        meta.setAuthor(name);
        book.setItemMeta(meta);
    }

    public static void setBookTitle(ItemStack book, String name) {
        BookMeta meta = (BookMeta) book.getItemMeta();
        meta.setDisplayName(null);
        meta.setTitle(name);
        book.setItemMeta(meta);
    }

}

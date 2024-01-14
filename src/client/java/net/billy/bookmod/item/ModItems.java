package net.billy.bookmod.item;

import net.billy.bookmod.BookMod;
import net.billy.bookmod.item.custom.BookWar;
import net.billy.bookmod.item.custom.Book_Immortality;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

//import java.rmi.registry.Registry;

public class ModItems {

    public static final Item Book_War = registerItem("book_war",
            new BookWar(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item Book_Immortality = registerItem("book_immortality",
            new Book_Immortality(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        Registry.register(Registry.ITEM, new Identifier(BookMod.MOD_ID, name), item);
        return item;
    }

    public static void registerModItems() {
        BookMod.LOGGER.debug("Registering Mod Items for " + BookMod.MOD_ID);
    }
}



    //  public static final Item Waritem = register("War_Book",
          //  new WarItem(new FabricItemSettings().group(ModItemGroup.new).maxCount(1)));


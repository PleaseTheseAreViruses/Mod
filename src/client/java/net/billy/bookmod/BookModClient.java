package net.billy.bookmod;

import net.billy.bookmod.item.ModItems;
import net.fabricmc.api.ClientModInitializer;

public class BookModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
    }
}

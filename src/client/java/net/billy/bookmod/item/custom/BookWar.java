package net.billy.bookmod.item.custom;

import net.billy.bookmod.item.ModItems;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import static net.minecraft.util.Hand.MAIN_HAND;

public class BookWar extends Item {

    public BookWar(Settings settings) {super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (ModItems.Book_War hand = MAIN_HAND) {
            new BookWar(new StatusEffectInstance(StatusEffects.WITHER, 3600, 0)));




            user.getItemCooldownManager().set(this, 600);
        }
        return super.use(world, user, hand);

    }
}

package net.billy.bookmod.item.custom;

import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;


import java.util.concurrent.atomic.AtomicBoolean;

import static net.minecraft.util.Hand.MAIN_HAND;

public class BookWar extends Item {

    public BookWar(Settings settings) {super(settings);
    }




        @Override
    public boolean canBeNested()
    {
        return false;
    }





    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {


        if (!world.isClient() && hand == MAIN_HAND) {
            new Potion(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 5));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 5));



            user.getItemCooldownManager().set(this, 1200);
        }
        return super.use(world, user, hand);

    }
}

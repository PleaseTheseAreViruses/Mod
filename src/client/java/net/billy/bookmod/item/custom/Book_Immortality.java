package net.billy.bookmod.item.custom;


import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import static net.minecraft.util.Hand.MAIN_HAND;

public class Book_Immortality extends Item{
    public Book_Immortality(Item.Settings settings) {super(settings);
    }


    @Override
    public boolean canBeNested()
    {
        return false;
    }
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {


        if (!world.isClient() && hand == MAIN_HAND) {
            new Potion(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 6000, 4));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 6000, 4));



            user.getItemCooldownManager().set(this, 3000);
        }
        return super.use(world, user, hand);

    }
}



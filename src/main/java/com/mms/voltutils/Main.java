package com.mms.voltutils;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("voltutils")
public class Main
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "voltutils";

    public Main() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);
    }

        public static class ModItemGroup extends ItemGroup {

            public static final ModItemGroup instance = new ModItemGroup(ItemGroup.TABS.length, "superpackutils");

            public ModItemGroup(int index, String label) {
                super(index, label);
            }

            @SuppressWarnings("NullableProblems")
            @OnlyIn(Dist.CLIENT)
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(Items.DIAMOND_PICKAXE.getItem());


            }
        }

}

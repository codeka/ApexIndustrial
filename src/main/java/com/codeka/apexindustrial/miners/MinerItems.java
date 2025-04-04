package com.codeka.apexindustrial.miners;

import com.codeka.apexindustrial.ApexIndustrialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MinerItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ApexIndustrialMod.MODID);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

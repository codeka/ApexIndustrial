package com.codeka.apexindustrial.item;

import com.codeka.apexindustrial.ApexIndustrialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ApexIndustrialMod.MODID);

    public static final DeferredItem<Item> IRON_FRAME = ITEMS.register(
            "iron_frame",
            () -> new Item(
                    new Item.Properties()
                            .useItemDescriptionPrefix()
                            .setId(
                                    ResourceKey.create(
                                            Registries.ITEM,
                                            ResourceLocation.fromNamespaceAndPath(
                                                    ApexIndustrialMod.MODID,
                                                    "iron_frame")))));

    public static final DeferredItem<Item> IRON_PLATE = ITEMS.register(
            "iron_plate",
            () -> new Item(
                    new Item.Properties()
                            .useItemDescriptionPrefix()
                            .setId(
                                    ResourceKey.create(
                                            Registries.ITEM,
                                            ResourceLocation.fromNamespaceAndPath(
                                                    ApexIndustrialMod.MODID,
                                                    "iron_plate")))));

    public static final DeferredItem<Item> IRON_ROD = ITEMS.register(
            "iron_rod",
            () -> new Item(
                    new Item.Properties()
                            .useItemDescriptionPrefix()
                            .setId(
                                    ResourceKey.create(
                                            Registries.ITEM,
                                            ResourceLocation.fromNamespaceAndPath(
                                                    ApexIndustrialMod.MODID,
                                                    "iron_rod")))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

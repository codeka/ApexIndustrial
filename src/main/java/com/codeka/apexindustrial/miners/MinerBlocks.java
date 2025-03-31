package com.codeka.apexindustrial.miners;

import com.codeka.apexindustrial.ApexIndustrialMod;
import com.codeka.apexindustrial.miners.block.MinerBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class MinerBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ApexIndustrialMod.MODID);

    public static final DeferredBlock<Block> MINER = registerBlock(
            "miner",
            () -> new MinerBlock(
                    BlockBehaviour.Properties.of()
                            .setId(
                                    ResourceKey.create(
                                            Registries.BLOCK,
                                            ResourceLocation.fromNamespaceAndPath(ApexIndustrialMod.MODID, "miner")))
                            .noOcclusion()
                            .strength(4f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> blockSupplier) {
        DeferredBlock<T> deferredBlock = BLOCKS.register(name, blockSupplier);
        registerBlockItem(name, deferredBlock);
        return deferredBlock;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        MinerItems.ITEMS.register(
                name,
                () -> new BlockItem(
                        block.get(),
                        new Item.Properties().setId(
                                ResourceKey.create(
                                        Registries.ITEM,
                                        ResourceLocation.fromNamespaceAndPath(ApexIndustrialMod.MODID, name)))));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);
    
    public static final RegistryObject<Item> STEEL = ITEMS.register("steel",
        ()-> new Item(new Item.Properties().stacksTo(64)));

    public static void register(IEventBus iEventBus) {
        ITEMS.register(iEventBus);
    }
}

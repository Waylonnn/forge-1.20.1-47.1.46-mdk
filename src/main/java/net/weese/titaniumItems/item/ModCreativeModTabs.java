package net.weese.titaniumItems.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.weese.titaniumItems.block.ModBlocks;
import net.weese.titaniumItems.titanium;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, titanium.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TITANIUM_TAB = CREATIVE_MODE_TABS.register("titanium_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANIUM.get()))
                    .title(Component.translatable("Titanium"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TITANIUM.get());

                        // Block
                        pOutput.accept(ModBlocks.TITANIUM_BLOCK.get());
                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}

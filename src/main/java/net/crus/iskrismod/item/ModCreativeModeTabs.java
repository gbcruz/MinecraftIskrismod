package net.crus.iskrismod.item;

import net.crus.iskrismod.IskrisMod;
import net.crus.iskrismod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IskrisMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ISKRIS_ITEMS_TAB = CREATIVE_MODE_TAB.register("iskris_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ISKRIS_ORE.get()))
                    .title(Component.translatable("creativetab.iskrismod.iskris_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.KARL_MARX_BOOK.get());
                        output.accept(ModItems.ISKRIS_INGOT.get());
                        output.accept(ModItems.RAW_ISKRIS.get());
                        output.accept(ModItems.FILHO_DO_GUIVEN.get());
                        output.accept(ModBlocks.ISKRIS_ORE.get());
                        output.accept(ModItems.KIWI.get());
                        output.accept(ModBlocks.ISKRIS_22_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }

}

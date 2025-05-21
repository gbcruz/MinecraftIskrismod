package net.crus.iskrismod.item;
import net.crus.iskrismod.IskrisMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, IskrisMod.MOD_ID);

    public static final RegistryObject<Item> KARL_MARX_BOOK = ITEMS.register("karl_marx", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ISKRIS_INGOT = ITEMS.register("iskris_ingot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ISKRIS = ITEMS.register("raw_iskris", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FILHO_DO_GUIVEN = ITEMS.register("filho_do_guiven", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

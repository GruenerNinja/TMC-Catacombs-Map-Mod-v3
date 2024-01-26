package net.themodcraft.tmc_catacombs_map_mod.client;


import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;
import net.themodcraft.tmc_catacombs_map_mod.config.CatacombsMapHUDConfig;

public class CatacombsMapClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        AutoConfig.register(CatacombsMapHUDConfig.class, JanksonConfigSerializer::new);
    }
}

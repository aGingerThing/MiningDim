package ftblag.stoneblockdimensions;

import ftblag.stoneblockdimensions.mining.MW_WorldProvider;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = StoneBlockDimensions.MODID, name = StoneBlockDimensions.NAME, version = StoneBlockDimensions.version, guiFactory = "ftblag.stoneblockdimensions.client.ModGuiFactory")
public class StoneBlockDimensions {

    public static final String MODID = "stoneblockdimensions", NAME = "StoneBlock Dimensions", version = "@VERSION@";
    public static DimensionType typeMW;
    public static Logger log;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        log = e.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        typeMW = DimensionType.register(MODID + "_mw_world", "", SBUConfig.dimIDMining, MW_WorldProvider.class, false);
        DimensionManager.registerDimension(typeMW.getId(), typeMW);

        MinecraftForge.TERRAIN_GEN_BUS.register(new SBUEventsTerrain());
        ResourceLocationMeta.updateArrayList();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {

    }

    public static void log(String str) {
        if (SBUConfig.debug_log)
            log.debug(str);
    }
}

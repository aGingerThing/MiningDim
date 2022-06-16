package ftblag.stoneblockdimensions;

import net.minecraftforge.common.config.Config;

@Config(modid = StoneBlockDimensions.MODID)
public class SBUConfig {

    @Config.Name("dimIDMining")
    @Config.Comment("The actual dimension id")
    public static int dimIDMining = -7;

    @Config.Name("disableNether")
    @Config.Comment("disabling of original Minecraft nether")
    public static boolean disableNether = true;
    @Config.Name("disableEnd")
    @Config.Comment("disabling of original Minecraft end")
    public static boolean disableEnd = true;

    @Config.Name("wait_time")
    @Config.Comment("Wait time to first login")
    public static int wait_time = 50;
    @Config.Name("tp_cooldown")
    @Config.Comment("Cooldown before teleport")
    public static int tp_cooldown = 50;
    @Config.Name("caves_enable")
    @Config.Comment("Can caves spawn in mining world (true - yes, false - no)")
    public static boolean caves_enable = true;
    @Config.Name("debug_log")
    @Config.Comment("Enable or disable debug.")
    public static boolean debug_log = false;

    @Config.Name("teleporterWhiteList")
    @Config.Comment("Blocks from this list can deleted by teleporter")
    public static String[] teleporterWhiteList = {};
}

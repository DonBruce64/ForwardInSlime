package forwardinslime;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = FIS.MODID, name = FIS.MODNAME, version = FIS.MODVER)
public class FIS{
	public static final String MODID="fis";
	public static final String MODNAME="Forward in Slime";
	public static final String MODVER="1.0";
	
	
	@Instance(value = FIS.MODID)
	public static FIS instance;
	@SidedProxy(clientSide="forwardinslime.ClientProxy", serverSide="forwardinslime.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		proxy.init();
	}
}
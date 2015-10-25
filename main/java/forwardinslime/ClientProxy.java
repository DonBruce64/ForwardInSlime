package forwardinslime;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy{
	public void init(){
		super.init();
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(smoothSlime), 0, new ModelResourceLocation("fis:SmoothSlime", "inventory"));
	}
}

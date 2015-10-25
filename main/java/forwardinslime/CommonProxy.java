package forwardinslime;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy{
	public static final Block smoothSlime = new BlockSmoothSlime();
	public void init(){
		GameRegistry.registerBlock(smoothSlime, "SmoothSlime").setUnlocalizedName("SmoothSlime");
		GameRegistry.addShapelessRecipe(new ItemStack(smoothSlime), Blocks.slime_block, Blocks.sand);
	}
}

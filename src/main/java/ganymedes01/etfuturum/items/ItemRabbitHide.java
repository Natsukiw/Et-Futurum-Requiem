package ganymedes01.etfuturum.items;

import ganymedes01.etfuturum.EtFuturum;
import ganymedes01.etfuturum.core.utils.Utils;
import net.minecraft.item.Item;

public class ItemRabbitHide extends Item {

	public ItemRabbitHide() {
		setTextureName("rabbit_hide");
		setUnlocalizedName(Utils.getUnlocalisedName("rabbit_hide"));
		setCreativeTab(EtFuturum.creativeTabItems);
	}
}
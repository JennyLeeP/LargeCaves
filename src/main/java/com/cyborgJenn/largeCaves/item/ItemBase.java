package com.cyborgJenn.largeCaves.item;

import com.cyborgJenn.largeCaves.LargeCaves;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemBase extends Item {

	protected String name;
	private float attackDamage;
	
	public ItemBase(String name){
		this.name = name;
		setTranslationKey(name);
		//setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(LargeCaves.tabLargeCaves);
		ModItems.ITEMS.add(this);
	}
	
	public ItemBase(ToolMaterial material, String name) {
		ModItems.CYBERIUM = material;
		this.name = name;
		setTranslationKey(name);
		//setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(LargeCaves.tabLargeCaves);
		ModItems.ITEMS.add(this);
	}

	public void registerItemModels() {
		LargeCaves.proxy.registerItemRenderer(this, 0 , name);
	}
	
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}

package com.elikill58.negativity.api.entity;

public enum EntityType {

	ALLAY("minecraft:allay"),
	AREA_EFFECT_CLOUD("minecraft:area_effect_cloud"),
	ARMOR_STAND("ArmorStand"),
	ARROW("Arrow"),
	AXOLOTL("Axolotl"),
	BAT("Bat"),
	BEE("Bee"),
	BLAZE("Blaze"),
	BOAT("Boat"),
	CAT("CAT"),
	CAVE_SPIDER("CaveSpider"),
	CHICKEN("Chicken"),
	COD("Cod"),
	COMPLEX_PART("Complex"),
	COW("Cow"),
	CHEST_BOAT("ChestBoat"),
	CREEPER("Creeper"),
	DOLPHIN("Dolphin"),
	DONKEY("Donkey"),
	DROWNED("Drowned"),
	DROPPED_ITEM("Item"),
	DRAGON_FIREBALL("DragonFireball"),
	EGG("Egg"),
	ENDERMAN("Enderman"),
	ENDERMITE("Endermite"),
	ENDER_CRYSTAL("EnderCrystal"),
	ENDER_DRAGON("EnderDragon"),
	ENDER_PEARL("ThrownEnderpearl"),
	ENDER_SIGNAL("EyeOfEnderSignal"),
	ELDER_GUARDIAN("ElderGuardian"),
	EVOKER("Evoker"),
	EVOKER_FANGS("EvokerFangs"),
	EXPERIENCE_ORB("XPOrb"),
	EYE_OF_ENDER("EyeOfEnder"),
	FALLING_BLOCK("FallingSand"),
	FIREBALL("Fireball"),
	FIREWORK("FireworksRocketEntity"),
	FISHING_HOOK("FishingHook"),
	FOX("Fox"),
	FROG("Frog"),
	GOAT("Goat"),
	GIANT("Giant"),
	GHAST("Ghast"),
	GUARDIAN("Guardian"),
	GLOW_SQUID("GlowSquid"),
	GLOW_ITEM_FRAME("GlowItemFrame"),
	HORSE("Horse"),
	HOGLIN,
	HUSK("Husk"),
	ILLUSIONER("Illusioner"),
	IRON_GOLEM("IronGolem"),
	ITEM_FRAME("ItemFrame"),
	LLAMA,
	LLAMA_SPLIT,
	LLAMA_TRADER,
	LEASH_KNOT("LeashKnot"),
	LIGHTNING("Lightning"),
	MARKER,
	MAGMA_CUBE("LavaSlime"),
	MINECART("MinecartRideable"),
	MINECART_COMMAND_BLOCK("MinecartCommandBlock"),
	MINECART_CHEST("MinecartChest"),
	MINECART_FURNACE("MinecartFurnace"),
	MINECART_HOPPER("MinecartHopper"),
	MINECART_MOB_SPAWNER("MinecartMobSpawner"),
	MINECART_TNT("MinecartTNT"),
	MUSHROOM_COW("MushroomCow"),
	MULE,
	MOOSHROOM,
	OCELOT("Ozelot"),
	PANDA,
	PARROT,
	PAINTING("Painting"),
	PLAYER("Player"),
	PRIMED_TNT("PrimedTnt"),
	PILLAGER,
	PIG("Pig"),
	PIGLIN("Piglin"),
	PIG_ZOMBIE("PigZombie"),
	PHANTOM,
	PIGLIN_BRUTE,
	POLAR_BEAR,
	PUFFER_FISH,
	RABBIT("Rabbit"),
	RAVAGER,
	SALMON("Salmon"),
	SHEEP("Sheep"),
	SILVERFISH("Silverfish"),
	SKELETON("Skeleton"),
	SKELETON_HORSE,
	SLIME("Slime"),
	SMALL_FIREBALL("SmallFireball"),
	SNOW_BALL("Snowball"),
	SNOW_GOLEM("SnowGolem"),
	SPIDER("Spider"),
	SPLASH_POTION("Potion"),
	SPECTRAL_ARROW("SpectralArrow"),
	STRAY("Stray"),
	STRIDER("Strider"),
	SQUID("Squid"),
	SHULKER("Shulker"),
	SHULKER_BULLET("ShulkerBullet"),
	TADPOLE,
	TRIDENT,
	EXP_BOTTLE,
	TURTLE("Turtle"),
	TROPICAL_FISH("TropicalFish"),
	UNKNOWN("Unknow"),
	VEX("Vex"),
	VINDICATOR("Vindicator"),
	VILLAGER("Villager"),
	WARDEN,
	WANDERING_TRADER,
	WITHER("WitherBoss"),
	WITHER_SKULL("WitherSkull"),
	WITHER_SKELETON("WitherSkeleton"),
	WITCH("Witch"),
	WOLF("Wolf"),
	WEATHER("Weather"),
	ZOGLIN("Zoglin"),
	ZOMBIE("Zombie"),
	ZOMBIE_VILLAGER("ZombieVillager");

	private final String name;

	EntityType() {
		this("");
	}
	
	EntityType(String name) {
		this.name = name; // will be replaced by minecraft keys
	}

	public String getName() {
		return name;
	}

	public static EntityType get(String name) {
		for(EntityType gm : EntityType.values())
			if(gm.getName().equalsIgnoreCase(name) || gm.name().equalsIgnoreCase(name))
				return gm;
		return EntityType.UNKNOWN;
	}
}

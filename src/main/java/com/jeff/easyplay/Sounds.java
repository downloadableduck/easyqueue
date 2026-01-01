package com.jeff.easyplay;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

import static com.jeff.easyplay.EasyPlay.MOD_ID;

public class Sounds {
    private static SoundEvent registerSound(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }
    public static final SoundEvent EXPLOSION = registerSound("explosion");
    public static final SoundEvent DING = registerSound("ding");

    public static void registerSounds() {
        EasyPlay.LOGGER(MOD_ID, "registering sounds");

    }

}

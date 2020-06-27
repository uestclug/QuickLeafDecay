package io.github.plusls.QuickLeafDecay;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QuickLeafDecayMod implements ModInitializer {
    public static final String MODID = "quick_leaf_decay_mod";
    public static final Logger LOGGER = LogManager.getLogger(MODID);
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
    }
}
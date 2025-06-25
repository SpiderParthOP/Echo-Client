package com.echoclient;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class EchoClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("✅ Echo Client loaded successfully!");
    }
}

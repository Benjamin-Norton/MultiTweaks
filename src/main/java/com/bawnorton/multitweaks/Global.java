package com.bawnorton.multitweaks;

import com.bawnorton.multitweaks.config.KeybindSettings;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.options.KeyBinding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Global {
    public static final String NAME = "Multiplayer Tweaks";
    public static final String MOD_ID = "multitweaks";
    public static final int[] keyCounts = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
    public final static HashMap<String, Double> troopTimes = new HashMap<String, Double>() {{
        put("Husk", 5.1);
        put("Skeleton", 4.2);
        put("Panda", 25.5);
        put("Parrot", 3.4);
        put("Rabbit", 12.8);
        put("Witch", 51.0);
        put("Creeper", 17.0);
        put("Fox", 25.5);
        put("Spider Jockey", 10.2);
        put("Enderman", 25.5);
        put("Chicken Jockey", 13.6);
        put("Pufferfish Cannon", 34.0);
        put("Phantom", 38.2);
        put("Skeleton Horseman", 34.0);
    }};
    public static boolean inDev = true;
    public static int cycleHat = 0;
    public static int persistentHat = 0;
    public static double trainTime = 0.0;
    public static String currentChat = "";
    public static KeybindSettings[] keybindSettings = new KeybindSettings[24];
    public static KeyBinding[] textBinds = new KeyBinding[24];
    public static MinecraftClient client = MinecraftClient.getInstance();
    public static KeyBinding menuKeybind;
    public static KeyBinding scoreboardKeybind;
    public static KeyBinding gammaKeybind;
    public static KeyBinding hatKeybind;
    public static Map<String, List<String>> spammers = new HashMap<>();
    public static boolean renderChatType = false;
    public static boolean renderBarracksTime = false;
    public static boolean showScoreboard = true;
    public static boolean kingdomDing = true;
    public static boolean visitDing = true;
    public static boolean helperDing = false;
    public static boolean staffDing = false;
    public static boolean messageDing = false;
    public static boolean questionDing = false;
    public static boolean farmDing = true;
    public static boolean barracksDing = true;
    public static boolean blacksmithDing = true;
    public static boolean sendSpamMessage = false;
    public static boolean betterBank = false;
    public static boolean betterCombat = false;
    public static boolean betterTroops = false;
    public static boolean betterFarm = false;
    public static boolean betterRaid = false;
    public static boolean displayChat = true;
    public static boolean barracksTime = false;
    public static boolean autoCharSpam = false;
    public static String ipAddress = "";
    public static String incomingSound;
    public static ConfigBuilder builder;
}

package dev.lps;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class RevenantEtherLootTrackerPluginTest
{

    public static void main(String[] args) throws Exception
    {
        ExternalPluginManager.loadBuiltin(RevenantEtherLootTrackerPlugin.class);
        RuneLite.main(args);
    }
}

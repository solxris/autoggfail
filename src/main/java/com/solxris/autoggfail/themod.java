package com.solxris.autoggfail;

import net.minecraft.client.Minecraft;
import net.minecraft.util.StringUtils;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class themod {
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void onChat(ClientChatReceivedEvent event) {
        String message = StringUtils.stripControlCodes(event.message.getUnformattedText());
        if (message.contains("PUZZLE FAIL!") || message.contains("chose the wrong answer! I shall never forget this moment")) {
            Minecraft.getMinecraft().thePlayer.sendChatMessage("/pc gg");
        }
    }
}

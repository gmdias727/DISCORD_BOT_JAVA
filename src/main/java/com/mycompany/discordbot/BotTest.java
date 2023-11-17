package com.mycompany.discordbot;

import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.EventListener;

public class botTest implements EventListener {

    @Override
    public void onEvent(GenericEvent event) {
        if (event instanceof MessageReceivedEvent) {
            System.out.println(((MessageReceivedEvent) event).getMessage().getContentDisplay());
        }
    }
}

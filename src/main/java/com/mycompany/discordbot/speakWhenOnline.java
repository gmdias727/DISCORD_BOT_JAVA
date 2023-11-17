package com.mycompany.discordbot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Invite;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class speakWhenOnline extends ListenerAdapter {
    @Override
    public void onReady(ReadyEvent event) {
        if (event.getState().toString().equals("READY")) {
            // channel id = 1171447323063226442
            String channelID = "";
            TextChannel textChannel = event.getJDA().getTextChannelById(channelID);

            if (textChannel != null) {
                textChannel.sendMessage("Hello, World!").queue();
                textChannel.sendMessage("I'm now online, ask me something...").queue();
            } else {
                System.out.println("Deu ruim");
            }

        }
    };
}

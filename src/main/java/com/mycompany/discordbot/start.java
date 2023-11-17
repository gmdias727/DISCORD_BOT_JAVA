package com.mycompany.discordbot;

import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import net.dv8tion.jda.api.requests.GatewayIntent;

public class start {

    public static void main(String[] args) throws LoginException, InterruptedException {

        JDA api = JDABuilder.createDefault(
                "MTE3MTQ0NjA2MTExNDYwMTYxNQ.GPGFbB.whGudcYie-An2DYFT8Ml4qPDO3GvgWKnPnsPCw",
                GatewayIntent.GUILD_MESSAGES,
                GatewayIntent.MESSAGE_CONTENT,
                GatewayIntent.GUILD_MEMBERS).build();

        api.getGatewayIntents();

        api.addEventListener(new myFirstListener());
        api.addEventListener(new speakWhenOnline());

    }

}

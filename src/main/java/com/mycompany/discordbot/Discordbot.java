/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.discordbot;

import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Discordbot {

    public static void main(String[] args) throws LoginException, InterruptedException {
        JDA api = JDABuilder.createDefault(
                "token",
                GatewayIntent.GUILD_MESSAGES,
                GatewayIntent.MESSAGE_CONTENT,
                GatewayIntent.GUILD_MEMBERS
        ).build();
        api.getGatewayIntents();
        api.addEventListener(new MyFirstListener());
    }

}

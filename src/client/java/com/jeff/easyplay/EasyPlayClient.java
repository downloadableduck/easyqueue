package com.jeff.easyplay;

import com.mojang.brigadier.arguments.StringArgumentType;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommands;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.minecraft.network.chat.Component;

public class EasyPlayClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> dispatcher.register(ClientCommands.literal("q")
                .then(ClientCommands.argument("mode", StringArgumentType.string())
                        .executes(context -> {
                            var client = context.getSource().getClient();
                            var player = client.player;
                            String argument = StringArgumentType.getString(context, "mode");

                            if (player != null) {

                                player.playSound(Sounds.DING);

                                /**this is a bunch of spaghetti code. im sorry if you are reading this.
                                the modes are in alphabetical order, followed by the sub-modes in their general order.
                                 if you are looking for a specific game, id suggest doing ctrl + f since i left comments
                                 on most of the commands with the mode it refers to.
                                 the command format is simply gamemode (e.g. bedwars) and then sub-gamemode (e.g. swappage)
                                 and then the amount of players (e.g. doubles)
                                 the amount of players is always in worded format (so not 2s, doubles)
                                **/


                                //arcade games
                                //blocking dead
                                switch (argument) {
                                    case "blocking_dead" -> {

                                        player.connection.sendCommand("play arcade_day_one");
                                        context.getSource().sendFeedback(Component.literal("§3§lThe Blocking Dead!"));
                                    }
                                    //bounty hunters
                                    case "bounty_hunters" -> {

                                        player.connection.sendCommand("play arcade_bounty_hunters");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing The Blocking Dead!"));
                                    }
                                    //creeper attack
                                    case "creeper_attack" -> {

                                        player.connection.sendCommand("play arcade_creeper_defense");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Creeper Attack!"));
                                    }
                                    //dragon wars
                                    case "dragon_wars" -> {

                                        player.connection.sendCommand("play arcade_dragon_wars");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Dragon Wars!"));
                                    }
                                    //disasters
                                    case "disasters" -> {

                                        player.connection.sendCommand("play arcade_disasters");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Disasters!"));
                                    }
                                    //dropper
                                    case "dropper" -> {

                                        player.connection.sendCommand("play arcade_dropper");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Dropper!"));
                                    }
                                    //easter simulator
                                    case "easter_simulator" -> {

                                        player.connection.sendCommand("play arcade_easter_simulator");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Easter Simulator! §r§cIf this fails, it's because Easter Simulator is a seasonal mode and may not be available right now."));
                                    }
                                    //ender spleef
                                    case "ender_spleef" -> {

                                        player.connection.sendCommand("play arcade_ender_spleef");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Ender Spleef!"));
                                    }
                                    //farm hunt
                                    case "farm_hunt" -> {

                                        player.connection.sendCommand("play arcade_farm_hunt");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Farm Hunt!"));
                                    }
                                    //football
                                    case "football" -> {

                                        player.connection.sendCommand("play arcade_soccer");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Football!"));
                                    }
                                    //galaxy wars
                                    case "galaxy_wars" -> {

                                        player.connection.sendCommand("play arcade_starwars");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Galaxy Wars!"));
                                    }
                                    //grinch simulator
                                    case "grinch_simulator" -> {

                                        player.connection.sendCommand("play arcade_grinch_simulator_v2");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Grinch Simulator! §r§cIf this fails, it's because Grinch Simulator is a seasonal mode and may not be available right now."));
                                    }
                                    //halloween simulator
                                    case "halloween_simulator" -> {

                                        player.connection.sendCommand("play arcade_halloween_simulator");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Halloween Simulator! §r§cIf this fails, it's because Halloween Simulator is a seasonal mode and may not be available right now."));
                                    }
                                    //hide and seek: party pooper
                                    case "hide_and_seek_party_pooper", "party_pooper" -> {

                                        player.connection.sendCommand("play arcade_hide_and_seek_party_pooper");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Hide And Seek: Party Pooper!"));
                                    }
                                    //hide and seek: prop hunt
                                    case "hide_and_seek_prop_hunt", "prop_hunt" -> {

                                        player.connection.sendCommand("play arcade_hide_and_seek_prop_hunt");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Hide And Seek: Prop Hunt!"));
                                    }
                                    //hole in the wall
                                    case "hole_in_the_wall" -> {

                                        player.connection.sendCommand("play arcade_hole_in_the_wall");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Hole In The Wall!"));
                                    }
                                    //hypixel says
                                    case "hypixel_says" -> {

                                        player.connection.sendCommand("play arcade_simon_says");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Hypixel Says!"));
                                    }
                                    //mini walls
                                    case "mini_walls" -> {

                                        player.connection.sendCommand("play arcade_mini_walls");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Mini Walls!"));
                                    }
                                    //party games
                                    case "party_games" -> {

                                        player.connection.sendCommand("play arcade_party_games_1");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Party Games!"));
                                    }
                                    //pixel painters
                                    case "pixel_painters" -> {

                                        player.connection.sendCommand("play arcade_pixel_painters");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Pixel Painters!"));
                                    }
                                    //pixel party
                                    case "pixel_party" -> {

                                        player.connection.sendCommand("play arcade_pixel_party");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Pixel Party!"));
                                    }
                                    //santa says
                                    case "santa_says" -> {

                                        player.connection.sendCommand("play arcade_santa_says");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Santa Says! §r§cIf this fails, it's because Santa Says is a seasonal mode and may not be available right now."));
                                    }
                                    //scuba simulator
                                    case "scuba_simulator" -> {

                                        player.connection.sendCommand("play arcade_scuba_simulator_v2");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Scuba Simulator! §4§cIf this fails, it's because Scuba Simulator is a seasonal mode and may not be available right now."));
                                    }
                                    //throw out
                                    case "throw_out", "throwout" -> {

                                        player.connection.sendCommand("play arcade_throw_out");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Throw Out!"));
                                    }
                                    //zombies
                                    //alien arcadium
                                    case "zombies_alien_arcadium", "alien_arcadium" -> {

                                        player.connection.sendCommand("play arcade_zombies_alien_arcadium");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Zombies: Alien Arcadium!"));
                                    }
                                    case "zombies_bad_blood", "bad_blood" -> {

                                        player.connection.sendCommand("play arcade_zombies_bad_blood");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Zombies: Bad Blood!"));
                                    }
                                    case "zombies_dead_end", "dead_end" -> {

                                        player.connection.sendCommand("play arcade_zombies_dead_end");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Zombies: Dead End!"));
                                    }
                                    case "zombies_prison", "prison" -> {

                                        player.connection.sendCommand("play arcade_zombies_prison");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Zombies: Prison!"));
                                    }
                                    //bedwars
                                    //solo
                                    case "bedwars_solo", "solo_bedwars", "bedwars" -> {

                                        player.connection.sendCommand("play bedwars_eight_one");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bedwars!"));
                                    }
                                    //bedwars doubles
                                    case "bedwars_doubles", "doubles_bedwars" -> {

                                        player.connection.sendCommand("play bedwars_eight_two");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bedwars: Doubles!"));
                                    }
                                    //bedwars threes
                                    case "bedwars_3s", "3s_bedwars", "bedwars_threes", "threes_bedwars" -> {

                                        player.connection.sendCommand("play bedwars_four_three");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bedwars: Threes!"));
                                    }
                                    //bedwars fours
                                    case "bedwars_4s", "4s_bedwars", "bedwars_fours", "fours_bedwars" -> {

                                        player.connection.sendCommand("play bedwars_four_four");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bedwars: Fours!"));
                                    }
                                    //rush doubles
                                    case "bedwars_2s_rush", "bedwars_rush_2s", "bedwars_rush_doubles",
                                         "bedwars_doubles_rush" -> {

                                        player.connection.sendCommand("play bedwars_eight_two_rush");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bedwars: Rush Doubles! §r§cIf this fails, it's because Bedwars Rush is a rotational mode and may not be available right now."));
                                    }
                                    //rush fours
                                    case "bedwars_4s_rush", "bedwars_rush_4s", "bedwars_rush_fours",
                                         "bedwars_fours_rush" -> {

                                        player.connection.sendCommand("play bedwars_four_four_rush");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bedwars: Rush Fours! §r§cIf this fails, it's because Bedwars Rush is a rotational mode and may not be available right now."));
                                    }
                                    //ultimate doubles
                                    case "bedwars_2s_ultimate", "bedwars_ultimate_2s", "bedwars_ultimate_doubles",
                                         "bedwars_doubles_ultimate" -> {

                                        player.connection.sendCommand("play bedwars_eight_two_ultimate");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bedwars: Ultimate Doubles!  §r§cIf this fails, it's because Ultimate Bedwars is a rotational mode and may not be available right now."));
                                    }
                                    //ultimate fours
                                    case "bedwars_4s_ultimate", "bedwars_ultimate_4s", "bedwars_ultimate_fours",
                                         "bedwars_fours_ultimate" -> {

                                        player.connection.sendCommand("play bedwars_four_four_ultimate");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bedwars: Ultimate Fours!  §r§cIf this fails, it's because Ultimate Bedwars is a rotational mode and may not be available right now."));
                                    }
                                    //bedwars castle
                                    case "bedwars_castle", "castle_bedwars", "castle" -> {

                                        player.connection.sendCommand("play bedwars_castle");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bedwars: Castle!  §r§cIf this fails, it's because Bedwars Castle is a rotational mode and may not be available right now."));
                                    }
                                    //bedwars 4v4
                                    case "bedwars_4v4" -> {
                                        player.connection.sendCommand("play bedwars_two_four");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bedwars: 4v4!"));
                                    }
                                    //voidless doubles
                                    case "bedwars_2s_voidless", "bedwars_voidless_2s", "bedwars_voidless_doubles",
                                         "bedwars_doubles_voidless" -> {

                                        player.connection.sendCommand("play bedwars_eight_two_voidless");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bedwars: Voidless Doubles! §r§cIf this fails, it's because Voidless Bedwars is a rotational mode and may not be available right now."));
                                    }
                                    //voidless fours
                                    case "bedwars_4s_voidless", "bedwars_voidless_4s", "bedwars_voidless_fours",
                                         "bedwars_fours_voidless" -> {

                                        player.connection.sendCommand("play bedwars_four_four_voidless");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bedwars: Voidless Fours! §r§cIf this fails, it's because Voidless Bedwars is a rotational mode and may not be available right now."));
                                    }
                                    //armed doubles
                                    case "bedwars_2s_armed", "bedwars_armed_2s", "bedwars_armed_doubles",
                                         "bedwars_doubles_armed" -> {

                                        player.connection.sendCommand("play bedwars_eight_two_armed");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bedwars: Armed Doubles!  §r§cIf this fails, it's because Armed Bedwars is a rotational mode and may not be available right now."));
                                    }
                                    //armed fours
                                    case "bedwars_4s_armed", "bedwars_armed_4s", "bedwars_armed_fours",
                                         "bedwars_fours_armed" -> {

                                        player.connection.sendCommand("play bedwars_four_four_armed");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bedwars: Armed Fours!  §r§cIf this fails, it's because Armed Bedwars is a rotational mode and may not be available right now."));
                                    }
                                    //lucky block doubles
                                    case "bedwars_2s_lucky_block", "bedwars_lucky_block_2s",
                                         "bedwars_lucky_block_doubles", "bedwars_doubles_lucky_block" -> {

                                        player.connection.sendCommand("play bedwars_eight_two_lucky");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bedwars: Lucky Block Doubles!  §r§cIf this fails, it's because Bedwars Lucky Blocks is a rotational mode and may not be available right now."));
                                    }
                                    //lucky block fours
                                    case "bedwars_4s_lucky_block", "bedwars_lucky_block_4s",
                                         "bedwars_lucky_block_fours", "bedwars_fours_lucky_block" -> {

                                        player.connection.sendCommand("play bedwars_four_four_lucky");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bedwars: Lucky Block Fours!  §r§cIf this fails, it's because Bedwars Lucky Blocks is a rotational mode and may not be available right now."));
                                    }
                                    //blitz sg
                                    //blitz solo
                                    case "blitz_solo", "solo_blitz" -> {

                                        player.connection.sendCommand("play blitz_solo_normal");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Blitz Survival Games!"));
                                    }
                                    //blitz teams
                                    case "blitz_teams", "teams_blitz", "blitz_doubles", "doubles_blitz" -> {

                                        player.connection.sendCommand("play blitz_teams_normal");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Blitz: Teams Mode!"));
                                    }
                                    //build battle
                                    //build battle solo
                                    case "build_battle_solo", "solo_build_battle", "build_battle" -> {

                                        player.connection.sendCommand("play build_battle_solo_normal");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Build Battle: Solo Mode!"));
                                    }
                                    //build battle teams
                                    case "build_battle_teams", "teams_build_battle", "build_battle_doubles",
                                         "doubles_build_battle" -> {

                                        player.connection.sendCommand("play build_battle_teams_normal");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Build Battle: Teams Mode!"));
                                    }
                                    //solo pro
                                    case "build_battle_pro", "pro_build_battle", "build_battle_pro_solo",
                                         "solo_pro_build_battle" -> {

                                        player.connection.sendCommand("play build_battle_solo_pro");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Build Battle: Pro Mode!"));
                                    }
                                    //doubles pro
                                    case "build_battle_doubles_pro", "build_battle_pro_doubles",
                                         "pro_doubles_build_battle", "doubles_pro_build_battle",
                                         "build_battle_teams_pro", "build_battle_pro_teams", "pro_teams_build_battle",
                                         "teams_pro_build_battle" -> {

                                        player.connection.sendCommand("play build_battle_teams_pro");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Build Battle: Pro Teams!"));
                                    }
                                    //speed builders
                                    case "speed_builders", "build_battle_speed_builders" -> {

                                        player.connection.sendCommand("play build_battle_speed_builders");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Build Battle: Speed Builders"));
                                    }
                                    //classic games
                                    //vampirez
                                    case "vampirez", "vampires" -> {

                                        player.connection.sendCommand("play vampirez");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Vampirez"));
                                    }
                                    //solo quakecraft
                                    case "solo_quake", "quake_solo", "quakecraft_solo", "solo_quakecraft", "quake",
                                         "quakecraft" -> {

                                        player.connection.sendCommand("play quake_solo");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Quakecraft!"));
                                    }
                                    //teams quakecraft
                                    case "teams_quake", "quake_teams", "quakecraft_teams", "teams_quakecraft" -> {

                                        player.connection.sendCommand("play quake_teams");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Quakecraft: Teams!"));
                                    }
                                    //paintball
                                    case "paintball", "painting_your_balls" -> {

                                        player.connection.sendCommand("play paintball");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Paintball!"));
                                    }
                                    //arena brawl
                                    //arena brawl solo
                                    case "arena_brawl_1v1", "arena_brawl_solo", "arena_1v1", "arena_solo",
                                         "arena_brawl", "arena" -> {

                                        player.connection.sendCommand("play arena_1v1");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Arena Brawl!"));
                                    }
                                    //arena brawl doubles
                                    case "arena_brawl_2v2", "arena_brawl_doubles", "arena_2v2", "arena_doubles" -> {

                                        player.connection.sendCommand("play arena_2v2");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Arena Brawl: Doubles!"));
                                    }
                                    //arena brawl fours
                                    case "arena_brawl_4v4", "arena_brawl_fours", "arena_4v4", "arena_fours" -> {

                                        player.connection.sendCommand("play arena_4v4");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Arena Brawl: Fours!"));
                                    }
                                    //the walls
                                    case "walls", "the_walls" -> {

                                        player.connection.sendCommand("play walls");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing The Walls!"));
                                    }
                                    //turbo kart racers/tkr
                                    case "turbo_kart_racers", "tkr" -> {

                                        player.connection.sendCommand("play tkr");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Turbo Kart Racers!"));
                                    }
                                    //cops and crims
                                    //defusal
                                    case "cvc_defusal", "cops_versus_crims_defusal", "cops_and_crims_defusal",
                                         "defusal" -> {

                                        player.connection.sendCommand("play mcgo_normal");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Cops Versus Crims: Defusal!"));
                                    }
                                    //team deathmatch
                                    case "cvc_tdm", "cvc_team_deathmatch", "cops_versus_crims_team_deathmatch",
                                         "cops_and_crims_team_deathmatch" -> {

                                        player.connection.sendCommand("play mcgo_deathmatch");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Cops Versus Crims: Team Deathmatch!"));
                                    }
                                    //gun game
                                    case "cvc_gun_game", "cops_versus_crims_gun_game", "cops_and_crims_gun_game",
                                         "gun_game" -> {

                                        player.connection.sendCommand("play mcgo_gungame");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Cops Versus Crims: Gun Game!"));
                                    }
                                    /**duels
                                     * oh boy this is going to be fun
                                     */
                                    //classic duels
                                    case "duels_classic", "classic_duels" -> {

                                        player.connection.sendCommand("play duels_classic_duel");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Classic Duels!"));
                                    }
                                    //classic doubles
                                    case "classic_doubles" -> {

                                        player.connection.sendCommand("play duels_classic_doubles");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Classic Doubles!"));
                                    }
                                    //skywars duels
                                    case "duels_sw", "skywars_duels", "sw_duels", "duels_skywars" -> {

                                        player.connection.sendCommand("play duels_sw_duel");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Skywars Duels!"));
                                    }
                                    //skywars doubles
                                    case "duels_sw_doubles", "skywars_duels_doubles", "duels_doubles_sw",
                                         "doubles_duels_skywars" -> {

                                        player.connection.sendCommand("play duels_sw_doubles");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Skywars Duels: Doubles!"));
                                    }
                                    //bedwars duels
                                    case "bedwars_duels", "bw_duels", "duels_bedwars", "duels_bw" -> {

                                        player.connection.sendCommand("play bedwars_two_one_duels");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bedwars Duels!"));
                                    }
                                    //bedwars rush
                                    case "bedwars_rush_duels", "bw_rush_duels", "bedwars_duels_rush",
                                         "bw_duels_rush" -> {

                                        player.connection.sendCommand("play bedwars_two_one_duels_rush");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bedwars Duels: Rush! §r§cIf you are trying to queue the dream mode bedwars rush, run /q bedwars_rush_doubles or /q bedwars_rush_fours."));
                                    }
                                    //bow duels
                                    case "bow_duels", "duels_bow" -> {

                                        player.connection.sendCommand("play duels_bow_duel");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bow Duels!"));
                                    }
                                    //uhc duels
                                    //solo
                                    case "uhc_duels_solo", "uhc_solo_duel", "uhc_duels" -> {

                                        player.connection.sendCommand("play duels_uhc_solo");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing UHC Duels!"));
                                    }
                                    //uhc doubles
                                    case "uhc_duels_doubles", "uhc_duel_doubles", "uhc_doubles_duel", "uhc_duels_2s",
                                         "uhc_duel_2s", "uhc_2s_duel" -> {

                                        player.connection.sendCommand("play duels_uhc_doubles");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing UHC Duels: Doubles!"));
                                    }
                                    //uhc fours
                                    case "uhc_duels_fours", "uhc_duel_fours", "uhc_fours_duel", "uhc_duels_4s",
                                         "uhc_duel_4s", "uhc_4s_duel" -> {

                                        player.connection.sendCommand("play duels_uhc_four");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing UHC Duels: Doubles!"));
                                    }
                                    //deathmatch
                                    case "uhc_deathmatch", "deathmatch", "uhc_duels_deathmatch" -> {

                                        player.connection.sendCommand("play duels_uhc_meetup");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing UHC Duels: Deathmatch!"));
                                    }
                                    //nodebuff
                                    case "nodebuff", "nodebuff_duels", "duels_nodebuff" -> {

                                        player.connection.sendCommand("play duels_potion_duel");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Nodebuff Duels!"));
                                    }
                                    //combo
                                    case "combo", "combo_duels", "duels_combo" -> {

                                        player.connection.sendCommand("play duels_combo_duel");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Combo Duels!"));
                                    }
                                    //op duels
                                    //op solo
                                    case "op_duels_solo", "duels_op_solo", "op_duels" -> {

                                        player.connection.sendCommand("play duels_op_duel");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing OP Duels!"));
                                    }
                                    //op doubles
                                    case "op_duels_doubles", "duels_op_doubles", "op_doubles" -> {

                                        player.connection.sendCommand("play duels_op_doubles");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing OP Doubles!"));
                                    }
                                    //mega walls duels
                                    case "mw_duels", "duels_mw", "mega_walls_duels", "duels_mega_walls" -> {

                                        player.connection.sendCommand("play duels_mw_duel");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Mega Walls Duels!"));
                                    }
                                    //sumo duels
                                    case "sumo_duels", "duels_sumo", "worst_gamemode_on_the_server", "solo" -> {

                                        player.connection.sendCommand("play duels_sumo_duel");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Sumo Duels!"));
                                    }
                                    //blitz duels
                                    case "blitz_duels", "duels_blitz" -> {

                                        player.connection.sendCommand("play duels_blitz_duel");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Blitz Duels!"));
                                    }
                                    //quake duels
                                    //quakecraft duels
                                    case "quake_duels", "duels_quake", "quakecraft_duels", "duels_quakecraft" -> {

                                        player.connection.sendCommand("play duels_quake_duel");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Quakecraft Duels!"));
                                    }
                                    //spleef duels
                                    case "spleef_duels", "duels_spleef", "spleef" -> {

                                        player.connection.sendCommand("play duels_spleef_duel");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Spleef Duels!"));
                                    }
                                    //bow spleef duels
                                    case "bowspleef_duels", "duels_bowspleef", "bow_spleef_duels",
                                         "duels_bow_spleef" -> {

                                        player.connection.sendCommand("play duels_bowspleef_duel");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bow Spleef Duels!"));
                                    }
                                    //bridge duels
                                    //solo bridge
                                    case "bridge_duels_solo", "duels_bridge_solo", "solo_bridge_duels", "bridge_duels",
                                         "duels_bridge", "bridge" -> {


                                        player.connection.sendCommand("play duels_bridge_duel");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing The Bridge!"));
                                    }
                                    //bridge doubles
                                    case "bridge_duels_doubles", "duels_bridge_doubles", "doubles_bridge_duels",
                                         "bridge_doubles", "doubles_bridge" -> {


                                        player.connection.sendCommand("play duels_bridge_doubles");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing The Bridge: Doubles!"));
                                    }
                                    //bridge threes
                                    //bridge trios
                                    case "bridge_duels_threes", "duels_bridge_threes", "threes_bridge_duels",
                                         "bridge_threes", "threes_bridge" -> {


                                        player.connection.sendCommand("play duels_bridge_threes");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing The Bridge: Threes!"));
                                    }
                                    //bridge fours
                                    case "bridge_duels_fours", "duels_bridge_fours", "fours_bridge_duels",
                                         "bridge_fours", "fours_bridge" -> {


                                        player.connection.sendCommand("play duels_bridge_four");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing The Bridge: Fours!"));
                                    }
                                    //boxing duels
                                    case "boxing_duels", "duels_boxing", "boxing" -> {


                                        player.connection.sendCommand("play duels_boxing_duel");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Boxing Duels!"));
                                    }
                                    //parkour duels
                                    case "parkour_duels", "duels_parkour", "parkour" -> {


                                        player.connection.sendCommand("play duels_parkour_eight");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Parkour Duels!"));
                                    }
                                    //arena
                                    case "arena_duels", "duels_arena", "duel_arena" -> {


                                        player.connection.sendCommand("play duels_duel_arena");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing the Duels Arena!"));
                                    }
                                    //mega walls
                                    case "mega_walls", "mw", "mega_walls_standard", "mw_standard" -> {


                                        player.connection.sendCommand("play mw_standard");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Mega Walls: Standard!"));
                                    }
                                    //mega walls face off
                                    case "mega_walls_faceoff", "mw_faceoff", "mega_walls_face_off", "mw_face_off" -> {


                                        player.connection.sendCommand("play mw_face_off");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Mega Walls: Face Off!"));
                                    }
                                    //murder mystery
                                    //classic
                                    case "mm", "murder_mystery", "mm_classic", "murder_mystery_classic" -> {

                                        player.connection.sendCommand("play murder_classic");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Murder Mystery: Classic!"));
                                    }
                                    //double up
                                    case "double_up", "murder_mystery_double_up", "mm_double_up" -> {

                                        player.connection.sendCommand("play murder_double_up");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Murder Mystery: Double Up!"));
                                    }
                                    //assassins
                                    case "mm_assassins", "murder_mystery_assassins", "assassins" -> {

                                        player.connection.sendCommand("play murder_assassins");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Murder Mystery: Assassins!"));
                                    }
                                    //infection
                                    case "mm_infection", "murder_mystery_infection", "infection" -> {

                                        player.connection.sendCommand("play murder_infection");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Murder Mystery: Infection!"));
                                    }
                                    //skywars
                                    //solo
                                    case "skywars_solo", "solo_skywars", "normal_skywars", "skywars", "sw_solo",
                                         "solo_sw", "normal_sw", "sw", "sweet_potatoes" -> {

                                        player.connection.sendCommand("play solo_normal");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Skywars!"));
                                    }
                                    //solo insane
                                    case "skywars_solo_insane", "solo_insane_skywars", "insane_skywars",
                                         "skywars_insane", "sw_solo_insane", "solo_insane_sw", "insane_sw",
                                         "sw_insane" -> {

                                        player.connection.sendCommand("play solo_insane");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Skywars: Insane Mode!"));
                                    }
                                    //teams
                                    case "skywars_teams", "teams_skywars", "sw_teams", "teams_sw", "skywars_doubles",
                                         "doubles_skywars", "sw_doubles", "doubles_sw" -> {

                                        player.connection.sendCommand("play teams_normal");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Skywars: Teams!"));
                                    }
                                    //teams insane
                                    case "skywars_teams_insane", "teams_insane_skywars", "insane_skywars_teams",
                                         "skywars_insane_teams", "sw_teams_insane", "teams_insane_sw",
                                         "insane_sw_teams", "sw_insane_teams", "skywars_doubles_insane",
                                         "doubles_insane_skywars", "insane_skywars_doubles", "skywars_insane_doubles",
                                         "sw_doubles_insane", "doubles_insane_sw", "insane_sw_doubles",
                                         "sw_insane_doubles" -> {

                                        player.connection.sendCommand("play teams_insane");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Skywars: Insane Mode!"));
                                    }
                                    //mega
                                    case "skywars_mega", "mega_skywars", "beans" -> {

                                        player.connection.sendCommand("play mega_normal");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Skywars: Mega!"));
                                    }
                                    //tnt madness
                                    case "skywars_tnt_madness", "tnt_madness_skywars", "tnt_madness" -> {

                                        player.connection.sendCommand("play solo_insane_tnt_madness");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Skywars: TNT Madness! §r§cThis mode requires a subscription to MVP++ and private games turned on. If this fails, that's why!"));
                                    }
                                    //rush
                                    case "skywars_rush", "rush_skywars" -> {

                                        player.connection.sendCommand("play solo_insane_rush");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Skywars: Rush! §r§cThis mode requires a subscription to MVP++ and private games turned on. If this fails, that's why!"));
                                    }
                                    //slime
                                    case "skywars_slime", "slime_skywars", "slime" -> {

                                        player.connection.sendCommand("play solo_insane_slime");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Skywars: Slime! §r§cThis mode requires a subscription to MVP++ and private games turned on. If this fails, that's why!"));
                                    }
                                    //lucky blocks
                                    case "skywars_lucky_blocks", "lucky_blocks_skywars" -> {

                                        player.connection.sendCommand("play solo_insane_lucky");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Skywars: Lucky Blocks!"));
                                    }
                                    case "skywars_teams_lucky_blocks", "lucky_blocks_skywars_teams",
                                         "skywars_doubles_lucky_blocks", "lucky_blocks_skywars_doubles" -> {

                                        player.connection.sendCommand("play teams_insane_lucky");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Skywars: Lucky Doubles!"));
                                    }
                                    //smash heroes
                                    //solo
                                    case "smash_heroes", "smash_heroes_solo", "smash_solo", "solo_smash" -> {

                                        player.connection.sendCommand("play super_smash_solo_normal");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Smash Heroes!"));
                                    }
                                    //doubles
                                    case "smash_heroes_doubles", "doubles_smash_heroes", "smash_doubles",
                                         "doubles_smash" -> {

                                        player.connection.sendCommand("play super_smash_doubles_normal");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Smash Heroes: Doubles!"));
                                    }
                                    //1v1
                                    case "smash_heroes_1v1", "1v1_smash_heroes", "smash_1v1", "1v1_smash" -> {

                                        player.connection.sendCommand("play super_smash_1v1_normal");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Smash Heroes: 1v1!"));
                                    }
                                    //2v2
                                    case "smash_heroes_2v2", "2v2_smash_heroes", "smash_2v2", "2v2_smash" -> {

                                        player.connection.sendCommand("play super_smash_2v2_normal");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Smash Heroes: 2v2!"));
                                    }
                                    //pit
                                    case "pit" -> {

                                        player.connection.sendCommand("play pit");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing The Hypixel Pit!"));
                                    }
                                    //tnt games
                                    //tnt run
                                    case "tntrun", "tnt_run" -> {

                                        player.connection.sendCommand("play tnt_tntrun");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing §cT§fN§cT Run!"));
                                    }
                                    //pvp run
                                    //why are you playing this?
                                    case "pvprun", "pvp_run" -> {

                                        player.connection.sendCommand("play tnt_pvprun");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing PvP Run!"));
                                    }
                                    //bow spleef
                                    case "bowspleef", "bow_spleef" -> {

                                        player.connection.sendCommand("play tnt_bowspleef");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Bow Spleef!"));
                                    }
                                    //tnt tag
                                    case "tnttag", "tnt_tag" -> {

                                        player.connection.sendCommand("play tnt_tnttag");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing §cT§fN§cT Tag!"));
                                    }
                                    //tnt wizards
                                    case "tntwizards", "tnt_wizards", "wizards" -> {

                                        player.connection.sendCommand("play tnt_capture");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing §cT§fN§cT Wizards!"));
                                    }
                                    //uhc
                                    //solo
                                    case "uhc", "uhc_solo", "solo_uhc" -> {

                                        player.connection.sendCommand("play uhc_solo");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing UHC!"));
                                    }
                                    //teams
                                    case "uhc_teams", "teams_uhc", "uhc_doubles", "doubles_uhc" -> {

                                        player.connection.sendCommand("play uhc_teams");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing UHC Doubles!"));
                                    }
                                    //speed uhc
                                    case "speed_uhc", "speed_uhc_solo", "solo_speed_uhc" -> {

                                        player.connection.sendCommand("play speed_solo_normal");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Speed UHC!"));
                                    }
                                    //teams
                                    case "speed_uhc_teams", "speed_teams_uhc", "speed_uhc_doubles",
                                         "doubles_speed_uhc" -> {

                                        player.connection.sendCommand("play speed_team_normal");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Speed UHC Doubles!"));
                                    }
                                    //warlords
                                    //capture the flag
                                    case "warlords_ctf", "capture_the_flag", "ctf", "capture_the_flag_warlords",
                                         "potato" -> {

                                        player.connection.sendCommand("play warlords_ctf_mini");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Warlords: Capture the Flag!"));
                                    }
                                    //domination
                                    case "warlords_domination", "domination", "domination_warlords" -> {

                                        player.connection.sendCommand("play warlords_domination");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Warlords: Domination!"));
                                    }
                                    //team deathmatch
                                    case "warlords_tdm", "team_deathmatch_warlords", "tdm_warlords",
                                         "warlords_team_deathmatch" -> {

                                        player.connection.sendCommand("play warlords_team_deathmatch");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Warlords: Team Deathmatch!"));
                                    }
                                    //wool games
                                    //sheep wars
                                    case "sheep_wars", "shep_war" -> {
                                        player.connection.sendCommand("play wool_sheep_wars_two_six");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Sheep Wars!"));
                                    }
                                    //wool_wars
                                    case "wool_wars", "ww" -> {
                                        player.connection.sendCommand("play wool_wool_wars_two_four");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Wool Wars!"));
                                    }
                                    //capture the wool
                                    case "capture_the_wool", "ctw" -> {
                                        player.connection.sendCommand("play wool_capture_the_wool_two_twenty");
                                        context.getSource().sendFeedback(Component.literal("§3§lQueueing Capture the Wool!"));
                                    }
                                    case null, default ->
                                            context.getSource().sendFeedback(Component.literal("§cNo command was found with argument " + argument + ". Type /qhelp for a list of arguments."));
                                }
                            }
                            return 1;
                        })
                )
        ));
    }
}
package com.jeff.easyplay;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.minecraft.network.chat.Component;

public class qhelp implements ClientModInitializer {
    String qHelpMessage = """
            §b§lEasyQueue Help §7- §fAvailable Arguments:
            §3§lArcade: §bblocking_dead, bounty_hunters, creeper_attack, dragon_wars, disasters, dropper, easter_simulator, ender_spleef, farm_hunt, football, galaxy_wars, grinch_simulator, halloween_simulator, party_pooper, prop_hunt, hole_in_the_wall, hypixel_says, mini_walls, party_games, pixel_painters, pixel_party, santa_says, scuba_simulator, throw_out
            §3§lZombies: §balien_arcadium, bad_blood, dead_end, prison
            §3§lBedwars: §bbedwars_solo, bedwars_doubles, bedwars_threes, bedwars_fours, 4v4, [mode]_rush, [mode]_ultimate, castle, [mode]_voidless, [mode]_armed, [mode]_lucky_block
            §3§lDuels: §bclassic, sw_duels, bw_duels, bow_duels, uhc_duels, nodebuff, combo, op_duels, mw_duels, sumo, blitz_duels, quake_duels, spleef_duels, bridge, boxing, parkour, arena_duels
            §3§lMurder Mystery: §bmm, double_up, assassins, infection
            §3§lSkywars: §bsolo, solo_insane, doubles, doubles_insane, mega, lucky_blocks, tnt_madness, rush, slime
            §3§lOther: §bblitz, build_battle, speed_builders, vampirez, quake, paintball, walls, tkr, arena_brawl, cvc_defusal, cvc_tdm, gun_game, mega_walls, smash_heroes, pit, tntrun, tnttag, wizards, uhc, speed_uhc, warlords, sheep_wars, wool_wars, ctw
            §7§oUse underscores for spaces. Example: /q bedwars_doubles""";
    public void onInitializeClient() {
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {
            dispatcher.register(ClientCommandManager.literal("qhelp")
                    .executes(context -> {
                        context.getSource().sendFeedback(Component.literal(qHelpMessage));
                        return 0;
                    }));
        });
    }
}

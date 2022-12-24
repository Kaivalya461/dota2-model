package com.kv.player.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerDto {
    private long account_id;
    private int player_slot;
    private int hero_id;
    private int item_0;
    private int item_1;
    private int item_2;
    private int item_3;
    private int item_4;
    private int item_5;
    private int backpack_0;
    private int backpack_1;
    private int backpack_2;
    private int item_neutral;
    private int kills;
    private int deaths;
    private int assists;
    private int leaver_status;
    private int last_hits;
    private int denies;
    private int gold_per_min;
    private int xp_per_min;
    private int level;
    private int net_worth;
    private int aghanims_scepter;
    private int aghanims_shard;
    private int moonshard;
    private int hero_damage;
    private int tower_damage;
    private int hero_healing;
    private int gold;
    private int gold_spent;
    private int scaled_hero_damage;
    private int scaled_tower_damage;
    private int scaled_hero_healing;
//    private ArrayList<AbilityUpgrade> ability_upgrades;
//public class AbilityUpgrade{
//    public int ability;
//    public int time;
//    public int level;
//}
}

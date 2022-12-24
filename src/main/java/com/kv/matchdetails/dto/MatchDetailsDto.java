package com.kv.matchdetails.dto;

import com.kv.player.dto.PlayerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchDetailsDto {
    private long match_sequence_num;

    public boolean radiant_win;
    public int duration;
    public int pre_game_duration;
    public int start_time;
    public long match_id;
    public long match_seq_num;
    public int tower_status_radiant;
    public int tower_status_dire;
    public int barracks_status_radiant;
    public int barracks_status_dire;
    public int cluster;
    public int first_blood_time;
    public int lobby_type;
    public int human_players;
    public int leagueid;
    public int positive_votes;
    public int negative_votes;
    public int game_mode;
    public int flags;
    public int engine;
    public int radiant_score;
    public int dire_score;
//    public ArrayList<PicksBan> picks_bans;
//public class PicksBan{
//    public boolean is_pick;
//    public int hero_id;
//    public int team;
//    public int order;
//}

    private List<PlayerDto> players;
}

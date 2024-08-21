package com.kv.matchdetails.dto;

import com.kv.player.dto.PlayerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <p>This Class is used to hold "Matches" data coming from GetMatchHistory Steam Web API </p>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchesDto {
    private long match_id;
    private long match_seq_num;

    private List<PlayerDto> players;
    private boolean radiant_win;
    private int duration;
    private int pre_game_duration;
    private long start_time;
    private long tower_status_radiant;
    private long tower_status_dire;
    private long barracks_status_radiant;
    private long barracks_status_dire;
    private int cluster;
    private int first_blood_time;
    private int lobby_type;
    private int human_players;
    private int leagueid;
    private int game_mode;
    private int flags;
    private int engine;
    private int radiant_score;
    private int dire_score;
    private List<PicksBansDto> picks_bans;
}

package com.kv.winrate.dto;

import com.kv.hero.dto.HeroesDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class HeroWinRate {
    private String currentSteamName;
    private double winRate;
    private int totalMatchesPlayed;
    private String gameMode;//Turbo, AllPick...
    private String dota2AccountId;
    private String steamId;
    private long steamWebApiCallCount;
    private String errorMessage;
    private String heroName;

    private HeroesDto heroesDto;
}

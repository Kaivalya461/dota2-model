package com.kv.matchdetails.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>This Class is used to hold "Matches" data coming from GetMatchHistory Steam Web API </p>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PicksBansDto {
    private boolean is_pick;
    private int hero_id;
    private int team;
    private int order;
}

package com.kv.matchdetails.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <p>This Class is used to hold data coming from GetMatchHistory Steam Web API </p>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchHistoryDto {
    private int status;//1 - success status
    private String statusDetail;
    private int num_results;
    private int total_results;
    private int results_remaining;
    private List<MatchesDto> matches;
}

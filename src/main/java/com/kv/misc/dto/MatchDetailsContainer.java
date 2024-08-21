package com.kv.misc.dto;

import com.kv.matchdetails.dto.MatchDetailsDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>This Class is used to hold response data coming from GetMatchDetails Steam Web API </p>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchDetailsContainer {
    private int status;//1 - success status
    private MatchDetailsDto result;
}

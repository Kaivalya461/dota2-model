package com.kv.constants;

public interface Dota2SteamWebApiUrls {

    String STEAM_WEB_API_BASE_URL = "https://api.steampowered.com/IDOTA2Match_570";
    String MATCH_DETAILS_URL = STEAM_WEB_API_BASE_URL + "/GetMatchDetails/v1";
    String MATCH_HISTORY_URL = STEAM_WEB_API_BASE_URL + "/GetMatchHistory/v1";
    String MATCH_HISTORY_BY_SEQUENCE_NUM_URL = STEAM_WEB_API_BASE_URL + "/GetMatchHistoryBySequenceNum/v1";

}

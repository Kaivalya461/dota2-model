package com.kv.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SteamWebApiKeys {
    public static String PRIMARY_STEAM_ACCOUNT_WEB_API_KEY;

    private SteamWebApiKeys(
            @Value("${kv.steam.api.key}") String primaryKey) {
        PRIMARY_STEAM_ACCOUNT_WEB_API_KEY = primaryKey;
    }
}

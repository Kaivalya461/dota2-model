package com.kv.misc.dto;

import lombok.Data;

@Data
public class SteamWebApiResponseContainer<T> {
    private T result;
}

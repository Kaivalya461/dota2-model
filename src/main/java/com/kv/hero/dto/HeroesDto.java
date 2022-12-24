package com.kv.hero.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HeroesDto {
    private String name;
    private int id;
    private String localized_name;

    //Dota2 DataFeed service is providing data in name_loc
    private String name_loc;
    private int complexity;
    private int primary_attr;
    private String name_english_loc;

    public HeroesDto(String name, int id, String localized_name, String name_loc, int complexity, int primary_attr) {
        this.name = name;
        this.id = id;
        this.localized_name = localized_name;
        this.name_loc = name_loc;
        this.complexity = complexity;
        this.primary_attr = primary_attr;

        if(localized_name.isEmpty()) {
            this.localized_name = name_loc;
        }
        if(name_loc.isEmpty()) {
            this.name_loc = localized_name;
        }
    }
}

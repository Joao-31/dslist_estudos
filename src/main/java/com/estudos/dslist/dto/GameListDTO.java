package com.estudos.dslist.dto;

import com.estudos.dslist.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {
            };
    public GameListDTO(GameList entity){
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

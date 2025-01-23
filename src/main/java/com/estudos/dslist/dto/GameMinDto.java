package com.estudos.dslist.dto;


import com.estudos.dslist.entities.Game;
import com.estudos.dslist.projection.GameMinProjection;

public class GameMinDto {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDto() {
    }

    public GameMinDto(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        shortDescription = entity.getShortDescription();
        imgUrl = entity.getImgUrl();

    }

    public GameMinDto(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        shortDescription = projection.getShortDescription();
        imgUrl = projection.getImgUrl();

    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}


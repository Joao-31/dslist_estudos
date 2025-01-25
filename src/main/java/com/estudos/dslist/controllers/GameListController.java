package com.estudos.dslist.controllers;

import com.estudos.dslist.dto.GameDTO;
import com.estudos.dslist.dto.GameListDTO;
import com.estudos.dslist.dto.GameMinDto;
import com.estudos.dslist.dto.ReplacementDTO;
import com.estudos.dslist.servicies.GameListService;
import com.estudos.dslist.servicies.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDto> findByList(@PathVariable Long listId) {
        var result = gameService.findByList(listId);
        return result;
    }
    @PostMapping(value = "/{listId}/replacement")
    public void move (@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId,body.getSourceIndex(), body.getDestinationIndex());

    }

}

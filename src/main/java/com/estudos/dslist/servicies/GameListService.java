package com.estudos.dslist.servicies;


import com.estudos.dslist.dto.GameListDTO;
import com.estudos.dslist.dto.GameMinDto;
import com.estudos.dslist.entities.Game;
import com.estudos.dslist.entities.GameList;
import com.estudos.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x->new GameListDTO(x)).toList();

        return dto;
    }
}

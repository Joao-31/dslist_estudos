package com.estudos.dslist.servicies;

import com.estudos.dslist.dto.GameDTO;
import com.estudos.dslist.dto.GameMinDto;
import com.estudos.dslist.entities.Game;
import com.estudos.dslist.entities.GameList;
import com.estudos.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDto> dto = result.stream().map(x->new GameMinDto(x)).toList();

        return dto;
    }
}

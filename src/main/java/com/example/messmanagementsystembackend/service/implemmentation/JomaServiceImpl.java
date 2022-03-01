package com.example.messmanagementsystembackend.service.implemmentation;

import com.example.messmanagementsystembackend.dto.JomaDto;
import com.example.messmanagementsystembackend.model.Joma;
import com.example.messmanagementsystembackend.model.repository.IJomaRepository;
import com.example.messmanagementsystembackend.model.repository.IPersonRepository;
import com.example.messmanagementsystembackend.service.IJomaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JomaServiceImpl implements IJomaService {

    private final IJomaRepository iJomaRepository;
    private final IPersonRepository iPersonRepository;

    @Override
    public JomaDto saveJoma(JomaDto jomaDto) {
        Joma joma = new Joma();
        BeanUtils.copyProperties(jomaDto, joma, "person");
        joma.setPerson(iPersonRepository.getById(jomaDto.getPerson()));
        iJomaRepository.save(joma);
        return jomaDto;
    }

    @Override
    public JomaDto updateJoma(JomaDto jomaDto, Long id) {
        Joma joma = iJomaRepository.getById(id);
        BeanUtils.copyProperties(jomaDto, joma, "id", "person");
        joma.setPerson(iPersonRepository.getById(jomaDto.getPerson()));
        iJomaRepository.save(joma);
        return jomaDto;
    }

    @Override
    public JomaDto getJoma(Long id) {
        JomaDto jomaDto = new JomaDto();
        Joma joma = iJomaRepository.getById(id);
        BeanUtils.copyProperties(joma, jomaDto);
        return jomaDto;
    }

    @Override
    public List<Joma> getJomaList() {
        List<Joma> joma = iJomaRepository.findAll();
        return joma;
    }

    @Override
    public String deleteJoma(Long id) {
        iJomaRepository.deleteById(id);
        return "Delete Success";
    }
}

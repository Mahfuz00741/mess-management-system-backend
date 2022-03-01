package com.example.messmanagementsystembackend.service.implemmentation;

import com.example.messmanagementsystembackend.dto.BazarDto;
import com.example.messmanagementsystembackend.model.Bazar;
import com.example.messmanagementsystembackend.model.repository.IBazarRepository;
import com.example.messmanagementsystembackend.model.repository.IPersonRepository;
import com.example.messmanagementsystembackend.service.IBazarService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BazarServiceImpl implements IBazarService {

    private final IBazarRepository iBazarRepository;
    private final IPersonRepository iPersonRepository;

    @Override
    public BazarDto saveBazar(BazarDto bazarDto) {
        Bazar bazar = new Bazar();
        BeanUtils.copyProperties(bazarDto, bazar, "person");
        bazar.setPerson(iPersonRepository.getById(bazarDto.getPerson()));
        iBazarRepository.save(bazar);
        return bazarDto;
    }

    @Override
    public BazarDto updateBazar(BazarDto bazarDto, Long id) {
        Bazar bazar = iBazarRepository.getById(id);
        BeanUtils.copyProperties(bazarDto, bazar, "id", "person");
        bazar.setPerson(iPersonRepository.getById(bazarDto.getPerson()));
        iBazarRepository.save(bazar);
        return bazarDto;
    }

    @Override
    public BazarDto getBazar(Long id) {
        BazarDto bazarDto = new BazarDto();
        Bazar bazar = iBazarRepository.getById(id);
        BeanUtils.copyProperties(bazar, bazarDto);
        return bazarDto;
    }

    @Override
    public List<Bazar> getBazarList() {
        List<Bazar> bazar = iBazarRepository.findAll();
        return bazar;
    }

    @Override
    public String deleteBazar(Long id) {
        iBazarRepository.deleteById(id);
        return "Delete Success";
    }
}

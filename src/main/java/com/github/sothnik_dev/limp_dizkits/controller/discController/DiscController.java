package com.github.sothnik_dev.limp_dizkits.controller.discController;

import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.DiscDto;
import com.github.sothnik_dev.limp_dizkits.repository.discRepository.DiscRepository;
import com.github.sothnik_dev.limp_dizkits.service.discService.DiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/disc")
public class DiscController {

    private final DiscService discService;

    public DiscController(DiscService discService) {
        this.discService = discService;
    }

    @GetMapping("/disc/all")
    public List<DiscDto> getAll() {
        return discService.findAllDisc();
    }
}

package com.github.sothnik_dev.limp_dizkits.controller.discController;

import com.github.sothnik_dev.limp_dizkits.mapper.discMapper.DiscMapper;
import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.CreateDiscRequest;
import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.DiscDto;
import com.github.sothnik_dev.limp_dizkits.model.entity.discEntity.DiscModel;
import com.github.sothnik_dev.limp_dizkits.service.discService.DiscService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/disc")
public class DiscController {

    private final DiscService discService;
    private final DiscMapper discMapper;

    public DiscController(DiscService discService, DiscMapper discMapper) {
        this.discService = discService;
        this.discMapper = discMapper;
    }

    @GetMapping("/hello")
    public String hello(){
        return "Olá, dev";
    }

    @GetMapping("/{id}")
    public ResponseEntity<DiscDto> getDisc(@PathVariable UUID id) {
        return ResponseEntity.ok(discService.findDiscById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<DiscDto> postDisc(@RequestBody DiscModel disc){
        DiscDto dto = discMapper.toDto(disc);
        return ResponseEntity.ok(dto);
    }

    @DeleteMapping("disc/delete")
    public void deleteDisc(UUID id){
        discService.deleteDisc(id);
    }
}

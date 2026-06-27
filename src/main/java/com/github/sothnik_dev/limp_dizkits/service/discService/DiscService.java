package com.github.sothnik_dev.limp_dizkits.service.discService;

import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.DiscDto;
import com.github.sothnik_dev.limp_dizkits.model.entity.discEntity.DiscModel;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DiscService {
    DiscModel findDisc();
}

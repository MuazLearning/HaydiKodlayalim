package com.haydikodlayalim.service.impl;

import com.haydikodlayalim.dto.KisiDto;
import com.haydikodlayalim.entity.Adres;
import com.haydikodlayalim.repo.AdresRepository;
import com.haydikodlayalim.service.KisiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class KisiServiceImplIntegrationTest {

    @Autowired
    private KisiService kisiService;

    @Autowired
    private AdresRepository adresRepository;

    @Test
    public void testSave() {
        KisiDto kisiDto = new KisiDto();
        kisiDto.setAdi("Test-Name");
        kisiDto.setSoyadi("Test-LastName");
        kisiDto.setAdresler(List.of("Test-Address-1"));

        KisiDto result = kisiService.save(kisiDto);
        List<Adres> liste = adresRepository.findAll();

        assertTrue(result.getId() > 0L);
        assertEquals(liste.size(), 1);

    }
}

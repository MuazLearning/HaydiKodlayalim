package com.haydikodlayalim.service.impl;

import com.haydikodlayalim.dto.KisiDto;
import com.haydikodlayalim.entity.Adres;
import com.haydikodlayalim.entity.Kisi;
import com.haydikodlayalim.repo.AdresRepository;
import com.haydikodlayalim.repo.KisiRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class KisiServiceImplTest {

    @InjectMocks
    private KisiServiceImpl kisiService;

    @Mock
    private KisiRepository kisiRepository;

    @Mock
    private AdresRepository adresRepository;

    @Test
    public void testSave() {
        KisiDto kisiDto = new KisiDto();
        kisiDto.setAdi("Test-Name");
        kisiDto.setSoyadi("Test-LastName");
        kisiDto.setAdresler(List.of("Test-Address-1"));

        Kisi kisiMock = mock(Kisi.class);
        when(kisiMock.getId()).thenReturn(1L);
        when(kisiRepository.save(any(Kisi.class))).thenReturn(kisiMock);
        KisiDto result = kisiService.save(kisiDto);

        assertEquals(result.getAdi(), kisiDto.getAdi());
        assertEquals(result.getId(), 1L);

    }

    @Test
    public void testSaveException() {
        KisiDto kisiDto = new KisiDto();
//        kisiDto.setAdi("Test-Name");
        kisiDto.setSoyadi("Test-LastName");
        kisiDto.setAdresler(List.of("Test-Address-1"));

        Assertions.assertThrows(IllegalArgumentException.class, () -> kisiService.save(kisiDto));

    }

    @Test
    public void testGetAll() {
        Kisi kisi = new Kisi();
        kisi.setId(1L);
        kisi.setAdi("Test-Name");
        kisi.setSoyadi("Test-LastName");

        when(kisiRepository.findAll()).thenReturn(List.of(kisi));
        List<KisiDto> result = kisiService.getAll();

        assertEquals(result.size(), 1);
        assertEquals(result.get(0), KisiDto.builder().id(1L).build());
    }

    @Test
    public void testGetAllWithAddress() {
        Kisi kisi = new Kisi();
        kisi.setId(1L);
        kisi.setAdi("Test-Name");
        kisi.setSoyadi("Test-LastName");

        Adres adres = new Adres();
        adres.setAdresTip(Adres.AdresTip.DIGER);
        adres.setAdres("Test-Address-1");

        kisi.setAdresleri(Collections.singletonList(adres));

        when(kisiRepository.findAll()).thenReturn(List.of(kisi));
        List<KisiDto> result = kisiService.getAll();

        assertEquals(result.get(0).getAdresler().size(), 1);

    }
}
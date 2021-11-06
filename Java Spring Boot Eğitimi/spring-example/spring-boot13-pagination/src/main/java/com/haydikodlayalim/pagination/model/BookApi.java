package com.haydikodlayalim.pagination.model;

import com.haydikodlayalim.pagination.repo.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookApi {

    private final BookRepository bookRepository;

    @GetMapping
    public Page<Book> pagination(@RequestParam Integer pageSize, @RequestParam Integer page) {
        Pageable pageable = PageRequest.of(page, pageSize);
        return bookRepository.findAll(pageable);
    }

    @GetMapping("/p")
    public Page<Book> pagination(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @GetMapping("/s")
    /** Daha performanslı çalışır.
     * İstenilen pageable bilgilerine göre sayfalama yapıyor. Bütün veriyi gezmez.
     * Örnek; 3 sayfa istenirse 4 sayfa gezip veriyi döndürüyor. Twitter aşağı kaydırdıkça veri getiriyor.
     */
    public Slice<Book> slice(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }
}

package com.haydikodlayalim.dpatterns.d3_builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class ProductLombok {

    private Long id;
    private String name;
    private LocalDateTime date;
    private Boolean inStock;
    private String description;
    private BigDecimal price;

}

package com.laliel.ecommerce_backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    private String color;

    private String size;

    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    private LocalDateTime createdAt=LocalDateTime.now();



}

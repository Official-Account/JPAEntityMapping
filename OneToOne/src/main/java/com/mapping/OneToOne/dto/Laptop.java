package com.mapping.OneToOne.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
@Table(name = "jpa_laptop")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "laptop_id")
    private Long laptopId;

    @Column(name = "laptop_model" , length = 30)
    private String laptopModel;

    @Column(name = "laptop_brand" , length = 50)
    private String laptopBrand;

    @Column(name = "laptop_price" )
    private Double laptopPrice;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")// this will rename FK column
    private Student student;
}

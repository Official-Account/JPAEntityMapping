package com.mapping.OneToMany.dto;

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
@Table(name = "jpa_address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    private  Long addId;

    @Column(name = "add_city")
    private  String addCity;

    @Column(name = "add_pincode")
    private  int addPinCode;

    @Column(name = "add_state")
    private  String addState;

    @Column(name = "add_country")
    private  String addCountry;

}

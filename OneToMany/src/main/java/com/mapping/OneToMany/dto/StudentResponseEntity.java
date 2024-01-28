package com.mapping.OneToMany.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class StudentResponseEntity {

    public StudentResponseEntity(String studentName, String addCity) {
        this.studentName = studentName;
        this.addCity = addCity;
    }

    private  String studentName;
    private  String addCity;

    private  int addPinCode;

}

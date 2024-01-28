package com.mapping.ManyToOne.service;

import com.mapping.ManyToOne.dto.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository  extends JpaRepository<School,Long> {


}

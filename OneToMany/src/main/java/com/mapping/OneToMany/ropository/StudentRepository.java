package com.mapping.OneToMany.ropository;

import com.mapping.OneToMany.dto.Student;
import com.mapping.OneToMany.dto.StudentResponseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Qualifier("StudentRepository")
//@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student,Long> {

//   @Query(value = "SELECT new com.mapping.OneToMany.dto.StudentResponseEntity(s.studentName,a.addPinCode)" +
//           " from Student s join s.Address a ")
//   public List<StudentResponseEntity> getJoinOperation();

}

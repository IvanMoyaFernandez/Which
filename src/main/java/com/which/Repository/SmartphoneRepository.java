package com.which.Repository;

import com.which.Entity.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SmartphoneRepository extends JpaRepository<Smartphone, Long> {

}

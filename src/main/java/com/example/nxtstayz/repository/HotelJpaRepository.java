package com.example.nxtstayz.repository;

import com.example.nxtstayz.model.*;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface HotelJpaRepository extends JpaRepository<Hotel, Integer> {

}
/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */

// Write your code here
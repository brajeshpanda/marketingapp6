package com.marketingapp6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingapp6.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead,Long> {

}

package com.ticketflash.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticketflash.Model.ModelCompany;

@Repository
public interface RepoCompany extends JpaRepository<ModelCompany, Long> {
	
	ModelCompany findByEmail(String email);

}

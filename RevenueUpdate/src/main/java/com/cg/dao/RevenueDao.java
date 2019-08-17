package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.Capstore;

@Repository
public interface RevenueDao extends JpaRepository<Capstore,Integer>{
	
	@Transactional
	@Modifying
	@Query("update Capstore r set r.balance=r.balance+?1")
	public void updateRevenue(Double price);
	
	
}

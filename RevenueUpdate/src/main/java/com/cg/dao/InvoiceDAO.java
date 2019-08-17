package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.bean.Invoice;
@Repository
public interface InvoiceDAO extends JpaRepository<Invoice, Integer>{
	
	@Query("select i.price from Invoice i where i.invoiceId=?1")
	public Double getPriceByInvoiceId(Integer invoiceId);

}

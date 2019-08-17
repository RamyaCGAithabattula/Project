package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.Capstore;
import com.cg.dao.InvoiceDAO;
import com.cg.dao.RevenueDao;

@Service
@Transactional
public class RevenueServiceImpl implements RevenueService {
	
	@Autowired RevenueDao revenueDao;
	
	@Autowired InvoiceDAO invoiceDao;
	public void update(Integer invoiceId) {
		
		
		Double price= (double) Math.round(invoiceDao.getPriceByInvoiceId(invoiceId));
		revenueDao.updateRevenue(price);
		
	}

}

package ar.com.customer.relationship.management.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ar.com.customer.relationship.management.main.dao.CustomerDao;
import ar.com.customer.relationship.management.main.entity.CustomerEntity;
import jakarta.transaction.Transactional;

@Service
public class CustomerService {

	CustomerDao cDao;
	
	public CustomerService(CustomerDao cDao)
	{
		this.cDao = cDao;
	}
	
	@Transactional
	public List<CustomerEntity> findAll() 
	{
		return cDao.findAll();
	}
	
	@Transactional
	public Optional<CustomerEntity> findById(int id)
	{
		return cDao.findById(id);
	}
	
	@Transactional
	public void saveCustomer(CustomerEntity c)
	{
		if(c != null) {
			cDao.save(c);
		}
	}
	
	@Transactional
	public void deleteById(int id) {
		if(id > 0)
		{
			cDao.deleteById(id);
		}
	}
	
}

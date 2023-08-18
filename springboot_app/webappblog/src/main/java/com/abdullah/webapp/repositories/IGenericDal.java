	package com.abdullah.webapp.repositories;
	
	import org.springframework.data.jpa.repository.JpaRepository;
	
	public interface IGenericDal <T> extends JpaRepository<T, Long>{
		
	}

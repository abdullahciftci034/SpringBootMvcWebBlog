package com.abdullah.webapp.managers;
import java.util.List;
import java.util.Optional;

import com.abdullah.webapp.models.GenericModels;
import com.abdullah.webapp.repositories.IGenericDal;
import com.abdullah.webapp.services.IGenericService;

public class GenericManager<T> implements IGenericService<T> {
	
	IGenericDal<T> iGenericDal;
	
	@Override
	public List<T> getAll() {
		 return this.iGenericDal.findAll();
	}
	@Override
	public T getById(int id) {
	    Optional<T> entityOptional = this.iGenericDal.findById((long) id);
	    return entityOptional.orElse(null);
	}
	@Override
	public T save(T t) {
		return this.iGenericDal.save(t);
	}
	@Override
	public T update(int id, T t) {
		if (this.iGenericDal.existsById((long) id)) {
	        ((GenericModels) t).setId((int) id); // Assuming there's a setId() method in the T class
	        return this.iGenericDal.save(t);
	    }
	    return null;
	}
	@Override
	public void delete(int i) {
		this.iGenericDal.deleteById((long) i);
	}
	
}

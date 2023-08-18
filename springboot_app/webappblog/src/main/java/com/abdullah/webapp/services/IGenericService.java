package com.abdullah.webapp.services;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IGenericService<T> {
	public List<T> getAll();
	public T getById(int id);
    public T save(T t);
    public T update(int id, T t); 
    public void delete(int i);
}

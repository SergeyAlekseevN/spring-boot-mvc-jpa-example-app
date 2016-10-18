package com.example.services;

import com.example.domain.DomainObject;

import java.util.List;

/**
 * Created by Sergey Alekseev on 17.10.2016.
 */
public interface CRUDService<T> {

    List<?> listAll();

    T getById(Integer id);

    T saveOrUpdate(T object);

    void delete(Integer id);
}

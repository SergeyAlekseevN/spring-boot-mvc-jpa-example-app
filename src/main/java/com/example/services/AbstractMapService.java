package com.example.services;

import com.example.domain.DomainObject;

import java.util.*;

/**
 * Created by Sergey Alekseev on 17.10.2016.
 */
public abstract class AbstractMapService{
    protected Map<Integer, DomainObject> domainMap;

    public AbstractMapService() {
        domainMap = new HashMap<>();
        loadDomainObjects();
    }

    protected abstract void loadDomainObjects();

    public List<DomainObject> listAll() {
        return new
                ArrayList<>(domainMap.values());
    }

    public DomainObject getById(Integer id) {
        return domainMap.get(id);
    }

    public DomainObject saveOrUpdate(DomainObject domainObject) {
        if (domainObject != null) {
            if (domainObject.getId() == null) {
                domainObject.setId(getNextKey());
            }
            domainMap.put(domainObject.getId(), domainObject);
            return domainObject;
        } else {
            throw new RuntimeException("Object can't be null");
        }
    }

    public void delete(Integer id){
        domainMap.remove(id);
    }

    private Integer getNextKey() {
        return Collections.max(domainMap.keySet()) + 1;
    }
}

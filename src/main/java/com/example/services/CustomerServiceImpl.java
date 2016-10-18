package com.example.services;

import com.example.domain.Customer;
import com.example.domain.DomainObject;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 15.10.2016.
 */
@Service
public class CustomerServiceImpl extends AbstractMapService implements CustomerService {


    @Override
    protected void loadDomainObjects() {

        domainMap = new HashMap<>();

        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("FirstName1");
        customer1.setLastName("LastName1");
        customer1.setEmail("Email1");
        customer1.setPhone("Phone1");
        customer1.setAddressLineOne("");
        customer1.setAddressLineTwo("");
        customer1.setCity("City1");
        customer1.setState("State1");
        customer1.setZip("zip1");

        domainMap.put(1, customer1);

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setFirstName("FirstName2");
        customer2.setLastName("LastName2");
        customer2.setEmail("Email2");
        customer2.setPhone("Phone2");
        customer2.setAddressLineOne("");
        customer2.setAddressLineTwo("");
        customer2.setCity("City2");
        customer2.setState("State2");
        customer2.setZip("zip2");

        domainMap.put(2, customer2);

        Customer customer3 = new Customer();
        customer3.setId(3);
        customer3.setFirstName("FirstName3");
        customer3.setLastName("LastName3");
        customer3.setEmail("Email3");
        customer3.setPhone("Phone3");
        customer3.setAddressLineOne("");
        customer3.setAddressLineTwo("");
        customer3.setCity("City3");
        customer3.setState("State3");
        customer3.setZip("zip3");

        domainMap.put(3, customer3);

        Customer customer4 = new Customer();
        customer4.setId(4);
        customer4.setFirstName("FirstName4");
        customer4.setLastName("LastName4");
        customer4.setEmail("Email4");
        customer4.setPhone("Phone4");
        customer4.setAddressLineOne("");
        customer4.setAddressLineTwo("");
        customer4.setCity("City4");
        customer4.setState("State4");
        customer4.setZip("zip1");

        domainMap.put(4, customer4);
    }

    @Override
    public Customer saveOrUpdate(Customer object) {
        return (Customer) super.saveOrUpdate(object);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }

    @Override
    public Customer getById(Integer id) {
        return (Customer) super.getById(id);
    }

    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

}

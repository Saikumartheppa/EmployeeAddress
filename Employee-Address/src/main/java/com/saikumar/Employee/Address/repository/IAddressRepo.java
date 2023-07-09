package com.saikumar.Employee.Address.repository;

import com.saikumar.Employee.Address.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Long> {

    Address findByAddressId(Long addId);
}

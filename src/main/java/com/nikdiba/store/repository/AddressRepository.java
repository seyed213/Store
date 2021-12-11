package com.nikdiba.store.repository;

import com.nikdiba.store.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}

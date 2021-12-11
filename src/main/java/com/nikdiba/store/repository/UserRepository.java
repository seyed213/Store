package com.nikdiba.store.repository;

import com.nikdiba.store.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM users u WHERE u.phone_number=:phoneNumber AND u.password =:password", nativeQuery = true)
    User login(String phoneNumber, String password);


}

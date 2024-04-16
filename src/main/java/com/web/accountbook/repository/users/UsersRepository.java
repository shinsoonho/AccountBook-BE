package com.web.accountbook.repository.users;

import com.web.accountbook.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {

    //@Query(value = "select * from user_infomation where service_id = :serviceId", nativeQuery = true)
    @Query(value = "select u from Users u where u.serviceId = :serviceId")
    Optional<Users> findByServiceId(String serviceId);

    Optional<Users> findByServiceIdAndUserPw(String serviceId, String userPw);

}

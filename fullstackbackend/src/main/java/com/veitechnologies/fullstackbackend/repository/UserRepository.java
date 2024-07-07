package com.veitechnologies.fullstackbackend.repository;
import com.veitechnologies.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

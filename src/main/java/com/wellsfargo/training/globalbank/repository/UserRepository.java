package com.wellsfargo.training.globalbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wellsfargo.training.globalbank.model.User;

public interface UserRepository extends JpaRepository<User, Long> { 

}

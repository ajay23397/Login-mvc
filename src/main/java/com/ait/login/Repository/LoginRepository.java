package com.ait.login.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ait.login.Entity.UserLogin;

public interface LoginRepository extends JpaRepository<UserLogin, Integer> {

	@Query(value = "from UserLogin login where login.username = ?1")
	Optional<UserLogin>  fetchuser(String username);
}

package com.ait.login.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ait.login.Entity.UserLogin;
import com.ait.login.Repository.LoginRepository;
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginRepository repo;
	@Override
	public void checkLogin(String Username, String Password) {
		Optional<UserLogin> opt=repo.fetchuser(Username);
		UserLogin user = opt.get();
		
	
	}

	
}

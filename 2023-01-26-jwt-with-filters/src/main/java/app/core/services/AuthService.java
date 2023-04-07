package app.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.auth.JwtUtil;
import app.core.auth.UserCredentials;
import app.core.entities.User;
import app.core.repositories.UserRepository;

@Service
public class AuthService {

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private UserRepository userRepo;

	public String register(User user) throws Exception {
		// business logic comes here
		if(!this.userRepo.existsByEmail(user.getEmail())) {
			this.userRepo.save(user);
			return this.jwtUtil.generateToken(user);			
		}else {
			throw new Exception("register failed - the email: "+user.getEmail()+" already exists in the system" );
		}
	}

	public String login(UserCredentials credentials) throws Exception {
		// find if there is a user with this email
		User user = userRepo.findByEmail(credentials.getEmail())
				.orElseThrow(() -> new Exception("user not found. email: " + credentials.getEmail()));
		// if a user was found - check the password
		if(credentials.getPassword().equals(user.getPassword())) {
			String token = jwtUtil.generateToken(user);
			return token;
		} else { 
			throw new Exception("wrong email or password");
		}
	}

}

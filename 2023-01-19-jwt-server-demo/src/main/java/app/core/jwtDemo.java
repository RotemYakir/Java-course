package app.core;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;

public class jwtDemo {

	public static void main(String[] args) {

		System.out.println("JWT");
	
		// 1. create a JWT builder
		JwtBuilder jwtBuilder= Jwts.builder();
		
		// 2. create the token
		String token=jwtBuilder
				
		.claim("name", "Rotem")
		
		.claim("Adress", "Udim")
		
		.claim("email", "Rotem@mail.com")
		
		
		.compact();
		
		// print the token
		System.out.println(token);
	}

}

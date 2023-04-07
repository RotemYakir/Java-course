package app.core;

import java.security.Key;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class jwtDemo {

	public static void main(String[] args) {
		
		Instant now = Instant.now(); // now
		Instant expiration = now.plus(5,ChronoUnit.MINUTES); // five minutes from now
		
		// we need to create a Key Object from a secret combination
		// step 1 - secret
		String secret = "aaaaaaaaa1aaaaaaaaa2aaaaaaaaa3aaaaaaaaa4aaa";
		// step 2 - encryption algorithm (name)
		String alg = SignatureAlgorithm.HS256.getJcaName();
		// step 3 - a Key Object made by the secret and alg above
		Key key = new SecretKeySpec(Base64.getDecoder().decode(secret), alg) ;
		
	
		// create a JWT builder
		JwtBuilder jwtBuilder= Jwts.builder();
		
		
		// create the token
		String token=jwtBuilder
				
				.signWith(key)
				
				.setSubject("101") // the subject identifies the user 
				
				.setIssuedAt(Date.from(now)) // the time when this token was created

				.setExpiration(Date.from(expiration)) // the expiration time of the token
				
		.claim("name", "Rotem") // adds a claim to the payload
		
		.claim("Adress", "Udim") // adds a claim to the payload
		
		.claim("email", "Rotem@mail.com") // adds a claim to the payload
		
		
		.compact(); // convert to a string JWS
		
		// print the token
		System.out.println(token);
	
		/////////////////////////////////////////////////////////////////////////////////////
				
		// how to authenticate and decode a received token
		
		// get a parser to open the token
		JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(key).build();
		Jws<Claims> jwt = jwtParser.parseClaimsJws(token);
		System.out.println(jwt);
		System.out.println(jwt.getHeader());
		System.out.println(jwt.getBody());
		System.out.println(jwt.getSignature());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

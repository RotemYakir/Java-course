package app.core.auth;

import java.security.Key;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Value;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * @author me
 *
 * @param <T>  the type of the Object from which we generate the token - JWT
 *             payload
 * @param <ID> the type of the identifier - JWT subject
 */
public abstract class JwtUtilAbstract<T, ID> {

	private String alg = SignatureAlgorithm.HS256.getJcaName();

	@Value("${jwt.util.secret.key}")
	private String secret;
	private Key key;
	@Value("${jwt.util.chrono.unit}")
	private ChronoUnit chronoUnit;
	@Value("${jwt.util.chrono.unit.number}")
	private int unitsNumber;

	@PostConstruct
	public void init() {
		this.key = new SecretKeySpec(Base64.getDecoder().decode(secret), alg);
	}

	public abstract String generateToken(T user);

	protected String createToken(Map<String, Object> claims, ID subject) {
		
		Instant now = Instant.now(); // now
		Instant expiration = now.plus(this.unitsNumber,this.chronoUnit); 
		
		String token = Jwts.builder()
				
				.setClaims(claims)

				.setSubject(subject.toString()) // the subject identifies the user

				.setIssuedAt(Date.from(now)) // the time when this token was created

				.setExpiration(Date.from(expiration)) // the expiration time of the token

				.signWith(key)

				.compact(); // convert to a string JWS
		
		return token;
	}
	
	public abstract T extractUser(String token) throws JwtException;
		
	protected Claims extractAllClaims (String token) throws JwtException{
		JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(key).build();
		Jws<Claims> jwt = jwtParser.parseClaimsJws(token);
		return jwt.getBody();
	}

}

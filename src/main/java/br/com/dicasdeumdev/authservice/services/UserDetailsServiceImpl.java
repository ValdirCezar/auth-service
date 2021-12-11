package br.com.dicasdeumdev.authservice.services;

import br.com.dicasdeumdev.authservice.domain.User;
import br.com.dicasdeumdev.authservice.repositories.UserRepository;
import br.com.dicasdeumdev.authservice.security.UserSS;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	private final UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<User> user = repository.findByEmail(email);

		if(user.isPresent()) {
			return new UserSS(
					user.get().getId(),
					user.get().getEmail(),
					user.get().getPassword(),
					List.of(user.get().getProfile()));
		}
		throw new UsernameNotFoundException(email);
	}

}

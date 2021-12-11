package br.com.dicasdeumdev.authservice.repositories;

import br.com.dicasdeumdev.authservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

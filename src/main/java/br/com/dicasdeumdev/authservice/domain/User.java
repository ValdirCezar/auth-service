package br.com.dicasdeumdev.authservice.domain;

import br.com.dicasdeumdev.authservice.enumerations.ProfileEnum;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Entity
public class User {

    @Id
    private Long id;
    private String name;
    private String cpfOrCnpj;
    private ProfileEnum profile;
    private String email;
    private String password;
}

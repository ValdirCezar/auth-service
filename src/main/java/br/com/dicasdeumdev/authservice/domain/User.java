package br.com.dicasdeumdev.authservice.domain;

import br.com.dicasdeumdev.authservice.enumerations.ProfileEnum;

public class User {

    private Long id;
    private String name;
    private String cpfOrCnpj;
    private ProfileEnum profile;
    private String email;
    private String password;
}

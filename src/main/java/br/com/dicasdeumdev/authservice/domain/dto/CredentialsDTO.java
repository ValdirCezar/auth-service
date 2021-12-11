package br.com.dicasdeumdev.authservice.domain.dto;

import lombok.Data;

@Data
public class CredentialsDTO {

    private String email;
    private String password;
}

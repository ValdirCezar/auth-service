package br.com.dicasdeumdev.authservice.enumerations;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor(access = PRIVATE)
public enum ProfileEnum {

    ADMIN("Admin"),
    ENTERPRISE("Enterprise"),
    CLIENT("Client");

    @Getter
    private String description;

}

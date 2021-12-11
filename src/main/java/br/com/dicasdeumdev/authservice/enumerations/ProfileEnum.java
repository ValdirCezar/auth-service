package br.com.dicasdeumdev.authservice.enumerations;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static java.util.Objects.isNull;
import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor(access = PRIVATE)
public enum ProfileEnum {

    ADMIN("Admin"),
    ENTERPRISE("Enterprise"),
    CLIENT("Client");

    @Getter
    private String description;

    public static ProfileEnum getProfile(String description) {
        if(isNull(description)) return null;

        for(ProfileEnum x : ProfileEnum.values()) {
            if(description.equals(x.getDescription())) return x;
        }

        throw new IllegalArgumentException("Invalid profile description");
    }

}

package com.assoulaimani.etudiant.config;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "etudiant.params")
public class TestParam {
    int c1;
    int c2;
}

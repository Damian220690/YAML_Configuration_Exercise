package com.example.yamlConfig.configuration;

import com.example.yamlConfig.model.Animal;
import com.example.yamlConfig.model.Website;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("person")
public class YAMLConfig {
    private String firstName;
    private String lastName;
    private List<String> hobbies = new ArrayList<>();
    private List<Animal> pet = new ArrayList<>();
    private List<Website> website = new ArrayList<>();

    public YAMLConfig() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<Animal> getPet() {
        return pet;
    }

    public void setPet(List<Animal> pet) {
        this.pet = pet;
    }

    public List<Website> getWebsite() {
        return website;
    }

    public void setWebsite(List<Website> website) {
        this.website = website;
    }

    @PostConstruct
    public void init(){
        System.out.println("Init");
    }
}

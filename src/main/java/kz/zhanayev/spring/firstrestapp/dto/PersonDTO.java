package kz.zhanayev.spring.firstrestapp.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class PersonDTO {


    @NotEmpty(message = "name shouldnt be empty")
    @Size(min = 2, max = 30, message = "name should be between 2 and 30 characters")
    private String name;

    @Min(value = 0, message = "age should be greater than 0")
    private int age;

    @Email
    @NotEmpty(message = "email should not be empty")
    private String email;

    public @NotEmpty(message = "name shouldnt be empty") @Size(min = 2, max = 30, message = "name should be between 2 and 30 characters") String getName() {
        return name;
    }

    public void setName(@NotEmpty(message = "name shouldnt be empty") @Size(min = 2, max = 30, message = "name should be between 2 and 30 characters") String name) {
        this.name = name;
    }

    @Min(value = 0, message = "age should be greater than 0")
    public int getAge() {
        return age;
    }

    public void setAge(@Min(value = 0, message = "age should be greater than 0") int age) {
        this.age = age;
    }

    public @Email @NotEmpty(message = "email should not be empty") String getEmail() {
        return email;
    }

    public void setEmail(@Email @NotEmpty(message = "email should not be empty") String email) {
        this.email = email;
    }
}

package com.example.MascotasServicio.model;

public class Pets {
    private Long petId;
    private String name;

    private String status;


    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPetId() {
        return petId;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

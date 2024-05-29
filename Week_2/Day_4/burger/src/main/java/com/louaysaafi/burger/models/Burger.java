package com.louaysaafi.burger.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="burgers")
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min=1, max=255, message="Burger name must not be null")
    private String name;

    @NotNull
    @Size(min=1, max=255, message="restoName name must not be null")
    private String restaurant;

    @NotNull
    @Min(1)
    @Max(5)
    private int rating;

    private String notes;

    public Burger() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getburgerName() {
        return name;
    }

    public void setburgerName(String name) {
        this.name = name;
    }

    public String getrestoName() {
        return restaurant;
    }

    public void setrestoName(String restaurant) {
        this.restaurant = restaurant;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
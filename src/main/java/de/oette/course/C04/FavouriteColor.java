package de.oette.course.C04;

import javax.persistence.*;

@Entity
@Table(name = "favourite_color_entity")
public class FavouriteColor {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    protected FavouriteColor() {
        // for jpa
    }

    public FavouriteColor(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

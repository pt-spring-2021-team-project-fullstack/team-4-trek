package com.wecancodeit.trekdemoteam4;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Trek {

    @Id
    @GeneratedValue
    private Long id;

    private String trekName;

    @ManyToOne
    private Continent continent;

    @ManyToOne
    private Region region;

    @ManyToOne
    private TrekType trekType;
    private String imageUrl;

    protected Trek(){

    }

    public Trek(String trekName, Continent continent, Region region, TrekType trekType, String imageUrl) {
        this.trekName = trekName;
        this.continent = continent;
        this.region = region;
        this.trekType = trekType;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public String getTrekName() { return trekName; }

    public Continent getContinent() {
        return continent;
    }

    public Region getRegion() {
        return region;
    }

    public TrekType getTrekType() {
        return trekType;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trek trek = (Trek) o;
        return Objects.equals(id, trek.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

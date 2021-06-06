package com.wecancodeit.trekdemoteam4;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class TrekType {

    @Id
    @GeneratedValue
    private Long id;

    private String typeName;

    @OneToMany(mappedBy = "trekType")
    private Collection<Trek> treks;

    protected TrekType(){

    }

    public TrekType(String typeName) {
        this.typeName = typeName;
    }

    public Long getId() {
        return id;
    }

    public String getTypeName() {
        return typeName;
    }

    public Collection<Trek> getTreks() {
        return treks;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrekType trekType = (TrekType) o;
        return Objects.equals(id, trekType.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

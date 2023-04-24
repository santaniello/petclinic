package br.com.felipe.petclinic.appointment;
import br.com.felipe.petclinic.common.entity.BaseEntity;
import br.com.felipe.petclinic.vet.entitydb.VetEntityDB;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "works")
@SuperBuilder
public class Work extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "duration")
    private int duration;

    @ManyToMany
    @JoinTable(name = "works_vets", joinColumns = @JoinColumn(name = "id_work"), inverseJoinColumns = @JoinColumn(name = "id_vet"))
    private List<VetEntityDB> vets;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Work)) return false;
        Work work = (Work) o;
        return super.getId().equals(work.getId());
    }

    @Override
    public int hashCode() {
        return this.getId().hashCode();
    }
}

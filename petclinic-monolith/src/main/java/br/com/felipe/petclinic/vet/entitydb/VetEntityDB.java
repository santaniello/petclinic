package br.com.felipe.petclinic.vet.entitydb;
import br.com.felipe.petclinic.appointment.Appointment;
import br.com.felipe.petclinic.appointment.Work;
import br.com.felipe.petclinic.appointment.WorkingPlan;
import br.com.felipe.petclinic.common.entity.PersonEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vets")
@SuperBuilder
public class VetEntityDB extends PersonEntity {

    @Column(name = "document", unique = true)
    private int document;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    private Set<SpecialtyEntityDB> specialties;

    @OneToMany(mappedBy = "vet")
    private List<Appointment> appointments;

    @OneToMany(mappedBy = "vet")
    private List<WorkingPlan> workingPlans;

    @ManyToMany
    @JoinTable(name = "works_vets", joinColumns = @JoinColumn(name = "id_vet"), inverseJoinColumns = @JoinColumn(name = "id_work"))
    private List<Work> works;
}

package br.com.felipe.petclinic.appointment;
import br.com.felipe.petclinic.common.entity.BaseEntity;
import br.com.felipe.petclinic.vet.entitydb.VetEntityDB;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "working_plans")
@SuperBuilder(toBuilder = true)
public class WorkingPlan extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "id_vet")
    private VetEntityDB vet;

    @OneToMany(mappedBy = "workingPlan")
    private List<WorkingBreak> breaks;

    @Enumerated(EnumType.STRING)
    @Column(name = "dayOfWeek")

    private DayOfWeek dayOfWeek;
    @Column(name = "workplan_start")
    private LocalTime workingStart;

    @Column(name = "workplan_end")
    private LocalTime workingEnd;
}

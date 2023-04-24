package br.com.felipe.petclinic.appointment;
import br.com.felipe.petclinic.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "working_breaks")
public class WorkingBreak extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "id_working_plan")
    private WorkingPlan workingPlan;

    private DayOfWeek dayOfWeek;
    @Column(name = "break_start")
    private LocalTime breakingStart;

    @Column(name = "break_end")
    private LocalTime breakingEnd;
}

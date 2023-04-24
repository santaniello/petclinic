package br.com.felipe.petclinic.appointment;
import br.com.felipe.petclinic.common.entity.BaseEntity;
import br.com.felipe.petclinic.vet.entitydb.VetEntityDB;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "appointments")
public class Appointment extends BaseEntity {

    @Column(name = "appointment_start")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime appointmentStart;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    @Column(name = "appointment_end")
    private LocalDateTime appointmentEnd;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    @Column(name = "canceled_at")
    private LocalDateTime canceledAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private AppointmentStatus status;

    @ManyToOne
    @JoinColumn(name = "id_vet")
    private VetEntityDB vet;

    @ManyToOne
    @JoinColumn(name = "id_work")
    private Work work;

    public List<Appointment> getAppointmentsWithoutBreaks(){
        return Collections.emptyList();
    }
}

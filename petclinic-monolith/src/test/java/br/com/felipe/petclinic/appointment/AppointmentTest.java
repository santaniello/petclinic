package br.com.felipe.petclinic.appointment;
import br.com.felipe.petclinic.vet.entitydb.VetEntityDB;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import static java.time.LocalDateTime.of;
import static java.time.Month.MARCH;

class AppointmentTest {
    private VetEntityDB veterinary;

    @Test
    void should_return_appointments_without_breaks(){
        LocalDateTime start = of(2023, MARCH, 28, 14, 00,00);
        LocalDateTime end = of(2023, MARCH, 28, 15, 00,00);
        Appointment app = Appointment.builder()
                .appointmentStart(start)
                .appointmentEnd(end)
                .status(AppointmentStatus.CONFIRMED)
                .vet(new VetEntityDB())
                .build();
    }
}

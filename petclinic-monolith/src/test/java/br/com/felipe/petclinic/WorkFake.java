package br.com.felipe.petclinic;
import br.com.felipe.petclinic.appointment.Work;
import br.com.felipe.petclinic.appointment.WorkingPlan;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.emptyList;

public final class WorkFake {
    public static final List<Work> VET_WORKS = getVetWorks();

    private static List<Work> getVetWorks(){
        List<Work> vetWorks = new ArrayList<>();
        Work baseWork = Work.builder()
                .name("Medical Appointment")
                .description("Medical Appointment")
                .price(100)
                .duration(60)
                .build();
        vetWorks.add(baseWork);
        vetWorks.add(baseWork.toBuilder().name("Vaccine").description("Vaccine").build());
        vetWorks.add(baseWork.toBuilder().name("Artificial Insemination").description("Artificial Insemination").build());
        return vetWorks;
    }
}

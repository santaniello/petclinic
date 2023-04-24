package br.com.felipe.petclinic;
import br.com.felipe.petclinic.vet.entitydb.SpecialtyEntityDB;
import br.com.felipe.petclinic.vet.entitydb.VetEntityDB;

import java.util.Set;

public final class VetFake {
    public static final VetEntityDB VET_DEFAULT = VetEntityDB.builder()
            .firstName("John")
            .lastName("Green")
            .document(111)
            .works(WorkFake.VET_WORKS)
            .workingPlans(WorkingPlanFake.WEEKPLAN)
            .specialties(Set.of(new SpecialtyEntityDB("Clinical"), new SpecialtyEntityDB(" Administration of Vaccine")))
            .build();
}

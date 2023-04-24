package br.com.felipe.petclinic;
import br.com.felipe.petclinic.appointment.WorkingBreak;
import br.com.felipe.petclinic.appointment.WorkingPlan;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

import static java.time.LocalTime.of;
import static java.util.Collections.emptyList;
import static java.util.List.*;

public final class WorkingPlanFake {
    public static final List<WorkingPlan> WEEKPLAN = getWeekPlan();
    public static final List<WorkingPlan> WEEKPLAN_WITH_ONE_BREAK_ON_MONDAY = getWeekPlanWithOneBreakOnMonday();


    public static List<WorkingPlan> getDayPlan(DayOfWeek day, List<WorkingBreak> breaks){
        List<WorkingPlan> workingPlans = new ArrayList<>();
        WorkingPlan plan = WorkingPlan.builder()
                .dayOfWeek(day)
                .breaks(breaks)
                .workingStart(of(8, 00))
                .workingEnd(of(9, 00))
                .build();
        workingPlans.add(plan);
        workingPlans.add(plan.toBuilder().workingStart(of(9, 00)).workingEnd(of(10,00)).build());
        workingPlans.add(plan.toBuilder().workingStart(of(10, 00)).workingEnd(of(11,00)).build());
        workingPlans.add(plan.toBuilder().workingStart(of(11, 00)).workingEnd(of(12,00)).build());
        workingPlans.add(plan.toBuilder().workingStart(of(12, 00)).workingEnd(of(13,00)).build());
        workingPlans.add(plan.toBuilder().workingStart(of(13, 00)).workingEnd(of(14,00)).build());
        workingPlans.add(plan.toBuilder().workingStart(of(14, 00)).workingEnd(of(15,00)).build());
        workingPlans.add(plan.toBuilder().workingStart(of(15, 00)).workingEnd(of(16,00)).build());
        workingPlans.add(plan.toBuilder().workingStart(of(16, 00)).workingEnd(of(17,00)).build());
        return workingPlans;
    }

    private static List<WorkingPlan> getWeekPlan(){
        List<WorkingPlan> workingPlans = new ArrayList<>();
        workingPlans.addAll(getDayPlan(DayOfWeek.MONDAY, emptyList()));
        workingPlans.addAll(getDayPlan(DayOfWeek.TUESDAY, emptyList()));
        workingPlans.addAll(getDayPlan(DayOfWeek.WEDNESDAY,  emptyList()));
        workingPlans.addAll(getDayPlan(DayOfWeek.THURSDAY, emptyList()));
        workingPlans.addAll(getDayPlan(DayOfWeek.FRIDAY, emptyList()));
        workingPlans.addAll(getDayPlan(DayOfWeek.SATURDAY, emptyList()));
        return workingPlans;
    }

    private static List<WorkingPlan> getWeekPlanWithOneBreakOnMonday(){
        List<WorkingPlan> workingPlans = new ArrayList<>();
        workingPlans.addAll(getDayPlan(DayOfWeek.MONDAY, List.of(new WorkingBreak(of(12,00), of(13,00)))));
        workingPlans.addAll(getDayPlan(DayOfWeek.TUESDAY, emptyList()));
        workingPlans.addAll(getDayPlan(DayOfWeek.WEDNESDAY,  emptyList()));
        workingPlans.addAll(getDayPlan(DayOfWeek.THURSDAY, emptyList()));
        workingPlans.addAll(getDayPlan(DayOfWeek.FRIDAY, emptyList()));
        workingPlans.addAll(getDayPlan(DayOfWeek.SATURDAY, emptyList()));
        return workingPlans;
    }
}

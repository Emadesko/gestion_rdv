package com.emadesko.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data

public class Rdv {
    private int id;
    private LocalDate date;
    private LocalTime heure;
}

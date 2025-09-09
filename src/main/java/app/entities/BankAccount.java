package app.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@AllArgsConstructor
public class BankAccount {
    private int id;
    private Integer userId;
    private String accountNumber;
    private double balance;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}

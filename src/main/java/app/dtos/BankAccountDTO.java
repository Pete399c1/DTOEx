package app.dtos;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BankAccountDTO {
    private String accountNumber;
    private double balance;
    private LocalDate createdAt;

}

package app.dtos;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BankAccountWithUserDTO {
    private String accountNumber;
    private double balance;
    private String fullName;
    private String email;
}

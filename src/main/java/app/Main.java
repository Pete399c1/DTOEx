package app;


import app.config.HibernateConfig;

import app.dtos.BankAccountDTO;
import app.dtos.BankAccountWithUserDTO;
import app.dtos.UserDTO;
import app.entities.BankAccount;
import app.entities.User;
import jakarta.persistence.EntityManagerFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User(1,"Ally","olivers","al@gmail.com");
        UserDTO userDTO = new UserDTO(user.getFirstName() + " " + user.getLastName(), user.getEmail());

        System.out.println(userDTO.getFullName());

        BankAccount bankAccount = new BankAccount(1,1,"2020202",6.1, LocalDate.of(2000,1,10), LocalDate.of(2007,3,12));
        BankAccountDTO bankAccountDTO = new BankAccountDTO(bankAccount.getAccountNumber(),bankAccount.getBalance(), bankAccount.getCreatedAt());

        System.out.println(bankAccountDTO);

        BankAccountWithUserDTO bankAccountWithUserDTO = new BankAccountWithUserDTO(bankAccount.getAccountNumber(),bankAccount.getBalance(),user.getFirstName() +" "+ user.getLastName(), user.getEmail());
        System.out.println(bankAccountWithUserDTO.getFullName() + " " + bankAccountWithUserDTO.getBalance());

    }
}
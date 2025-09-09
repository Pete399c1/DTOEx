package app.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
}

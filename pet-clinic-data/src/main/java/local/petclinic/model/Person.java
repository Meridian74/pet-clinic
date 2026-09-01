package local.petclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;

}
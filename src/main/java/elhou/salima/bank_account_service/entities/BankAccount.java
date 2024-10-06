package elhou.salima.bank_account_service.entities;

import elhou.salima.bank_account_service.entities.enums.AccountType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Builder
//@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)//tous va stocker dans un seul table
//@DiscriminatorColumn(name = "TYPE", length = 4)//colone type char peut avoir 4 lettre
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {
    @Id
    private String id;
    private Date createdAt;
    private Double balance;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
}

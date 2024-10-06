package elhou.salima.bank_account_service.web;

import elhou.salima.bank_account_service.dto.BankAccountRequestDTO;
import elhou.salima.bank_account_service.dto.BankAccountResponseDTO;
import elhou.salima.bank_account_service.entities.BankAccount;
import elhou.salima.bank_account_service.repositories.BankAccountRepository;
import elhou.salima.bank_account_service.service.AccountService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BankAccountGraphQlController {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private AccountService accountService;

    @QueryMapping
    public List<BankAccount> accountsList(){
        return bankAccountRepository.findAll();
    }

    @QueryMapping
    public BankAccount bankAccountById(@Argument String id){
        return bankAccountRepository.findById( id)
                .orElseThrow(()-> new RuntimeException(String.format("Account %s not found",id)));
    }

    @MutationMapping
    public BankAccountResponseDTO addAccount(@Argument BankAccountRequestDTO bankAccount){
        return accountService.addAccount(bankAccount);
    }
    @MutationMapping
    public BankAccountResponseDTO updateAccount(@Argument String id ,@Argument BankAccountRequestDTO bankAccount){
        return accountService.updateAccount(id, bankAccount);
    }

    @MutationMapping
    public Boolean DeleteAccount(@Argument String id ){
         bankAccountRepository.deleteById(id);
         return true;
    }


}



//record c est un objet java 14
//record  BankAccountDTO(Double balance, String type, String currency){ }

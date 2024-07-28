package mybatis.springstudy.account;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AccountController {

    private final AccountServiceImpl accountServiceImpl;

    @PostMapping("signUp")
    public void signUp(@RequestBody AccountDto accountDto) {
        accountServiceImpl.accountInsert(accountDto);
    }

    @PostMapping("login")
    public ResLoginDto login(@RequestBody AccountLoginDto accountLoginDto){
        return accountServiceImpl.accountLogin(accountLoginDto);
    }
}

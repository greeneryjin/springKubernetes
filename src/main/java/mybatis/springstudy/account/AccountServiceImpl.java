package mybatis.springstudy.account;

import lombok.RequiredArgsConstructor;
import mybatis.springstudy.account.mapper.AccountMapper;
import mybatis.springstudy.util.JwtUtil;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountMapper accountMapper;

    private final JwtUtil jwtUtil;

    @Override
    public void accountInsert(AccountDto accountDto) {
        Account account = new Account(accountDto.getName(), accountDto.getUserId(), accountDto.getUserPw());
        accountMapper.insertAccount(account);
    }

    @Override
    public ResLoginDto accountLogin(AccountLoginDto accountLoginDto) {
        Account accountByUserId = accountMapper.findAccountByUserId(accountLoginDto.getUserId());

        String token = JwtUtil.generateToken(accountByUserId.getUserId());
        ResLoginDto resLoginDto = new ResLoginDto(accountByUserId.getAccountId(), accountByUserId.getName(), token);
        return resLoginDto;
    }

    @Override
    public void AccountDelete(String accountId) {

    }
}

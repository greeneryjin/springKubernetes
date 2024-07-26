package mybatis.springstudy.account;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.xml.bind.DatatypeConverter;
import lombok.RequiredArgsConstructor;
import mybatis.springstudy.account.mapper.AccountMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountMapper accountMapper;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;




    @Override
    public String userInsert(AccountDto accountDto) {
        Account account = new Account(accountDto.getName(), accountDto.getUserId(), bCryptPasswordEncoder.encode(accountDto.getUserPw()));
        accountMapper.insertAccount(account);



        return null;
    }
}

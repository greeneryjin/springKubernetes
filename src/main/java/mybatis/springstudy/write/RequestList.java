package mybatis.springstudy.write;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Pageable;

@Builder
@Getter
@Setter
public class RequestList<T> {

    private T data;
    private Pageable pageable;
}

package mybatis.springstudy.write;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface WriteService {

    void insertWrites(RegWriteDto regWriteDto);
    Page<Map<String, Object>> getListWrite(Writes writes, Pageable pageable);
}


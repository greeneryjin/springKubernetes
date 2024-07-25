package mybatis.springstudy.write;

import java.util.List;

public interface WriteService {

    void insertWrites(WriteDto writeDto);
    List<WriteDto> getListWrite();
}


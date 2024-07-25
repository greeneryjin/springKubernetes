package mybatis.springstudy.write;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mybatis.springstudy.write.mapper.WriteMapper;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WriteServiceImpl implements WriteService {

    private final WriteMapper writeMapper;

    @Override
    public void insertWrites(WriteDto writeDto) {
        Writes writes = new Writes(writeDto.getTitle(), writeDto.getContent(), "김어진");
        writeMapper.insertWrites(writes);
    }

    @Override
    public List<WriteDto> getListWrite() {
        List<Writes> listWrite = writeMapper.getListWrite();
        return listWrite.stream()
                .map(WriteDto::new)
                .collect(Collectors.toList());
    }
}

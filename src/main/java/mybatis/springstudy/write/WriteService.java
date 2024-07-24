package mybatis.springstudy.write;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class WriteService {

//    @Transactional
//    public void createWrite(WriteDto writeDto) {
//        Writes write = new Writes(writeDto.getTitle(), writeDto.getContent(), writeDto.getWriter());
//        //writeRepository.save(write);
//    }
//
//    @Transactional(readOnly = true)
//    public Writes findOneWrite(Long writeId) {
//        //Optional<Writes> byId = writeRepository.findById(writeId);
//        return byId.get();
//    }
//
//    @Transactional(readOnly = true)
//    public List<Writes> findWrite() {
//        //List<Writes> all = writeRepository.findAll();
//        return all;
//    }
}

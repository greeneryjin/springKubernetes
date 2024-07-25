package mybatis.springstudy.write;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class WritesController {

    private final WriteServiceImpl writeServiceImpl;

    @PostMapping("/write")
    public void saveWrite(@RequestBody WriteDto writeDto) {
        writeServiceImpl.insertWrites(writeDto);
    }

    @GetMapping("/search")
    public ResponseEntity<List<WriteDto>> getListWrite() {
        List<WriteDto> listWrite = writeServiceImpl.getListWrite();
        return ResponseEntity.ok(listWrite);
    }
}

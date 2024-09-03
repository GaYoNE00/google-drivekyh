package googledrivekyh.domain;

import googledrivekyh.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String fileSize;
    private String fileName;
}

package googledrivekyh.domain;

import googledrivekyh.domain.*;
import googledrivekyh.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private Long id;
    private String fileSize;
    private String fileName;
    private Boolean indexYn;
    private Boolean uploadYn;
    private String videoUrl;
    private String userId;
}

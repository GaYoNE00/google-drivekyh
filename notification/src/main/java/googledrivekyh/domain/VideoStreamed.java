package googledrivekyh.domain;

import googledrivekyh.domain.*;
import googledrivekyh.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoStreamed extends AbstractEvent {

    private Long id;
    private String fileSize;
    private String fileName;
    private String indexYn;
    private String uploadYn;
    private String videoUrl;
    private String userId;
}

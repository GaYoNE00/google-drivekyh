package googledrivekyh.domain;

import googledrivekyh.domain.*;
import googledrivekyh.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
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

    public VideoStreamed(Videoprocessing aggregate) {
        super(aggregate);
    }

    public VideoStreamed() {
        super();
    }
}
//>>> DDD / Domain Event

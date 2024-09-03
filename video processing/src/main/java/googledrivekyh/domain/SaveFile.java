package googledrivekyh.domain;

import googledrivekyh.domain.*;
import googledrivekyh.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class SaveFile extends AbstractEvent {

    private Long id;
    private String fileSize;
    private String fileName;
    private String indexYn;
    private String uploadYn;
    private String videoUrl;
    private String userId;

    public SaveFile(Videoprocessing aggregate) {
        super(aggregate);
    }

    public SaveFile() {
        super();
    }
}
//>>> DDD / Domain Event

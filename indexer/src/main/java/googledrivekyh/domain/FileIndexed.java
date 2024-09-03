package googledrivekyh.domain;

import googledrivekyh.domain.*;
import googledrivekyh.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
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

    public FileIndexed(Index aggregate) {
        super(aggregate);
    }

    public FileIndexed() {
        super();
    }
}
//>>> DDD / Domain Event

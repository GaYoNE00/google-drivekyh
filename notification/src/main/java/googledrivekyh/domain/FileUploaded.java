package googledrivekyh.domain;

import googledrivekyh.domain.*;
import googledrivekyh.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String fileSize;
    private String fileName;
}

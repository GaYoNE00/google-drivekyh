package googledrivekyh.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import googledrivekyh.config.kafka.KafkaProcessor;
import googledrivekyh.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    VideoprocessingRepository videoprocessingRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileIndexed'"
    )
    public void wheneverFileIndexed_SaveFile(@Payload FileIndexed fileIndexed) {
        FileIndexed event = fileIndexed;
        System.out.println(
            "\n\n##### listener SaveFile : " + fileIndexed + "\n\n"
        );

        // Sample Logic //
        Videoprocessing.saveFile(event);
    }
}
//>>> Clean Arch / Inbound Adaptor

package googledrivekyh.domain;

import googledrivekyh.VideoProcessingApplication;
import googledrivekyh.domain.SaveFile;
import googledrivekyh.domain.VideoStreamed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Videoprocessing_table")
@Data
//<<< DDD / Aggregate Root
public class Videoprocessing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileSize;

    private String fileName;

    private String indexYn;

    private String uploadYn;

    private String videoUrl;

    private String userId;

    @PostPersist
    public void onPostPersist() {
        VideoStreamed videoStreamed = new VideoStreamed(this);
        videoStreamed.publishAfterCommit();

        SaveFile saveFile = new SaveFile(this);
        saveFile.publishAfterCommit();
    }

    public static VideoprocessingRepository repository() {
        VideoprocessingRepository videoprocessingRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoprocessingRepository.class
        );
        return videoprocessingRepository;
    }

    //<<< Clean Arch / Port Method
    public static void saveFile(FileIndexed fileIndexed) {
        //implement business logic here:

        /** Example 1:  new item 
        Videoprocessing videoprocessing = new Videoprocessing();
        repository().save(videoprocessing);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileIndexed.get???()).ifPresent(videoprocessing->{
            
            videoprocessing // do something
            repository().save(videoprocessing);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root

package nirmal.javaexercises.java8;

import com.google.common.collect.Lists;

import java.util.Comparator;
import java.util.List;

public class MaxandComparator {

    Media cdMedia = new Media("CD", 5);
    Media vinlyMedia = new Media("VINYL", 170);

    public void maxandComparator() {
        List<Media> mediaList = Lists.newArrayList(cdMedia, vinlyMedia);

        Media maxMedia = mediaList.stream()
                .max(Comparator.comparing(Media::getMediaCount))
                .get();

        System.out.println("Media Count: " + maxMedia.getMediaCount());
        System.out.println("Media Name: " + maxMedia.getMediaName());

    }

}

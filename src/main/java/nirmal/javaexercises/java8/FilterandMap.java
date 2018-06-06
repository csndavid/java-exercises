package nirmal.javaexercises.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterandMap {
    public static List<String> filterandMapMethod(ArrayList<Media> medias) {

        return medias.stream()
                .filter(media -> media.getMediaCount() > 10)
                .map(Media::getMediaName)
                .collect(Collectors.toList());
    }
}

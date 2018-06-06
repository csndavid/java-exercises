package nirmal.javaexercises.java8;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GroupByDataSetup {

    public class Artist {
        String name;
        String albumCount;
        String mediaType;

        public Artist(String name, String albumCount, String mediaType) {
            this.name = name;
            this.albumCount = albumCount;
            this.mediaType = mediaType;
        }
    }

    public List<Artist> createArtist() {

        Artist sting = new Artist("Sting", "5", "LP");
        Artist eric = new Artist("Eric", "5", "LP");
        Artist toto = new Artist("Toto", "6", "CD");

        List<Artist> artistList = Lists.newArrayList(sting, eric, toto);

        return artistList;

    }


}

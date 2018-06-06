package nirmal.javaexercises.java8;


public class Media {

    private String mediaName;
    private Integer mediaCount;

    public Media(String mediaName, Integer mediaCount) {
        this.mediaName = mediaName;
        this.mediaCount = mediaCount;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public Integer getMediaCount() {
        return mediaCount;
    }

    public void setMediaCount(Integer mediaCount) {
        this.mediaCount = mediaCount;
    }
}

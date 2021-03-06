package com.jdkgroup.autoplayvideo.model;

/**
 * Created by krupenghetiya on 03/02/17.
 */

public class ModelVideo {
    private final String image_url;
    private String video_url;
    private final String name;

    public ModelVideo(String video_url, String image_url, String name) {
        this.video_url = video_url;
        this.image_url = image_url;
        this.name = name;
    }

    public ModelVideo(String image_url, String name) {
        this.image_url = image_url;
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getVideo_url() {
        return video_url;
    }

    public String getName() {
        return name;
    }
}

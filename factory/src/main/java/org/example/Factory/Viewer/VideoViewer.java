package org.example.Factory.Viewer;

import org.example.Factory.enums.ViewerType;
import org.example.Factory.models.Video;
import org.springframework.stereotype.Component;

@Component
public class VideoViewer implements Viewer<Video> {

    @Override
    public ViewerType getType() {
        return ViewerType.Video;
    }

    @Override
    public void view(Video object) {
        System.out.println("Viewing Video");
    }


}


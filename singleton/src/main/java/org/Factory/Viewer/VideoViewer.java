package org.Factory.Viewer;

import org.Factory.enums.ViewerType;
import org.Factory.models.Video;
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


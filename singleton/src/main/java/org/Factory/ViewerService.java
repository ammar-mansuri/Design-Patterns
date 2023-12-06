package org.Factory;

import jakarta.annotation.PostConstruct;
import org.Factory.Viewer.Viewer;
import org.Factory.enums.ViewerType;
import org.Factory.models.Document;
import org.Factory.models.Image;
import org.Factory.models.Video;
import org.springframework.stereotype.Service;

@Service
public class ViewerService {
    private final ViewerFactory viewerFactory;

    public ViewerService(ViewerFactory viewerFactory) {
        this.viewerFactory = viewerFactory;
    }

    public void view(ViewerType viewerType, Object o) {
        Viewer viewer=viewerFactory.getViewer(viewerType);
                viewer.view(o);
    }

}
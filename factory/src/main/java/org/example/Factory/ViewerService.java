package org.example.Factory;

import jakarta.annotation.PostConstruct;
import org.example.Factory.Viewer.Viewer;
import org.example.Factory.enums.ViewerType;
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
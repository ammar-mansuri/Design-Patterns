package org.example.Factory.Viewer;

import org.example.Factory.enums.ViewerType;
import org.example.Factory.models.Image;
import org.springframework.stereotype.Component;

@Component
public class ImageViewer implements Viewer<Image> {

    @Override
    public ViewerType getType() {
        return ViewerType.Image;
    }

    @Override
    public void view(Image object) {
        System.out.println("Viewing Image");
    }


}

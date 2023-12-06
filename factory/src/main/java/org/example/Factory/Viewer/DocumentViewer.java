package org.example.Factory.Viewer;

import org.example.Factory.enums.ViewerType;
import org.example.Factory.models.Document;
import org.springframework.stereotype.Component;

@Component
public class DocumentViewer implements Viewer<Document> {

    @Override
    public ViewerType getType() {
        return ViewerType.DOCUMENT;
    }

    @Override
    public void view(Document object) {
        System.out.println("Viewing Document");
    }


}

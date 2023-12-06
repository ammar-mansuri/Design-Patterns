package org.Factory.Viewer;

import org.Factory.enums.ViewerType;
import org.Factory.models.Document;
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

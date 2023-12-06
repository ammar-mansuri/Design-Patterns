package org.Factory;

import jakarta.annotation.PostConstruct;
import org.Factory.enums.ViewerType;
import org.Factory.models.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckingService {

    @Autowired
    ViewerService viewerService;

    @PostConstruct
    public void checkDocument(){
        viewerService.view(ViewerType.DOCUMENT,new Document());

    }
}

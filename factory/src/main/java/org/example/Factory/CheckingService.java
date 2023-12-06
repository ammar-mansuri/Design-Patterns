package org.example.Factory;

import jakarta.annotation.PostConstruct;
import org.example.Factory.enums.ViewerType;
import org.example.Factory.models.Document;
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

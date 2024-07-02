package test.document.application;

import test.document.domain.DocumentCreated;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Component;

@Component
public class DocumentEventListener {

    @ApplicationModuleListener
    public void handle(DocumentCreated event) {
        event.document().readyToRun();
    }

}

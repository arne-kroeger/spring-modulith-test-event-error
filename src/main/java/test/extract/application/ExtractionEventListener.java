package test.extract.application;

import test.document.DocumentReadyToRun;
import test.extract.domain.Extraction;
import org.bson.Document;
import org.springframework.data.mongodb.core.mapping.event.AfterSaveCallback;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Component;

@Component
public class ExtractionEventListener implements AfterSaveCallback<Extraction> {

    private TestUseCase testUseCase;

    public ExtractionEventListener(TestUseCase testUseCase) {
        this.testUseCase = testUseCase;
    }

    @ApplicationModuleListener
    public void handle(DocumentReadyToRun event) {
        System.out.println(event.documentId());
    }

    @Override
    public Extraction onAfterSave(Extraction entity, Document document, String collection) {
        return entity;
    }
}

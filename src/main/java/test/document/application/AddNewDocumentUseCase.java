package test.document.application;

import test.UseCase;
import test.document.domain.Document;
import test.document.domain.DocumentRepository;

@UseCase
public class AddNewDocumentUseCase {

    DocumentRepository repository;

    public AddNewDocumentUseCase(DocumentRepository repository) {
        this.repository = repository;
    }

    public String execute(String externalIdentification, String campaignId) {
        Document documentToStore = new Document(externalIdentification, campaignId);

        repository.save(documentToStore);

        return documentToStore.id;
    }

}

package test.document;

import test.document.domain.DocumentRepository;
import org.springframework.stereotype.Service;

@Service
public class DocumentManagementServiceImpl implements  DocumentManagementService {

    private DocumentRepository documentRepository;

    public DocumentManagementServiceImpl(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Override
    public DocumentDto getDocumentById(String id) {
        return documentRepository.findById(id).map(
                document -> new DocumentDto(document.id, document.externalIdentification, document.campaignId)
        ).orElse(null);
    }

}

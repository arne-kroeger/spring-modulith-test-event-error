package test.extract.application;

import test.UseCase;
import test.document.DocumentManagementService;

@UseCase
public class TestUseCase {

    private DocumentManagementService documentManagementService;

    public TestUseCase(DocumentManagementService documentManagementService) {
        this.documentManagementService = documentManagementService;
    }

    public void execute() {

    }

}

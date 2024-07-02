package test.document.rest;

import test.document.application.AddNewDocumentUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class DocumentController {

    private AddNewDocumentUseCase addNewDocumentUseCase;

    public DocumentController(
            AddNewDocumentUseCase addNewDocumentUseCase
    ) {
        this.addNewDocumentUseCase = addNewDocumentUseCase;
    }


    @RequestMapping(value = "/document/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> addNewDocument(
            @RequestParam  String externalIdentification,
            @RequestParam  String campaignId
    ) {
        return new ResponseEntity(
                addNewDocumentUseCase.execute(
                        externalIdentification,
                        campaignId
                ),
                HttpStatus.OK
        );
    }

}

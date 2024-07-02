package test.document.domain;

import test.document.DocumentReadyToRun;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.AbstractAggregateRoot;
import org.springframework.util.Assert;

import java.time.LocalDateTime;


public class Document extends AbstractAggregateRoot<Document> {

    @Id
    public String id;

    public LocalDateTime created;

    public String externalIdentification;
    public String campaignId;

    public Document(String externalIdentification, String campaignId) {
        Assert.notNull(externalIdentification, "externalIdentification must not be null");
        Assert.notNull(campaignId, "campaignId must not be null");

        this.created = LocalDateTime.now();

        this.campaignId = campaignId;
        this.externalIdentification = externalIdentification;

        this.registerEvent(new DocumentCreated(this));
    }

    public void readyToRun() {
        this.registerEvent(new DocumentReadyToRun(this.id));
    }

}

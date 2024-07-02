package test.document.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DocumentRepository extends MongoRepository<Document, String> {

    List<Document> findAllByCampaignId(String campaignId);

}

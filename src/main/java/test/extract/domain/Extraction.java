package test.extract.domain;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Extraction {

    @Id
    public String id;

    public LocalDateTime created;

}

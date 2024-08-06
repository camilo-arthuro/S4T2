package cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n03.S04T02N03GalanCarlos.config;

import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Collections;

@Configuration
@EnableMongoRepositories(basePackages = "cat.itacademy.barcelonactiva.galan.carlos.s04.t02.n03.S04T02N03GalanCarlos.model.repository")
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "dbFruits";
    }

    @Bean
    @Override
    public MongoClient mongoClient() {
        return MongoClients.create(
                MongoClientSettings.builder()
                        .applyToClusterSettings(builder ->
                                builder.hosts(Collections.singletonList(new ServerAddress("localhost", 27017))))
                        .credential(
                                com.mongodb.MongoCredential.createCredential(
                                        "admin", "dbFruits", "root".toCharArray()))
                        .build());
    }
}

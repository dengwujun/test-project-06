package com.donggua.test.testproject06.conf;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

import java.time.Duration;

@Configuration
public class ElasticConfig extends AbstractElasticsearchConfiguration {

    @Value("${elastic-search.host.port}")
    private String hostAndPort;

    @Value("${elastic-search.socket-timeout}")
    private String socketTimeout;

    @Value("${elastic-search.connection-timeout}")
    private String connectionTimeout;

    @Override
    @Bean
    public RestHighLevelClient elasticsearchClient() {
        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo(hostAndPort)
                .withSocketTimeout(Duration.ofSeconds(Long.parseLong(socketTimeout)))
                .withConnectTimeout(Long.parseLong(connectionTimeout))
                .build();
        return RestClients.create(clientConfiguration).rest();
    }

    @Bean
    public ElasticsearchRestTemplate elasticsearchRestTemplate() throws Exception {
        return new ElasticsearchRestTemplate(elasticsearchClient());
    }

}

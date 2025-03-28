package com.whatsup.handler;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.CreateTopicsResult;
import org.apache.kafka.clients.admin.KafkaAdminClient;

import io.vertx.core.Vertx;
import io.vertx.core.impl.cpu.CpuCoreSensor;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.RoutingContext;
import io.vertx.kafka.admin.NewTopic;

public class NewUserHandler {
    private final Vertx vertx;

    public NewUserHandler(Vertx vertx) {
        this.vertx = vertx;
    }

    public void handler(RoutingContext ctx) {
        System.out.println("Reached new user Handler");
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");

        try {
            final AdminClient client = AdminClient.create(properties);
            System.out.println("Created Admin Client Successfully");

            String topicName = "my-topic-123";
            int partitions = 2;
            short replicationFactor = 1;
            NewTopic newTopic = new NewTopic(topicName, partitions, replicationFactor);



            CreateTopicsResult result = client.createTopics(); // not working

            System.out.println("Topic created successfully");
        } catch (Exception e){
            System.out.println("Failed to create admin client :" + e.getMessage());
        }
        ctx.json(new JsonObject().put("message", "Hello from Handler!"));
    }
}

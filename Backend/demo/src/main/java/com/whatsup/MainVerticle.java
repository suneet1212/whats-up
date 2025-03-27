package com.whatsup;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

public class MainVerticle extends AbstractVerticle {
    @Override
    public void start() {
        vertx.createHttpServer().requestHandler(req -> req.response().end("Hello from Vertx!"))
            .listen(8080, http -> {
                if(http.succeeded()) {
                    System.out.println("Server started on port 8080");
                } else {
                    System.out.println("Failed to start server: " + http.cause());
                }
            });
    }

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new MainVerticle());
    }

}

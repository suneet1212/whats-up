package com.whatsup;

import com.whatsup.router.ApiRouter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class MainVerticle extends AbstractVerticle {
    @Override
    public void start() {
        Router router = ApiRouter.createRouter(vertx);
        vertx.createHttpServer()
            .requestHandler(router)
            .listen(3000, "0.0.0.0", http -> {
                if(http.succeeded()) {
                    System.out.println("HTTP server started on port 3000");
                } else {
                    System.out.println("Error in starting server: " + http.cause());
                }
            });
    }

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new MainVerticle());
    }

}

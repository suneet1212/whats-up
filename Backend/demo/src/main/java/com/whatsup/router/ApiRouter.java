package com.whatsup.router;

import com.whatsup.handler.NewUserHandler;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class ApiRouter {
    public static Router createRouter(Vertx vertx) {
        Router router = Router.router(vertx);

        NewUserHandler newUserHandler = new NewUserHandler(vertx);

        router.get("/api/newUser").handler(newUserHandler.handler);
        router.get("/").handler(req -> {
            System.out.println("Reaced homepage");
            req.response().end("at least u reached here");
        });
        return router;
    }
}

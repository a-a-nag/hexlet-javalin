package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        // Создаем приложение
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });

        app.get("/users/{id}/post/{postid}", ctx -> {
            ctx.result("id: " + ctx.pathParam("id"));
            ctx.result("postid: " + ctx.pathParam("postid"));
        });

        app.start(7070); // Стартуем веб-сервер
    }
}
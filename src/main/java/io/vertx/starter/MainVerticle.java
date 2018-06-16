package io.vertx.starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start() {
    vertx.createHttpServer()
        .requestHandler(req -> req.response().end("Hello Vert.x!"))
        .listen(8080);
  }

  public static void main(String[] args) {
	    Vertx vertx = Vertx.vertx();
	    vertx.deployVerticle(new MainVerticle());
	}
}

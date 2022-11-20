module com.example.demo2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.httpserver;
    requires org.kordamp.bootstrapfx.core;
    requires com.google.api.client.auth;
    requires com.google.api.client.extensions.java6.auth;
    requires com.google.api.client.extensions.jetty.auth;
    requires google.api.client;
    requires com.google.api.client;
    requires com.google.api.client.json.gson;
    requires com.google.api.services.calendar;

    opens com.example.demo2 to javafx.fxml;
    exports com.example.demo2;
}
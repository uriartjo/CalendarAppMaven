package com.example.demo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
import java.security.GeneralSecurityException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        readCal();
        launch();

    }

    public static void readCal() {
        try {
            CalendarQuickstart.readCalendar();
        } catch (IOException e) {
            System.out.println("oh no");
        } catch (GeneralSecurityException e) {
            System.out.println("oh no 2");
        }
    }
}
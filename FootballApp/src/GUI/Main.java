package GUI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.stage.Stage;

public class Main extends Application {

  Image iconImg;

  {
    try {
      iconImg = new Image(
         new FileInputStream("/Users/Krijn/Downloads/Football App/Other photos/championsIcon.png"));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  Image backgroundImg;

  {
    try {
      backgroundImg = new Image(
         new FileInputStream("/Users/Krijn/Downloads/Football App/Other photos/background.jpg"));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  Image headerImg;

  {
    try {
      headerImg = new Image(
         new FileInputStream("/Users/Krijn/Downloads/Football App/Other photos/header.png"));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  @Override
    public void start(Stage primaryStage) {
    ImageView backgroundView = new ImageView(backgroundImg);

    ImageView headerView = new ImageView(headerImg);
    headerView.setX(100);

    Group images = new Group(backgroundView, headerView);

    primaryStage.setTitle("SoccerX");
    primaryStage.setScene(new Scene(images, 500, 750));

    primaryStage.getIcons().add(iconImg);
    primaryStage.show();

  }

  public static void main(String[] args) {
    launch(args);
  }
}

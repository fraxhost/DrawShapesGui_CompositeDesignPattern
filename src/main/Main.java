package main;

import composite.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");
        VBox vBox = new VBox();

        Button lineButton = new Button("Line");
        Button circleButton = new Button("Circle");
        Button rectangleButton = new Button("Rectangle");
        Button flagButton = new Button("Flag");
        Button starButton = new Button("Star");
        Button triangleButton = new Button("Triangle");

        EventHandler<ActionEvent> eventLine = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                AnchorPane anchorPaneLine = new AnchorPane();

                anchorPaneLine.getChildren().add(new ShapeLine(100,100,200,100).draw());

                primaryStage.setScene(new Scene(anchorPaneLine, 500, 500));
            }
        };

        EventHandler<ActionEvent> eventCircle = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                AnchorPane anchorPaneCircle = new AnchorPane();

                anchorPaneCircle.getChildren().add(new ShapeCircle(100,100,50).draw());

                primaryStage.setScene(new Scene(anchorPaneCircle, 500, 500));
            }
        };

        EventHandler<ActionEvent> eventRectangle = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                AnchorPane anchorPaneRectangle = new AnchorPane();

                anchorPaneRectangle.getChildren().add(new ShapeRectangle(50,50,80, 100).draw());

                primaryStage.setScene(new Scene(anchorPaneRectangle, 500, 500));
            }
        };

        EventHandler<ActionEvent> eventFlag = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                AnchorPane anchorPaneFlag = new AnchorPane();

                anchorPaneFlag.getChildren().add(new ShapeFlag(50,50,80, 100).draw());

                primaryStage.setScene(new Scene(anchorPaneFlag, 500, 500));
            }
        };

        EventHandler<ActionEvent> eventTriangle = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                AnchorPane anchorPaneTriangle = new AnchorPane();

                anchorPaneTriangle.getChildren().add(new ShapeTriangle(50,50,100, 100).draw());

                primaryStage.setScene(new Scene(anchorPaneTriangle, 500, 500));
            }
        };

        EventHandler<ActionEvent> eventStar = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                AnchorPane anchorPaneStar = new AnchorPane();

                anchorPaneStar.getChildren().add(new ShapeStar(100,100,100, 100).draw());

                primaryStage.setScene(new Scene(anchorPaneStar, 500, 500));
            }
        };

        lineButton.setOnAction(eventLine);
        circleButton.setOnAction(eventCircle);
        rectangleButton.setOnAction(eventRectangle);
        flagButton.setOnAction(eventFlag);
        triangleButton.setOnAction(eventTriangle);
        starButton.setOnAction(eventStar);

        vBox.getChildren().addAll(
                lineButton, circleButton , triangleButton, rectangleButton, flagButton, starButton);
        vBox.setSpacing(15);
        vBox.setAlignment(Pos.CENTER);

        primaryStage.setScene(new Scene(vBox, 500, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        // Launch
        launch(args);
    }
}

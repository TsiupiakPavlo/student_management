package controllers;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> tbData;

    @FXML
    private TableColumn<?, ?> studentId;

    @FXML
    private TableColumn<?, ?> firstName;

    @FXML
    private TableColumn<?, ?> lastName;

    @FXML
    private Button btnWriteAllStudents;

    @FXML
    private Button btnReadAllStudents;

    @FXML
    private TextField txtStudentId;

    @FXML
    private TextField txtFirstName;

    @FXML
    private Button btnWriteStudent;

    @FXML
    void onClickMethod(ActionEvent event) {

    }

    @FXML
    void initialize() {
        btnWriteAllStudents.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Hello");
            }
        });
    }
}


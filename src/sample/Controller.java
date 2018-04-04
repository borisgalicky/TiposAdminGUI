package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.util.Random;

public class Controller{
    public Button submit_button;
    public TextField login_input;
    public PasswordField password_input;
    public Button generate_button;
    public Label error;
    public Label label1;
    public Label label2;
    public Label label3;
    public Label label4;
    public Label label5;
    private int[]arr;
    public void checkData(ActionEvent actionEvent) throws Exception{
        error.setText("");
        String login=login_input.getText().trim();
        String password=password_input.getText().trim();
        System.out.println(login+" "+password);
        if(login.length()<1 || password.length()<2){
            error.setText("Incorrect login or password!");
        }
        else{
            Stage stage=(Stage)submit_button.getScene().getWindow();
            Parent root=FXMLLoader.load(getClass().getResource("main.fxml"));
            Stage newStage=new Stage();
            newStage.setTitle("TIPOS admin portal");
            newStage.setScene(new Scene(root,600,300));
            newStage.show();
            stage.close();
        }
    }
    public void generateNumbers(ActionEvent actionEvent) throws Exception{
        arr=new int[5];
        Random random=new Random();
        arr[0]=random.nextInt(35)+1;
        int i=1;
        int j=1;
        int k;
        boolean match;
        do{
            arr[j]=random.nextInt(35)+1;
            match=false;
            for(k=0;k<j;k++){
                if(arr[j]==arr[k]){
                    match=true;
                }
            }
            if(match==false){
                j++;
            }
        }
        while(j!=5);
            for(i=0;i<4;i++)
                for(j=0;j<4;j++)
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
        label1.setText(Integer.toString(arr[0]));
        label2.setText(Integer.toString(arr[1]));
        label3.setText(Integer.toString(arr[2]));
        label4.setText(Integer.toString(arr[3]));
        label5.setText(Integer.toString(arr[4]));
    }
}
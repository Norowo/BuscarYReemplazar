package dad.buscaryreemplazar;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazarApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// ui
		
		TextField buscarText = new TextField();
		TextField reemplazarText = new TextField();
		
		CheckBox mayusMinusCheckbox = new CheckBox("Mayúsculas y minúsculas");
		CheckBox expresionRegularCheckbox = new CheckBox("Expresión regular");
		CheckBox buscarHaciaAtrasCheckbox = new CheckBox("Buscar hacia atrás");
		CheckBox resaltarCheckbox = new CheckBox("Resaltar resultados");
		
		Button buscarButton = new Button("Buscar");
		buscarButton.setMaxWidth(Double.MAX_VALUE);
		Button reemplazarButton = new Button("Reemplazar");
		reemplazarButton.setMaxWidth(Double.MAX_VALUE);
		Button reemplazarTodoButton = new Button("Reemplazar todo");
		Button cerrarButton = new Button("Cerrar");
		cerrarButton.setMaxWidth(Double.MAX_VALUE);
		Button ayudaButton = new Button("Ayuda");
		ayudaButton.setMaxWidth(Double.MAX_VALUE);
		
		VBox botonesVBox = new VBox(5, buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton);
		botonesVBox.setPadding(new Insets(5));
		
		GridPane checkboxPane = new GridPane();
		checkboxPane.addRow(0, mayusMinusCheckbox, buscarHaciaAtrasCheckbox);
		checkboxPane.addRow(1, expresionRegularCheckbox, resaltarCheckbox);
		
		GridPane tablePane = new GridPane();
		tablePane.setGridLinesVisible(true);
		tablePane.addRow(0, new Label("Buscar:"), buscarText);
		tablePane.addRow(1, new Label("Reemplazar con:"), reemplazarText);
		tablePane.addRow(2, new Label(""), checkboxPane);
		tablePane.setPadding(new Insets(5));
		tablePane.setVgap(5);
		tablePane.setHgap(5);
		
		
		
		ColumnConstraints [] columns = {
				new ColumnConstraints(),	
				new ColumnConstraints(),	
			};
		tablePane.getColumnConstraints().setAll(columns);
		columns[1].setHgrow(Priority.ALWAYS);
		
		
		BorderPane root = new BorderPane();
		root.setLeft(tablePane);
		root.setRight(botonesVBox);
		
		primaryStage.setScene(new Scene(root, 800, 200));
		primaryStage.show();
		
		

	}

}

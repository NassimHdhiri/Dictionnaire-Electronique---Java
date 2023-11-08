module dicTest {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens dicTest to javafx.graphics, javafx.fxml;
}

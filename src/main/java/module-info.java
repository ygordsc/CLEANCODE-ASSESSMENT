module org.infnet.cleancodeassessment {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    exports org.infnet.cleancodeassessment.domain;
    opens org.infnet.cleancodeassessment.domain to javafx.fxml;
    exports org.infnet.cleancodeassessment.service.frete;
    opens org.infnet.cleancodeassessment.service.frete to javafx.fxml;
    exports org.infnet.cleancodeassessment.domain.interfaces;
    opens org.infnet.cleancodeassessment.domain.interfaces to javafx.fxml;
}
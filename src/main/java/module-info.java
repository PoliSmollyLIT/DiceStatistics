module bg.tuvarna.oop.dicestatistics {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.data.jpa;
    requires jakarta.persistence;
    requires lombok;
    requires spring.boot;
    requires spring.beans;
    requires spring.core;
    requires org.hibernate.validator;

    opens bg.tuvarna.oop.dicestatistics;
    opens bg.tuvarna.oop.persistence.entities;
    opens bg.tuvarna.oop.core.operations;
    opens bg.tuvarna.oop.persistence.repositories;
    exports bg.tuvarna.oop.dicestatistics;
}
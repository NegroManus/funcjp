package de.fuh.seminar1908.funcjp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaSyntax {
    ActionListener listener1 = (ActionEvent e) -> {
        System.out.println("Bumm!");
    };
    ActionListener listener2 = e -> System.out.println("Bumm!");
}

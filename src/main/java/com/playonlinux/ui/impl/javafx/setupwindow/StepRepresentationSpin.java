package com.playonlinux.ui.impl.javafx.setupwindow;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import com.playonlinux.utils.messages.InterrupterAsynchroneousMessage;

public class StepRepresentationSpin extends StepRepresentationMessage {
    public StepRepresentationSpin(JavaFXSetupWindowImplementation parent, InterrupterAsynchroneousMessage messageWaitingForResponse,
                                  String textToShow) {
        super(parent, messageWaitingForResponse, textToShow);
    }


    @Override
    protected void drawStepContent() {
        super.drawStepContent();

        ProgressIndicator progressIndicator = new ProgressIndicator();
        progressIndicator.setLayoutX(230);
        progressIndicator.setLayoutY(100);

        this.addToContentPanel(progressIndicator);
    }

    @Override
    protected void setStepEvents() {
        this.setNextButtonEnabled(false);
    }

}
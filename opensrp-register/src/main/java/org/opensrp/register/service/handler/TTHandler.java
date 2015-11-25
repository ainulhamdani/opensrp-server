package org.opensrp.register.service.handler;

import org.opensrp.form.domain.FormSubmission;
import org.opensrp.register.service.ANCService;
import org.opensrp.service.formSubmission.handler.CustomFormSubmissionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TTHandler implements CustomFormSubmissionHandler {
    private ANCService ancService;

    @Autowired
    public TTHandler(ANCService ancService) {
        this.ancService = ancService;
    }

    @Override
    public void handle(FormSubmission submission) {
        ancService.ttProvided(submission);
    }
}
package org.opensrp.register.service.handler;

import org.opensrp.form.domain.FormSubmission;
import org.opensrp.register.service.ECService;
import org.opensrp.service.formSubmission.handler.CustomFormSubmissionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FPComplicationsHandler implements CustomFormSubmissionHandler {
    private ECService ecService;

    @Autowired
    public FPComplicationsHandler(ECService ecService) {
        this.ecService = ecService;
    }

    @Override
    public void handle(FormSubmission submission) {
        ecService.reportFPComplications(submission);
    }
}
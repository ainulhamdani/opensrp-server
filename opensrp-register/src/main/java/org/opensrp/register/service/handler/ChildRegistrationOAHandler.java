package org.opensrp.register.service.handler;

import org.opensrp.form.domain.FormSubmission;
import org.opensrp.register.service.ChildService;
import org.opensrp.service.formSubmission.handler.CustomFormSubmissionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChildRegistrationOAHandler implements CustomFormSubmissionHandler {
    private ChildService childService;

    @Autowired
    public ChildRegistrationOAHandler(ChildService childService) {
        this.childService = childService;
    }

    @Override
    public void handle(FormSubmission submission) {
        childService.registerChildrenForOA(submission);
    }
}
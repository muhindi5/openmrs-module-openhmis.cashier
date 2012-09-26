/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.openhmis.cashier.web.controller;

import java.util.Set;

import org.openmrs.Patient;
import org.openmrs.PatientIdentifier;
import org.openmrs.api.PatientService;
import org.openmrs.api.context.Context;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/module/openhmis/cashier/bill.form")
public class BillAddEditController {
	
	@RequestMapping(method = RequestMethod.GET)
	public void bill(ModelMap model, @RequestParam(value = "patientId", required = false) Integer patientId) {
		Patient patient = null;
		String patientIdentifier = null;
		if (patientId != null) {
			PatientService service = Context.getPatientService();
			patient = service.getPatient(patientId);
			Set<PatientIdentifier> identifiers = patient.getIdentifiers();
			for (PatientIdentifier id : identifiers)
				if (id.getPreferred()) patientIdentifier = id.getIdentifier();
		}
		model.addAttribute("patient", patient);
		model.addAttribute("patientIdentifier", patientIdentifier);
	}

}
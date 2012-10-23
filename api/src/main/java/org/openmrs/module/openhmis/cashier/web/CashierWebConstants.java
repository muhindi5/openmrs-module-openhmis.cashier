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
package org.openmrs.module.openhmis.cashier.web;

public class CashierWebConstants {
	public static final String MODULE_ROOT = "/module/openhmis/cashier/";

	public static final String RECEIPT_NUMBER_GENERATOR_CONFIGURATION_PAGE = MODULE_ROOT + "admin/receiptNumberGenerator";
	public static final String SEQ_RECEIPT_NUMBER_GENERATOR_CONFIGURATION_PAGE = MODULE_ROOT + "admin/seqReceiptNumberGenerator";

	public static final String TIMESHEET_PAGE = MODULE_ROOT + "timesheet";
	public static final String TIMESHEET_ENTRY_PAGE = TIMESHEET_PAGE + "Entry";

	public static final String BILL_PAGE = MODULE_ROOT + "bill";

	public static String formUrl(String page) {
		return page.endsWith(".form") ? page : page + ".form";
	}

	public static String redirectUrl(String page) {
		return "redirect:" + formUrl(page);
	}
}
UPDATE patient SET patient.last_modified = (select patient_status.last_modified from patient_status WHERE patient.id = patient_status.id);
UPDATE patient SET patient.last_modified_by = (select patient_status.last_modified_by from patient_status WHERE patient.id = patient_status.id);
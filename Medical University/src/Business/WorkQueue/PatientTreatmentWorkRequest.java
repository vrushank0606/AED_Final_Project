/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ankitaindi
 */
public class PatientTreatmentWorkRequest extends WorkRequest {

    private String registrationDate;
    private String reasonForVisit;
    private Patient patient;
    private String labTestType;
    private String labResult;
    private UserAccount labAssistant;
    private String labTestMessage;
    private String prescription;
    private double billAmount;
    private UserAccount assignedDoctor;
    private UserAccount studentAssistant;
    private String caseStudyStatus;
    private String caseStudyResult;
    private String caseStudyType;
    private String caseStudyStudentMedicalPractice;

    

  
    public PatientTreatmentWorkRequest(String Date, String reasonForVisit, Patient patient) {
        this.registrationDate = Date;
        this.reasonForVisit = reasonForVisit;
        this.patient = patient;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String Date) {
        this.registrationDate = Date;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getLabTestType() {
        return labTestType;
    }

    public void setLabTestType(String labTestType) {
        this.labTestType = labTestType;
    }

    public String getLabResult() {
        return labResult;
    }

    public void setLabResult(String labResult) {
        this.labResult = labResult;
    }

    public UserAccount getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(UserAccount labAssistant) {
        this.labAssistant = labAssistant;
    }

    public String getLabTestMessage() {
        return labTestMessage;
    }

    public void setLabTestMessage(String labTestMessage) {
        this.labTestMessage = labTestMessage;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public UserAccount getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(UserAccount assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    public UserAccount getStudentAssistant() {
        return studentAssistant;
    }

    public void setStudentAssistant(UserAccount studentAssistant) {
        this.studentAssistant = studentAssistant;
    }

    public String getCaseStudyStatus() {
        return caseStudyStatus;
    }

    public void setCaseStudyStatus(String caseStudyStatus) {
        this.caseStudyStatus = caseStudyStatus;
    }
  
    public String getCaseStudyResult() {
        return caseStudyResult;
    }

    public void setCaseStudyResult(String caseStudyResult) {
        this.caseStudyResult = caseStudyResult;
    }
    
    public String getCaseStudyType() {
        return caseStudyType;
    }

    public void setCaseStudyType(String caseStudyType) {
        this.caseStudyType = caseStudyType;
    }

    public String getCaseStudyStudentMedicalPractice() {
        return caseStudyStudentMedicalPractice;
    }

    public void setCaseStudyStudentMedicalPractice(String caseStudyStudentMedicalPractice) {
        this.caseStudyStudentMedicalPractice = caseStudyStudentMedicalPractice;
    }
    
    
    @Override
    public String toString() {
        return reasonForVisit;
    }

}

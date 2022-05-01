package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HealthCenterEnterprise;
import Business.Enterprise.InsuranceCompanyEnterprise;
import Business.Insurance.Insurance;
import Business.InsuranceCustomer.InsuranceCustomer;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Role.AccountantRole;
import Business.Role.DoctorRole;
import Business.Role.EnterpriseAdminRole;
import Business.Role.InsuranceAgentRole;
import Business.Role.InsuranceFinanceManagerRole;
import Business.Role.InsurancePolicyPlannerRole;
import Business.Role.LabAssistantRole;
import Business.Role.ProfessorRole;
import Business.Role.Role;
import Business.Role.StudentRole;
import Business.WorkQueue.PatientTreatmentWorkRequest;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem ecosystem = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = ecosystem.getEmployeeDirectory().createEmployee("sysadmin");
        
        UserAccount userAccount = ecosystem.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        
        
        Network network = ecosystem.createAndAddNetwork();
        
        ecosystem.getNetworks().get(0).setName("network alpha");
        
        network.getEnterpriseDirectory().createAndAddEnterprise("HealthCenter", Enterprise.EnterpriseType.HealthCenter);
        network.getEnterpriseDirectory().createAndAddEnterprise("InsuranceCompany", Enterprise.EnterpriseType.InsuranceCompany);
        network.getEnterpriseDirectory().createAndAddEnterprise("University", Enterprise.EnterpriseType.University);
        
        for(Enterprise e: network.getEnterpriseDirectory().getEnterpriseList()) {
            Employee emppp = e.getEmployeeDirectory().createEmployee(e.getName() + "admin");
            e.getUserAccountDirectory().createUserAccount(e.getName() + "Admin", "admin", emppp, new EnterpriseAdminRole());

            
            if (e.getEnterpriseType() == Enterprise.EnterpriseType.HealthCenter) {
                e.getOrganizationDirectory().createOrganization(Organization.Type.Lab);
                 e.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
                  e.getOrganizationDirectory().createOrganization(Organization.Type.Accountant);
            }
            
             if (e.getEnterpriseType() == Enterprise.EnterpriseType.HealthCenter) {
                 for(Organization o: e.getOrganizationDirectory().getOrganizations()) {
                     
                     if(o.getName() == Organization.Type.Doctor.getValue()) {
                         Employee emp = ecosystem.getEmployeeDirectory().createEmployee("docter");
                         o.getUserAccountDirectory().createUserAccount("DoctorUser", "admin", emp, new DoctorRole());
                     }
                     
                      if(o.getName() == Organization.Type.Lab.getValue()) {
                         Employee emp = ecosystem.getEmployeeDirectory().createEmployee("lab");
                         o.getUserAccountDirectory().createUserAccount("LabUser", "admin", emp, new LabAssistantRole());
                     }
                      
                       if(o.getName() == Organization.Type.Accountant.getValue()) {
                         Employee emp = ecosystem.getEmployeeDirectory().createEmployee("accountant");
                         o.getUserAccountDirectory().createUserAccount("AccUser", "admin", emp, new AccountantRole());
                         
                         
                     }
                 }
             }
            
            
            if (e.getEnterpriseType() == Enterprise.EnterpriseType.InsuranceCompany) {
                 e.getOrganizationDirectory().createOrganization(Organization.Type.InsuranceAgent);
                  e.getOrganizationDirectory().createOrganization(Organization.Type.InsuranceFinanceOrganization);
                   e.getOrganizationDirectory().createOrganization(Organization.Type.InsurancePolicyPlanner);
            }
            
            if (e.getEnterpriseType() == Enterprise.EnterpriseType.InsuranceCompany) {
                 for(Organization o: e.getOrganizationDirectory().getOrganizations()) {
                     
                     if(o.getName() == Organization.Type.InsuranceAgent.getValue()) {
                         Employee emp = ecosystem.getEmployeeDirectory().createEmployee("iagent");
                         o.getUserAccountDirectory().createUserAccount("AgentUser", "admin", emp, new InsuranceAgentRole());

                         
                     }
                     
                      if(o.getName() == Organization.Type.InsuranceFinanceOrganization.getValue()) {
                         Employee emp = ecosystem.getEmployeeDirectory().createEmployee("finance");
                         o.getUserAccountDirectory().createUserAccount("FinanceUser", "admin", emp, new InsuranceFinanceManagerRole());
                     }
                      
                       if(o.getName() == Organization.Type.InsurancePolicyPlanner.getValue()) {
                         Employee emp = ecosystem.getEmployeeDirectory().createEmployee("policy");
                         o.getUserAccountDirectory().createUserAccount("PolicyUser", "admin", emp, new InsurancePolicyPlannerRole());
                         
                         InsuranceCompanyEnterprise insuranceCompanyEnterprise = (InsuranceCompanyEnterprise) e;
                         
                          Insurance insurance = new Insurance("insuranceA", insuranceCompanyEnterprise.getName(), 0);
                            insurance.setPolicyTC("policytc");
                            insurance.setMonthlyPremium(1200000);

                            insuranceCompanyEnterprise.getInsurancePolicyDirectory().getPolicies().add(insurance);
                            
                            
                         
                         
                         
                            InsuranceCustomer insuranceCustomer = new InsuranceCustomer(insurance, "abcdefgh1234");

                            insuranceCustomer.setCustomerFirstName("kri");
                             insuranceCustomer.setCustomerLastName("kri");
                            insuranceCustomer.setDateOfBirth("07/16/1990");
                            insuranceCustomer.setGender("female");
                            insuranceCustomer.setSsn("56565");
                             insuranceCustomer.setPhoneNumber("201");
                             insuranceCustomer.setAddress("30 alls");

                             insuranceCustomer.setInsurance(insurance);
                            insuranceCompanyEnterprise.getInsuranceCustomerDirectory().getInsuranceCustomers().add(insuranceCustomer);
                            
                            
                            
                            
                            Patient patient = new Patient();
            
                            patient.setAppointmentDate("---");
                            patient.setPatientId("123");
                            patient.setPatientFirstName("abc");
                            patient.setPatientLastName("def");
                            patient.setGender("male");
                            patient.setPatientEmail("aaaa@gmail.com");

                            patient.setContactNumber("9999");
                            patient.setPatientAge("10");
                            patient.setSocialSecurityNumber("999");
                            patient.setAddress("123");

                            patient.setInsuranceCustomer(insuranceCustomer);

                            HealthCenterEnterprise healthCenterEnterprise = (HealthCenterEnterprise) network.getEnterpriseDirectory().getEnterpriseList().get(0);
                            healthCenterEnterprise.getPatientDirectory().getPatients().add(patient);

                            PatientTreatmentWorkRequest patientTreatmentWorkRequest = new PatientTreatmentWorkRequest("--", "---", patient);
                            patientTreatmentWorkRequest.setStatus("Waiting for Doctor");
                            patientTreatmentWorkRequest.setCaseStudyStatus("SentToStudent");
                            //   patientTreatmentWorkRequest.setSender(userAccount);

                            Organization org = null;
                            
                            for(Enterprise en: network.getEnterpriseDirectory().getEnterpriseList()) {
                                for (Organization orgs : en.getOrganizationDirectory().getOrganizations()) {
                
                                if (orgs instanceof DoctorOrganization) {
                                    org =  orgs;
                                    break;
                                }
                            }
        }
                            
                            if (org != null) {
                                org.getWorkQueue().getWorkRequests().add(patientTreatmentWorkRequest);
                                userAccount.getWorkQueue().getWorkRequests().add(patientTreatmentWorkRequest);
                            }



                                     }
                                 }
                             }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            if (e.getEnterpriseType() == Enterprise.EnterpriseType.University) {
                e.getOrganizationDirectory().createOrganization(Organization.Type.Professor);
                e.getOrganizationDirectory().createOrganization(Organization.Type.Student);
            }
            
            if (e.getEnterpriseType() == Enterprise.EnterpriseType.University) {
                 for(Organization o: e.getOrganizationDirectory().getOrganizations()) {
                     
                     if(o.getName() == Organization.Type.Professor.getValue()) {
                         Employee emp = ecosystem.getEmployeeDirectory().createEmployee("prof");
                         o.getUserAccountDirectory().createUserAccount("ProfUser", "admin", emp, new ProfessorRole());
                     }
                     
                      if(o.getName() == Organization.Type.Student.getValue()) {
                         Employee emp = ecosystem.getEmployeeDirectory().createEmployee("student");
                         o.getUserAccountDirectory().createUserAccount("StudentUser", "admin", emp, new StudentRole());
                     }
                      

                 }
             }
            
            
            
            
        }
        
        
        return ecosystem;
    }
    
}

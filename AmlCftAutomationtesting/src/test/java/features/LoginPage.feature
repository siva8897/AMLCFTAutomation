@tag
Feature: AMLCFT Application Feature 

 
  Scenario: AMLCFT Login page Details
    Given Login into AMLCFT Application
    When  User login into appliction username is "fscuser1"
    And User login into application password is "Admin@123"
    And User clicked on the Sign in button
    Then Home page should be opend
    
    
    Scenario: Approve Users Details
    
    Given Approve User Details page
    And Approve User page clicked on UserName 
    And Approve User page clicked on Select All checkbox 
    And Approve User page clicked on Close button
     
    
    Scenario: Approved Users Details
    Given Approved User Detals page
    When Approved User page clicked on Approved Users button
    And Approved User page clicked on User name element
    And Approved User page clicked close button
    
    
    
    Scenario: Create Internal User
    Given Create Interal User Details
    When User clicked on the Menu button
    And User clicked on the Internal User button
    And VerifyInteralUserTitle
    And User Create Interal Userss page UserId is "Siva888"
    And User Create Interal Userss page First Name "Siva"
    And User Create Interal Userss page Last Name "lingala"
    And User Create Interal Userss page Email "Siva.lingala@Radiant.digital"
    And User Create Interal Userss page Phone Number "9854745474"
    And User Create Interal Userss page select Role option
    And User Crate Interal Userss page clicked on Reset button
    
    
    
    Scenario: Returns Extension Details
    Given Point to Returns Extension Details
    When User is clicked on the Menu button
    And User clicked on the Returns Extension 
    And Return extension page select Comany Number option
    And Return extension page select Licence Number option 
    
    Scenario: Upload Excel Returns Details
    When Point to Upload Excel Returns 
    And Upload Excel Return User has clicked on Upload Returns 
    And Upload Excel Return page Company Number "1000201"
    And Upload Excel Return page Enter Choose file name "C:\Users\hp\Downloads\Bulk Registration Insolvency_sam (1).xlsx"
    And Upload Excel Return page clicked on Upload button
    Then Upload Excel Return page file uploaded sucssfully.
    
    Scenario: Update Company Details
    Given Ponit to Update company details
    When User has clicked on the Menu button
    And User clicked on update company details
    And Update Company profile page select company number option
    And Update Company profle page select Licence Number option
    
    Scenario: Update User Details
    Given Point ot Update User Details
    When User has clicked on the menu button
    And User clicked on update user details
    And Update User page select Userid option
    
   
    Scenario: Logout Details
    Given Application Logout Details
    When User clciked on Logout logo
    And User has clicked on logout button 
 
     @Smoketest
    Scenario: New User Registration Details
    Given New User Registration 
    And User clicked on New User Registration link
    And User Registration page FirstName "Tom"
    And User Registration page LastName "Latham"
    And User Registration page E-Mail "TomLatham@gmail.com"
    And User Registration page Telephone "8978741585"
    And User Registration page UserId "Tom1234"
    And User Registration page Password "Latham@1234"
    And User Registration page ConfirmPassword "Latham@1234"
    And User Registration page Higlight add another liceness button
    And User Registration page select Company Number option
    And User Registration page select Licence Number option
    And User registration page User clicked on Register button
    And User registration page User has clicked on Home page button
    
    Scenario: login page Details
    Given Login into application
    And  User enters valid username is "Puneeth1234"
    And User enter valid password is "Puneeth@1234"
    And User has clicked on Sing in button
    
    Scenario: AMLCFT Returns Details Dashboard 
    
    Given User has clicked on Submit New Return button
    And User has enter Comapney Number Option
    And User has enter Reporting Peroid Option
    And User Return page clicked on GOVERNANCE button
    And User Governace page select Board Meetings option
    And User Governace page select Senior Managements option
    And User Governace page select Board Meetings1 option
    And User Governace page select Senior Management Meetings2 option
    And User Governace page select Policies option
    And User Governace page select Procedures option
    And User Governace page select Was the review conducted internally or by a third party option
    And User Governace page select AML/CFT systems and controls option
    And User Governace page select AML/CFT systems and controls presented to the Borad option
    And User Governace page select Risks for all of its buiness line option
    And User Governace page select Board approve the risk assessment option
    And User Governace page select Products/Service option
    And User Governace page select Customers option
    And User Governace page select Geography option
    And User Governace page select Distribution channels option
    And User Governace page select Overall licensee rating option
    And User Governace page clicked on Record keeping button
    
    Scenario: AMLCFT Returns Record keeping Details
    
    Given User has on Record keeping page
    And User Record Keeping page select AMLTFCOP option
    And User Record Keeping page clciked on Intranet Site option
    And User Record Keeping page Select procedures record retention option
    And User Record Keeping page Select Virgin Islands option
    And User Record Keeping page Select licensee include transation record option
    And User Record Keeping page Select retrievable format option
    And User Record Keeping page Select licensee's records held option
    And User Record Keeping page User clicked on Risk profile button
    
    Scenario: User has on Risk Profile Exposure Details
    
    Given User has on Risk Profile exposure page
    And User Risk Profile page select Products option
    And User Risk Profile page select Services option
    And User Risk Profile page PS select High option
    And User Risk Profile page PS select Medium option
    And User Risk Profile page PS select Low option
    And User Risk Profile page PS select Distribution Channels option
    And User Risk Profile page PS Customer Exposure select High option 
    And User Risk Profile page PS Customer Exposure select Medium option
    And User Risk Profile page PS Customer Exposure select Low option
    And User Risk Profile page select Retail option
    And User Risk Profile page select Insitutional option
    And User Risk Profile page select Professional option
    And User Risk Profile page select Percentage of licensee option
    And User Risk Profile page select Specific risk management option
    And User Risk Profile page select percentage option
    And User Risk Profile page select percentage transation option
    And User Risk Profile page select CDD with the last months option
    And User Risk Profile page select CDD with the incomplete CDD option
    And User Risk Profile page PEPs select  identity whether customers PEps option
    And User Risk Profile page PEPs select PEP screening option
    And User Risk Profile page PEps select persons idenentified as PEps option
    And User Risk Profile page PEps select cutomer base PEPs option 
    And User Risk Profile page PEps select identified PEPs have NOT option
    And User Risk Profile page PEps select classifed as PEP option
    And User Risk Profile page PEPs select UN option
    And User Risk Profile page PEPs select Automatically option
    And User Risk Profile page PEPs select Screening conducted option
    And User Risk Profile page added to sanctions option
    And User Risk Profile has clickd on Risk monitoring button
    
    Scenario: User has on Risk monitoring Details
    
    When User is on Risk monitoring details page
    And User Risk monitoring page clicked on ML/TF checkbox
    And User Risk monitoring page clicked on AMLTFCOP checkbox
    And User Risk monitoring page clicked on ECDD checkbox
    And User Risk monitoring page clicked on Lawful purpose checkbox
    And User Risk monitoring page clicked on AMLCFT requirment checkbox
    And User Risk monitoring page select client files option 
    And User Risk monitoring page clicked on Application for business checkbox
    And User Risk monitoring page select group structure relied option
    And User Risk monitoring page select currently have place option
    And User Risk monitoring page select group realted option 
    And User Risk monitoring page select AML Legislation option
    And User Risk monitoring page select Third Party option
    And User Risk monitoring page AML/CFT option
    And User Risk monitoring page Without delay option
    And User Risk monitoring page With the AMLTFCOP option
    And User Risk monitoring page Arrangements option
    And User Risk monitoring page licensee due option
    And User Risk monitoring page licensee businees option
    And User Risk monitoring page Due to incomplete CDD option
    And User Risk monitoring page Terminted option
    And User Risk monitoring page clicked on Georgrapic exposusre button 
    
    Scenario: User has on Geographic Exposure detials
    
    When User Geographic Exposure select Country option
    And User Geographic Exposure clicked on Add Jurisdiction link
    And User Geographic Exposure select Countrysecond option
    And User Geographic Exposure clicked on Sars button
    
   Scenario: User has on Suspicious Activity Reporting detials 
   
   When User has on SARS details page
   And User SARS page reported to the MLRO last month "24"
   And User SARS page SARS being filed with the FIA "64"
   And User SARS page select documented in each instance option
   And User SARS page value of associated transaction "84"
   And User SARS page select suspicious activity option
   And User SARS page select analyse a suspicious option
   And User SARS page clicked on other issues button
   
   Scenario: User has on Other Issues page
   
   When User Other Issues page details page
   And User Other Issues page clicked on NO button
   And User Other Issues page clicked on Declaration button
   
   Scenario: User has on Declaration page
   
   When User Declaration page clicked on Accept the declartion button
   And User Declaration page clicked on Submit button 
   
   Scenario: AMLCFT Logout Details
   Given AMLCFT Application Logout Details
   When AMLCFT User clciked on Logout logo
   And AMLCFT User has clicked on logout button
   
   
   Scenario: AMLCFT login page Details
    Given AMLCFT Login into application
    And AMLCFT User enters valid username is "Root888"
    And AMLCFT User enter valid password is "Root@1234"
    And AMLCFT User has clicked on Sing in button
    
   
    Scenario: Resubmit Return Details
    
    Given AMLCFT Access to Resubmit Return page
    And Resubmit Return page user has clicked on company number
    And General page user has clicked on Edit and Re-submit Return button
    And General page User has select on Reporting Period option
    And Declaration page User clicked on Declaration button
    And Declaration page User enter data Amendments to the Retuns is "Reporint Period changed"
    
   
   
   
    
    
    
    
    
    
   

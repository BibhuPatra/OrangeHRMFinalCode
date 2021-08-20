package com.test_runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Orangehrmpagefactory {
        WebDriver driver;
		@FindBy(name="txtUsername")
		@CacheLookup
		WebElement username99;

		@FindBy(name="txtPassword")
		@CacheLookup
		WebElement password99;

		@FindBy(id="btnLogin")
		@CacheLookup
		WebElement loginButton;

		@FindBy(id="menu_pim_viewPimModule")
		@CacheLookup
		WebElement PIMButton;

		@FindBy(xpath="//*[@id='empsearch_employee_name_empName']")
		@CacheLookup
		WebElement employeeNameField;

		@FindBy(xpath="//*[@id='empsearch_id']")
		@CacheLookup
		WebElement employeeIdField;

		@FindBy(id="searchBtn")
		@CacheLookup
		WebElement searchButton;
		//for deleting record we use checkbox1
		@FindBy(xpath="//*[@id='ohrmList_chkSelectAll']")
		@CacheLookup
		WebElement checkBox1;

		@FindBy(id="btnDelete")
		@CacheLookup
		WebElement deleteButton;

		@FindBy(id="dialogDeleteBtn")
		@CacheLookup
		WebElement dialogueBoxOkButton;
		//adding records addbutton is to be clicked
		@FindBy(name="btnAdd")
		@CacheLookup
		WebElement addButton;

		@FindBy(name="firstName")//in adding record
		@CacheLookup
		WebElement firstNameField;

		@FindBy(name="lastName")
		@CacheLookup
		WebElement lastNameField;
		@FindBy(xpath="//*[@id='employeeId']")
		@CacheLookup
		WebElement employeeId;

		@FindBy(xpath="//*[@id='chkLogin']")//checkbox in adding record
		@CacheLookup
		WebElement checkBox2;

		@FindBy(name="user_name")//username in adding record
		@CacheLookup
		WebElement usernameField;

		@FindBy(name="user_password")//password in adding record
		@CacheLookup
		WebElement passwordField;

		@FindBy(name="re_password")//confirm password
		@CacheLookup
		WebElement confirmPasswordField;

		@FindBy(id="btnSave")//saving the added details in ADD
		@CacheLookup
		WebElement saveButton1;//this button is for adding mandatory details

		//editoption
		@FindBy(xpath="//*[@id='btnSave']")
		@CacheLookup
		WebElement editButton;//edit option for adding non mandatory details

		@FindBy(xpath="//*[@id='personal_optGender_1']")
		@CacheLookup
		WebElement maleRadioButton;

		@FindBy(xpath="//*[@id='personal_optGender_2']")
		@CacheLookup
		WebElement femaleRadioButton;

		@FindBy(xpath="//*[@id='btnSave']")
		@CacheLookup
		WebElement saveButton2;//this save is for saving non mandatory details

		@FindBy(id="welcome")
		@CacheLookup
		WebElement welcomeField;//for loging out first clickon welcome field

		@FindBy(xpath="//*[@id='welcome-menu']/ul/li[3]")
		@CacheLookup
		WebElement logoutField;

		public Orangehrmpagefactory (WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
		}

		public WebElement fieldUname(){
		return username99;
		}

		public void setUname(String uname)
		{
		this.username99.sendKeys(uname);
		}

		public WebElement fieldPassword(){
		return password99;
		}

		public void setPassword(String password)
		{
		this.password99.sendKeys(password);
		}

		public WebElement loginField(){
		return loginButton;
		}

		public void clickLogin()
		{
		this.loginButton.click();
		}

		public WebElement fieldPIM(){
		return PIMButton;
		}

		public void clickPIM()
		{
		this.PIMButton.click();
		}

		public WebElement fieldEname()
		{
		return employeeNameField;
		}

		public void enterEname(String ename)//entering employee name
		{
		this.employeeNameField.sendKeys(ename);
		}

		public WebElement fieldEid(){
		return employeeIdField;
		}

		public void enterId(String Eid)//entering employee id
		{
		this.employeeIdField.sendKeys(Eid);
		}

		public WebElement fieldsearch(){
		return searchButton;
		}

		public void clickSearch()//clicking on search
		{
		this.searchButton.click();
		}

		public WebElement fieldCheckbox1()//this checkbox1 is for selecting the record which is to b deleted
		{
		return checkBox1;
		}

		public void clickCheckBox1()
		{
		this.checkBox1.click();
		}

		public WebElement fieldDelete()//for clicking on delete to delete record
		{
		return deleteButton;
		}

		public void clickDelete()
		{
		this.deleteButton.click();
		}

		public WebElement fieldDialogueBoxOk()//for clicking on ok in dialogue box
		{
		return dialogueBoxOkButton;
		}

		public void clickDialogueBoxOk()
		{
		this.dialogueBoxOkButton.click();
		}

		public WebElement fieldAdd()
		{
		return addButton;
		}

		public void clickAdd()//for adding record click on add
		{
		this.addButton.click();
		}

		public WebElement fieldFirstName()
		{
		return firstNameField;
		}

		public void enterFirstName1(String firstname1)//for entering firstname in adding record
		{
		this.firstNameField.sendKeys(firstname1);
		}

		public WebElement fieldLastName()
		{
		return lastNameField;
		}

		public void enterLastName1(String lastname1)//for entering lastname in adding record
		{
		this.lastNameField.sendKeys(lastname1);
		}
		public WebElement employeeid()
		{
			return employeeId;
		}
		public void clearid()
		{
			this.employeeId.clear();
		}
		public void enteremployeeid(String empid)
		{
			this.employeeId.sendKeys(empid);
		}
		

		public WebElement fieldCheckBox2()
		{
		return checkBox2;
		}

		public void clickCheckBox2()//this checkbox2 for chicking the checkbox which is in ADD
		{
		this.checkBox2.click();
		}

		public WebElement fieldUsername1()
		{
		return usernameField;
		}

		public void enterUsername1(String username1)//entering username in ADD
		{
		this.usernameField.sendKeys(username1);
		}

		public WebElement fieldPassword1()
		{
		return passwordField;
		}

		public void enterPassword1(String password1)//entering password in ADD
		{
		this.passwordField.sendKeys(password1);
		}

		public WebElement fieldConfirmPassword1()
		{
		return confirmPasswordField;
		}

		public void enterConfirmPassword(String password2)
		{
		this.confirmPasswordField.sendKeys(password2);
		}

		public WebElement fieldSave1()//save1 is for saving non mandatory details
		{
		return saveButton1;
		}

		public void clickSave()
		{
		this.saveButton1.click();
		}

		public WebElement fieldEditButton()//clicking edit for entering non mandatory details
		{
		return editButton;
		}

		public void clickEditButton()
		{
		this.editButton.click();
		}

		public WebElement MaleRadioButton()
		{
		return maleRadioButton;
		}

		public void clickRadioMale()
		{
		this.maleRadioButton.click();
		}

		public WebElement FemaleRadioButton()
		{
		return femaleRadioButton;
		}

		public void clickRadioFemale()
		{
		this.femaleRadioButton.click();
		}

		public WebElement fieldSave2()//save2 is for saving non mandatory details
		{
		return saveButton2;
		}

		public void clickSave2()
		{
		this.saveButton2.click();
		}

		public WebElement fieldWelcome()
		{
		return welcomeField;
		}

		public void clickWelcomeField()
		{
		this.welcomeField.click();
		}

		public WebElement fieldLogout(){
		return logoutField;
		}

		public void clickLogout()
		{
		this.logoutField.click();
		}
		}
	


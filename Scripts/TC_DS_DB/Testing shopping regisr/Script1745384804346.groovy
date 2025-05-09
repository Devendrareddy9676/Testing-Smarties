import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import keywords


WebUI.openBrowser('https://demowebshop.tricentis.com/')

WebUI.click(findTestObject('OR_Demo_shopping/Page_Demo Web Shop/a_Log in'))

WebUI.click(findTestObject('OR_Demo_shopping/Page_Demo Web Shop. Login/input_New Customer_button-1 register-button'))

WebUI.click(findTestObject('OR_Demo_shopping/Page_Demo Web Shop. Register/register/input_Gender_Gender'))

WebUI.setText(findTestObject('OR_Demo_shopping/Page_Demo Web Shop. Register/register/input_First name_FirstName'), Firstname )

WebUI.setText(findTestObject('OR_Demo_shopping/Page_Demo Web Shop. Register/register/input_Last name_LastName'), Lastname)

WebUI.setText(findTestObject('OR_Demo_shopping/Page_Demo Web Shop. Register/register/input_Email_Email'), Email)

WebUI.setText(findTestObject('OR_Demo_shopping/Page_Demo Web Shop. Register/register/input_Password_Password'), Password)

WebUI.setText(findTestObject('OR_Demo_shopping/Page_Demo Web Shop. Register/register/input_Confirm password_ConfirmPassword'), Confirmpassword)

WebUI.click(findTestObject('OR_Demo_shopping/Page_Demo Web Shop. Register/register/input__register-button'))


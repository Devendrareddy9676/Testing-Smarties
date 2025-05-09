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

WebUI.callTestCase(findTestCase('TC_Search_function'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Java1610'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Junior Account Assistant'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1_2'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_mandaAJohn user'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Admin'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 'admin')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_-- Select --'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Admin'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input'), 'Satish Kumar Marisetty')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_-- Select --_1'))

WebUI.doubleClick(findTestObject('Object Repository/Page_OrangeHRM/input'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input'), 'Satish Kumar Marisetty')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Enabled'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_System UsersUsernameUser RoleAdminEmplo_2e89bd'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Search'))

WebUI.closeBrowser()


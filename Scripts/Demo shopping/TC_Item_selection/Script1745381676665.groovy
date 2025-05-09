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

WebUI.callTestCase(findTestCase('Demo shopping/TC_User_register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR_Demo_shopping/Page_Demo Web Shop. Register/a_Computers'))

WebUI.navigateToUrl('https://demowebshop.tricentis.com/computers')

WebUI.click(findTestObject('Object Repository/OR_Demo_shopping/Page_Demo Web Shop. Computers/div_Desktops_picture'))

WebUI.click(findTestObject('Object Repository/OR_Demo_shopping/Page_Demo Web Shop. Computers/img'))

WebUI.click(findTestObject('Object Repository/OR_Demo_shopping/Page_Demo Web Shop. Notebooks/input_Unique Asian-influenced imprint wraps_3d4071'))

WebUI.click(findTestObject('Object Repository/OR_Demo_shopping/Page_Demo Web Shop. Notebooks/span_Wishlist'))

WebUI.click(findTestObject('Object Repository/OR_Demo_shopping/Page_Demo Web Shop. Wishlist/a_Accessories'))

WebUI.click(findTestObject('Object Repository/OR_Demo_shopping/Page_Demo Web Shop. Accessories/div_Filter by price'))

WebUI.click(findTestObject('Object Repository/OR_Demo_shopping/Page_Demo Web Shop. Accessories/input_TCP Coaching day, added to TCP Instru_758b40'))

WebUI.click(findTestObject('Object Repository/OR_Demo_shopping/Page_Demo Web Shop. TCP/a_Digital downloads'))

WebUI.click(findTestObject('Object Repository/OR_Demo_shopping/Page_Demo Web Shop. Digital downloads/li_Tricentis'))

WebUI.closeBrowser()


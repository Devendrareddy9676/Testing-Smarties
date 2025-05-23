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

/*open browser
navigate to "https://academy.katalon.com/learning-path/"
close browser
*/
// Open a browser
WebUI.openBrowser('')

// Navigate to the specified URL
WebUI.navigateToUrl('https://academy.katalon.com/learning-path/')

// Close the browser
WebUI.closeBrowser()

WebUI.openBrowser('' // Opens a new browser
    )

WebUI.navigateToUrl('https://academy.katalon.com/learning-path/' // Navigates to the Katalon Academy learning path
    )

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/digital-downloads')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC_Demoshopping/Page_Demo Web Shop. Digital downloads/select_4812'), 
    'https://demowebshop.tricentis.com/digital-downloads?pagesize=12', true)

WebUI.click(findTestObject('Object Repository/TC_Demoshopping/Page_Demo Web Shop. Digital downloads/li_Jewelry'))

WebUI.click(findTestObject('Object Repository/TC_Demoshopping/Page_Demo Web Shop. Digital downloads/a_Gift Cards'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TC_Demoshopping/Page_Demo Web Shop. Gift Cards/select_PositionName A to ZName Z to APrice _c128dc'), 
    'https://demowebshop.tricentis.com/gift-cards?orderby=6', true)


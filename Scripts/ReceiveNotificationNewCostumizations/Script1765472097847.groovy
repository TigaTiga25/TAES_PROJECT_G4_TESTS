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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:5173/')

WebUI.setText(findTestObject('LoginPage/inputEmail'), 'pa@mail.pt')

WebUI.setEncryptedText(findTestObject('LoginPage/inputPassword'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('LoginPage/loginButton'))

WS.sendRequest(findTestObject('Admin_Announce_Item'))

WebUI.delay(16)

WebUI.verifyElementPresent(findTestObject('NavBar/span_New_Notifications'), 5)

WebUI.click(findTestObject('Object Repository/NavBar/button_Notifications'))

WebUI.click(findTestObject('NavBar/div_New_Notification'))

//String currentUrl = WebUI.getUrl()

//WebUI.verifyMatch(currentUrl, 'http://localhost:5173/customizations?tab=shop&category=decks', false)

WebUI.verifyTextPresent('Shop', false)

WebUI.delay(5)

WebUI.closeBrowser()


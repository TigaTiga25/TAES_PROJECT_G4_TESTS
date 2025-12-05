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

WebUI.click(findTestObject('NavBar/a_Scoreboards_nav-link'))

WebUI.click(findTestObject('ScoreboardsPage/button_Global'))

WebUI.verifyElementClickable(findTestObject('Object Repository/ScoreboardsPage/select'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ScoreboardsPage/select'), 'coins', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ScoreboardsPage/select'), 'capotes', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ScoreboardsPage/select'), 'bandeiras', true)

WebUI.click(findTestObject('Object Repository/ScoreboardsPage/filter_text'))

WebUI.setText(findTestObject('Object Repository/ScoreboardsPage/filter_text'), 'mickey')

WebUI.click(findTestObject('Object Repository/ScoreboardsPage/button_Low'))

WebUI.click(findTestObject('Object Repository/ScoreboardsPage/button_nextPage'))

WebUI.click(findTestObject('Object Repository/ScoreboardsPage/button_prevPage'))


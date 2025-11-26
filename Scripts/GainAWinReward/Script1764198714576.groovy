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

WebUI.setText(findTestObject('Object Repository/Page_Vite App/input_Email_loginId'), 'pa@mail.pt')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Vite App/input_Password_password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Password_inline-flex items-center ju_559f66'))

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_The Bisca_inline-flex items-center j_938413'))

WebUI.click(findTestObject('Object Repository/Page_Vite App/p_Your turn_text-2xl font-mono font-extrabo_26c785'))

WebUI.rightClick(findTestObject('Object Repository/Page_Vite App/p_YOU WIN_text-lg text-black-600'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Vite App/p_YOU WIN_text-lg text-black-600'), 'Coins earned: 20')

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_GAME 1_btn bg-gray-500 hoverbg-gray-_b6f7c0'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Vite App/div_About_inline-flex items-center justify-_4ac8e6'), 
    0)


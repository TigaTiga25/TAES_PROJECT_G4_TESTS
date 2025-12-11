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

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_New Match_inline-flex items-center j_905882'))

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Start a practice game_px-5 py-2 bg-e_67c576'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Vite App/img_Your turn_aspect-square size-full object-cover'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Vite App/p_Your turn_text-xs uppercase tracking-wide_5bd355'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Vite App/p_Your turn_text-xs uppercase tracking-wide_5bd355'), 
    'Player A')

WebUI.click(findTestObject('Object Repository/Page_Vite App/p_Your turn_text-xl font-mono font-extrabol_acfe38'))

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_36_reka-dropdown-menu-trigger-v-12'))

WebUI.click(findTestObject('Object Repository/Page_Vite App/div_View Avatar_focusbg-accent data-variant_de3ded'))

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Sign Up_inline-flex items-center jus_71cabe'))

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_The Bisca_inline-flex items-center j_938413'))

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Start a practice game_px-5 py-2 bg-e_67c576'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Vite App/p_Your turn_text-xs uppercase tracking-wide_5bd355_1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Vite App/p_Your turn_text-xs uppercase tracking-wide_5bd355_1'), 
    'Guest')


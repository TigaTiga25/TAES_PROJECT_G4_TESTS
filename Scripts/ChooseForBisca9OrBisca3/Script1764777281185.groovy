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

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Sign Up_inline-flex items-center jus_71cabe'))

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_The Bisca_inline-flex items-center j_938413'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Vite App/select_Start a practice game_w-full px-4 py_2ecde0'), 
    '3', true)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Vite App/select_Start a practice game_w-full px-4 py_2ecde0'), 
    'Bisca of 9Bisca of 3')

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Start a practice game_px-5 py-2 bg-e_67c576'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Vite App/img_Practice Game_card-img'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Vite App/img_Practice Game_card-img_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Vite App/img_Practice Game_card-img_2'), 0)

WebUI.rightClick(findTestObject('Object Repository/Page_Vite App/img_Practice Game_card-img_3'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Vite App/img_Your turn_card-img'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Vite App/img_Your turn_card-img_1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Vite App/img_Your turn_card-img_2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Vite App/img_Practice Game_card-img_3'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Vite App/img_Practice Game_card-img_4'), 0)


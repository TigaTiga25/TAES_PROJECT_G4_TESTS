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

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Entrar_inline-flex items-center just_5a503c'))

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Jogo de Bisca (TAES)_inline-flex ite_b960dc'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Practice Game_card-img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Practice Game_card-img_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Practice Game_card-img_2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Practice Game_card-img_3'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Practice Game_card-img_4'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Practice Game_card-img_5'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Practice Game_card-img_6'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Practice Game_card-img_7'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Practice Game_card-img_8'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Practice Game_card-img_9'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Vite App/span_Practice Game_deck-label text-white mt-1'), 
    '21 cards left')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Practice Game_card-img_10'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Vite App/span_Practice Game_deck-label text-white mt-1_1'), 
    'Trump')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Trump_card-img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Trump_card-img_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Trump_card-img_2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Trump_card-img_3'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Trump_card-img_4'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Trump_card-img_5'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Trump_card-img_6'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Vite App/img_Trump_card-img_7'))


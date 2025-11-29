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
import java.lang.System as System
import net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$System as System

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:5173/')

WebUI.click(findTestObject('RegisterPage/button_Registrar'))

String emailDinamico = ('test' + java.lang.System.currentTimeMillis()) + '@mail.pt'

WebUI.setText(findTestObject('RegisterPage/input_Email'), emailDinamico)

WebUI.setText(findTestObject('RegisterPage/input_Nickname'), 'test')

WebUI.setText(findTestObject('RegisterPage/input_Password'), '12345678')

WebUI.click(findTestObject('RegisterPage/button_Criar_Conta'))

if (WebUI.waitForAlert(5)) {
    WebUI.acceptAlert()
}

WebUI.delay(2)

WebUI.setText(findTestObject('LoginPage/inputEmail'), emailDinamico)

WebUI.setText(findTestObject('LoginPage/inputPassword'), '12345678')

WebUI.click(findTestObject('LoginPage/loginButton'))

WebUI.verifyElementVisible(findTestObject('LoginPage/p_email_unverified'))


package operations
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import javax.swing.JOptionPane


class ConfirmEmail {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I have registered a new account")
	def register_without_verify() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()

		WebUI.navigateToUrl(GlobalVariable.url)
		WebUI.click(findTestObject('Object Repository/RegisterPage/button_Registrar'))

		GlobalVariable.currentTestEmail = "non_verified_" + System.currentTimeMillis() + "@mail.pt"

		WebUI.setText(findTestObject('Object Repository/RegisterPage/input_Email'), GlobalVariable.currentTestEmail)
		WebUI.setText(findTestObject('Object Repository/RegisterPage/input_Nickname'), "TestBlocked")
		WebUI.setText(findTestObject('Object Repository/RegisterPage/input_Password'), "12345678")
		WebUI.click(findTestObject('Object Repository/RegisterPage/button_Criar_Conta'))

		if (WebUI.waitForAlert(15)) {
			WebUI.acceptAlert()
			WebUI.delay(1)
		}
	}

	@When("I try to login with my credentials")
	def login_unverified() {
		WebUI.delay(3)

		WebUI.setText(findTestObject('Object Repository/LoginPage/inputEmail'), GlobalVariable.currentTestEmail)
		WebUI.setText(findTestObject('Object Repository/LoginPage/inputPassword'), "12345678")
		WebUI.click(findTestObject('Object Repository/LoginPage/loginButton'))

		WebUI.delay(2)
	}

	@Then("I should see an error message saying {string}")
	def verify_error_message(String expectedError) {
		WebUI.waitForElementVisible(findTestObject('Object Repository/LoginPage/p_email_unverified'), 5)
		WebUI.verifyElementText(findTestObject('Object Repository/LoginPage/p_email_unverified'), expectedError)

		WebUI.closeBrowser()
	}

	@And("I pause the test to manually confirm the email link")
	def pause_for_manual_action() {
		String message = "O teste está em PAUSA.\n\n" +
				"1. Vai ao Mailtrap.\n" +
				"2. Confirma o email: " + GlobalVariable.currentTestEmail + "\n" +
				"3. Depois clica em OK nesta janela para continuar."

		JOptionPane.showMessageDialog(null, message, "Ação Manual Necessária", JOptionPane.INFORMATION_MESSAGE)

		println "Utilizador confirmou manualmente. A continuar teste..."
	}

	@Then("I should be redirected to the Game Menu")
	def verify_success_redirect() {
		WebUI.waitForPageLoad(3)

		String currentUrl = WebUI.getUrl()
		println "URL Atual: " + currentUrl

		WebUI.verifyMatch(currentUrl, "http://localhost:5173/home", false)

		WebUI.closeBrowser()
	}
}
package common
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
import com.kms.katalon.core.exception.StepErrorException

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



class Common {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I open the browser")
	def I_open_the_browser() {
		WebUI.openBrowser('http://localhost:5173/')
		println "Given->I have the browser open"
	}

	@Given("I navigate to the bisca platform")
	def I_navigate_to_the_bisca_platform() {
		WebUI.openBrowser(GlobalVariable.url)
		println "Given->I have the browser open"
	}

	@When("I click on the button to Sign Up")
	def click_sign_up() {
		WebUI.click(findTestObject('Object Repository/RegisterPage/button_Registrar'))
	}

	@And("I click on the button to create account")
	def click_create_account() {
		WebUI.click(findTestObject('Object Repository/RegisterPage/button_Criar_Conta'))
	}

	@And("I fill the registration form with a unique email")
	def fill_registration_form() {
		String uniqueEmail = "teste" + System.currentTimeMillis() + "@mail.pt"

		println "Email generated for the test: " + uniqueEmail

		WebUI.setText(findTestObject('Object Repository/RegisterPage/input_Email'), uniqueEmail)
		WebUI.setText(findTestObject('Object Repository/RegisterPage/input_Nickname'), "Teste")
		WebUI.setText(findTestObject('Object Repository/RegisterPage/input_Password'), "12345678")
	}

	@And("I enter as an anonymous user")
	def I_enter_as_an_anonymous_user() {
		WebUI.click(findTestObject('Object Repository/LoginPage/AnonymousButton'))
		println "And->I enter as an annonymous user"
	}

	@And("I login as a player")
	def I_login_as_player() {
		WebUI.setText(findTestObject('Object Repository/LoginPage/inputEmail'), GlobalVariable.defaultUser)
		WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/inputPassword'), 'tzH6RvlfSTg=')
		WebUI.click(findTestObject('Object Repository/LoginPage/loginButton'))
		WebUI.waitForPageLoad(5)
	}

	@And("I start a practice game")
	def I_start_a_practice_game() {
		WebUI.click(findTestObject('Object Repository/HomePage/practiceMatchButton'))
		println "And->I start a practice game"
	}

	@And("I start a new match")
	def I_start_a_new_match() {
		WebUI.click(findTestObject('Object Repository/Page_Vite App/button_The Bisca_inline-flex items-center j_938413'))
	}

	@When("I navigate to the URL (.*)")
	def I_navigate_to_the_URL(String name) {
		//WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
		WebUI.navigateToUrl(name)

		println "When->I navigate to the URL" + name
	}

	@When("I navigate to the (.*) page")
	def I_navigate_to_the_page(String name) {
		String url = GlobalVariable.url
		if (!url.endsWith("/")) {
			url += "/"
		}
		WebUI.navigateToUrl(url + name)
		WebUI.comment(url + name)

		println "When->I navigate to the " + name + " page"
	}

	@And ("I should be redirected to the (.*) page")
	def I_should_be_redirected_to_page(String name) {
		String url = GlobalVariable.url
		if (!url.endsWith("/")) {
			url += "/"
		}
		url += name

		WebUI.delay(3)

		// Login page edge case
		if (name.toLowerCase() == "login") {
			url = GlobalVariable.url
		}

		// Verify current URL
		if (url == WebUI.getUrl()) {
			WebUI.comment("Redirected Successfully to " + url)
		} else {
			WebUI.comment("Current URL: " + WebUI.getUrl())
			WebUI.comment("Expected URL: " + url)
			throw new StepErrorException("Redirect Unsuccessful")
		}

		println "And->I should be redirected to the " + name + " page"
	}

	@And("I close the browser")
	def I_close_the_browser() {
		WebUI.closeBrowser()
		println "And -> I close the browser"
	}


	@Then("I click on the (.*) button to login")
	def I_click_on_the_button_to_login(String string) {
		WebUI.click(findTestObject('Object Repository/Page_Vite App/' + string))
	}
	@When("I insert (.*) on the email field")
	def I_insert_on_the_email_field(String string) {
		WebUI.setText(findTestObject('Object Repository/Page_Vite App/input_Email_loginId'), string)
	}
	@And("I insert (.*) in the pass field")
	def I_insert_in_the_pass_field(String string) {
		WebUI.setText(findTestObject('Object Repository/Page_Vite App/input_Password_password'), string)
	}

	@And("I login as an user with no matches")
	def I_enter_as_an_user_with_no_matches() {
		WebUI.setText(findTestObject('Object Repository/LoginPage/inputEmail'), GlobalVariable.userWithoutMatches)
		WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/inputPassword'), 'tzH6RvlfSTg=')
		WebUI.click(findTestObject('Object Repository/LoginPage/loginButton'))
		println "And -> I login as an user with no matches"
	}

	@And("I see the face down deck")
	def I_see_the_face_down_deck(){
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/faceDownDeck'))
	}

	@And("I see the face up trump")
	def I_see_the_face_up_trump(){
		WebUI.verifyElementVisible(findTestObject('Object Repository/GameBoardPage/faceUpTrump'))
	}

	@And("I choose for a bisca9")
	def I_choose_for_a_bisca3() {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Vite App/select_Start a practice game_w-full px-4 py_2ecde0'),
				'9', true)

		WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Start a practice game_px-5 py-2 bg-e_67c576'))
	}

	@When("I click on my avatar to open the dropdown menu")
	def I_click_on_my_avatar_to_open_dropdown_menu() {
		WebUI.click(findTestObject('Object Repository/NavBar/profileAvatar'))
	}

	@When("I click on my coins balance")
	def I_click_on_my_coins_balance() {
		WebUI.click(findTestObject('Object Repository/NavBar/coinsButton'))
	}

	@Then("I click on the (.*) customizationsButton")
	def I_click_on_the_customizationsButton(String string) {
		WebUI.click(findTestObject('Object Repository/Page_Vite App/' + string))
	}
	@And("I click on the (.*) decksButton")
	def I_click_on_the_decksButton(String string) {
		WebUI.click(findTestObject('Object Repository/Page_Vite App/' + string))
	}

	@And("I wait for the notification polling")
	def wait_polling() {
		WebUI.delay(16)
	}

	@Then("I should see the red badge on the bell icon")
	def check_badge() {
		WebUI.verifyElementPresent(findTestObject('NavBar/span_New_Notifications'), 5)
	}

	@When("I click on the notification bell")
	def click_bell() {
		WebUI.click(findTestObject('NavBar/button_Notifications'))
		WebUI.waitForElementVisible(findTestObject('NavBar/div_New_Notification'), 5)
	}

	@Then("the red badge should disappear")
	def badge_should_disappear() {
		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('NavBar/span_New_Notifications'), 5)
		WebUI.closeBrowser()
	}

	@When("the system triggers a (.*) event via Debug API")
	def system_triggers_event(String eventType) {
		WS.sendRequest(findTestObject('Debug_Notify_Leaderboard'))
	}

	@And("I check my customizations")
	def I_check_my_customizations() {
		WebUI.click(findTestObject('Object Repository/NavBar/a_Customizations_nav-link'))
	}

	@When("I buy the second item on the shop")
	def I_buy_a_deck() {
		WebUI.click(findTestObject('Object Repository/CustomizationsPage/secondShopEntry'))
		WebUI.acceptAlert()
	}
}
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

import java.time.LocalDate
import java.time.format.DateTimeFormatter;

class GameHistory {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@And("I select a match")
	def I_select_a_match() {
		WebUI.click(findTestObject('Object Repository/GameHistory/firstMatchCard'))
		println "And -> I select a match"
	}

	@When("I check my game history")
	def I_check_my_game_history() {
		WebUI.click(findTestObject('Object Repository/HomePage/historyNav'))
		println "When -> I check my game history"
	}

	@When("I try to check my game history")
	def I_try_to_check_my_game_history() {
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/HomePage/historyNav'), 0)
		println "When -> I try to check my game history"
	}

	@Then("I shouldn't be able to check my history")
	def I_shouldnt_be_able_to_check_my_history() {
		WebUI.verifyEqual(WebUI.getUrl(), 'http://localhost:5173/home')
		println "Then -> I shouldn't see any history while logged out"
	}

	@Then("I shouldn't see any matches")
	def I_shouldnt_see_any_matches() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GameHistory/noMatchesText'), 0)
		println "Then -> I shouldn't see any matches"
	}

	@Then("I should see all my matches")
	def I_should_see_all_my_matches() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GameHistory/matchCards'), 0)
		println "Then -> I should see all my matches"
	}

	@Then("I should see all games from that match")
	def I_should_see_all_games_from_that_match() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GameHistory/firstMatchGames'), 0)
		println "Then -> I should see all games from that match"
	}

	@Then("I should see a new match in my history")
	def I_should_see_a_new_match_in_my_history() {
		String matchDate = WebUI.getText(findTestObject('Object Repository/GameHistory/firstMatchDate'))

		LocalDate date = LocalDate.now()

		String currentDate = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
		WebUI.comment("New match date: " + matchDate)
		WebUI.comment("Current date: " + currentDate)

		if (matchDate != currentDate) {
			WebUI.comment("New match date doesn't match current date")
			throw new StepErrorException("Match not created")
		}
		println "Then -> I should see a new match in my history"
	}
}
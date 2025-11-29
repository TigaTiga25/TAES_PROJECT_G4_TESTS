package operations

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class ViewPersonalScoreboard {
	
	@When("I click on the Scoreboards link")
	def I_click_scoreboards_link() {
		WebUI.click(findTestObject('Object Repository/NavBar/a_Scoreboards_nav-link'))
		WebUI.delay(1)
		println "When -> I check my scoreboards"
	}
	
	@Then("I should see all stats initialized to zero")
    def verify_all_zeros() {
        WebUI.verifyElementText(findTestObject('Object Repository/ScoreboardsPage/lbl_TotalMatches'), "0")
        WebUI.verifyElementText(findTestObject('Object Repository/ScoreboardsPage/lbl_WinRate'), "0%")
        WebUI.verifyElementText(findTestObject('Object Repository/ScoreboardsPage/lbl_TimePlayed'), "0h 0m")
    }
	
	@Then("I should see all stats filled correctly")
	def verify_stats_filled() {
		String totalMatches = WebUI.getText(findTestObject('Object Repository/ScoreboardsPage/lbl_TotalMatches'))
        String timePlayed = WebUI.getText(findTestObject('Object Repository/ScoreboardsPage/lbl_TimePlayed'))

        WebUI.verifyNotMatch(totalMatches, "0", false)
        WebUI.verifyNotMatch(timePlayed, "0h 0m", false)
        
        println "Then -> Stats verified: Matches=${totalMatches}, Time=${timePlayed}"
	}
}

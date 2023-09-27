package packageKeywords

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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class trackingShipment {

	@Keyword
	def trackingShipment() {
		WebUI.mouseOver(findTestObject('Object Repository/Track Shipment/elementE-Services'))
		WebUI.click(findTestObject('Object Repository/Track Shipment/elementTracking'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Track Shipment/p_You can search for a maximum of 10 AWB numbers'))
	}

	@Keyword
	def flightSchedule(String origin, String destination) {
		WebUI.mouseOver(findTestObject('Object Repository/Track Shipment/elementE-Services'))
		WebUI.click(findTestObject('Object Repository/Flight Schedule/elementFightSchedule'))
		WebUI.setText(findTestObject('Object Repository/Flight Schedule/inputOrigin'), origin)
		WebUI.click(findTestObject('Object Repository/Flight Schedule/span_Singapore, SingaporeChangi Intl'))
		WebUI.setText(findTestObject('Object Repository/Flight Schedule/inputDestination'), destination)
		WebUI.click(findTestObject('Object Repository/Flight Schedule/div_Sydney, AustraliaKingsford Smith SYD'))
		WebUI.click(findTestObject('Object Repository/Flight Schedule/inputFightDate'))
		WebUI.click(findTestObject('Object Repository/Flight Schedule/inputDate'))
		WebUI.click(findTestObject('Object Repository/Flight Schedule/buttonSearch'))
		WebUI.scrollToElement(findTestObject('Object Repository/Flight Schedule/verifySQ0221'), 0)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Flight Schedule/verifySQ0221'))
		WebUI.delay(3)
	}

	@Keyword
	def resetSchedule(String origin, String destination) {
		WebUI.click(findTestObject('Object Repository/Flight Schedule/resetHyperlink'))
		WebUI.setText(findTestObject('Object Repository/Flight Schedule/inputOrigin'),origin)
		WebUI.setText(findTestObject('Object Repository/Flight Schedule/inputDestination'),destination)
		WebUI.click(findTestObject('Object Repository/Flight Schedule/buttonSearch'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Flight Schedule/errorMessageDate'))
	}
}

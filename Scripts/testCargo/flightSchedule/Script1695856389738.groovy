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

TestData inputan = findTestData('Data Files/siaCargo_DDT')

origin = inputan.getValue('origin', 1)
destination = inputan.getValue('destination', 1)


WebUI.openBrowser('www.siacargo.com')

WebUI.maximizeWindow()

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

WebUI.closeBrowser()
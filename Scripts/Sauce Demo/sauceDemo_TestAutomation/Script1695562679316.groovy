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


//Variables for login
String testType = "P" //need data files to test this (excel data)
String username = "standard_user"
String password = "secret_sauce"
String expWarningMsg = "" //need data files to test this (excel data)

//Varialbles for checkout
String firstName = "Ilham"
String lastName = "Apriansyah"
String zipCode = "11640"



CustomKeywords.'sauceDemoKeywords.sdKeywords.openBrowser'()

CustomKeywords.'sauceDemoKeywords.sdKeywords.login'(username, password)

CustomKeywords.'sauceDemoKeywords.sdKeywords.filterContainer'()

CustomKeywords.'sauceDemoKeywords.sdKeywords.addToCart'()

CustomKeywords.'sauceDemoKeywords.sdKeywords.inCart'()

CustomKeywords.'sauceDemoKeywords.sdKeywords.checkout'(firstName, lastName, zipCode)

CustomKeywords.'sauceDemoKeywords.sdKeywords.checkoutOverview'()

CustomKeywords.'sauceDemoKeywords.sdKeywords.orderConfirmation'()
WebUI.delay(2)
CustomKeywords.'sauceDemoKeywords.sdKeywords.closeBrowser'()


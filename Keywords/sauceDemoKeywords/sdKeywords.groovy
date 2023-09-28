package sauceDemoKeywords

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

import internal.GlobalVariable

public class sdKeywords {

	String url = 'https://www.saucedemo.com/v1/index.html'

	@Keyword
	def openBrowser() {
		WebUI.openBrowser(url)
		WebUI.maximizeWindow()
	}

	@Keyword
	def closeBrowser() {
		WebUI.closeBrowser()
	}

	//Variables for login
	String testType = "P" //need data files to test this (excel data)
	String username = "standard_user"
	String password = "secret_sauce"
	String expWarningMsg = "" //need data files to test this (excel data)

	@Keyword
	def login() {
		WebUI.maximizeWindow()
		WebUI.verifyElementVisible(findTestObject('Object Repository/login_SauceDemo/userName'))
		if (username != 'none') {
			WebUI.sendKeys(findTestObject('Object Repository/login_SauceDemo/userName'), username)

			if (password != 'none') {
				WebUI.sendKeys(findTestObject('Object Repository/login_SauceDemo/password'), password)

				WebUI.click(findTestObject('Object Repository/login_SauceDemo/loginButton'))
				if (testType == 'P') {
					WebUI.waitForElementVisible(findTestObject('Object Repository/login_SauceDemo/landingPageProducts'),0)
				} else {
					WebUI.verifyElementText(findTestObject('Object Repository/login_SauceDemo/expErrorMessage'), expWarningMsg)
				}
				WebUI.delay(2)
			}
		}
	}

	@Keyword
	def filterContainer() {
		WebUI.click(findTestObject('Object Repository/productsList_SauceDemo/productSortContainer'))
		WebUI.click(findTestObject('Object Repository/productsList_SauceDemo/productSortContainer_ZtoA'))
		WebUI.click(findTestObject('Object Repository/productsList_SauceDemo/productSortContainer_LowtoHigh'))
		WebUI.click(findTestObject('Object Repository/productsList_SauceDemo/productSortContainer_HightoLow'))
	}

	@Keyword
	def addToCart() {
		WebUI.mouseOver(findTestObject('Object Repository/productsList_SauceDemo/catalog1'))
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/productsList_SauceDemo/catalog1'))
		WebUI.click(findTestObject('Object Repository/productsList_SauceDemo/catalog2'))
		WebUI.click(findTestObject('Object Repository/productsList_SauceDemo/catalog3'))
		WebUI.click(findTestObject('Object Repository/cartPage/cart'))
	}

	@Keyword
	def inCart() {
		WebUI.mouseOver(findTestObject('Object Repository/cartPage/cart_btnRemove'))
		WebUI.click(findTestObject('Object Repository/cartPage/cart_btnRemove'))
		WebUI.click(findTestObject('Object Repository/cartPage/cart_btnCheckout'))
	}

	//variables for checkout
	String firstName = "Ilham"
	String lastName = "Apriansyah"
	String zipCode = "11640"

	@Keyword
	def checkout() {
		WebUI.sendKeys(findTestObject('Object Repository/checkoutPage/checkout_FirstName'), firstName)
		WebUI.sendKeys(findTestObject('Object Repository/checkoutPage/checkout_LastName'), lastName)
		WebUI.sendKeys(findTestObject('Object Repository/checkoutPage/checkout_PostalCode'), zipCode)
		WebUI.click(findTestObject('Object Repository/checkoutPage/checkout_btnContinue'))
	}

	@Keyword
	def checkoutOverview() {
		WebUI.click(findTestObject('Object Repository/checkoutPage/checkoutOverview_catalogDetail'))
		WebUI.click(findTestObject('Object Repository/checkoutPage/checkoutOverview_btnBackDetail'))
		WebUI.scrollToElement(findTestObject('Object Repository/checkoutPage/checkoutOverview_btnFinish'), 0)
		WebUI.click(findTestObject('Object Repository/checkoutPage/checkoutOverview_btnFinish'))
	}

	@Keyword
	def orderConfirmation() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/checkoutPage/orderConfirmation_Greetings'))
	}
}

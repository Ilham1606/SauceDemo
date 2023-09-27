import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Variables
String testType = "P" //need data files to test this (excel data)
String username = "standard_user"
String password = "secret_sauce"
String expWarningMsg = "" //need data files to test this (excel data)

//Actions
WebUI.openBrowser('https://www.saucedemo.com/v1/index.html')
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

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/productsList_SauceDemo/catalog1'))
WebUI.click(findTestObject('Object Repository/productsList_SauceDemo/catalog2'))
WebUI.click(findTestObject('Object Repository/cartPage/cart'))

}
}

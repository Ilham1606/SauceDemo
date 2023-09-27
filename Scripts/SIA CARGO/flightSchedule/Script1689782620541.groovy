import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.openBrowser('www.siacargo.com')

WebUI.maximizeWindow()

WebUI.mouseOver(findTestObject('Object Repository/Track Shipment/elementE-Services'))

WebUI.click(findTestObject('Object Repository/Flight Schedule/elementFightSchedule'))

WebUI.setText(findTestObject('Object Repository/Flight Schedule/inputOrigin'),'SIN')

WebUI.click(findTestObject('Object Repository/Flight Schedule/span_Singapore, SingaporeChangi Intl'))

WebUI.setText(findTestObject('Object Repository/Flight Schedule/inputDestination'),'SYD')

WebUI.click(findTestObject('Object Repository/Flight Schedule/div_Sydney, AustraliaKingsford Smith SYD'))

WebUI.click(findTestObject('Object Repository/Flight Schedule/inputFightDate'))

WebUI.click(findTestObject('Object Repository/Flight Schedule/inputDate'))

WebUI.click(findTestObject('Object Repository/Flight Schedule/buttonSearch'))

WebUI.scrollToElement(findTestObject('Object Repository/Flight Schedule/verifySQ0221'), 0)
WebUI.verifyElementVisible(findTestObject('Object Repository/Flight Schedule/verifySQ0221'))

WebUI.delay(3)

WebUI.closeBrowser()
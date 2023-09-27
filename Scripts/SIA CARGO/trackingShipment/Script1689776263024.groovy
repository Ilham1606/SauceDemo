import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('www.siacargo.com')

WebUI.maximizeWindow()

WebUI.mouseOver(findTestObject('Object Repository/Track Shipment/elementE-Services'))

WebUI.click(findTestObject('Object Repository/Track Shipment/elementTracking'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Track Shipment/p_You can search for a maximum of 10 AWB numbers'))

WebUI.closeBrowser()


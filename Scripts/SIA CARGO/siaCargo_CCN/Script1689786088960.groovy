import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.openBrowser('www.siacargo.com')

WebUI.maximizeWindow()

CustomKeywords.'packageKeywords.trackingShipment.flightSchedule'()

WebUI.closeBrowser()

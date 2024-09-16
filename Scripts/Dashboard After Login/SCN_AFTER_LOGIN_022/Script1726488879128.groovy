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

WebUI.callTestCase(findTestCase('Workflow Global/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

if(WebUI.verifyElementPresent(findTestObject('Object Repository/After Login/Logout/btn_MenuLogout'), 3)) {
	println("Logout is exist")
	WebUI.click(findTestObject('Object Repository/After Login/Logout/btn_MenuLogout'))
	WebUI.delay(5)
	println("Success click Logout")
} else {
	println("Logout is not exist")
}

if(WebUI.verifyElementPresent(findTestObject('Object Repository/After Login/Logout/btn_Cancel'), 3)) {
	println("Cancel is exist")
	WebUI.click(findTestObject('Object Repository/After Login/Logout/btn_Cancel'))
	WebUI.delay(5)
	println("Success click cancel")
} else {
	println("Cancel is not exist")
}


WebUI.closeBrowser()
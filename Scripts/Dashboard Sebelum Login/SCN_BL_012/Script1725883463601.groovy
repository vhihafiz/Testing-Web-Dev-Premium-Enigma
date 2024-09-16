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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/After Login/Course/button_Add To Cart'), 0)

if (WebUI.verifyElementVisible(findTestObject('Object Repository/After Login/Course/button_Add To Cart'))) {
	println("Button add to cart is Exist")
	WebUI.delay(5)
	WebUI.click(findTestObject('Object Repository/After Login/Course/button_Add To Cart'))
	WebUI.delay(5)
	if (WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Dashboard/Login/text_Log In'))) {
		println("Success diarahkan ke halaman login saat mengklik add to cart sebelum login")
	} else {
		println("Gagal diarahkan ke halaman login")
	}
} else {
	println("Button not found")
}

WebUI.closeBrowser()


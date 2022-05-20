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

//open browser
WebUI.openBrowser("")

//navigate to url
WebUI.navigateToUrl("https://www.tokopedia.com/")

//click masuk
WebUI.click(findTestObject('Object Repository/LoginTokped/Page_Situs Jual Beli Online Terlengkap, Mudah  Aman  Tokopedia/button_Masuk'))

//input nomer/email
WebUI.setText(findTestObject('Object Repository/LoginTokped/Page_Situs Jual Beli Online Terlengkap, Mudah  Aman  Tokopedia/div_Nomor HP atau EmailContoh emailtokopedia.com'), "puput081098@gmail.com")

//button selanjutnya
WebUI.click(findTestObject('Object Repository/LoginTokped/Page_Situs Jual Beli Online Terlengkap, Mudah  Aman  Tokopedia/button_Selanjutnya'))

//input password
WebUI.setEncryptedText(findTestObject('Object Repository/LoginTokped/Page_Situs Jual Beli Online Terlengkap, Mudah  Aman  Tokopedia/div_Kata Sandi'), "12345678okta")

//button masuk
WebUI.click(findTestObject('Object Repository/LoginTokped/Page_Situs Jual Beli Online Terlengkap, Mudah  Aman  Tokopedia/button_Masuk'))

//verify
WebUI.click(findTestObject('Object Repository/LoginTokped/Page_Situs Jual Beli Online Terlengkap, Mudah  Aman  Tokopedia/div_SMS ke --299'))

//close browser
WebUI.closeBrowser()


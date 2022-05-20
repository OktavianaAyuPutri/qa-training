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
WebUI.navigateToUrl("https://www.hotstar.com/")

//click masuk
WebUI.click(findTestObject('Object Repository/LoginDisneyHotstar/Page_DisneyHotstar - Streaming Film Terbaru dan Nonton TV Show Online Terbaik/div_Masuk'))

//input nomor
WebUI.setText(findTestObject('Object Repository/LoginDisneyHotstar/Page_DisneyHotstar - Streaming Film Terbaru dan Nonton TV Show Online Terbaik/input_Masuk menggunakan Ponsel_phoneNo'), "081293672299")

//button lanjutkan
WebUI.click(findTestObject('Object Repository/LoginDisneyHotstar/Page_DisneyHotstar - Streaming Film Terbaru dan Nonton TV Show Online Terbaik/button_Lanjutkan'))

//input kode
WebUI.setEncryptedtText(findTestObject('Object Repository/LoginDisneyHotstar/Page_DisneyHotstar - Streaming Film Terbaru dan Nonton TV Show Online Terbaik/div_Masukkan kode 4 digit yang dikirim ke_otp-input'), "6Abmqro4zFA=")

//Verify
WebUI.verifyTextPresent(findTestObject('Object Repository/LoginDisneyHotstar/Page_DisneyHotstar - Streaming Film Terbaru dan Nonton TV Show Online Terbaik/div_Daftar Tonton  Akun Saya  Keluar'), false)

//close
WebUI.closeBrowser()

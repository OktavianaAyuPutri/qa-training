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

WebUI.navigateToUrl('https://accounts.bukalapak.com/register?from=nav_header')

WebUI.setText(findTestObject('Object Repository/BukaLapakRecord/Page_Daftar Akun Bukalapak  Bukalapak/input_Nomor handphone atau email_bl-text-fi_6e9e2f'), 
    no_tlp/email)

WebUI.click(findTestObject('Object Repository/BukaLapakRecord/Page_Daftar Akun Bukalapak  Bukalapak/button_Daftar'))

WebUI.click(findTestObject('Object Repository/BukaLapakRecord/Page_Daftar Akun Bukalapak  Bukalapak/button_Ya, kirim kode'))

WebUI.click(findTestObject('Object Repository/BukaLapakRecord/Page_Daftar Akun Bukalapak  Bukalapak/div_Kode rahasia'))

WebUI.setText(findTestObject('Object Repository/BukaLapakRecord/Page_Daftar Akun Bukalapak  Bukalapak/input_Nomor handphone atau email_bl-text-fi_6e9e2f'), 
    '60806')

WebUI.click(findTestObject('Object Repository/BukaLapakRecord/Page_Daftar Akun Bukalapak  Bukalapak/button_Verifikasi'))


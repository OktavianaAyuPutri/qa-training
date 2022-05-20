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

WebUI.navigateToUrl('https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.click(findTestObject('Object Repository/GmailRecord/Page_Gmail/span_Buat akun'))

WebUI.click(findTestObject('Object Repository/GmailRecord/Page_Gmail/li_Untuk diri sendiri'))

WebUI.setText(findTestObject('Object Repository/GmailRecord/Page_Buat Akun Google/input_Lanjutkan ke Gmail_firstName'), 
    firstname)

WebUI.setText(findTestObject('Object Repository/GmailRecord/Page_Buat Akun Google/input_Lanjutkan ke Gmail_lastName'), lastname)

WebUI.click(findTestObject('Object Repository/GmailRecord/Page_Buat Akun Google/div_Persyaratan_VmOpGe'))

WebUI.setEncryptedText(findTestObject('Object Repository/GmailRecord/Page_Buat Akun Google/input_oayuputri7_Passwd'), password)

WebUI.setEncryptedText(findTestObject('Object Repository/GmailRecord/Page_Buat Akun Google/input_oayuputri7_ConfirmPasswd'), 
    konfirm_password)


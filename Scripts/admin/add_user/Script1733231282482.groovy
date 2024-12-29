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

CustomKeywords.'newPackage.orangeKey.login'()

WebUI.click(findTestObject('Object Repository/Admin_page/a_Admin'))

WebUI.click(findTestObject('Object Repository/Admin_page/button_Add_User'))

WebUI.click(findTestObject('Object Repository/Admin_page/Select_User_Role'))

WebUI.click(findTestObject('Object Repository/Admin_page/select_Admin'))

WebUI.setText(findTestObject('Object Repository/Admin_page/Input_Employee_Name'), "james")

WebUI.click(findTestObject('Object Repository/Admin_page/span_James_Butler'))

WebUI.click(findTestObject('Object Repository/Admin_page/Select_Status'))

WebUI.click(findTestObject('Object Repository/Admin_page/select_Enabled'))

WebUI.setText(findTestObject('Object Repository/Admin_page/Input_Username'), "james")

WebUI.setText(findTestObject('Object Repository/Admin_page/Input_Password_User'), "1234567a")

WebUI.setText(findTestObject('Object Repository/Admin_page/Input_Confirm_Password'), "1234567a")

WebUI.click(findTestObject('Object Repository/Admin_page/Button_Save_User'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_page/message_SuccessSuccessfullySaved'), 0)

WebUI.closeBrowser()




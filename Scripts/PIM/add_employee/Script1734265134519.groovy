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

randomDecimal = Math.random();
finalInt = (randomDecimal * 1000).round();
finalStr = finalInt.toString();

CustomKeywords.'newPackage.orangeKey.login'()

WebUI.click(findTestObject('Object Repository/PIM_Page/menu_PIM'))

WebUI.click(findTestObject('Object Repository/PIM_Page/navbar_Add_Employee'))

WebUI.setText(findTestObject('Object Repository/PIM_Page/input_Employee_FirstName'), "Fajar")

WebUI.setText(findTestObject('Object Repository/PIM_Page/input_Employee_LastName'), "Test01")

WebUI.setText(findTestObject('Object Repository/PIM_Page/input_Employee_Id'), finalStr)

WebUI.click(findTestObject('Object Repository/PIM_Page/button_Save'))

// verify success message
WebUI.verifyElementPresent(findTestObject('Object Repository/PIM_Page/div_SuccessSuccessfully_Saved'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/PIM_Page/h6_Personal Details'), 5)
WebUI.closeBrowser()
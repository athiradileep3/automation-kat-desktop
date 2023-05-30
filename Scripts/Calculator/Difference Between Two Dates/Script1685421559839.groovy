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

Windows.startApplicationWithTitle('C:\\Users\\Abhi\\Downloads\\Calc 64-bit\\calc1.exe', 'Calculator')

Windows.click(findWindowsObject('Object Repository/Calculator/FromDropdown'))

Windows.click(findWindowsObject('Object Repository/Calculator/01May-2023'))

Windows.click(findWindowsObject('Object Repository/Calculator/ToDropdown'))

Windows.click(findWindowsObject('Object Repository/Calculator/31May-2023'))

Windows.click(findWindowsObject('Calculator/CalculateButton'))

txt1 = Windows.getText(findWindowsObject('Calculator/Result-YMWD'))

txt2 = Windows.getText(findWindowsObject('Calculator/Result-Days'))

Windows.verifyMatch((txt1 + 'AND') + txt2, '4 weeks, 2 days AND 30 days', true)

Windows.closeApplication()


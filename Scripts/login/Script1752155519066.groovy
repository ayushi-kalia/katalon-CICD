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

WebUI.navigateToUrl('https://sit.ibexpayroll.com:8443/edge8/identityserver/Account/Login?ReturnUrl=%2Fedge8%2Fidentityserver%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3Deveresthybrid%26redirect_uri%3Dhttps%253A%252F%252Fsit.ibexpayroll.com%253A8443%252Fedge8%252Feverest%252FLogin%252FAuthenticate.mr%26response_mode%3Dform_post%26response_type%3Dcode%2520id_token%2520token%26scope%3Deverest%2520openid%2520user_name%26state%3DOpenIdConnect.AuthenticationProperties%253DLczBjtlLqfvj8d4aRMipLuRjMtYMiRK_80zny8FzI1rwsmcpipXQQrQ3nuoTGaeqFW7jO4KqX1kal5Ou3xHMD0Z-d3KxJ3G8x0OwuLQN9-E1DHPHJS59v_MAIW7vmC7ywto-Va4kEAop2pbvxLnbjjbrWuEGPwBczuXQye-sOH82IP-L7pXkijmZfcYZJ31yvboL03SSvH9JAz1RM9uvbrIynbhYvySS3TKL4MggPmcECJRcgglYlaT2G2qx2VoIPqx3bNpnGLNtbgC2eY0BNjrTQQCPlThTMoegVM_KeaYlMYaYogZ7kruNlI63169yhTI6__OC-8SYlcnhI32DFR0Olj3tmGDWzZF1ZnSBOrlJ8qqCb_Azi9_Rg_TNL5M9%26nonce%3D638877523376509776.OTNjNjVhODItZjdjMi00ZDg4LTk5MTItOTNkNTIyMThkYTA4MTQ4MDM5MTMtYTZiOS00ZWRjLWEzYTQtYmJlZDc2N2JmNWI1&timestamp=2025-07-10T13%3A52%3A48.3739914Z')

WebUI.setText(findTestObject('Object Repository/login/Page_IBEX Payroll - Login/input_Username_Input.Username'), 'dev.guser')

WebUI.setEncryptedText(findTestObject('Object Repository/login/Page_IBEX Payroll - Login/input_Show Password_Input.Password'), 
    'p4y+y39Ir5Oy1MY8jPt0uQ==')

WebUI.click(findTestObject('Object Repository/login/Page_IBEX Payroll - Login/input_Show Password_rememberMe'))

WebUI.click(findTestObject('Object Repository/login/Page_IBEX Payroll - Login/input_Remember me_Input.Button'))


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hub.subut.ai/login')

WebUI.setText(findTestObject('Page_Sign in  Subutai Hub/input_email'), 'kondersonn@gmail,com')

WebUI.setText(findTestObject('Page_Sign in  Subutai Hub/input_password'), 'a220831abc')

WebUI.click(findTestObject('Page_Sign in  Subutai Hub/input_btn btn_blue btn_full-wi'))

WebUI.setText(findTestObject('Page_Sign in  Subutai Hub/input_email'), 'kondersonn@gmail.com')

WebUI.click(findTestObject('Page_Sign in  Subutai Hub/input_btn btn_blue btn_full-wi'))

WebUI.setText(findTestObject('Page_Sign in  Subutai Hub/input_email'), 'kondersonn@gmail.com')

WebUI.setText(findTestObject('Page_Sign in  Subutai Hub/input_password'), 'a220831')

WebUI.click(findTestObject('Page_Sign in  Subutai Hub/input_btn btn_blue btn_full-wi'))

WebUI.click(findTestObject('Page_Subutai Hub/i_sidebar-menu-item__icon hb h'))

WebUI.click(findTestObject('Page_Environments/a_Create'))

WebUI.click(findTestObject('Page_Environments  Create/label'))

WebUI.click(findTestObject('Page_Environments  Create/div_step-1'))

WebUI.click(findTestObject('Page_Environments  Create/a_Next'))

WebUI.setText(findTestObject('Page_Environments  Create/input_js-search'), 'ap')

WebUI.click(findTestObject('Page_Environments  Create/div_templates'))

WebUI.click(findTestObject('Page_Environments  Create/a_Save'))

WebUI.setText(findTestObject('Page_Environments  Create/input_environment-name'), 'tesTAVR=TOMAT')

WebUI.click(findTestObject('Page_Environments  Create/button_Save'))

WebUI.setText(findTestObject('Page_Environments  Create/input_environment-name'), 'tesTAVRTOMAT')

WebUI.click(findTestObject('Page_Environments  Create/button_Save'))

WebUI.click(findTestObject('Page_Environments  Create/div_swal2-icon swal2-success a'))

WebUI.click(findTestObject('Page_Environments  Create/h2_Success'))

WebUI.click(findTestObject('Page_Environments  Create/button_Build'))

WebUI.click(findTestObject('Page_Environment View  tesTAVRTOMAT/span_details-header-item__text'))

WebUI.closeBrowser()


package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NextbaseCrmProject {

    public NextbaseCrmProject(){
        /**
         * PageFactory class is a Selenium class that support POM
         * It has method called initElements. Once it`s called it will store all elements specified using @FindBy
         * annotation with locator, and it will give elements to the classes when they called
         * initElements method accept 2 arg.
         */
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@name='USER_LOGIN']")
    public WebElement inputUsername;

    @FindBy (xpath="//input[@name='USER_PASSWORD']")
    public WebElement inputPassword;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement signInButton;

    @FindBy (xpath = "//span[.='Log out']")
    public WebElement logOutBtn;

    @FindBy (id="USER_REMEMBER")  //id="inputEmail"
    public WebElement checkRememberBox;

    @FindBy (xpath = "//label[.='Remember me on this computer']")
    public WebElement rememberMeOnThisComputerMsg;

    @FindBy (id = "user-name")
    public WebElement userProfil;

    @FindBy (xpath = "//div[.='Authorization']")
    public WebElement loginPageVerify;


    @FindBy (xpath = "//div[.='This field is required.']/div")
    public WebElement fieldRequiredErrorMsg;

    @FindBy (xpath = "//div[.='Please enter a valid email address.']/div")
    public WebElement enterInvalidEmailErrorMsg;

    @FindBy (xpath = "//div[.='Incorrect login or password']")
    public WebElement incorrectLoginOrPasswordMsg;

    @FindBy (xpath = "//span[.='My Profile']")
    public WebElement myProfil;

    @FindBy (xpath = "//span[.='Edit Profile Settings']")
    public WebElement editProfilSettings;

    @FindBy (xpath = "//span[.='Themes']")
    public WebElement themes;

    @FindBy (xpath = "//span[.='Configure notifications']")
    public WebElement configureNotification;

    @FindBy (xpath = "//span[@id='feed-add-post-form-tab-message']/span")
    public WebElement messageBtn;

    @FindBy (xpath = "//div[@id='bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm']/iframe")
    public WebElement messageFrame;

    @FindBy (xpath = "//body[@contenteditable='true']")
    public WebElement  textMessageArea;

    //@FindBy (xpath = "//button[.='Send']")
    // id = "blog-submit-button-save"
    @FindBy (id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy (xpath = "(//div[contains(@class,'feed-post-text-block-inner-inner')])[1]")
    public WebElement verifyTextMessage;

    @FindBy (xpath = "//span[.='The message title is not specified']")
    public WebElement emptyMessageSpaceErrorMsg;

    @FindBy (id="feed-add-post-form-link-text")
    public WebElement moreTab;

    @FindBy (xpath = "(//span[.='File'])[2]")
    public WebElement fileUnderMore;

    @FindBy (xpath = "(//span[.='Appreciation'])[2]")  // Announcement //Workflow
    public WebElement appreciationUnderMore;

    @FindBy (xpath = "(//span[.='Announcement'])[2]")
    public WebElement announcementUnderMore;

    @FindBy (xpath = "(//span[.='Workflow'])[2]")
    public WebElement workFlowUnderMore;

    // US_7
    @FindBy (xpath = "//*[@id='feed-add-post-form-tab-vote']")
    public WebElement pollButton;

    @FindBy (xpath = "//div[@id='bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm']/iframe")
    public WebElement pollMessageFrame;

    @FindBy (xpath = "//body[@contenteditable='true']")
    public WebElement pollMainTextArea;

    @FindBy (xpath = "//input[@id='question_0']")
    public WebElement pollQuestionInput;

    @FindBy (xpath = "//input[@id='answer_0__0_']")
    public WebElement pollAnswerInput1;

    @FindBy (xpath = "//input[@id='answer_0__1_']")
    public WebElement pollAnswerInput2;

    @FindBy (xpath = "//*[@id='blog-submit-button-save']")
    public WebElement pollSendBtn;

    @FindBy (xpath = "(//span[@class='bx-vote-block-inp-substitute'])[1]")
    public List<WebElement> pollRadioBtn;

    @FindBy (xpath = "//button[.='Vote']")
    public WebElement pollVoteBtn;

    @FindBy (xpath = "//button[@class='ui-btn ui-btn-lg ui-btn-link']")
    public WebElement pollVoteVerify;


    // US_8
    @FindBy (xpath = "//span[normalize-space()='Chat and Calls']")
    public WebElement chatAndCallsBtn;

    @FindBy (xpath = "//div[@id='bx-desktop-tab-im']/div")
    public WebElement hoverMessageBtn;

    @FindBy (xpath = "//div[@id='bx-desktop-tab-notify']/div")
    public WebElement hoverNotificationsBtn;

    @FindBy (xpath = "//div[@id='bx-desktop-tab-config']/div")
    public WebElement hoverSettingsBtn;

    @FindBy (xpath = "//div[@id='bx-desktop-tab-im-lf']/div")
    public WebElement hoverActivityBtn;

    // US_9

    @FindBy (xpath = "//span[normalize-space()='Activity Stream']")
    public WebElement moduleActivity;

    @FindBy (xpath = "//span[normalize-space()='Tasks']")
    public WebElement moduleTasks;

    @FindBy (xpath = "//span[normalize-space()='Chat and Calls']")
    public WebElement moduleChatAndCall;

    @FindBy (xpath = "//div[@class='bx-im-fullscreen-popup-back']/a")
    public WebElement moduleChatAndCallCloseBtn;

    @FindBy (xpath = "//span[normalize-space()='Workgroups']")
    public WebElement moduleWorkGroups;

    @FindBy (xpath = "//span[normalize-space()='Drive']")
    public WebElement moduleDrive;

    @FindBy (xpath = "//span[normalize-space()='Calendar']")
    public WebElement moduleCalendar;

    @FindBy (xpath = "//span[normalize-space()='Mail']")
    public WebElement moduleMail;

    @FindBy (xpath = "//span[normalize-space()='Contact Center']")
    public WebElement moduleContactCenter;

    @FindBy (xpath = "//li[@id='bx_left_menu_menu_crm_favorite']/a/span[1]")
    public WebElement moduleCrm;

    @FindBy (xpath = "//span[normalize-space()='Time and Reports']")
    public WebElement moduleTimeAndReports;

    @FindBy (xpath = "//span[normalize-space()='Employees']")
    public WebElement moduleEmployees;

    @FindBy (xpath = "//span[normalize-space()='Services']")
    public WebElement moduleServices;

    @FindBy (xpath = "//span[normalize-space()='Company']")
    public WebElement moduleCompany;

    // US_10

    @FindBy (xpath = "//span[@id='feed-add-post-form-tab-tasks']/span")
    public WebElement taskBtn;

    @FindBy (xpath = "//div[@id='bx-component-scope-lifefeed_task_form']/div/div[1]/div[1]/div[2]/input")
    public WebElement taskHeadMsg;

    @FindBy (xpath = "//div[@id='bx-html-editor-iframe-cnt-lifefeed_task_form']/iframe")
    public WebElement taskMsgFrame;

    @FindBy (xpath = "//body[@contenteditable='true']")
    public WebElement taskMsg;

    @FindBy (xpath = "//button[@id='blog-submit-button-save']")
    public WebElement taskSendBtn;

    @FindBy (xpath = "(//div[@class='feed-task-info-label'])[1]")
    public WebElement taskVerify;

    @FindBy (xpath = "//div[@class='task-message-label error']")
    public WebElement taskEmptySendBtnErrorMsg;

    // US_11

    @FindBy (xpath = "//a[normalize-space()='General']")
    public WebElement generalBtn;

    @FindBy (xpath = "(//a[normalize-space()='Tasks'])[2]")
    public WebElement tasksBtn;

    @FindBy (xpath = "(//a[normalize-space()='Drive'])[4]")
    public WebElement driveBtn;

    @FindBy (xpath = "(//a[normalize-space()='Conversations'])[2]")
    public WebElement conversationsBtn;

    @FindBy (xpath = "(//a[normalize-space()='Calendar'])[3]")
    public WebElement calendarBtn;

    // US_12

    //@FindBy (xpath = " (//div[@class='feed-post-text-block-inner-inner'])[1]") //(//div[contains(@class,'feed-post-text-block-inner-inner')])[1]






}

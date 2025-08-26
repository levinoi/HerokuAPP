package com.herokuapp.tests;

import com.herokuapp.core.TestBase;
import com.herokuapp.pages.FileUploadPage;
import com.herokuapp.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileUploadTest extends TestBase {
    FileUploadPage fileUploadPage;

    @BeforeEach
    public void preconditions() {
        fileUploadPage = new FileUploadPage(driver);
        new HomePage(driver).clickOnFileUpload();
    }

    @Test
    public void fileUploadTest() {
        fileUploadPage.uploadFile("/Users/chaikalis/Tools/pic.jpg")
             .submitAndCheck("File Uploaded!");
    }

}

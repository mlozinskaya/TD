package TestData;

import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;

import static TestData.Constants.Filenames.dataFilename;
import static TestData.Constants.JsonKeys.*;

public class TestDataKeeper {
    private final ISettingsFile testData;

    public TestDataKeeper(){
        testData = new JsonSettingsFile(dataFilename);
    }

    public String getVariant(){
        return testData.getValue(varKey).toString();
    }

    public int getTokenSize(){
        return Integer.parseInt(testData.getValue(tokenSizeKey).toString());
    }

    public String getLogin(){
        return testData.getValue(loginKey).toString();
    }

    public String getPassword(){
        return testData.getValue(passwordKey).toString();
    }

    public String getFooterText(){
        return testData.getValue(footerTextKey).toString();
    }

    public String getProjectId(){
        return testData.getValue(projectIdKey).toString();
    }

    public String getSuccessMsg(){
        return testData.getValue(successMsgKey).toString();
    }

    public String getImageName(){ return testData.getValue(imgNameKey).toString(); }

    public String getScreenName(){ return testData.getValue(screenNameKey).toString(); }

    /**
     * TR = Test Rail
     */

    public String getTRUrl(){ return testData.getValue(trUrlKey).toString(); }

    public String getTRLogin(){ return testData.getValue(trLoginKey).toString(); }

    public String getTRPassword(){ return testData.getValue(trPasswordKey).toString(); }

    public String getTRProject(){ return testData.getValue(trProjectIdKey).toString(); }

    public String getTRCaseId(){ return testData.getValue(trCaseIdKey).toString(); }

    public String getTRRunName(){ return testData.getValue(trRunNameKey).toString(); }

    public String getTRCaseStatus(){ return testData.getValue(trCaseStatusKey).toString(); }


}

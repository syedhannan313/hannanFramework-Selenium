package elementAction;

public class TestModules extends PerformElementAction{

    public void click(String elementname, String... dynamicvalues){
        performElementAction( elementname, "click",  dynamicvalues);
    }
    public void clear(String elementname, String... dynamicvalues){
        performElementAction( elementname, "clear",  dynamicvalues);
    }
    public void enterText(String elementname, String... dynamicvalues){
        performElementAction( elementname, "enterText",  dynamicvalues);
    }
    public void getText(String elementname, String... dynamicvalues){
        getText( elementname, "getText",  dynamicvalues);
    }
    public void getAttribute(String elementname,String attributename, String... dynamicvalues){
        getAttribute( elementname, attributename,"getAttribute",  dynamicvalues);
    }

}

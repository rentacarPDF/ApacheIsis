package pruebaMenu;

import org.apache.isis.applib.AbstractContainedObject;
import org.apache.isis.applib.annotation.Hidden;

public abstract class AbstractMenu extends AbstractContainedObject {

    @Hidden
    public String getId() 
    {
        return getClassName();
    }

    protected String getClassName() 
    {
        return getClass().getName();
    }

}

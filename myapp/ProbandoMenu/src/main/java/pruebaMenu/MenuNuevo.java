package pruebaMenu;

import java.util.List;

import org.apache.isis.applib.AbstractService;
import org.apache.isis.applib.annotation.Named;

import com.google.common.collect.Lists;

import dom.todo.ToDoItems;








@Named("menunuevo")
public class MenuNuevo extends AbstractMenu 
{

	 public String default0InstallFor() 
	    {
	        return "guest";
	    }
	    public List<String> choices0InstallFor() 
	    {
	        return Lists.newArrayList("guest", "dick", "bob", "joe","silvana");
	    }

	  private ToDoItems toDoItems;

	    public void setToDoItems(final ToDoItems toDoItems) 
	    {
	        this.toDoItems = toDoItems;
	    }
  
}



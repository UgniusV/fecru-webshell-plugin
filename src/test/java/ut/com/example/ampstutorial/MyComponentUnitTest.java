package ut.com.example.ampstutorial;

import org.junit.Test;
import com.example.ampstutorial.api.MyPluginComponent;
import com.example.ampstutorial.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}
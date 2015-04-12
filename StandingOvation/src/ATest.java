import junit.framework.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class ATest {

    private A a=new A();

    @Test
    public void testRun() throws Exception {

        a.run("input.txt");

    }

    @Test
    public void case1() {
        Assert.assertEquals(0, a.getMinFriends(4, "11111"));
    }

    @Test
    public void case2() {
        Assert.assertEquals(1, a.getMinFriends(1, "09"));
    }

    @Test
    public void case3() {
        Assert.assertEquals(2, a.getMinFriends(5, "110011"));
    }

    @Test
    public void case4() {
        Assert.assertEquals(0, a.getMinFriends(0, "1"));
    }


    @Test
    public void case5() {
        Assert.assertEquals(2, a.getMinFriends(2, "002"));
    }

    @Test
    public void case6() {
        Assert.assertEquals(0, a.getMinFriends(3, "1201"));
    }

    @Test
    public void case7() {
        Assert.assertEquals(2, a.getMinFriends(4, "02001"));
    }
}

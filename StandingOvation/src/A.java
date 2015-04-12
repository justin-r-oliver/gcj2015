import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class A {

    public static void main(String[] args) throws Exception {

        A a=new A();
        a.run(args[0]);
    }

    public String run(String inputFilename) throws Exception{

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(inputFilename).getFile());

        Scanner in = new Scanner(file);
        int T = in.nextInt();

        for(int t=1; t<=T; t++) {
            int sMax=in.nextInt();

            String audience = in.next();

            System.out.printf("Case #%d:%d\n", t, getMinFriends(sMax,audience));
        }

        return null;
    }

    public int getMinFriends(int sMax, String audience) {

        int minFriends = 0;
        int currentStanding = 0;

        for (int currentLevel = 0; currentLevel < sMax + 1; currentLevel++) {

            int shynessLevelCount = new Integer(audience.substring(currentLevel, currentLevel+1));

            if (shynessLevelCount == 0) continue;
            // Audience needs to stand

            int friendsForLevel = 0;
            if (currentStanding < currentLevel) {
                // friends needed
                friendsForLevel = currentLevel - currentStanding;
            }

            minFriends+=friendsForLevel;
            currentStanding+= shynessLevelCount + friendsForLevel;
        }

        return minFriends;
    }

}

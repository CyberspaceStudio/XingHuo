import com.entity.User;
import com.entity.Video;
import com.entity.base.File;
import com.unit.Core;

public class Test {
    public static void main(String[] args){
        Video file = new Video();
        Video file2 = new Video();
        file.setUrl("happy/test.mp4");
        file.decodeFileType();
        String type = file.getFileType();
        file.decodeFileName();
        String name = file.getFileName();
        file.decodeEmotion();
        String emotion = file.getEmotion();
        System.out.println(type);
        System.out.println(name);
        System.out.println(emotion);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        file2 = file;
        file2.setUrl("aaa");
        System.out.println(file2.getUrl());
        System.out.println(file.getUrl());
        User user = new User();
        Core.timeJudge(user);
    }
}

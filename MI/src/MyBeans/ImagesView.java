package MyBeans;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@ManagedBean
public class ImagesView {

    private List<Image> images;
    
    private List<Player> squad;
    
    @PostConstruct
    public void init() {
        images = new ArrayList<Image>();
       
        for (int i = 1; i <= 7; i++) {
        	Image im=new Image();
        	im.setCaption("MI "+i);
        	im.setRes("/images/"+ i + ".jpg");
            images.add(im);
        }
        System.out.println(images);
       
      /*  try{
        	Reader reader = new InputStreamReader(new FileInputStream(new File("C:\\java\\WS2\\MI\\WebContent\\resources\\json\\players.json")));
        
            Gson gson = new GsonBuilder().create();
            Player p = gson.fromJson(reader, Player.class);
            System.out.println(p);
        }catch(Exception e)
        {
        	e.printStackTrace();
        }*/
    }
 
    public List<Image> getImages() {
        return images;
    }
}

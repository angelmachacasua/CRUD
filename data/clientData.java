
package data;

import entities.client;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class clientData {
    static List<client> lis=new CopyOnWriteArrayList<client>();
    static int id=0;
    public clientData(){
        
    }

    public List<client> List() {
        return lis;
    }

    public void create( client d) {
       id=id+1;
       System.out.println("ID"+id);
       d.setId(id);
       lis.add(d);
    }


    public void delete( int id) {
        for(client d:lis){
            if(id==d.getId()){
                lis.remove(d);
                System.out.println("eliminado"+d.getnombre());
            }
        }
    }
    
}

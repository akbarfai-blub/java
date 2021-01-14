import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fy190
 */
public class Username{
    private String name;
    
    public Username() {        
    }
    
    public String getName() {
        return this.name;
    }
    
    public String saveName(String name) {
        try {
            FileOutputStream fout = new FileOutputStream("name.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(name);
            out.flush();
            out.close();
            fout.close();
            return "Success";
        } catch (Exception e) {
            System.out.println(e);
            return "Failed";
        }
    }

    
    public void readName() {
        try {
            FileInputStream fout = new FileInputStream("name.txt");
            ObjectInputStream in = new ObjectInputStream(fout);
            this.name = (String)in.readObject();
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}

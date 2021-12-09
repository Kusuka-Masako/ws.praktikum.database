/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws.praktikum.ws.praktikum.database;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author PAVILION GAMING
 */
@Controller

public class DatabaseController {
    
    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping("/alattulis")
    @ResponseBody
    public List<Alattulis> getAlatTulis(){
        
        List<Alattulis> alattulis = new ArrayList<>();
        
        AlattulisJpaController controller = new AlattulisJpaController();
        
        try {
                alattulis = controller.findAlattulisEntities();
        } catch (Exception e) {}
        
        return alattulis;
    }
    
}

package br.edu.ifpb.atividade1.fjs;

import java.time.LocalDate;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "convert.Data", forClass = LocalDate.class )
public class DataConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        
        if(value == null){
            return null;
        }
        return LocalDate.parse(value);
                
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        
        if(value == null){
            return null;
        }
        return value.toString();
    }
    
}

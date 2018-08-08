package br.edu.ifpb.atividade1.fjs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "convert.Data", forClass = LocalDate.class )
public class DataConverter implements Converter{

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        
        
        if(value == null){
            return null;
        }
        
        LocalDate date = LocalDate.parse(value,formatter);
        return date;
                
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value == null)
        {
            return null;
        }       
        return formatter.format((LocalDate)value);
    }
    
    
}

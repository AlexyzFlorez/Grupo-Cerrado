package gruposcerrados;

import java.util.ArrayList;

/**
 *
 * @author Alexyz
 */
public class Nodo 
{
    private String nombre;
    private String conversación;
    
    Nodo(String nombre)
    {
        this.nombre=nombre;
        this.conversación="";
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void recibirMensaje(String mensaje)
    {
        this.conversación+="\n"+mensaje;
    }
    
    public void enviarMensajeParticular(String mensaje,Nodo emisor, Nodo receptor)
    {   
        receptor.recibirMensaje(emisor.getNombre()+": "+mensaje);
    }
     
    public void enviarMensajeGrupal(String mensaje, Nodo emisor,Grupo receptor)
    {
        receptor.recibirMensaje(emisor.getNombre()+": "+mensaje);
    }
    
    public String getConversacion()
    {
        return this.conversación;
    }
    
    public Nodo elegirDestinatario(String nombreReceptor, ArrayList<Nodo> nodos)
    {
        Nodo destinatario=null;
        for(Nodo nodo : nodos) 
        {     
            if(nombreReceptor.equals(nodo.getNombre()))
            {
                destinatario=nodo;
            }
        }
        return destinatario;
    }
   
}

package gruposcerrados;

import java.util.ArrayList;
/**
 *
 * @author Alexyz
 */
public class Grupo 
{
    private ArrayList<Nodo> grupoNodos;
    private String conversacion;
    
    Grupo()
    {
        this.conversacion="";
        this.grupoNodos=new ArrayList();
    }
    
    public void agregarNodo(Nodo nodo)
    {
        this.grupoNodos.add(nodo);
    }
    
    public void recibirMensaje(String mensaje)
    {
        this.conversacion+="\n"+mensaje;
    }
    
    public String getConversacion()
    {
        return this.conversacion;
    }
    
    public ArrayList getGrupoNodos()
    {
        return this.grupoNodos;
    }
    
    public Nodo getNodo(int pos)
    {
        return this.grupoNodos.get(pos);
    }
    
    public boolean existe(Nodo nodo)
    {
        boolean bandera=false;
        for(Nodo n : grupoNodos)
        {
            if(n==nodo)
            {
                System.out.println("Existe");
                bandera=true;
            }
            else
            {
                
            }
        }
        return bandera;
    }
}

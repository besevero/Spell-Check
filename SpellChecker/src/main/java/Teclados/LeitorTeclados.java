package Teclados;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class LeitorTeclados {
    
    private ArrayList<Teclado> listagemTeclados = new ArrayList<>();
    
    public LeitorTeclados(){}
/**
 * Faz a leitura do XML
 */ 
    public ArrayList<Teclado> leitorTeclados() 
    {
        try 
        {
            File arquivoXML = new File("src\\main\\java\\com\\mycompany\\spellchecker\\Teclados\\Teclados.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document documento = dBuilder.parse(arquivoXML);
            documento.getDocumentElement().normalize();

            NodeList nList = documento.getElementsByTagName("layout");

            for (int i = 0; i < nList.getLength(); i++)
            {
		Node nNode = nList.item(i);
                Teclado teclado = new Teclado();
		Element eElement = (Element) nNode;
               
                teclado.setModelo(eElement.getAttribute("model"));
                
                teclado.setLinha(eElement.getChildNodes().item(1).getTextContent());
                
                teclado.setLinha2(eElement.getChildNodes().item(3).getTextContent());
                
                if(eElement.getChildNodes().item(3).getAttributes().getNamedItem("offset") != null)
                {
                    teclado.setOffset2(Double.parseDouble(eElement.getChildNodes().item(3).getAttributes().getNamedItem("offset").getNodeValue()));
                }
                else
                {
                    teclado.setOffset2(0);
                }
                        
                teclado.setLinha3(eElement.getChildNodes().item(5).getTextContent());
                if(eElement.getChildNodes().item(5).getAttributes().getNamedItem("offset") != null)
                {
                    teclado.setOffset3(Double.parseDouble(eElement.getChildNodes().item(5).getAttributes().getNamedItem("offset").getNodeValue()));
                }
                else
                {
                    teclado.setOffset3(0);
                }
                
                listagemTeclados.add(teclado);
			

		}
	}catch (Exception e) 
    {
	e.printStackTrace();
    }
         listagemTeclados.add(new Teclado("Neutro", "", "", "", 0, 0));
         return listagemTeclados;
    }
    
}


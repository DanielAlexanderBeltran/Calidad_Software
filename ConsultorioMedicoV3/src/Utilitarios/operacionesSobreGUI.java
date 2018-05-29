package Utilitarios;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Component;
import java.awt.Container;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class operacionesSobreGUI {
	public Component comp=new Component() {
		private static final long serialVersionUID = 1L;
	};
	public operacionesSobreDB objGestGui=new operacionesSobreDB();

	//INICIO REINICIAR JTABLE
	public void reiniciarJTable(DefaultTableModel dtblmodGenereic)
	{
		while(dtblmodGenereic.getRowCount()>0)
		{
			dtblmodGenereic.removeRow(0);
		}
		
	}
	//FIN REINICIAR JTABLE
	//-----------------------------------------------------------------
	//INICIO VALIDAR EXISTENCIA JTABLE
	public boolean validarExistencia(JTable jtbGeneric,String strParaBuscar, int intColToFind)
	{
		
		boolean blnResultado=false;
		for(int i=0; i<jtbGeneric.getRowCount(); i++)
		{
			if(jtbGeneric.getValueAt(i,intColToFind).toString().equals(strParaBuscar))
			{
				blnResultado=true;
				break;
			}
			else
			{
				blnResultado=false;
			}
		}
		return blnResultado;
	}
	//FIN VALIDAR EXISTENCIA JTABLE
	//------------------------------------------------------------------
	//INICIO LIMPIAR INTERFACE
	public void limpiarINterface()
	{
		
	}
	//FIN LIMPIAR INTERFACE
	//-------------------------------------------------------------------
	//INICIO LLENAR COMBOS DINAMICOS
	public void llenarComboDinamico(JComboBox<String> jcbOut, JComboBox<String> jcbIn, String strSqlIn,ArrayList<Integer> arrListPOs)
	{
		
		//para usar esta clase se deneb tener en desde el lugar de su llamado
		//un arrallist<Integer> por cada combo a llenarse
		arrListPOs.add(jcbOut.getSelectedIndex());
			if(arrListPOs.size()<2)
			{
				
				objGestGui.llenarCombo(jcbIn, strSqlIn);
			}
			else
			{
				
				//pos.add(jcbProvincia.getSelectedIndex());
				if(arrListPOs.size()>=2&&(arrListPOs.get(arrListPOs.size()-1)==arrListPOs.get(arrListPOs.size()-2)))
				{
					arrListPOs.remove(0);
					
				}
				if(arrListPOs.size()>=2&&(arrListPOs.get(arrListPOs.size()-1)!=arrListPOs.get(arrListPOs.size()-2)))
				{
					//System.out.println("ha cambiado");
					
					while(jcbIn.getItemCount()>1)
					{
						jcbIn.removeItemAt(1);
					}
					objGestGui.llenarCombo(jcbIn, strSqlIn);
					
					arrListPOs.remove(0);
					
					
				}
			
		}
	}
	//FIN LLENAR COMBOS DINAMICOS
	//-------------------------------------------------------------------
	//INICIO LLENAR listas dinamicas en funcion de combos
	public void llenarComboDinamico(JComboBox<String> jcbOut, JComboBox<String> jcbIn, String strSqlIn,ArrayList<Integer> arrListPOs, ArrayList<String> lstParalela)
	{
		
		//para usar esta clase se deneb tener en desde el lugar de su llamado
		//un arrallist<Integer> por cada combo a llenarse
		arrListPOs.add(jcbOut.getSelectedIndex());
			if(arrListPOs.size()<2)
			{
				
				objGestGui.llenarCombo(jcbIn, strSqlIn);
				objGestGui.llenarArrayLis(lstParalela, strSqlIn, 2);
			}
			else
			{
				
				//pos.add(jcbProvincia.getSelectedIndex());
				if(arrListPOs.size()>=2&&(arrListPOs.get(arrListPOs.size()-1)==arrListPOs.get(arrListPOs.size()-2)))
				{
					arrListPOs.remove(0);
					
				}
				if(arrListPOs.size()>=2&&(arrListPOs.get(arrListPOs.size()-1)!=arrListPOs.get(arrListPOs.size()-2)))
				{
					//System.out.println("ha cambiado");
					
					while(jcbIn.getItemCount()>1)
					{
						jcbIn.removeItemAt(1);
					}
					lstParalela.removeAll(lstParalela);
					objGestGui.llenarCombo(jcbIn, strSqlIn);
					objGestGui.llenarArrayLis(lstParalela, strSqlIn, 2);
					
					arrListPOs.remove(0);
					
					
				}
			
		}
	}
		//FIN LLENAR listas dinamicas
		//-------------------------------------------------------------------
	//inicio desactivacion de los paneles
		public void ActivarDesactivarContenedores(Container c, boolean f)
		{
			for(int i=0;i<c.getComponents().length;i++) {
				c.getComponent(i).setEnabled(f);
			}
		}
		//fin desactivacion paneles
	//-------------------------------------------------------------------
	//VALIDACION EN TIEMPO REAL TAMAÑO LONGITUD Y TIPO DE DATO
	//-------------------------------------------------------------------
	public void sLetras(JTextField a,int tam )
	{
		a.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e)
			{
				char c=e.getKeyChar();
				if((!Character.isLetter(c)&&!Character.isSpaceChar(c))||a.getText().length()>tam-1)
				{
					e.consume();
					comp.getToolkit().beep();
				}
			}
		});
	}
	public void sNumeros(JTextField a,int tammax)
	{
		a.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e)
			{
				char c=e.getKeyChar();
				if(!Character.isDigit(c)||(a.getText().length()>tammax-1 ))
				{
					e.consume();
					comp.getToolkit().beep();
				}
			}
		});
	}
	public void sTamañoJtfield (JTextField a, int tam)
	{
		a.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e)
			{
				if(a.getText().length()>tam-1)
				{
					e.consume();
					comp.getToolkit().beep();
				}
			}
		});
	}
	
	public void sTamañoJArea (JTextArea a, int tam)
	{
		a.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e)
			{
				if(a.getText().length()>tam-1)
				{
					e.consume();
					comp.getToolkit().beep();
				}
			}
		});
	}
	//FIN VALIDACIONES EN TIEMPO REAL
	//-----------------------------------------------------------
	//inicio validacion cedula
	public boolean ValidarCedula(String id)
	{
		int intcedula[]={1,2,3,4,5,6,7,8,9,0};
		int intsumimp=0,intsumpa=0,intsumtot,intdobleimp,intdigver;
		String str12=id.substring(0, 2);
		if(Integer.parseInt(str12)>=1&&Integer.parseInt(str12)<=24)
		{
			//char chrcadena[]=id.toCharArray();
			for(int i=0; i<=9;i++)
			{
				intcedula[i]=Integer.parseInt(""+id.charAt(i));
			}
			for(int i=0;i<=9;i=i+2)
			{
				intdobleimp=2*intcedula[i];
				if(intdobleimp>9)
					intdobleimp-=9;
				intsumimp+=intdobleimp;
			}
			for(int i=1;i<=8;i=i+2)
			{
				intsumpa+=intcedula[i];
			}
			intsumtot=intsumimp+intsumpa;
			intdigver=10-(intsumtot%10);
			if(intcedula[9]==intdigver)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	//fin valdacion cedula
	//---------------------------------------------------------
	//inicio validacion fecha (polimorfica)
	public int compararFechas(String strFecha) 
	{  
		int res=0;
		String arrStrFecha1[]=strFecha.split("-");
		if((Integer.parseInt(arrStrFecha1[1])>12||Integer.parseInt(arrStrFecha1[1])<1)&&(Integer.parseInt(arrStrFecha1[2])>31||Integer.parseInt(arrStrFecha1[2])<1))
		{
			res=-6; //fallo mes y dia fuera de rango 
		}
		else if(Integer.parseInt(arrStrFecha1[2])>31||Integer.parseInt(arrStrFecha1[2])<1)
		{
			res=-3; //fallo dia fuera de rango
		}
		else if(Integer.parseInt(arrStrFecha1[1])>12||Integer.parseInt(arrStrFecha1[1])<1)
		{
			res=-2;//fallo mes fuera de rango
		}
		else
		{
			try {
				SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd"); 
				Date fechaDate1 = formateador.parse(strFecha);
				Date fechaDate2 =new Date();//formateador.parse(fechaActStr);

				if ( fechaDate1.before(fechaDate2) )
				{
					res=-1;
				}
				else
				{
					if ( fechaDate2.before(fechaDate1) )
					{
						res=1;
					}
					else
					{
						res=0;
					} 
				}
			} 
			catch (ParseException e)
			{
				System.out.println("Se Produjo un Error!!!  "+e.getMessage());
			} 
		}
		return res;
	}
	//--------------------------------------------------------
	public int compararFechas(String strFecha1, String strFecha2)
	{
		int res=0;
		String arrStrFecha1[]=strFecha1.split("-");
		if((Integer.parseInt(arrStrFecha1[1])>12||Integer.parseInt(arrStrFecha1[1])<1)&&(Integer.parseInt(arrStrFecha1[2])>31||Integer.parseInt(arrStrFecha1[2])<1))
		{
			res=-6; //fallo mes fuera de rango 
		}
		else if(Integer.parseInt(arrStrFecha1[2])>31||Integer.parseInt(arrStrFecha1[2])<1)
		{
			res=-3; //fallo dia fuera de rango
		}
		else if(Integer.parseInt(arrStrFecha1[1])>12||Integer.parseInt(arrStrFecha1[1])<1)
		{
			res=-2;
		}
		else
		{
			try 
			{
				SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd"); 
				Date fechaDate1 = formateador.parse(strFecha1);
				Date fechaDate2 = formateador.parse(strFecha2);
	
				if ( fechaDate1.before(fechaDate2) )
				{
					res=-1;
				}
				else{
					if ( fechaDate2.before(fechaDate1) )
					{
						res=1;
					}
					else
					{
						res=0;
					} 
				}
			} catch (ParseException e) {
				System.out.println("Se Produjo un Error!!!  "+e.getMessage());
			}
		}
		return res;
	}
	//fin validacion fecha(polimorfica)
}

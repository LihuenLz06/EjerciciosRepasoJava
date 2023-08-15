
package com.mycompany.jdbcex1;

import com.mycompany.jdbcex1.DAO.CasasDAO;
import com.mycompany.jdbcex1.DAO.FamiliasDAO;

public class JDBCEx1 {

   public static void main(String[] args) {
        
       FamiliasDAO familia = new FamiliasDAO();
       CasasDAO casa = new CasasDAO();
       
       familia.listarFamilias();
       casa.listarCasasDisponibles();
       familia.hotmailFasmilias();
       casa.CasasDisponiblesDatos();
       
    }
}

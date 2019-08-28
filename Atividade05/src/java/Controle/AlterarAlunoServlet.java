/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.AlunoBO;
import modelo.entidades.Aluno;

/**
 *
 * @author 18114290023
 */
@WebServlet(name = "AlterarAlunoServlet", urlPatterns = {"/aluno/alterar"})
public class AlterarAlunoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
         Aluno aluno = new Aluno();   
         int id = Integer.parseInt(request.getParameter("id"));
         AlunoBO bo = new AlunoBO();
         
        out.print ("<!DOCTYPE html>");
        out.print ("<html>");
        out.print ("<head>");
        out.print ("<title> Cadastro de Alunos</title>");
        out.print ("</head>");
        out.print ("<body>");
        out.print ("<h1> Alterar Aluno</h1>");
        out.print ("<form>");
        out.print ("action = '/aluno/alterar' method = 'post'>");
        out.print ("<input>"); 
        out.print ("type = 'hidden' name = 'id' value = '' />");
        out.print ("<div>");
        out.print ("<label > Matrícula:</label>");
        out.print ("<input>"); 
        out.print ("type = 'text' name = 'matricula' size = '15' value = ''>");
        out.print ("</div>");
        out.print ("<div>");
        out.print ("<label> Nome:</label>");
        out.print ("<input type = 'text' name = 'nome' size = '30' value = ''>");
        out.print ("</div>");
        out.print ("<input type = 'submit' value = 'Salvar' />");
        out.print ("<a href = '/aluno/listar' > Desistir <  / a>");
        out.print ("</form>");
        out.print ("</body>");
        out.print ("</html >");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

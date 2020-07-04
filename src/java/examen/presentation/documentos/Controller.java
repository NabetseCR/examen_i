package examen.presentation.documentos;

import examen.logic.Persona;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "DocumentoController", urlPatterns = {"/presentation/user/documentos/show", 
"/presentation/user/documentos/filter", "/presentation/user/documentos/add"})
public class Controller extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("model", new Model());

        String viewUrl = "";
        switch (request.getServletPath()) {
            case "/presentation/user/documentos/show":
                viewUrl = this.show(request);
                break;
            case "/presentation/user/documentos/filter":
                viewUrl = this.filter(request);
                break;
            case "/presentation/user/documentos/add":
                viewUrl = this.add(request);
                break;
        }
        request.getRequestDispatcher(viewUrl).forward(request, response);
    }

    void updateModel(HttpServletRequest request) {
        Model model = (Model) request.getAttribute("model");
        HttpSession session = request.getSession(true);
        String codigo = request.getParameter("tipo");
        examen.logic.Model domainModel = examen.logic.Model.instance();
        model.setDocumentos(domainModel.documentosFindbyTipo(codigo));
    }

    public String show(HttpServletRequest request) {
        return this.showAction(request);
    }
    
    public String filter(HttpServletRequest request) {
        return this.filterAction(request);
    }
    
    public String add(HttpServletRequest request){
        return this.addAction(request);
    }

    public String showAction(HttpServletRequest request) {
        return "/presentation/user/documentos/view.jsp";
    }
    
    public String filterAction(HttpServletRequest request){
        updateModel(request);
        return "/presentation/user/documentos/view.jsp";
    }
    
    public String addAction(HttpServletRequest request){
        Model model = (Model) request.getAttribute("model");
        HttpSession session = request.getSession(true);
        String id = request.getParameter("idFld");
        examen.logic.Model domainModel = examen.logic.Model.instance();
        model.addDocumento(domainModel.documentoFindbyId(id));
        return "/presentation/user/documentos/view.jsp";
    }

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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

}

package edu.uag.iidis.scec.control;

import edu.uag.iidis.scec.vista.*;
import edu.uag.iidis.scec.modelo.*;
import edu.uag.iidis.scec.servicios.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;



public final class MCUEliminarRespuesta 
        extends MappingDispatchAction {

    private Log log = LogFactory.getLog(MCURegistrarUsuario.class);


    public ActionForward procesarEliminarRespuesta(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">procesarEliminarRespuesta!!!");
        }
      
        FormaEliminarRespuesta forma = (FormaEliminarRespuesta)form;
        ManejadorRespuestas mr = new ManejadorRespuestas();
        mr.eliminarRespuesta(forma.getId());
        return (mapping.findForward("exito"));
    }
}
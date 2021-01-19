package ncu.im3069.controller;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.*;
import org.json.*;

import ncu.im3069.app.AssignmentHelper;
import ncu.im3069.tools.JsonReader;

@WebServlet("/api/assignment.do")
public class AssignmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AssignmentHelper ah =  AssignmentHelper.getHelper();

    public AssignmentController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/** 透過JsonReader類別將Request之JSON格式資料解析並取回 */
        JsonReader jsr = new JsonReader(request);
        /** 若直接透過前端AJAX之data以key=value之字串方式進行傳遞參數，可以直接由此方法取回資料 */
        String course_id = jsr.getParameter("id");

        JSONObject resp = new JSONObject();
        JSONObject query = ah.getListByCourseId(course_id);

        resp.put("status", "200");
        resp.put("message", "assignment取得成功");
        resp.put("response", query);

        jsr.response(resp, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

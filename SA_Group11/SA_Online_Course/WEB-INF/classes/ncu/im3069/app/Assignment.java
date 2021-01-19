package ncu.im3069.app;

import org.json.*;

public class Assignment {

    private int id;
    private String name;
    private	int course_id;
    private int user_id;
	private String desc;
	private String start_time;
	private String deadline;
	private int score = 0;

	// constructor for adding new assignment
    public Assignment(int id, String name, int course_id, int user_id, String desc, String start_time,
			String deadline) {
		this.id = id;
		this.name = name;
		this.course_id = course_id;
		this.user_id = user_id;
		this.desc = desc;
		this.start_time = start_time;
		this.deadline = deadline;
	}

	public Assignment(int id, String name, int course_id, int user_id, String desc, String start_time,
			String deadline, int score) {
		this.id = id;
		this.name = name;
		this.course_id = course_id;
		this.user_id = user_id;
		this.desc = desc;
		this.start_time = start_time;
		this.deadline = deadline;
		this.score = score;
	}

	public int getID() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}
	
	public int getCourseId() {
		return course_id;
	}
	
	public int getUserId() {
		return user_id;
	}

	public String getDesc() {
		return desc;
	}

	public String getStartTime() {
		return start_time;
	}

	public String getDeadline() {
		return deadline;
	}
	
	public void calcScore() {
		this.score = (int) (Math.random()*100)+60;
	}
	
	public int getScore() {
		return score;
	}

	public JSONObject getData() {
        /** 透過JSONObject將該項產品所需之資料全部進行封裝*/
        JSONObject jso = new JSONObject();
        jso.put("id", getID());
        jso.put("name", getName());
        jso.put("course_id", getCourseId());
        jso.put("user_id", getUserId());        
        jso.put("desc", getDesc());
        jso.put("start_time", getStartTime());
        jso.put("deadline", getDeadline());
        jso.put("score", getScore());
        
        return jso;
    }


	
}

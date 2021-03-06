package cn.luo.ssm.po;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Calendars {
    private Integer calendarId;

    private Integer staId;

    private String calendaName;

    private String calendaContent;

    private String calendaRemark;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date calendaStartTime;

    private Date calendaEndTime;

    private String calendaType;

    private String calendaOne;

    private Date calendaCreate;

    private String calendaFile;
    
 
    
    private String startTime;
  	private String endTime;
  	
  	
  	private String stanumber;
  	
  	private String createAuthor;
  	
  	private String staname;
  	
  	
  	private String order;//排序方式
  	
  	private String sort;//排序字段
  	//附件
  	private String calendServerName;
  	
  	
  	

  
	public String getCalendServerName() {
		return calendServerName;
	}

	public void setCalendServerName(String calendServerName) {
		this.calendServerName = calendServerName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStanumber() {
		return stanumber;
	}

	public void setStanumber(String stanumber) {
		this.stanumber = stanumber;
	}

	public String getCreateAuthor() {
		return createAuthor;
	}

	public void setCreateAuthor(String createAuthor) {
		this.createAuthor = createAuthor;
	}

	public String getStaname() {
		return staname;
	}

	public void setStaname(String staname) {
		this.staname = staname;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public Integer getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(Integer calendarId) {
        this.calendarId = calendarId;
    }

    public Integer getStaId() {
        return staId;
    }

    public void setStaId(Integer staId) {
        this.staId = staId;
    }

    public String getCalendaName() {
        return calendaName;
    }

    public void setCalendaName(String calendaName) {
        this.calendaName = calendaName == null ? null : calendaName.trim();
    }

    public String getCalendaContent() {
        return calendaContent;
    }

    public void setCalendaContent(String calendaContent) {
        this.calendaContent = calendaContent == null ? null : calendaContent.trim();
    }

    public String getCalendaRemark() {
        return calendaRemark;
    }

    public void setCalendaRemark(String calendaRemark) {
        this.calendaRemark = calendaRemark == null ? null : calendaRemark.trim();
    }

    public Date getCalendaStartTime() {
        return calendaStartTime;
    }

    public void setCalendaStartTime(Date calendaStartTime) {
        this.calendaStartTime = calendaStartTime;
    }

    public Date getCalendaEndTime() {
        return calendaEndTime;
    }

    public void setCalendaEndTime(Date calendaEndTime) {
        this.calendaEndTime = calendaEndTime;
    }

    public String getCalendaType() {
        return calendaType;
    }

    public void setCalendaType(String calendaType) {
        this.calendaType = calendaType == null ? null : calendaType.trim();
    }

    public String getCalendaOne() {
        return calendaOne;
    }

    public void setCalendaOne(String calendaOne) {
        this.calendaOne = calendaOne == null ? null : calendaOne.trim();
    }

    public Date getCalendaCreate() {
        return calendaCreate;
    }

    public void setCalendaCreate(Date calendaCreate) {
        this.calendaCreate = calendaCreate;
    }

    public String getCalendaFile() {
        return calendaFile;
    }

    public void setCalendaFile(String calendaFile) {
        this.calendaFile = calendaFile == null ? null : calendaFile.trim();
    }
}
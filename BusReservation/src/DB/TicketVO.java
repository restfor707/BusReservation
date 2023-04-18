package DB;

import java.sql.Date;

public class TicketVO {
	private String ticketNum;
	private String placeNum;
	private String terminal;
	private String area;
	private Date startDate;
	
	public TicketVO(String ticketNum, String placeNum, String terminal, String area, Date startDate) {
		this.ticketNum = ticketNum;
		this.placeNum = placeNum;
		this.terminal = terminal;
		this.area = area;
		this.startDate = startDate;
	}

	public String getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(String ticketNum) {
		this.ticketNum = ticketNum;
	}

	public String getPlaceNum() {
		return placeNum;
	}

	public void setPlaceNum(String placeNum) {
		this.placeNum = placeNum;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	
}

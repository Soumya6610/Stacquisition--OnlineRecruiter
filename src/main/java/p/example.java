package p;



import com.sun.net.httpserver.Authenticator.Success;


import java.util.List;
@SuppressWarnings("unused")
public class example {
	private Long jid;
	private String pos;
	private String cri;
	private Long vac;
	private Long sal;
	private String lad;
	private List<example> depotList;
	
	
	public List<example> getDepotList() {
		return depotList;
	}
	public void setDepotList(List<example> depotList) {
		this.depotList = depotList;
	}
	public Long getJid() {
		return jid;
	}
	public void setJid(Long jid) {
		this.jid = jid;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getCri() {
		return cri;
	}
	public void setCri(String cri) {
		this.cri = cri;
	}
	public Long getVac() {
		return vac;
	}
	public void setVac(Long vac) {
		this.vac = vac;
	}
	public Long getSal() {
		return sal;
	}
	public void setSal(Long sal) {
		this.sal = sal;
	}
	public String getLad() {
		return lad;
	}
	public void setLad(String lad) {
		this.lad = lad;
	}
	DbLogic dl=new DbLogic();
	public String exa() throws Exception
	{
		
	
	   int i=DbConnect.getStatement().executeUpdate("update jobdetails set post='"+getPos()+"',criteria='"+getCri()+"',VACANCY='"+getVac()+"',salary='"+getSal()+"',lastDate='"+getLad()+"' where j_id="+getJid()+"");
	
		return "success";
	}
	
}

package p;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport implements ServletRequestAware{
	private String firstname;
	private String middlename;
	private String lastname;
	private String date1;
	private Long age;
	private String gender;
	private String category;
	private String nationality;
	private String fathers_name;
	private String fathers_occupation;
	private String mothers_name;
	private String email_id;
	private Long contact_no;
	private String present_address;
	private String permanent_address;
	private String board;
	private String institute;
	private Long loginid;
	private String p1;
	private String p2;
	private String name;
	private String address;
	private String post;
	private Long contact;
	private String r;
	private File resume;
	private HttpServletRequest servletRequest;
	private String userImageFileName;
	private int selectuser;
	private int result1;
	
	private Long hdnHallTicket;
	public Long getHdnHallTicket()
	{
		return hdnHallTicket;
	}
	public void setHdnHallTicket(Long hdnHallTicket)
	{
		this.hdnHallTicket=hdnHallTicket;
	}
	
 
		

	public void setResume(File resume) {
		this.resume = resume;
	
	}
	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}
	
	public int getSelectuser() {
		return selectuser;
	}
	public void setSelectuser(int selectuser) {
		this.selectuser = selectuser;
	}
	
	private Long accountno;
	private Long balance;
	private Long j_id;
    private String Branch;
    private Long Regdno;
    
	
	private String Criteria;
	
	private Long exam_id;

	/*private String ;
	private Long Js_id;
	private String ;*/
	private Long Vacancies;
	private Long Salary;
	private String LastDate;
	private List<String> viewList;
	private Long Js_id;
	private String branch;
	private Long regdno;
	private Long q_id;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String bankanme;
	
	
	public String getBankanme() {
		return bankanme;
	}
	public void setBankanme(String bankanme) {
		this.bankanme = bankanme;
	}
	public Long getAccountno() {
		return accountno;
	}
	public void setAccountno(Long accountno) {
		this.accountno = accountno;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	public String getR() {
		return r;
	}
	public void setR(String r) {
		this.r = r;
	}
	public Long getQ_id() {
		return q_id;
	}
	public void setQ_id(Long qId) {
		q_id = qId;
	}
	private String slno;
	public String getSlno() {
		return slno;
	}
	public void setSlno(String slno) {
		this.slno = slno;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Long getRegdno() {
		return regdno;
	}
	public void setRegdno(Long regdno) {
		this.regdno = regdno;
	}
	public void setViewList(List<String> viewList) {
		this.viewList = viewList;
	}
	public String getLastDate() {
		return LastDate;
	}
	public void setLastDate(String lastDate) {
		LastDate = lastDate;
	}

	
	


	public String Logout()throws Exception {
		Map map=ActionContext.getContext().getSession();
		map.clear();
			return "Logout";
		}


	public String euserlogin() throws Exception {
		setMsg("Successfully Logged Out");
		return "euserlogin";
	}


	
	
	public Long getJ_id() {
		return j_id;
	}
	public void setJ_id(Long jId) {
		j_id = jId;
	}






	
	public String getCriteria() {
		return Criteria;
	}
	public void setCriteria(String criteria) {
		Criteria = criteria;
	}
	
	
	public Long getVacancies() {
		return Vacancies;
	}
	public void setVacancies(Long vacancies) {
		Vacancies = vacancies;
	}
	public Long getSalary() {
		return Salary;
	}
	public void setSalary(Long salary) {
		Salary = salary;
	}
	public String getP1() {
		return p1;
	}
	public void setP1(String p1) {
		this.p1 = p1;
	}
	public String getP2() {
		return p2;
	}
	public void setP2(String p2) {
		this.p2 = p2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	
	public Long getMarks() {
		return marks;
	}
	public void setMarks(Long marks) {
		this.marks = marks;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public Long getYear() {
		return year;
	}
	public void setYear(Long year) {
		this.year = year;
	}
	public Long getTwyear() {
		return twyear;
	}
	public void setTwyear(Long twyear) {
		this.twyear = twyear;
	}
	public DbLogic getDl() {
		return dl;
	}
	public void setDl(DbLogic dl) {
		this.dl = dl;
	}
	public Long getTwmarks() {
		return twmarks;
	}
	public void setTwmarks(Long twmarks) {
		this.twmarks = twmarks;
	}
	public Long getGmarks() {
		return gmarks;
	}
	public void setGmarks(Long gmarks) {
		this.gmarks = gmarks;
	}
    private Long js_id;
	private String twboard;
	private String twinstitute;
	private Long gyear;
	private String ginstitute;
	
	
	private Long year;
	private Long marks;
	private String course;
	private Long twyear;
	private Long twmarks;
	private Long gmarks;
	private Long registration_no;
	
	public Long getJs_id() {
		return js_id;
	}
	public void setJs_id(Long jsId) {
		js_id = jsId;
	}
	private Long PGyear;
	private String PGinstitute;
	private String PGCourse;
	private Long PGmarks;
    private Long examid;
    private String examname;
    private String rounds;
    private String round_name;
    private Long hallticketno;
    private Long payment;
 

	
	
	
	
	public Long getPayment() {
		return payment;
	}
	public void setPayment(Long payment) {
		this.payment = payment;
	}
	public Long getHallticketno() {
		return hallticketno;
	}
	public void setHallticketno(Long hallticketno) {
		this.hallticketno = hallticketno;
	}
	public String getRounds() {
		return rounds;
	}
	public void setRounds(String rounds) {
		this.rounds = rounds;
	}
	public String getRound_name() {
		return round_name;
	}
	public void setRound_name(String roundName) {
		round_name = roundName;
	}
	public Long getExamid() {
		return examid;
	}
	public Long getRegistration_no() {
		return registration_no;
	}
	public void setRegistration_no(Long registrationNo) {
		registration_no = registrationNo;
	}
	public void setExamid(Long examid) {
		this.examid = examid;
	}
	public String getExamname() {
		return examname;
	}
	public void setExamname(String examname) {
		this.examname = examname;
	}
	public String getPGinstitute() {
		return PGinstitute;
	}
	public void setPGinstitute(String pGinstitute) {
		PGinstitute = pGinstitute;
	}
	public String getPGCourse() {
		return PGCourse;
	}
	public void setPGCourse(String pGCourse) {
		PGCourse = pGCourse;
	}
	public Long getPGmarks() {
		return PGmarks;
	}
	public void setPGmarks(Long pGmarks) {
		PGmarks = pGmarks;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public String getTwboard() {
		return twboard;
	}
	public void setTwboard(String twboard) {
		this.twboard = twboard;
	}
	public String getTwinstitute() {
		return twinstitute;
	}
	public void setTwinstitute(String twinstitute) {
		this.twinstitute = twinstitute;
	}
	
	public String getGinstitute() {
		return ginstitute;
	}
	public Long getGyear() {
		return gyear;
	}
	public void setGyear(Long gyear) {
		this.gyear = gyear;
	}
	public Long getPGyear() {
		return PGyear;
	}
	public void setPGyear(Long pGyear) {
		PGyear = pGyear;
	}
	public void setGinstitute(String ginstitute) {
		this.ginstitute = ginstitute;
	}
	
	
	public Long getLoginid() {
		return loginid;
	}
	public void setLoginid(Long loginid) {
		this.loginid = loginid;
	}
	
    private String date11;
	private String username;
	private String password;
	private String usertype;
	private String status;
	
	public String msg;
	public String c_name;
	public String c_address;
	public String c_post;
	public String c_email;
	public Long c_contactno;
	public Long c_cuttoff;
	public Long c_id;
	public String c_criteria;
	public String securityquestion;
		public String answer;
	public Long salary1;
	
		
		
	public String getDate11() {
			return date11;
		}
		public void setDate11(String date11) {
			this.date11 = date11;
		}
	public Long getC_cuttoff() {
			return c_cuttoff;
		}
		public void setC_cuttoff(Long cCuttoff) {
			c_cuttoff = cCuttoff;
		}
	public Long getC_contactno() {
		return c_contactno;
	}
	public void setC_contactno(Long cContactno) {
		c_contactno = cContactno;
	}
	
	public String getC_criteria() {
		return c_criteria;
	}
	public void setC_criteria(String cCriteria) {
		c_criteria = cCriteria;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	private Map<Integer,String>mapForSelect;
	private Map<Integer,String>mapForSelect1;
	
	
	public Map<Integer, String> getMapForSelect1() {
		return mapForSelect1;
	}
	public void setMapForSelect1(Map<Integer, String> mapForSelect1) {
		this.mapForSelect1 = mapForSelect1;
	}
	public Map<Integer, String> getMapForSelect() {
		return mapForSelect;
	}
	public void setMapForSelect(Map<Integer, String> mapForSelect) {
		this.mapForSelect = mapForSelect;
	}
	public String getSecurityquestion() {
		return securityquestion;
	}
	public void setSecurityquestion(String securityquestion) {
		this.securityquestion = securityquestion;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getFathers_name() {
		return fathers_name;
	}
	public void setFathers_name(String fathersName) {
		fathers_name = fathersName;
	}
	public String getFathers_occupation() {
		return fathers_occupation;
	}
	public void setFathers_occupation(String fathersOccupation) {
		fathers_occupation = fathersOccupation;
	}
	public String getMothers_name() {
		return mothers_name;
	}
	public void setMothers_name(String mothersName) {
		mothers_name = mothersName;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String emailId) {
		email_id = emailId;
	}
	public String getPresent_address() {
		return present_address;
	}
	public void setPresent_address(String presentAddress) {
		present_address = presentAddress;
	}
	public String getPermanent_address() {
		return permanent_address;
	}
	public void setPermanent_address(String permanentAddress) {
		permanent_address = permanentAddress;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String cName) {
		c_name = cName;
	}
	public String getC_address() {
		return c_address;
	}
	public void setC_address(String cAddress) {
		c_address = cAddress;
	}
	public String getC_post() {
		return c_post;
	}
	public void setC_post(String cPost) {
		c_post = cPost;
	}
	public String getC_email() {
		return c_email;
	}
	public void setC_email(String cEmail) {
		c_email = cEmail;
	}
	
		
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public Long getContact_no() {
		return contact_no;
	}
	public void setContact_no(Long contactNo) {
		contact_no = contactNo;
	}
	
	
	public Long getSalary1() {
		return salary1;
	}
	public void setSalary1(Long salary1) {
		this.salary1 = salary1;
	}
	public Long getC_id() {
		return c_id;
	}
	public void setC_id(Long cId) {
		c_id = cId;
	}

	DbLogic dl=new DbLogic();
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String LoginData()throws Exception
	 {System.out.println(username+password+usertype);
	 Long id=null;
	 Long c_id=null;
		ResultSet rs=dl.RetLogin(username,password,usertype);
		 
		
		 
		 if(rs.next())
		 {
			 id=rs.getLong(1);
			 String status=rs.getString("userstatus");
			 String utype=rs.getString("USERTYPE");
              System.out.println("cccc"+utype);


			 if(usertype.equals("admin"))
			 {
				 return "admin";
			 }
			 if(status.equals("approved")&& utype.equals("jobseeker"))
			 {
				 Map session=ActionContext.getContext().getSession();
				 session.put("LOGIN_ID",rs.getString(1));
					session.put("LOGINID",rs.getString(2));
					session.put("LOGINID",rs.getString(3));
					

					

					session.put("JOBSEEKERID",rs.getString(6)); 
					String aa =(String)session.get("JOBSEEKERID");
				System.out.println("eeeeee"+aa);
				return "jobseeker";
			 }
			 if(status.equals("approved")&& utype.equals("company"))
			 {
				 Map session=ActionContext.getContext().getSession();
					session.put("COMPANY_ID1",rs.getString(1));
					session.put("COMPANYID",rs.getString(6));
				session.get("xxxx"+"COMPANY_ID");
				
				 return "company";
			 }
		 }
		 setMsg("Invalid UserName/Password");
		 return "loginfail";
	 }
	public String RegisterData()throws Exception
	 {
		String filePath=servletRequest.getSession().getServletContext().getRealPath("/");
		String filetofolder=filePath+"resume";
		System.out.println(filetofolder);
		
		File filetoCreate=new File(filetofolder,this.userImageFileName);
		System.out.println(userImageFileName);
		FileUtils.copyFile(this.resume,filetoCreate);
		 int i=0;
		 String s = getDate1();
			System.out.println(getDate1());
			String dd = "";
			/*SimpleDateFormat  d=new SimpleDateFormat("dd/mm/yyyy");
			String date=d.format(s);*/
			String months[] = {
					"Jan", "Feb", "Mar", "Apr",
					"May", "Jun", "Jul", "Aug",
					"Sep", "Oct", "Nov", "Dec"};
			dd = s.substring(0, 10);
			String day = dd.substring(8);
			String month = dd.substring(5, 7);
			String year = dd.substring(0, 4);
			int m = Integer.parseInt(month);
			String date = day+"-"+months[m-1]+"-"+year;
			setDate1(date);
		 ResultSet rs=dl.RegisterStudent(getUsername(),getPassword(),getFirstname(),getMiddlename(),getLastname(),getDate1(),getAge(),getGender(),getBranch(),getRegdno(),getCategory(),getNationality(),getFathers_name(),getFathers_occupation(),getMothers_name(),getEmail_id(),getContact_no(),getPresent_address(),getPermanent_address(),getBoard(),getYear(),getMarks(),getTwboard(),getTwyear(),getTwmarks(),getGinstitute(),getCourse(),getGyear(),getGmarks(),getPGinstitute(),getPGCourse(),getPGyear(),getPGmarks(),filetoCreate);
		/* if(rs.next())
		 {
			 setUsername(rs.getString(1));
		 }
		 ResultSet rs1=dl.retid(getUsername());
		 if(rs1.next())
		 {
			 setLoginid(rs1.getLong(1));
		 }
		 ResultSet rss=DbConnect.getStatement().executeQuery("select js_id from jobseeker where login_id="+getLoginid()+"");
		 if(rss.next())
		 {
			 setJs_id(rss.getLong(1));
		 }*/
		 reset();
		 setMsg("Succesfully Registered");
		 return"registersuccess";
	 }
	
	public File getResume() {
		return resume;
	}
	public String registerbank()throws Exception
	{
		Long acc=null;
		Long bala=null;
	    String pass1=getPassword();
	    Long account=getAccountno();
	    Long jsid=getJs_id();
	    System.out.println(jsid);
		 System.out.println(acc+"hhh");
		 ResultSet rs=DbConnect.getStatement().executeQuery("select password,balance,accountno from BANKACCOUNT where js_id="+jsid+" ");
		 if(rs.next())
		 {
			bala=rs.getLong("BALANCE");
			setBalance(bala);
			 setPassword(rs.getString(1));
			 setAccountno(rs.getLong(3));
			 bala=rs.getLong("BALANCE");
		 }
		 
		 String pass=getPassword();
		 acc=getAccountno();
		 System.out.println(pass);
		 System.out.println(pass1);
		 System.out.println(bala+"kkkk");
		 Long recbal=getBalance()-500;
		
		 if(account.equals(acc)&& pass1.equals(pass)&& getBalance()<=(500))
		 {
			setMsg("U have insufficent balance") ;
		 }
		 else
		 {
			 int i=DbConnect.getStatement().executeUpdate("update BANKACCOUNT set BALANCE="+recbal+",status='paid'"); 
		 }
		 return "success";
	}
	public String Registercomp()throws Exception
	 {
		 int i=0;
		 i=dl.Registercomp(getUsername(),getPassword(),getC_name(),getC_address(),getC_post(),getC_criteria(),getC_email(),getC_contactno(),getC_cuttoff());
		 reset();
		 setMsg("Succesfully Registered");
		 return"registersuccess";
	 }
	 public void reset()
	 {
		 this.username="";
		 this.password="";
		 this.firstname="";
		 this.middlename="";
		 this.lastname="";
		 this.date1=null;
		 this.age=null;
		 this.gender="";
		 this.category="";
		 this.nationality="";
		 this.fathers_name="";
		 this.mothers_name="";
		 this.email_id="";
		 this.contact_no=null;
		 this.present_address="";
		 this.permanent_address="";
		 this.securityquestion="";
		 this.answer="";
	 }


	 

	 
	 public String combo1() throws Exception
		{
			mapForSelect=new HashMap<Integer,String>();
			ResultSet rs=dl.combo1();
			while(rs.next())
			{
			mapForSelect.put(rs.getInt(19),rs.getString(2));
			}
			return "success"; 
		}
	
	 public String adddelete()throws Exception
	 {
		 ArrayList<LoginAction> al=new ArrayList<LoginAction>();
			System.out.println("5");
		 Long id=getLoginid();
		 System.out.println("ffff"+id);
		 ResultSet rs=dl.adddelete(id);
		 //System.out.println("usrid");
		// LoginAction la=new LoginAction();
		 while(rs.next())
		 {
			 LoginAction la=new LoginAction();
			setJs_id(rs.getLong(1));	
			setFirstname(rs.getString(2));
			 setMiddlename(rs.getString(3));
			 setLastname(rs.getString(4));
			 setDate1(rs.getString(5))	;
			 setAge(rs.getLong(6));
			 setGender(rs.getString(7));
			 setBranch(rs.getString(8));
			 setRegdno(rs.getLong(9));
			 setCategory(rs.getString(10));
			 setNationality(rs.getString(11));
			 
			 setFathers_name(rs.getString(12));
			 setFathers_occupation(rs.getString(13));
			 setMothers_name(rs.getString(14));
			 setEmail_id(rs.getString(15));
			 setContact_no(rs.getLong(16));
			 setPresent_address(rs.getString(17));
			 setPermanent_address(rs.getString(18));
			 setLoginid(rs.getLong(19));
		     
			 la.setBoard(rs.getString(20));
			 
			 la. setYear(rs.getLong(21));
			 la. setMarks(rs.getLong(22));
			 la.setTwboard(rs.getString(23));
			 la.setTwyear(rs.getLong(24));
			 la.setTwmarks(rs.getLong(25));
			 la.setGinstitute(rs.getString(26));
			 la.setCourse(rs.getString(27));
			 la.setGyear(rs.getLong(28));
			 la.setGmarks(rs.getLong(29));
			la. setPGinstitute(rs.getString(30));
			la. setPGCourse(rs.getString(31));
			la.setPGyear(rs.getLong(32));
			 la.setPGmarks(rs.getLong(33));
        al.add(la);

		 }
		 Map session=ActionContext.getContext().getSession();
			session.put("ALIST",al);

		 return "displayuser1";
	 } 
	 public String add()throws Exception
	 {
		 HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		 Long id=Long.parseLong(request.getParameter("id"));
		 System.out.println("ghh"+id);
		 int i=dl.addjobseeker(id);
		 if(i>0)
		 {
			 setMsg("successfully approved");
			 return combo3();
		 }
		 return null;
	} 
	 
	 public String combo3() throws Exception
		{
			mapForSelect=new HashMap<Integer,String>();
			ResultSet rs=dl.combo3();
			while(rs.next())
			{
			mapForSelect.put(rs.getInt(19),rs.getString(2));
			}
			return "success"; 
		}
public String delete()throws Exception
{
	 HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	 Long id=Long.parseLong(request.getParameter("id"));
	 System.out.println("ghh"+id);
	 int i=dl.deletejobseeker(id);
	 if(i>0)
	 {
		 setMsg("successfully deleted");
		 return combo3();
	 }
	 return null;
} 
 

	 public String showjobseek()throws Exception
	 {
		 ArrayList<LoginAction> al=new ArrayList<LoginAction>();
			System.out.println("5");
		 Long id=getLoginid();
		 System.out.println("ffff"+id);
		 ResultSet rs=dl.showjobseek(id);
		 //System.out.println("usrid");
		// LoginAction la=new LoginAction();
		 while(rs.next())
		 {
			 LoginAction la=new LoginAction();
			setJs_id(rs.getLong(1));	
			setFirstname(rs.getString(2));
			 setMiddlename(rs.getString(3));
			 setLastname(rs.getString(4));
			 setDate1(rs.getString(5))	;
			 setAge(rs.getLong(6));
			 setGender(rs.getString(7));
			 setBranch(rs.getString(8));
			 setRegdno(rs.getLong(9));
			 setCategory(rs.getString(10));
			 setNationality(rs.getString(11));
			 
			 setFathers_name(rs.getString(12));
			 setFathers_occupation(rs.getString(13));
			 setMothers_name(rs.getString(14));
			 setEmail_id(rs.getString(15));
			 setContact_no(rs.getLong(16));
			 setPresent_address(rs.getString(17));
			 setPermanent_address(rs.getString(18));
			 setLoginid(rs.getLong(19));
		     
			 la.setBoard(rs.getString(20));
			 
			 la. setYear(rs.getLong(21));
			 la. setMarks(rs.getLong(22));
			 la.setTwboard(rs.getString(23));
			 la.setTwyear(rs.getLong(24));
			 la.setTwmarks(rs.getLong(25));
			 la.setGinstitute(rs.getString(26));
			 la.setCourse(rs.getString(27));
			 la.setGyear(rs.getLong(28));
			 la.setGmarks(rs.getLong(29));
			la. setPGinstitute(rs.getString(30));
			la. setPGCourse(rs.getString(31));
			la.setPGyear(rs.getLong(32));
			 la.setPGmarks(rs.getLong(33));
        al.add(la);

		 }
		 Map session=ActionContext.getContext().getSession();
			session.put("ALIST",al);

		 return "displayuser1";
	 } 
public String combo2() throws Exception
	{
		mapForSelect=new HashMap<Integer,String>();
		ResultSet rs=dl.combo2();
		while(rs.next())
		{
		mapForSelect.put(rs.getInt(1),rs.getString(2));
		}
		return "success"; 
	}

public String showcompany()throws Exception
{
	 ArrayList<LoginAction> al=new ArrayList<LoginAction>();
		System.out.println("5");
	 Long id=getC_id();
	 System.out.println("ffff"+id);
	 ResultSet rs=dl.showcompany(id);
	 //System.out.println("usrid");
	// LoginAction la=new LoginAction();
	 while(rs.next())
	 {
		 LoginAction la=new LoginAction();
		setC_id(rs.getLong(1));	
		setC_name(rs.getString(2));
		 setC_address(rs.getString(3));
		 setC_post(rs.getString(4));
		 setC_criteria(rs.getString(5));
		 setC_email(rs.getString(6));
		 setC_contactno(rs.getLong(7));
		 setC_cuttoff(rs.getLong(8));
	     		 }
	
	 return "displayuser2";
} 


public String combo4() throws Exception
{
	mapForSelect=new HashMap<Integer,String>();
	ResultSet rs=dl.combo4();
	while(rs.next())
	{
	mapForSelect.put(rs.getInt(1),rs.getString(2));
	}
	return "success"; 
}




public String approverejcompany()throws Exception
{
	 ArrayList<LoginAction> al=new ArrayList<LoginAction>();
		System.out.println("5");
	 Long id=getC_id();
	 System.out.println("ffff"+id);
	 ResultSet rs=dl.showcompany(id);
	 //System.out.println("usrid");
	// LoginAction la=new LoginAction();
	 while(rs.next())
	 {
		 LoginAction la=new LoginAction();
		setC_id(rs.getLong(1));	
		setC_name(rs.getString(2));
		 setC_address(rs.getString(3));
		 setC_post(rs.getString(4));
		 setC_criteria(rs.getString(5));
		 setC_email(rs.getString(6));
		 setC_contactno(rs.getLong(7));
		 setC_cuttoff(rs.getLong(8));
	     		 }
	
	 return "displayuser2";
} 

public String approveCompany()throws Exception
{
	 HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	 Long id=getC_id();
	 System.out.println("dfgg"+id);
	 int i=dl.approveCompany(id);
	 if(i>0)
	 {
		 return combo4();
	 }
	 return null;
}

public String companyview()throws Exception
{
	System.out.println("enter");
	Map session2=ActionContext.getContext().getSession();
	 String id=(String)session2.get("COMPANY_ID1");
	 Long cid=Long.parseLong(id);

	 System.out.println("ddddd"+cid);
	 //System.out.println("dghhj"+c_id);
	 ResultSet rs=dl.companyview(cid);
	while (rs.next())
	{
		 LoginAction la=new LoginAction();
			setC_id(rs.getLong(1));	
			setC_name(rs.getString(2));
			 setC_address(rs.getString(3));
			 setC_post(rs.getString(4));
			 setC_criteria(rs.getString(5));
			 setC_email(rs.getString(6));
			 setC_contactno(rs.getLong(7));
			 setC_cuttoff(rs.getLong(8));
		
	}
	return "displayuser2";
	
}
public String updatecompany()throws Exception
{
	System.out.println("enter");
	Map session2=ActionContext.getContext().getSession();
	 String id=(String)session2.get("COMPANYID");
	 Long cid=Long.parseLong(id);

	 System.out.println("ddddd"+cid);
	 System.out.println("dghhj"+c_id);
	 ResultSet rs=dl.updatecompany(cid);
	while (rs.next())
	{
		 LoginAction la=new LoginAction();
			setC_id(rs.getLong(1));	
			setC_name(rs.getString(2));
			 setC_address(rs.getString(3));
			 setC_post(rs.getString(4));
			 setC_criteria(rs.getString(5));
			 setC_email(rs.getString(6));
			 setC_contactno(rs.getLong(7));
			 setC_cuttoff(rs.getLong(8));
		
	}
	return "displayuser2";
}
public String updatecompanydetail()throws Exception
{
	Long id=getC_id();
	System.out.println("eee"+id);
	int i=dl.updatecompanydetail(getC_name(),getC_address(),getC_post(),getC_criteria(),getC_email(),getC_contactno(),getC_cuttoff(),id);
	return "success";
}
/*public String registerexam()throws Exception
{
	int i=0;
	i=dl.registerexam(getExamname(),getC_post(),getC_cuttoff());
}*/


public String RejectUser()throws Exception{
	 HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	 Long id=getC_id();
	 int i=dl.RejectUser(id);
	 if(i>0)
	 {
		 return combo4();
	 }
	 return null;
}


public String jobseekeracc1()throws Exception{
	System.out.println("enter jobseek");
	ArrayList<LoginAction> al=new ArrayList<LoginAction>();
	Map session=ActionContext.getContext().getSession();
	 String id=(String)session.get("JOBSEEKERID");
	 Long loginid=Long.parseLong(id);
	 System.out.println("dghhj"+loginid);
	 ResultSet rs=dl.jobseekeracc1(loginid);
	 if(rs.next())
	 {
		 LoginAction la=new LoginAction();
		setJs_id(rs.getLong(1));	
		setFirstname(rs.getString(2));
		 setMiddlename(rs.getString(3));
		 setLastname(rs.getString(4));
		 setDate1(rs.getString(5))	;
		 setAge(rs.getLong(6));
		 setGender(rs.getString(7));
		 setBranch(rs.getString(8));
		 setRegdno(rs.getLong(9));
		 setCategory(rs.getString(10));
		 setNationality(rs.getString(11));
		 
		 setFathers_name(rs.getString(12));
		 setFathers_occupation(rs.getString(13));
		 setMothers_name(rs.getString(14));
		 setEmail_id(rs.getString(15));
		 setContact_no(rs.getLong(16));
		 setPresent_address(rs.getString(17));
		 setPermanent_address(rs.getString(18));
		 setLoginid(rs.getLong(19));
	     
		 la.setBoard(rs.getString(20));
		 
		 la. setYear(rs.getLong(21));
		 la. setMarks(rs.getLong(22));
		 la.setTwboard(rs.getString(23));
		 la.setTwyear(rs.getLong(24));
		 la.setTwmarks(rs.getLong(25));
		 la.setGinstitute(rs.getString(26));
		 la.setCourse(rs.getString(27));
		 la.setGyear(rs.getLong(28));
		 la.setGmarks(rs.getLong(29));
		la. setPGinstitute(rs.getString(30));
		la. setPGCourse(rs.getString(31));
		la.setPGyear(rs.getLong(32));
		 la.setPGmarks(rs.getLong(33));
    al.add(la);

	 }
	 Map session1=ActionContext.getContext().getSession();
		session.put("ALIST",al);

	 return "displayuser1";

}
public String jobseekeracc()throws Exception{
	System.out.println("enter jobseek");
	ArrayList<LoginAction> al=new ArrayList<LoginAction>();
	Map session=ActionContext.getContext().getSession();
	 String id=(String)session.get("JOBSEEKERID");
	 Long loginid=Long.parseLong(id);
	 System.out.println("dghhj"+loginid);
	 ResultSet rs=dl.jobseekeracc(loginid);
	 if(rs.next())
	 {
		 LoginAction la=new LoginAction();
		setJs_id(rs.getLong(1));	
		setFirstname(rs.getString(2));
		 setMiddlename(rs.getString(3));
		 setLastname(rs.getString(4));
		 setDate1(rs.getString(5))	;
		 setAge(rs.getLong(6));
		 setGender(rs.getString(7));
		 setCategory(rs.getString(8));
		 setNationality(rs.getString(9));
		 
		 setFathers_name(rs.getString(10));
		 setFathers_occupation(rs.getString(11));
		 setMothers_name(rs.getString(12));
		 setEmail_id(rs.getString(13));
		 setContact_no(rs.getLong(14));
		 setPresent_address(rs.getString(15));
		 setPermanent_address(rs.getString(16));
		 setLoginid(rs.getLong(17));
	     
		 la.setBoard(rs.getString(18));
		 
		 la. setYear(rs.getLong(19));
		 la. setMarks(rs.getLong(20));
		 la.setTwboard(rs.getString(21));
		 la.setTwyear(rs.getLong(22));
		 la.setTwmarks(rs.getLong(23));
		 la.setGinstitute(rs.getString(24));
		 la.setCourse(rs.getString(25));
		 la.setGyear(rs.getLong(26));
		 la.setGmarks(rs.getLong(27));
		la. setPGinstitute(rs.getString(28));
		la. setPGCourse(rs.getString(29));
		la.setPGyear(rs.getLong(30));
		 la.setPGmarks(rs.getLong(31));
    al.add(la);

	 }
	 Map session1=ActionContext.getContext().getSession();
		session.put("ALIST",al);

	 return "displayuser1";

}

public String jobseekerview1()throws Exception{
	ArrayList<LoginAction> al=new ArrayList<LoginAction>();
	Map session=ActionContext.getContext().getSession();
	 String id=(String)session.get("JOBSEEKERID");
	 Long loginid=Long.parseLong(id);
	 System.out.println("dghhj"+loginid);
	 ResultSet rs=dl.jobseekeredit1(loginid);
	 if(rs.next())
	 {
		 LoginAction la=new LoginAction();
		 setJs_id(rs.getLong(1));	
			setFirstname(rs.getString(2));
			 setMiddlename(rs.getString(3));
			 setLastname(rs.getString(4));
			 setDate1(rs.getString(5))	;
			 setAge(rs.getLong(6));
			 setGender(rs.getString(7));
			 setBranch(rs.getString(8));
			 setRegdno(rs.getLong(9));
			 setCategory(rs.getString(10));
			 setNationality(rs.getString(11));
			 
			 setFathers_name(rs.getString(12));
			 setFathers_occupation(rs.getString(13));
			 setMothers_name(rs.getString(14));
			 setEmail_id(rs.getString(15));
			 setContact_no(rs.getLong(16));
			 setPresent_address(rs.getString(17));
			 setPermanent_address(rs.getString(18));
			 setLoginid(rs.getLong(19));
		     
			 la.setBoard(rs.getString(20));
			 
			 la. setYear(rs.getLong(21));
			 la. setMarks(rs.getLong(22));
			 la.setTwboard(rs.getString(23));
			 la.setTwyear(rs.getLong(24));
			 la.setTwmarks(rs.getLong(25));
			 la.setGinstitute(rs.getString(26));
			 la.setCourse(rs.getString(27));
			 la.setGyear(rs.getLong(28));
			 la.setGmarks(rs.getLong(29));
			la. setPGinstitute(rs.getString(30));
			la. setPGCourse(rs.getString(31));
			la.setPGyear(rs.getLong(32));
			 la.setPGmarks(rs.getLong(33));
    al.add(la);

	 }
	 Map session1=ActionContext.getContext().getSession();
		session.put("ALIST",al);

	 return "displayuser1";

}

public String jobseekerview()throws Exception{
	ArrayList<LoginAction> al=new ArrayList<LoginAction>();
	Map session=ActionContext.getContext().getSession();
	 String id=(String)session.get("JOBSEEKERID");
	 Long loginid=Long.parseLong(id);
	 System.out.println("dghhj"+loginid);
	 ResultSet rs=dl.jobseekeredit(loginid);
	 if(rs.next())
	 {
		 LoginAction la=new LoginAction();
		setJs_id(rs.getLong(1));	
		setFirstname(rs.getString(2));
		 setMiddlename(rs.getString(3));
		 setLastname(rs.getString(4));
		 setDate1(rs.getString(5))	;
		 setAge(rs.getLong(6));
		 setGender(rs.getString(7));
		 setCategory(rs.getString(8));
		 setNationality(rs.getString(9));
		 
		 setFathers_name(rs.getString(10));
		 setFathers_occupation(rs.getString(11));
		 setMothers_name(rs.getString(12));
		 setEmail_id(rs.getString(13));
		 setContact_no(rs.getLong(14));
		 setPresent_address(rs.getString(15));
		 setPermanent_address(rs.getString(16));
		 setLoginid(rs.getLong(17));
	    
		 la.setBoard(rs.getString(18));
		 
		 la. setYear(rs.getLong(19));
		 la. setMarks(rs.getLong(20));
		 la.setTwboard(rs.getString(21));
		 la.setTwyear(rs.getLong(22));
		 la.setTwmarks(rs.getLong(23));
		 la.setGinstitute(rs.getString(24));
		 la.setCourse(rs.getString(25));
		 la.setGyear(rs.getLong(26));
		 la.setGmarks(rs.getLong(27));
		la. setPGinstitute(rs.getString(28));
		la. setPGCourse(rs.getString(29));
		la.setPGyear(rs.getLong(30));
		 la.setPGmarks(rs.getLong(31));
    al.add(la);

	 }
	 Map session1=ActionContext.getContext().getSession();
		session.put("ALIST",al);

	 return "displayuser1";

}



public String jobseekeredit()throws Exception
{
	 Long loginid=getLoginid();
	 System.out.println("fffffff"+getLoginid());
	 int i=dl.updateAcc(getFirstname(),getMiddlename(),getLastname(),getDate1(),getAge(),getGender(),getCategory(),getNationality(),getFathers_name(),getFathers_occupation(),getMothers_name(),getEmail_id(),getContact_no(),getPresent_address(),getPermanent_address(),getBoard(),getYear(),getMarks(),getTwboard(),getTwyear(),getTwmarks(),getGinstitute(),getCourse(),getGyear(),getGmarks(),getPGinstitute(),getPGCourse(),getPGyear(),getPGmarks(),loginid);
	 setMsg("Updated successfully");
	 return "update";
}




public String changePassword()throws Exception{
	
	if(p1.equals(p2)){
		System.out.println("enter wwww");
		Map session=ActionContext.getContext().getSession();
		String  id3=(String)session.get("LOGIN_ID");
		Long id=Long.parseLong(id3);
		System.out.println("sssss"+id);
		int i=dl.changePassword(id,p1);
	}
	setMsg("Your Password Has Been Changed..........");
	return SUCCESS;
}

public String changePassword1()throws Exception{
	
	if(p1.equals(p2)){
		System.out.println("enter wwww");
		Map session=ActionContext.getContext().getSession();
		String  id1=(String)session.get("COMPANY_ID1");
		Long id=Long.parseLong(id1);
		System.out.println("sssss"+id);
		int i=dl.changePassword(id,p1);
	}
	setMsg("Your Password Has Been Changed..........");
	return SUCCESS;
}


public String userlogin()throws SQLException
{
	return "userlogin";
}

	


public String addjobnw()throws Exception
{
	System.out.println("cvfghn");
	 int i=0;
	 i=dl.addjob(getPost(),getCriteria(),getVacancies(),getSalary(),getDate1());
	 reset();
	 setMsg("Succesfully Added");
	 return "success";
}
public void reset1()
{
     
	 this.post="";
	 this.Criteria="";
	 this.Vacancies=null;
	 this.Salary=null;
	 this.LastDate=null;
}


public String viewjobdetails()throws Exception
{
	 ResultSet rs=dl.viewjobdetails();
	 while (rs.next())
	 {
		 setJ_id(rs.getLong(1));
		 setPost(rs.getString(2));
		 setCriteria(rs.getString(3));
		 setVacancies(rs.getLong(4));
		 setSalary(rs.getLong(5));
		 setLastDate(rs.getString(6));
		
	}
	return "success";
}

public String EditJobDetail()throws Exception
{
	
	ResultSet rs=dl.viewjobdetails();
	 while (rs.next())
	 {
		 setJ_id(rs.getLong(1));
		 setPost(rs.getString(2));
		 setCriteria(rs.getString(3));
		 setVacancies(rs.getLong(4));
		 setSalary(rs.getLong(5));
		 setLastDate(rs.getString(6));
		
	}
	return "success";

}
public String updatejob()throws Exception
{
	Long id=getJ_id();
	System.out.println("efe"+id);
	int i=dl.updatejobdetail(getPost(),getCriteria(),getVacancies(),getSalary(),getDate1(),id);
	return "success";
	
}
public String DeleteJobDetail()throws Exception
{
	Long id=getJ_id();
	int i=dl.DeleteJobDetail(id);
	return "success";
}
public String registerexam()throws Exception
{
	int i=dl.registerexam(getExamname(),getC_post(),getC_cuttoff());
	return "success";
}


public Long getExam_id() {
	return exam_id;
}
public void setExam_id(Long examId) {
	exam_id = examId;
}
public String Deleteexam()throws Exception
{
	System.out.println("enter");
	Long id=getExamid();
	System.out.println("ffff"+id);
	int i=dl.Deleteexam(id);
	return "success";
}

public String examview()throws Exception
{
	 ArrayList<LoginAction> al=new ArrayList<LoginAction>();
		System.out.println("5");
	 ResultSet rs=dl.viewexam();

	 while(rs.next())
	 {
		 LoginAction la=new LoginAction();
				
		 la.setExamid(rs.getLong(1));
		 la. setExamname(rs.getString(2));
		 la. setC_post(rs.getString(3));
		 la.setC_cuttoff(rs.getLong(4));
		 al.add(la);
		 
	 }
	 Map session=ActionContext.getContext().getSession();
		session.put("ALIST",al);

	 return "examview";


}
public String campusretrieve()throws Exception
{
	mapForSelect=new HashMap<Integer,String>();
	ResultSet rs=dl.campusretrieve();
	while(rs.next())
	{
	mapForSelect.put(rs.getInt(1),rs.getString(2));
	}
	return "success"; 

}
/*public String retrieveschedule()throws Exception
{
	Long cid=getC_id();
	System.out.println(cid);
	ResultSet rs=dl.showschedule(cid);
	if(rs.next())
	{
	setC_name(rs.getString(1));
	}
	return "success";
}*/
public String showschedule()throws Exception
{
	System.out.println("enter");
	Long cid=getC_id();
	System.out.println(cid);
	ResultSet rs=dl.showschedule(cid);
	if(rs.next())
	{
	setC_name(rs.getString(1));
	}
	String cname=getC_name();
	System.out.println(cname);
	int i=dl.campus(cid,getC_name(),getDate11());
	return campusretrieve();
}
public String campusschedule()throws Exception
{Long id=getC_id();
	int i=dl.campus(id,getC_name(),getDate11());
	return "success"; 
	
}

public String examsyllabus()throws Exception
{
	System.out.println("enter");
	Map session=ActionContext.getContext().getSession();
	 String id=(String)session.get("COMPANYID");
	 Long cid=Long.parseLong(id);
	 System.out.println("dghhj"+cid);
	
	
	System.out.println(cid);
	ResultSet rs=dl.showschedule(cid);
	if(rs.next())
	{
	setC_name(rs.getString(1));
	}
	String cname=getC_name();
	System.out.println(cname);
	return "success";
}

	public String campussyllabus1()throws Exception
	{
		Map session=ActionContext.getContext().getSession();
	 String id=(String)session.get("COMPANYID");
	 Long cid=Long.parseLong(id);
	 System.out.println("dghhj"+cid);
	 int i=0;
	 String s = getDate1();
		System.out.println(getDate1());
		String dd = "";
		/*SimpleDateFormat  d=new SimpleDateFormat("dd/mm/yyyy");
		String date=d.format(s);*/
		String months[] = {
				"Jan", "Feb", "Mar", "Apr",
				"May", "Jun", "Jul", "Aug",
				"Sep", "Oct", "Nov", "Dec"};
		dd = s.substring(0, 10);
		String day = dd.substring(8);
		String month = dd.substring(5, 7);
		String year = dd.substring(0, 4);
		int m = Integer.parseInt(month);
		String date = day+"-"+months[m-1]+"-"+year;
		setDate1(date);

	
	int J=dl.campussyllabus1(cid,getRounds(),getDate1());
	return "success";
}

public String hallticket()throws Exception
{
	System.out.println("entr2346");
	mapForSelect1=new HashMap<Integer,String>();
	ResultSet rs1=dl.companyname();
	while(rs1.next())
	{
	mapForSelect1.put(rs1.getInt(1),rs1.getString(2));
	}
	mapForSelect=new HashMap<Integer,String>();
	
	ResultSet rs=dl.hallticket();
	while(rs.next())
	{
	mapForSelect.put(rs.getInt(1),rs.getString(2));
	}
	
	return "success"; 

	
}
public String showhallticketinf()throws Exception
{   
	
	Long id=getJs_id();
	System.out.println(id);
	ResultSet rs=dl.showhallticketinf(id);
	while(rs.next())
	{
		setName(rs.getString(1)+rs.getString(2));
		setBranch(rs.getString(3));
		setRegdno(rs.getLong(4));
		setHallticketno(rs.getLong(5));
		setDate1(rs.getString(6));
	}
	
	
	return hallticket();
}
public String inserthallticket()throws Exception
{
	Long id=getJs_id();
	System.out.println(id);
	Long idd=getC_id();
	System.out.println(idd);
	/*ResultSet rs1=dl.companyview1(idd);
	while(rs1.next())
	{
		setC_name(rs1.getString(1));
	}
	String cname=rs1.getString(1);
	System.out.println(cname);
	*/
	 int i=0;
	 String s = getDate1();
		System.out.println(getDate1());
		String dd = "";
		/*SimpleDateFormat  d=new SimpleDateFormat("dd/mm/yyyy");
		String date=d.format(s);*/
		String months[] = {
				"Jan", "Feb", "Mar", "Apr",
				"May", "Jun", "Jul", "Aug",
				"Sep", "Oct", "Nov", "Dec"};
		dd = s.substring(0, 10);
		String day = dd.substring(8);
		String month = dd.substring(5, 7);
		String year = dd.substring(0, 4);
		int m = Integer.parseInt(month);
		String date = day+"-"+months[m-1]+"-"+year;
		setDate1(date);

		

	int j=dl.inserthallticet(idd,id,getName(),getBranch(),getRegdno(),getHallticketno(),getDate1());
	return hallticket();
}
public String viewhalltickt12()throws Exception
{
	Map session=ActionContext.getContext().getSession();
	 String idd=(String)session.get("JOBSEEKERID");
	 Long jid=Long.parseLong(idd);
	 System.out.println("dghhj"+jid);
	
	ResultSet rs1=DbConnect.getStatement().executeQuery("select status from bankaccount where js_id="+jid+"");
	if(rs1.next())
	{
		setStatus(rs1.getString(1));
	}
	System.out.println(getStatus()+"hhhh");
	if(getStatus().equals("paid"))
	{
	System.out.println("entr46788");
	mapForSelect1=new HashMap<Integer,String>();
	ResultSet rs=dl.campusretrieve();
   System.out.println("ligdh");
	while(rs.next())
	{
	mapForSelect1.put(rs.getInt(1),rs.getString(2));
	}
	System.out.println("hurnnj");
	return "hallticket";
	}
	else
	{
		setMsg("you had not paid yet");
		return "succ";
	}
}
public String viewhalticktinfo()throws Exception
{
	Long id=getC_id();
	System.out.println(id);
	Map session=ActionContext.getContext().getSession();
	 String idd=(String)session.get("JOBSEEKERID");
	 Long jid=Long.parseLong(idd);
	 System.out.println("dghhj"+jid);
	 ResultSet rs1=dl.viewhalltickt12(id,jid);
	while(rs1.next())
	{
		setName(rs1.getString(2));
		setBranch(rs1.getString(3));
		setRegdno(rs1.getLong(4));
		setHallticketno(rs1.getLong(5));
		setDate1(rs1.getString(6));
		
	}
	return viewhalltickt12(); 	

}
public String question()throws Exception
{
	Map session=ActionContext.getContext().getSession();
	String id=(String)session.get("COMPANYID");
	Long idd=Long.parseLong(id);
	int i=dl.question(getSlno(),getQuestion(),getOption1(),getOption2(),getOption3(),getOption4(),getAnswer(),idd);
	reset();
	return "success";
}
HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
private String getJ_id;

public String fillinfo()throws Exception{
		ArrayList<LoginAction> al=new ArrayList<LoginAction>();
	int id=2;
		int i=dl.fillinfo(getRegistration_no(),getHallticketno(),getName());
		//System.out.println(hallticketno);
		
		request.setAttribute("hallticketno",hallticketno);
		request.setAttribute("cid",c_id);
		request.setAttribute("regdno",regdno);
	    setHdnHallTicket(hallticketno);
		
	    HttpServletRequest myreq=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		HttpSession sess=myreq.getSession(true);
		sess.setAttribute("myHallTickNum", hallticketno);
	reset();
	/*for(id=2;id<=10;id++)
	{

	ResultSet rs=dl.viewQuestion(id);
	if(rs.next())
	{
		 LoginAction la=new LoginAction();
		  la.setQ_id(rs.getLong(1));
		la.setQuestion(rs.getString(2));
		la.setOption1(rs.getString(3));
		la.setOption2(rs.getString(4));
		la.setOption3(rs.getString(5));
		la.setOption4(rs.getString(6));
		 al.add(la);
		 
	 }
	 Map session=ActionContext.getContext().getSession();
		session.put("ALIST",al);
	}*/
	 return "infview";
	

}
public String exam()throws Exception
{
	//HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	String r = request.getParameter("r");
	System.out.println("R  :"+r);
	request.setAttribute("r",r);
	Long id=getC_id();
	request.setAttribute("cid",id);
	return "infview";
}

public String exam12()throws Exception
{
	//HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	String r=request.getParameter("r");
	request.setAttribute("r",r);
	Long id=getC_id();
	request.setAttribute("cid",id);
	return "infview";
}

public String exam1()throws Exception
{
	HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	String r=request.getParameter("r");
	request.setAttribute("r",r);
	Long id=getC_id();
	request.setAttribute("cid",id);
	return "infview";
}

public String exam2()throws Exception
{
	HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	String r=request.getParameter("r");
	request.setAttribute("r",r);
	Long id=getC_id();
	request.setAttribute("cid",id);
	return "infview";
}

public String exam3()throws Exception
{
	HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	String r=request.getParameter("r");
	request.setAttribute("r",r);
	Long id=getC_id();
	request.setAttribute("cid",id);
	return "infview";
}
public String exam4()throws Exception
{
	HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	String r=request.getParameter("r");
	request.setAttribute("r",r);
	Long id=getC_id();
	request.setAttribute("cid",id);
	return "infview";
}
public String exam5()throws Exception
{
	HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	String r=request.getParameter("r");
	request.setAttribute("r",r);
	Long id=getC_id();
	request.setAttribute("cid",id);
	return "infview";
}
public String exam6()throws Exception
{
	HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	String r=request.getParameter("r");
	request.setAttribute("r",r);
	Long id=getC_id();
	request.setAttribute("cid",id);
	return "infview";
}
public String exam7()throws Exception
{
	HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	String r=request.getParameter("r");
	request.setAttribute("r",r);
	Long id=getC_id();
	request.setAttribute("cid",id);
	return "infview";
}
public String exam8()throws Exception
{
	HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	String r=request.getParameter("r");
	request.setAttribute("r",r);
	Long id=getC_id();
	System.out.println(id+"....id");
	request.setAttribute("ciid",id);
	return "infview";
}



public String answer()throws Exception
{
	ResultSet rs=DbConnect.getStatement().executeQuery("select q_id,answer from question");
	if(rs.next())
	{
	  setQ_id(rs.getLong(1));
		setAnswer(rs.getString(2));
	}
	Long qid=getQ_id();
	String ans=getAnswer();

	int i=dl.answer(qid,ans);
	return "answer";
}

public String bankdet()throws Exception
{
	Map session=ActionContext.getContext().getSession();
	 String idd=(String)session.get("JOBSEEKERID");
	 Long jid=Long.parseLong(idd);
	 System.out.println("dghhj"+jid);
	 Long acc=getAccountno();
	int i=dl.bankdet(jid,getBankanme(),getName(),getAccountno(),getBalance(),getPassword());
	setAccountno(acc);
	setPassword(getPassword());
	setJs_id(jid);
	return "success";
}
public String cancel()throws Exception
{
	Map session=ActionContext.getContext().getSession();
	 String idd=(String)session.get("JOBSEEKERID");
	 Long jid=Long.parseLong(idd);
	 System.out.println("dghhj"+jid);
	 Long acc=getAccountno();
	
	int i=dl.cancel(jid,getBankanme(),getName(),getAccountno(),getBalance(),getPassword());
	return "cancel";
}

public String selectCloseJob()throws SQLException,ClassNotFoundException{
	mapForSelect=new HashMap<Integer,String>();
	ResultSet rs=dl.RetUser3();
	while(rs.next())
	{
		mapForSelect.put(rs.getInt(1),rs.getString(2));
		
	}
	return "selectclosejob1";
}
//select the value for close the job
public String valueCloseJob()throws SQLException,ClassNotFoundException{
	ResultSet rs1=dl.SelectUser3(getSelectuser());
	Long jd=null;
	System.out.println(getSelectuser()+"ooo");
	while(rs1.next())
	{
		jd=rs1.getLong(1);
		System.out.println(jd+"iii");
		setPost(rs1.getString(2));
		setCriteria(rs1.getString(3));
		setVacancies(rs1.getLong(4));
		setSalary(rs1.getLong(5));
		setLastDate(rs1.getString(6));
	
	}
	setJs_id(jd);
	return "closejob1";
}

//close the Job
public String CloseJob()throws Exception{
	
	Long jid=getJs_id();
	System.out.println(jid+"kkk");
	int i=dl.updateAcc11(jid,getPost(),getCriteria(),getVacancies(), getSalary(),getLastDate());
	reset();
	return "closejob11";

} 



public String selectapplyjob()throws SQLException,ClassNotFoundException{
	mapForSelect=new HashMap<Integer,String>();
	mapForSelect1=new HashMap<Integer,String>();
	ResultSet rs=dl.RetUser10();
	while(rs.next())
	{
		mapForSelect.put(rs.getInt(1),rs.getString(2));
	}
	ResultSet rs1=dl.RetUser3();
	while(rs1.next())
	{
	
		mapForSelect1.put(rs1.getInt(1),rs1.getString(2));
	}	
	/*Map session=ActionContext.getContext().getSession();
	 String idd=(String)session.get("JOBSEEKERID");
	Long jid=Long.parseLong(idd);
	 System.out.println("dghhj"+idd);*/
	Map session=ActionContext.getContext().getSession();
	String idd=(String)session.get("JOBSEEKERID");
	Long jid=Long.parseLong(idd);
	System.out.println("Job seeker id: "+jid);
	ResultSet rs23=DbConnect.getStatement().executeQuery("select REGD_NO from jobseeker where js_id="+jid+"");
	if(rs23.next())
	{
		setRegdno(rs23.getLong(1));
	}
	Long id1=getRegdno();
	System.out.println("Regd No: "+id1);
	ResultSet rs34=DbConnect.getStatement().executeQuery("select * from result where regd_no="+id1+"");
	//System.out.println(rs34.next());
	if(rs34.next())
	{
		System.out.println(rs34.getString(4));
		setStatus(rs34.getString(4));
		String sta=rs34.getString(4);
		System.out.println(sta);
		setMsg("successfully applied");
		if(sta.equals("approved"))
		{
			return "successapp";
			
		}
	}
	
	else
	
	{
		setMsg("you cannot apply");
		return "success23";
	}
	return "success23";

}


public String JobApply()throws SQLException,ClassNotFoundException
{
	Map session=ActionContext.getContext().getSession();
	 String iddd=(String)session.get("JOBSEEKERID");
	 Long idd=Long.parseLong(iddd);
	 System.out.println("dghhj"+idd);
	
	String s1=null,s2=null;
	Long id=getJ_id();
	System.out.println("aaa"+id);
    ResultSet rs1=dl.job(getJ_id());
	ResultSet rs2=dl.jobseeker(idd);
	if (rs1.next())
	{
		s1=rs1.getString("POST");
		
	}
	if (rs2.next())
	{
		s2=rs2.getString("FIRSTNAME");
		
	}
	int i=dl.Applyjob11(s2,s1);
	reset();
	
	if(i>0)
	{
		return selectapplyjob();
	}
	return null;
	}




public String approvestatus()throws Exception
{
	 System.out.println("emgrgh");
	 Long id=getRegdno();
	 Long idd1=getC_id();
	 System.out.println("ffff"+id+idd1);
	 ResultSet rs=dl.showresult(id);
     if(rs.next())
     {
    	 setResult1(rs.getInt(1));
    	 setC_id(rs.getLong(2));
     }
     int res=getResult1();
     Long idd=getC_id();
     ResultSet rs1=DbConnect.getStatement().executeQuery("select CUTOFF from exam where c_id="+idd+"");
     if(rs1.next())
     {
    	 setC_cuttoff(rs.getLong(1));
     }
     Long cuo=getC_cuttoff();
     if(res>=cuo)
     {
    	int i=DbConnect.getStatement().executeUpdate("update result set status='approved' where REGD_NO="+id+" and c_id="+idd1+""); 
     }
	
	 return "approvestatus";
}
private void setresult1(long long1) {
	this.result1 = result1;
}
public int getResult1() {
	return result1;
}
public void setResult1(int result1) {
	this.result1 = result1;
}

public String combo1234()throws Exception
{
	mapForSelect=new HashMap<Integer,String>();
	ResultSet rs=dl.combo1();
	while(rs.next())
	{
		mapForSelect.put(rs.getInt(1),rs.getString(2));
		
	}
	return "combo1234";

}
public String showjobseekresume()throws Exception
{
	Long id=getLoginid();
	return "showjobseekresume";
}
public String downloadImage() throws Exception{
	System.out.println("enter");
	Long anno=getLoginid();
	String ss="";
	System.out.println("gg"+anno);
	
	ResultSet rs=DbConnect.getStatement().executeQuery("select RESUME from JOBSEEKER where js_id="+anno+"");
	if(rs.next())
	{
		setUserImageFileName(rs.getString("RESUME"));
		System.out.println("photoenter");
	}
	//photo = new FileInputStream(new File("photo//kk"));
    
return "success";	
}
public String getUserImageFileName() {
	return userImageFileName;
}
public void setUserImageFileName(String userImageFileName) {
	this.userImageFileName = userImageFileName;
}

}

package p;

import java.io.File;
import java.io.InputStream;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.ActionSupport;
import java.io.FileInputStream;

public class UploadDownload extends ActionSupport implements ServletRequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstname, middlename, lastname, date1, age, gender, branch, regdno, category, nationality,
			fathers_name, fathers_occupation, mothers_name, email_id, present_address, permanent_address, board,
			twboard, ginstitute, course, PGinstitute, PGCourse, username, password;
	private Long login_id, contact_no, PGmarks, PGyear, gmarks, gyear, twmarks, twyear, marks, year;

	private FileInputStream fileinputstream;
	private InputStream fileinputstream1;

	public FileInputStream getFileinputstream() {
		return fileinputstream;
	}

	public void setFileinputstream(FileInputStream fileinputstream) {
		this.fileinputstream = fileinputstream;
	}

	public InputStream getFileinputstream1() {
		return fileinputstream1;
	}

	public void setFileinputstream1(InputStream fileinputstream1) {
		this.fileinputstream1 = fileinputstream1;
	}

	public FileInputStream getFileInputStream() {
		return fileinputstream;
	}

	public void setFileInputStream(FileInputStream fileinputstream) {
		this.fileinputstream = fileinputstream;
	}

	public Long getContact_no() {
		return contact_no;
	}

	public void setContact_no(Long contactNo) {
		contact_no = contactNo;
	}

	public Long getPGmarks() {
		return PGmarks;
	}

	public void setPGmarks(Long pGmarks) {
		PGmarks = pGmarks;
	}

	public Long getPGyear() {
		return PGyear;
	}

	public void setPGyear(Long pGyear) {
		PGyear = pGyear;
	}

	public Long getGmarks() {
		return gmarks;
	}

	public void setGmarks(Long gmarks) {
		this.gmarks = gmarks;
	}

	public Long getGyear() {
		return gyear;
	}

	public void setGyear(Long gyear) {
		this.gyear = gyear;
	}

	public Long getTwmarks() {
		return twmarks;
	}

	public void setTwmarks(Long twmarks) {
		this.twmarks = twmarks;
	}

	public Long getTwyear() {
		return twyear;
	}

	public void setTwyear(Long twyear) {
		this.twyear = twyear;
	}

	public Long getMarks() {
		return marks;
	}

	public void setMarks(Long marks) {
		this.marks = marks;
	}

	public Long getYear() {
		return year;
	}

	public void setYear(Long year) {
		this.year = year;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getRegdno() {
		return regdno;
	}

	public void setRegdno(String regdno) {
		this.regdno = regdno;
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

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public String getTwboard() {
		return twboard;
	}

	public void setTwboard(String twboard) {
		this.twboard = twboard;
	}

	public String getGinstitute() {
		return ginstitute;
	}

	public void setGinstitute(String ginstitute) {
		this.ginstitute = ginstitute;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
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

	public Long getLogin_id() {
		return login_id;
	}

	public void setLogin_id(Long loginId) {
		login_id = loginId;
	}

	private File userImage;
	private String name;
	private String userImageFileName;
	private Map<Integer, String> mapForSelect;
	private HttpServletRequest servletRequest;
	Long id;

	public File getUserImage() {
		return userImage;
	}

	public void setUserImage(File userImage) {
		this.userImage = userImage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserImageFileName() {
		return userImageFileName;
	}

	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
	}

	public Map<Integer, String> getMapForSelect() {
		return mapForSelect;
	}

	public void setMapForSelect(Map<Integer, String> mapForSelect) {
		this.mapForSelect = mapForSelect;
	}

	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}

	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String upload() throws Exception {

		String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
		String filetofolder = filePath + "/photo";
		File fileToCreate = new File(filetofolder, this.userImageFileName);
		FileUtils.copyFile(this.userImage, fileToCreate);
		// int i=DbConnect.getStatement().executeUpdate("insert into upload
		// values(UPLOAD_SEQ.nextval,'"+getName()+"','"+fileToCreate+"')");
		int j = DbConnect.getStatement().executeUpdate("insert into login values(login_seq.nextval,'" + getUsername()
				+ "','" + getPassword() + "','jobseeker','notapproved')");
		String sql = "insert into jobseeker values(JOBSEEKER_SEQ.nextval,'" + getFirstname() + "','" + getMiddlename()
				+ "','" + getLastname() + "','" + getDate1() + "'," + getAge() + ",'" + getGender() + "','"
				+ getBranch() + "'," + getRegdno() + ",'" + getCategory() + "','" + getNationality() + "','"
				+ getFathers_name() + "','" + getFathers_occupation() + "','" + getMothers_name() + "','"
				+ getEmail_id() + "'," + getContact_no() + ",'" + getPresent_address() + "','" + getPermanent_address()
				+ "',LOGIN_SEQ.nextval-1,'" + getBoard() + "'," + getYear() + ", " + getMarks() + ",'" + getTwboard()
				+ "'," + getTwyear() + ", " + getTwyear() + ", '" + getGinstitute() + "', '" + getCourse() + "',"
				+ getGyear() + ", " + getGmarks() + ", '" + getPGinstitute() + "', '" + getPGCourse() + "',"
				+ getPGyear() + "," + getPGmarks() + ",'" + fileToCreate + "')";

		// String sql="insert into candidate
		// values(SEQ.nextval,'"+getCandidatename()+"','"+getCandidate_email()+"','"+getCandidate_gender()+"','"+getCandidate_dob()+"','"+getCandidate_blood()+"','"+getQualification()+"','"+getAddress()+"','"+getUniversity()+"',"+getMobileno()+",'"+getUserImage()+"',LOGIN_SEQ.nextval)";
		System.out.println(sql);
		// int i=DbConnect.getStatement().executeUpdate("insert into candidate
		// values('"+getCandidatename()+"','"+getCandidate_email()+"','"+getCandidate_gender()+"','"+getCandidate_dob()+"','"+getCandidate_blood()+"','"+getQualification()+"','"+getAddress()+"','"+getUniversity()+"',"+getMobileno()+",'"+fileToCreate+"',CANDIDATE_SEQ.nextval,LOGIN_SEQ.nextval-1)");
		int i = DbConnect.getStatement().executeUpdate(sql);

		return "registersuccess";

	}

	public String selectImage() throws Exception {
		mapForSelect = new HashMap<Integer, String>();
		ResultSet rs = DbConnect.getStatement().executeQuery("select * from JOBSEEKER");
		while (rs.next()) {
			mapForSelect.put(rs.getInt(1), rs.getString(2));
		}
		return "combo1234";
	}

	public String downloadImage() throws Exception {
		System.out.println("enter");
		System.out.println(getLogin_id() + "kkk");
		ResultSet rs = DbConnect.getStatement()
				.executeQuery("select resume from JOBSEEKER where js_id=" + getLogin_id() + "");
		if (rs.next()) {
			fileinputstream1 = new FileInputStream(new File(rs.getString(1)));
			// String image=rs.getString(1);
			// System.out.println(image);
			// setUserImageFileName(image);

		}
		return "success";

	}
}

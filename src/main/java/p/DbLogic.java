package p;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import p.DbConnect;

public class DbLogic {
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	String sql = "";

	public ResultSet RetLogin(String username, String password, String usertype) throws Exception {
		if (usertype.equals("admin")) {

			sql = "select * from login where USERNAME='" + username + "' and PASSWORD='" + password + "' and USERTYPE='"
					+ usertype + "' ";
			// System.out.println(sql);
			rs = DbConnect.getStatement().executeQuery(sql);
			return rs;
		} else if (usertype.equals("jobseeker")) {
			// System.out.println(sql);
			sql = "select l.*,j.JS_ID from LOGIN l,JOBSEEKER j  where USERNAME='" + username + "' and PASSWORD='"
					+ password + "' and USERTYPE='" + usertype + "' and j.LOGIN_ID=l.LOGIN_ID";
			rs = DbConnect.getStatement().executeQuery(sql);
			return rs;

		} else if (usertype.equals("company")) {
			// System.out.println(sql);
			sql = "select l.*,c.c_id from LOGIN l,companydetails c  where USERNAME='" + username + "' and PASSWORD='"
					+ password + "' and USERTYPE='" + usertype + "' and l.LOGIN_ID=c.LOGIN_ID";
			rs = DbConnect.getStatement().executeQuery(sql);
			return rs;
		}

		return null;

	}

	public ResultSet combo1() throws Exception

	{
		rs = DbConnect.getStatement().executeQuery("select * from jobseeker");
		return rs;
	}

	public ResultSet showjobseek(Long id) throws Exception {
		System.out.println("User id" + id);
		rs = DbConnect.getStatement().executeQuery("select * from jobseeker where LOGIN_ID=" + id + "");// l.LOGIN_ID=js.LOGIN_ID
																										// and l.
		return rs;
	}

	public int Registercomp(String username, String password, String cName, String cAddress, String cPost,
			String cCriteria, String cEmail, Long cContactno, Long cCutoff) throws Exception {

		int i = DbConnect.getStatement().executeUpdate("insert into login values(LOGIN_SEQ.nextval,'" + username + "','"
				+ password + "','company','notapproved')");
		String sql = "insert into companydetail values(COMPANYDETAILS_SEQ.nextval,'" + cName + "','" + cAddress + "','"
				+ cPost + "','" + cCriteria + "','" + cEmail + "'," + cContactno + "," + cCutoff
				+ ",LOGIN_SEQ.nextval-1)";
		System.out.println(sql);
		int j = DbConnect.getStatement()
				.executeUpdate("insert into companydetails values(COMPANYDETAILS_SEQ.nextval,'" + cName + "','"
						+ cAddress + "','" + cPost + "','" + cCriteria + "','" + cEmail + "'," + cContactno + ","
						+ cCutoff + ",LOGIN_SEQ.nextval-1)");
		return i;

	}

	public ResultSet combo2() throws Exception

	{
		rs = DbConnect.getStatement().executeQuery("select * from companydetails");
		return rs;
	}

	public ResultSet showcompany(Long id) throws Exception {
		System.out.println("C_id" + id);
		rs = DbConnect.getStatement().executeQuery("select * from companydetails where C_ID=" + id + "");// l.LOGIN_ID=js.LOGIN_ID
																											// and l.
		return rs;
	}

	public ResultSet RegisterStudent(String username, String password, String firstname, String middlename,
			String lastname, String date1, Long age, String gender, String branch, Long regdno, String category,
			String nationality, String fathersName, String fathersOccupation, String mothersName, String emailId,
			Long contactNo, String presentAddress, String permanentAddress, String board, Long year, Long marks,
			String twboard, Long twyear, Long twmarks, String ginstitute, String course, Long gyear, Long gmarks,
			String pGinstitute, String pgCourse, Long pGyear, Long pGmarks) throws Exception {
		Long logid = null;
		int i = DbConnect.getStatement().executeUpdate("insert into login values(LOGIN_SEQ.nextval,'" + username + "','"
				+ password + "','user','notapproved')");
		String sql = "insert into jobseeker values(JOBSEEKER_SEQ.nextval,'" + firstname + "','" + middlename + "','"
				+ lastname + "','" + date1 + "'," + age + ",'" + gender + "','" + branch + "'," + regdno + ",'"
				+ category + "','" + nationality + "','" + fathersName + "','" + fathersOccupation + "','" + mothersName
				+ "','" + emailId + "'," + contactNo + ",'" + presentAddress + "','" + permanentAddress
				+ "',LOGIN_SEQ.nextval-1,'" + board + "'," + year + ", " + marks + ",'" + twboard + "'," + twyear + ", "
				+ twmarks + ", '" + ginstitute + "', '" + course + "'," + gyear + ", " + gmarks + ", '" + pGinstitute
				+ "', '" + pgCourse + "'," + pGyear + "," + pGmarks + ");)";
		System.out.println(sql);
		int j = DbConnect.getStatement().executeUpdate("insert into jobseeker values(JOBSEEKER_SEQ.nextval,'"
				+ firstname + "','" + middlename + "','" + lastname + "','" + date1 + "'," + age + ",'" + gender + "','"
				+ branch + "'," + regdno + ",'" + category + "','" + nationality + "','" + fathersName + "','"
				+ fathersOccupation + "','" + mothersName + "','" + emailId + "'," + contactNo + ",'" + presentAddress
				+ "','" + permanentAddress + "',LOGIN_SEQ.nextval-1,'" + board + "'," + year + ", " + marks + ",'"
				+ twboard + "'," + twyear + ", " + twmarks + ", '" + ginstitute + "', '" + course + "'," + gyear + ", "
				+ gmarks + ", '" + pGinstitute + "', '" + pgCourse + "'," + pGyear + "," + pGmarks + ")");
		ResultSet rss = DbConnect.getStatement().executeQuery("select login_seq.nextval-2 from dual");
		if (rss.next()) {
			logid = rss.getLong(1);
		}
		ResultSet rs = DbConnect.getStatement().executeQuery("select username from login where login_id=" + logid + "");

		return rs;

	}

	public ResultSet approverejcompany(Long id) throws Exception {

		System.out.println("C_id" + id);
		rs = DbConnect.getStatement().executeQuery("select * from companydetails where C_ID=" + id + "");// l.LOGIN_ID=js.LOGIN_ID
																											// and l.
		return rs;

	}

	public ResultSet combo3() throws Exception {
		rs = DbConnect.getStatement().executeQuery("select * from jobseeker");
		return rs;
	}

	public ResultSet adddelete(Long id) throws Exception {
		System.out.println("User id" + id);
		rs = DbConnect.getStatement().executeQuery("select * from jobseeker where LOGIN_ID=" + id + "");// l.LOGIN_ID=js.LOGIN_ID
																										// and l.
		return rs;

	}

	public ResultSet combo4() throws SQLException, ClassNotFoundException {
		rs = DbConnect.getStatement().executeQuery("select * from companydetails");
		return rs;
	}

	public int approveCompany(Long id) throws SQLException, ClassNotFoundException {
		ResultSet rs = DbConnect.getStatement()
				.executeQuery("select login_id from companydetails where c_id=" + id + "");
		Long q = null;
		if (rs.next()) {
			q = rs.getLong(1);
		}

		int i = DbConnect.getStatement()
				.executeUpdate("update login set USERSTATUS='approved' where login_id=" + q + "");

		return i;
	}

	public int RejectUser(Long id) throws SQLException, ClassNotFoundException {
		int i = DbConnect.getStatement().executeUpdate("delete from login where userid=" + id + "");
		return i;
	}

	public int addjobseeker(Long id) throws Exception {
		/*
		 * ResultSet rs=DbConnect.getStatement().
		 * executeQuery("select login_id from jobseeker where js_id="+id+""); Long
		 * q=null; if(rs.next()) { q=rs.getLong(1); }
		 */

		int i = DbConnect.getStatement()
				.executeUpdate("update login set USERSTATUS='approved' where login_id=" + id + "");
		return i;
	}

	public static int changePassword(Long id, String p1) throws Exception {

		int i = DbConnect.getStatement()
				.executeUpdate("update login set password='" + p1 + "' where LOGIN_ID=" + id + "");
		return i;
	}

	// *****************change password(ADMIN)*************************
	public int changePassword1(Long id, String p1) throws Exception {
		int i = DbConnect.getStatement()
				.executeUpdate("update login set password='" + p1 + "' where login_id=" + id + "");
		return i;

	}

	public ResultSet jobseekeracc(Long loginid) throws Exception {
		System.out.println("User id" + loginid);
		rs = DbConnect.getStatement().executeQuery("select * from jobseeker where LOGIN_ID=" + loginid + "");// l.LOGIN_ID=js.LOGIN_ID
																												// and
																												// l.
		return rs;
	}

	public ResultSet jobseekeracc1(Long loginid) throws Exception {
		System.out.println("User id" + loginid);
		rs = DbConnect.getStatement().executeQuery("select * from jobseeker where JS_ID=" + loginid + "");// l.LOGIN_ID=js.LOGIN_ID
																											// and l.
		return rs;
	}

	public ResultSet jobseekeredit(Long loginid) throws Exception {
		System.out.println("User id" + loginid);
		rs = DbConnect.getStatement().executeQuery("select * from jobseeker where LOGIN_ID=" + loginid + "");// l.LOGIN_ID=js.LOGIN_ID
																												// and
																												// l.
		return rs;
	}

	public ResultSet jobseekeredit1(Long loginid) throws Exception {
		System.out.println("User id" + loginid);
		rs = DbConnect.getStatement().executeQuery("select * from jobseeker where JS_ID=" + loginid + "");// l.LOGIN_ID=js.LOGIN_ID
																											// and l.
		return rs;
	}

	public int updateAcc(String firstname, String middlename, String lastname, String date1, Long age, String gender,
			String category, String nationality, String fathersName, String fathersOccupation, String mothersName,
			String emailId, Long contactNo, String presentAddress, String permanentAddress, String board, Long year,
			Long marks, String twboard, Long twyear, Long twmarks, String ginstitute, String course, Long gyear,
			Long gmarks, String pGinstitute, String pgCourse, Long pGyear, Long pGmarks, Long loginid)
			throws Exception {
		int i = DbConnect.getStatement()
				.executeUpdate("update jobseeker set firstname='" + firstname + "',middlename='" + middlename
						+ "',lastname='" + lastname + "',date1='" + date1 + "',age=" + age + ",gender='" + gender
						+ "',category='" + category + "',nationality='" + nationality + "',FATHERS_NAME='" + fathersName
						+ "',fathers_Occupation='" + fathersOccupation + "',MOTHERS_NAME='" + mothersName
						+ "',EMAIL_ID='" + emailId + "',CONTACT_NO=" + contactNo + ",PRESENT_ADDRESS='" + presentAddress
						+ "',PERMANENT_ADDRESS='" + permanentAddress + "',board='" + board + "',year=" + year
						+ ",marks=" + marks + ",twboard='" + twboard + "',twyear=" + twyear + ",twmarks=" + twmarks
						+ ",ginstitute='" + ginstitute + "',course='" + course + "',gyear=" + gyear + ",gmarks="
						+ gmarks + ",pGinstitute='" + pGinstitute + "',pgCourse='" + pgCourse + "',pGyear=" + pGyear
						+ ",pGmarks=" + pGmarks + "   where login_id=" + loginid + "");

		return i;
	}

	public ResultSet companyview(Long cid) throws Exception {
		rs = DbConnect.getStatement().executeQuery("select * from companydetails where Login_id=" + cid + "");// l.LOGIN_ID=js.LOGIN_ID
																												// and
																												// l.
		return rs;

	}

	public ResultSet updatecompany(Long cid) throws Exception {

		rs = DbConnect.getStatement().executeQuery("select * from companydetails where C_ID=" + cid + "");// l.LOGIN_ID=js.LOGIN_ID
																											// and l.
		return rs;
	}

	public int updatecompanydetail(String cName, String cAddress, String cPost, String cCriteria, String cEmail,
			Long cContactno, Long cCuttoff, Long id) throws Exception {
		String sql = "update companydetails set C_NAME='" + cName + "',c_address='" + cAddress + "',c_post='" + cPost
				+ "',c_criteria='" + cCriteria + "',C_EMAILID='" + cEmail + "',C_CONTACTNO=" + cContactno
				+ ",C_CUTTOFF=" + cCuttoff + " where c_id=" + id + "";
		System.out.println(sql);
		int i = DbConnect.getStatement()
				.executeUpdate("update companydetails set C_NAME='" + cName + "',c_address='" + cAddress + "',c_post='"
						+ cPost + "',c_criteria='" + cCriteria + "',C_EMAILID='" + cEmail + "',C_CONTACTNO="
						+ cContactno + ",C_CUTTOFF=" + cCuttoff + " where c_id=" + id + "");

		return i;
	}

	public ResultSet viewjobdetails() throws Exception {
		ResultSet rs = DbConnect.getStatement().executeQuery("select * from jobdetails");
		return rs;
	}

	public int addjob(String post, String criteria, Long vacancies, Long salary, String lastDate) throws Exception {
		String sql = "insert into jobdetails values(JOBDETAILS_SEQ.nextval,'" + post + "','" + criteria + "',"
				+ vacancies + "," + salary + "," + lastDate + "";
		System.out.println(sql);
		int i = DbConnect.getStatement().executeUpdate("insert into jobdetails values(JOBDETAILS_SEQ.nextval,'" + post
				+ "','" + criteria + "'," + vacancies + "," + salary + ",'" + lastDate + "')");
		return i;
	}

	public ResultSet updatejobdetails(Long J_id) throws Exception {

		rs = DbConnect.getStatement().executeQuery("select * from jobdetails where J_id=" + J_id + "");// l.LOGIN_ID=js.LOGIN_ID
																										// and l.
		return rs;
	}

	public int updatejobdetail(String post, String criteria, Long vacancies, Long salary, String lastDate, Long id)
			throws Exception {
		String sql = "update jobdetails set post='" + post + "',criteria='" + criteria + "',VACANCY='" + vacancies
				+ "',salary='" + salary + "',lastDate='" + lastDate + "' where j_id=" + id + "";
		System.out.println(sql);
		int i = DbConnect.getStatement()
				.executeUpdate("update jobdetails set post='" + post + "',CRITERIA='" + criteria + "',VACANCY="
						+ vacancies + ",SALARY=" + salary + ",LASTDATE='" + lastDate + "' where j_id=" + id + "");

		return i;

	}

	public int DeleteJobDetail(Long id) throws Exception {
		int i = DbConnect.getStatement().executeUpdate("delete from jobdetails where j_id=" + id + "");
		return i;
	}

	public int registerexam(String examname, String post, Long cCuttoff) throws Exception {
		int i = DbConnect.getStatement().executeUpdate("insert into exam values(EXAM_SEQ.nextval,'" + examname + "','"
				+ post + "'," + cCuttoff + ",COMPANYDETAILS_SEQ.nextval-1)");
		return i;
	}

	public ResultSet viewexam() throws Exception {

		ResultSet rs = DbConnect.getStatement().executeQuery("select * from exam");
		return rs;
	}

	public int Deleteexam(Long id) throws Exception {
		int i = DbConnect.getStatement().executeUpdate("delete from exam where exam_id=" + id + "");
		return i;
	}

	public int campus(Long cid, String cName, String date11) throws Exception {
		int i = DbConnect.getStatement()
				.executeUpdate("insert into campusschedule values(" + cid + ",'" + cName + "',sysdate)");
		return i;
	}

	public ResultSet campusretrieve() throws Exception {
		rs = DbConnect.getStatement().executeQuery("select * from COMPANYDETAILS");
		return rs;
	}

	public ResultSet showschedule(Long cid) throws Exception {
		rs = DbConnect.getStatement().executeQuery("select C_NAME from COMPANYDETAILS where c_id=" + cid + "");
		return rs;
	}

	public ResultSet hallticket() throws Exception {
		rs = DbConnect.getStatement().executeQuery("select * from JOBSEEKER");
		return rs;
	}

	public int campussyllabus1(Long cid, String rounds, String dt) throws Exception {
		int i = DbConnect.getStatement()
				.executeUpdate("insert into CAMPUSSYLLABUS values(" + cid + ",'" + rounds + "','" + dt + "')");
		return i;
	}

	public ResultSet viewjobseker(Integer id) throws Exception {
		rs = DbConnect.getStatement()
				.executeQuery("select FIRSTNAME,lastname,BRANCH,REGD.NO from jobseeker where js_id=" + id + "");
		return rs;
	}

	public ResultSet showhallticketinf(Long id) throws Exception {
		rs = DbConnect.getStatement().executeQuery("select * from HALLTICKET  where js_id=" + id + "");
		return rs;
	}

	public int inserthallticet(Long idd, Long id, String name, String branch, Long regdno, Long hallticketno,
			String date1) throws Exception {
		int i = DbConnect.getStatement().executeUpdate("insert into HALLTICKET values(" + id + ",'" + name + "','"
				+ branch + "'," + regdno + "," + hallticketno + ",'" + date1 + "'," + idd + ")");
		return i;
	}

	public ResultSet companyname() throws Exception {
		rs = DbConnect.getStatement().executeQuery("select * from COMPANYDETAILS");
		return rs;
	}

	public ResultSet companyview1(Long idd) throws Exception {
		ResultSet rs = DbConnect.getStatement()
				.executeQuery("select C_NAME from COMPANYDETAILS where c_id=" + idd + "");
		return rs;
	}

	public ResultSet viewhalltickt12(Long id, Long jid) throws Exception {
		ResultSet rs = DbConnect.getStatement()
				.executeQuery("select * from HALLTICKET h where h.JS_ID=" + jid + " and h.c_id=" + id + "");
		return rs;
	}

	public int question(String slno, String question, String option1, String option2, String option3, String option4,
			String answer, Long idd) throws Exception {
		int i = DbConnect.getStatement().executeUpdate("insert into question values('" + slno + "','" + question + "','"
				+ option1 + "','" + option2 + "','" + option3 + "','" + option4 + "','" + answer + "'," + idd + ")");
		return i;
	}

	public int fillinfo(Long registrationNo, Long hallticketno, String name) throws Exception {
		int i = DbConnect.getStatement().executeUpdate(
				"insert into fillinfo values(" + registrationNo + "," + hallticketno + ",'" + name + "')");
		return i;
	}

	public ResultSet viewQuestion(int id) throws Exception {
		rs = DbConnect.getStatement().executeQuery("select * from question where Q_ID=" + id + "");
		return rs;
	}

	public int answer(Long qid, String ans) {

		return 0;
	}

	public int deletejobseeker(Long id) throws Exception {
		int i = DbConnect.getStatement().executeUpdate("delete from login where login_id=" + id + "");
		int j = DbConnect.getStatement().executeUpdate("delete from jobseeker where login_id=" + id + "");
		return i;
	}

	public int bankdet(Long jid, String name, String bankname, Long accountno, Long balance, String password)
			throws Exception {
		int i = DbConnect.getStatement().executeUpdate("insert into bankaccount values('" + name + "'," + accountno
				+ "," + balance + ",'" + password + "'," + jid + ",'" + bankname + "','not paid')");
		return i;
	}

	public ResultSet retid(String username) throws Exception {
		rs = DbConnect.getStatement().executeQuery("select login_id from login where username='" + username + "'");
		return rs;
	}

	public int cancel(Long jid, String name, String bankname, Long accountno, Long balance, String password)
			throws Exception {
		int i = DbConnect.getStatement().executeUpdate("insert into bankaccount values('" + name + "'," + accountno
				+ "," + balance + ",'" + password + "'," + jid + ",'" + bankname + "','not paid')");
		return i;

	}

	public ResultSet SelectUser3(int selectuser) throws SQLException, ClassNotFoundException {
		ResultSet rs12 = DbConnect.getStatement()
				.executeQuery("select * from JOBDETAILS where j_id=" + selectuser + " ");
		return rs12;
	}

	public ResultSet RetUser3() throws SQLException, ClassNotFoundException {
		rs = DbConnect.getStatement().executeQuery("select * from JOBDETAILS ");
		return rs;
	}

	public int updateAcc11(Long jId, String post, String criteria, Long vacancies, Long salary, String lastDate)
			throws Exception {
		System.out.println(jId);
		int j = DbConnect.getStatement().executeUpdate("delete from JOBDETAILS where j_id=" + jId + "");
		return j;

	}

	public ResultSet job(Long jId) throws SQLException, ClassNotFoundException {
		rs = DbConnect.getStatement().executeQuery("select POST from JOBDETAILS where J_ID=" + jId + "");
		return rs;
	}

	public ResultSet jobseeker(Long idd) throws SQLException, ClassNotFoundException {
		rs = DbConnect.getStatement().executeQuery("select FIRSTNAME from JOBSEEKER where JS_ID=" + idd + "");
		return rs;
	}

	public int Applyjob11(String s2, String s1) throws SQLException, ClassNotFoundException {
		int i = DbConnect.getStatement()
				.executeUpdate("insert into JOBAPPLY values(JOB_ID_SEQ.nextval,'" + s2 + "','" + s1 + "','Approved')");
		return i;
	}

	public ResultSet RetUser10() throws SQLException, ClassNotFoundException {
		rs = DbConnect.getStatement().executeQuery("select * from JOBSEEKER");
		return rs;
	}

	public ResultSet RegisterStudent(String username, String password, String firstname, String middlename,
			String lastname, String date1, Long age, String gender, String branch, Long regdno, String category,
			String nationality, String fathersName, String fathersOccupation, String mothersName, String emailId,
			Long contactNo, String presentAddress, String permanentAddress, String board, Long year, Long marks,
			String twboard, Long twyear, Long twmarks, String ginstitute, String course, Long gyear, Long gmarks,
			String pGinstitute, String pgCourse, Long pGyear, Long pGmarks, File filetoCreate) throws Exception {
		Long logid = null;
		int i = DbConnect.getStatement().executeUpdate("insert into login values(LOGIN_SEQ.nextval,'" + username + "','"
				+ password + "','user','notapproved')");
		String sql = "insert into jobseeker values(JOBSEEKER_SEQ.nextval,'" + firstname + "','" + middlename + "','"
				+ lastname + "','" + date1 + "'," + age + ",'" + gender + "','" + branch + "'," + regdno + ",'"
				+ category + "','" + nationality + "','" + fathersName + "','" + fathersOccupation + "','" + mothersName
				+ "','" + emailId + "'," + contactNo + ",'" + presentAddress + "','" + permanentAddress
				+ "',LOGIN_SEQ.nextval-1,'" + board + "'," + year + ", " + marks + ",'" + twboard + "'," + twyear + ", "
				+ twmarks + ", '" + ginstitute + "', '" + course + "'," + gyear + ", " + gmarks + ", '" + pGinstitute
				+ "', '" + pgCourse + "'," + pGyear + "," + pGmarks + ",'" + filetoCreate + "');)";
		System.out.println(sql);
		int j = DbConnect.getStatement()
				.executeUpdate("insert into jobseeker values(JOBSEEKER_SEQ.nextval,'" + firstname + "','" + middlename
						+ "','" + lastname + "','" + date1 + "'," + age + ",'" + gender + "','" + branch + "'," + regdno
						+ ",'" + category + "','" + nationality + "','" + fathersName + "','" + fathersOccupation
						+ "','" + mothersName + "','" + emailId + "'," + contactNo + ",'" + presentAddress + "','"
						+ permanentAddress + "',LOGIN_SEQ.nextval-1,'" + board + "'," + year + ", " + marks + ",'"
						+ twboard + "'," + twyear + ", " + twmarks + ", '" + ginstitute + "', '" + course + "'," + gyear
						+ ", " + gmarks + ", '" + pGinstitute + "', '" + pgCourse + "'," + pGyear + "," + pGmarks + ",'"
						+ filetoCreate + "')");
		ResultSet rss = DbConnect.getStatement().executeQuery("select login_seq.nextval-2 from dual");
		if (rss.next()) {
			logid = rss.getLong(1);
		}
		ResultSet rs = DbConnect.getStatement().executeQuery("select username from login where login_id=" + logid + "");

		return rs;

	}

	public ResultSet showresult(Long id) throws Exception {
		ResultSet rs = DbConnect.getStatement()
				.executeQuery("select result1,c_id from result where REGD_NO=" + id + "");

		/*
		 * String sql="update result set STATUS='approved' where regdno="+q+"";
		 * System.out.println(sql); /* int i=DbConnect.getStatement().
		 * executeUpdate("update result set STATUS='approved' where regdno="+q+"");
		 */
		return rs;
	}

}

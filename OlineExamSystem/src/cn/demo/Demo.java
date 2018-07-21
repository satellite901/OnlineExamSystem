package cn.demo;

 
import java.io.BufferedReader;
 
import java.io.FileReader;
import java.io.IOException;
 
import java.lang.reflect.Field;
 
import java.util.ArrayList;
import java.util.List;
 

import org.junit.Test;

import cn.bean.Course;
import cn.bean.Exam;
import cn.bean.Identity;
import cn.bean.Judge;
import cn.bean.Multiplechoice;
import cn.bean.OutPaper;
import cn.bean.Singlechoice;
import cn.bean.User;
import cn.bean.User_Course;
import cn.biz.AdminBiz;
import cn.biz.TeacherBiz;
import cn.dao.CourseDao;
import cn.dao.ExamDao;
import cn.dao.IdentityDao;
import cn.dao.JudgeDao;
import cn.dao.MultiplechoiceDao;
import cn.dao.OutPaperDao;
import cn.dao.SinglechoiceDao;
import cn.dao.User_CourseDao;
import cn.dao.impl.CourseDaoImpl;
import cn.dao.impl.ExamDaoImpl;
import cn.dao.impl.IdentityDaoImpl;
import cn.dao.impl.JudgeDaoImpl;
import cn.dao.impl.MultiplechoiceDaoImpl;
import cn.dao.impl.OutPaperDaoImpl;
import cn.dao.impl.SinglechoiceDaoImpl;
import cn.dao.impl.User_CourseDaoImpl;
import cn.dbc.BaseDao;

public class Demo {

	ExamDao  edi = new ExamDaoImpl();
	Exam e = new Exam();
	List<Exam> list_exam=null;
	
	OutPaperDao  opdi = new OutPaperDaoImpl();
	OutPaper op = new OutPaper();
	List<OutPaper> list_outpaper=null;
	
	User_Course us= new User_Course();
	User_CourseDao  usdi = new User_CourseDaoImpl();
	List<User_Course> list_userCourse = new ArrayList<User_Course>();
	
	Course c = new Course();
	CourseDao cdi = new CourseDaoImpl();
	List<Course> list_course = new ArrayList<Course>();
	
	
	
	/**
	 * ����ExamDaoImpl
	 */
	
	
	/*
	 * ���� public boolean doExam(Exam e)
	 */
	@Test
	public void testDoExam(){
		
	 
		
		e.setCourse_id(1);
		e.setTeacher_id(1);
		e.setJud_list("1,1,1,1,0");
		e.setSch_list("A,A,A,A,A,A");
		e.setMch_list("ABC,ADE,ABC,DEF");
		e.setExam_time("2018-7-11");
		System.out.println(edi.doExam(e));
	}
	
	/*
	 * ���� public boolean updateExam(Exam e)
	 */
	@Test
	public void testUpdateExam(){
	
		 
		e.setId(4);
		e.setCourse_id(1);
		e.setTeacher_id(1);
		e.setJud_list("1,1,1,1,0");
		e.setSch_list("A,A,A,A,A,A");
		e.setMch_list("ABC,ADE,ABC,DEF");
		e.setExam_time("2018-7-05");
		System.out.println(edi.updateExam(e));
	}
	/*
	 * ���� public boolean delExamById(int id)
	 */
	@Test
	public void testDelExamById(){
		
		System.out.println(edi.delExamById(4));
	}
	/*
	 * ���� public List<Exam> findAllExam()
	 */
	@Test
	public void testFindAllExam(){
		list_exam = edi.findAllExam();
		for (Exam exam : list_exam) {
			System.out.println(exam);
		}
	}
	/*
	 * ���� public Exam findExamById(int id)
	 */
	@Test
	public void testFindExamById(){
		System.out.println(edi.findExamById(5));
		
	}
	/*
	 * ����  public List<Exam> findExamByCourseId(int courseId)
	 */
	@Test
	public void testFindExamBycourseId(){
		list_exam = edi.findExamByCourseId(1);
		for (Exam exam : list_exam) {
			System.out.println(exam);
		}
	}
	/*
	 * ���� public List<Exam> findExamByTeacherId(int teacherId)
	 */
	@Test
	public void testFindExamByTeacherId(){
		list_exam =edi.findExamByTeacherId(1);
		for (Exam exam : list_exam) {
			
			System.out.println(exam);
		}
	}
	
	/***
	 * ���� OutPaperDaoImpl
	 */
	
	/*
	 * ���� public boolean doOutPaper(OutPaper op)
	 */
	@Test
	public void testDoOutPaper(){
		op.setCourse_id(1);
		op.setJud_number(30);
		op.setSch_number(20);
		op.setMch_number(10);
		op.setDeff("��");
		op.setExam_time("2018-7-19");
		System.out.println(opdi.doOutPaper(op));
	}
	/*
	 * ���� public boolean updateOutPaper(OutPaper op)
	 */
	@Test
	public void testUpdateOutPaper(){
		op.setId(2);
		op.setCourse_id(1);
		op.setJud_number(10);
		op.setSch_number(20);
		op.setMch_number(30);
		op.setDeff("����");
		op.setExam_time("2018-7-10");
		System.out.println(opdi.updateOutPaper(op));
	}
	/*
	 * ���� public boolean delOutPaper(int id)
	 */
	@Test
	public void testDelOutPaper(){
		System.out.println(opdi.delOutPaper(2));
		
	}
	
	/*
	 * ���� public List<OutPaper> findAllOutPaper()
	 */
	@Test
	public void testFindAllOutPaper(){
		list_outpaper  = opdi.findAllOutPaper();
		for (OutPaper op : list_outpaper) {
			System.out.println(op);
		}
	}
	
	/*
	 * ���� public OutPaper findOutPaperById(int id)
	 */
	@Test
	public void testFindOutPaperById(){
		System.out.println(opdi.findOutPaperById(3));
	}
	/*
	 * ����  public List<OutPaper> findOutPaperByCourseId(int courseId)
	 */
	@Test
	public void testFindOutPaperByCourseId(){
		list_outpaper = opdi.findOutPaperByCourseId(1);
		for (OutPaper op : list_outpaper) {
			System.out.println(op);
		}
	}
	@Test
	public void testConnection(){
		BaseDao bs = new BaseDao();
		System.out.println(bs.getConenction());
	}
	
	/**
	 * ���� User_CourseDaoImpl
	 */
	
	/*
	 * ����  public boolean doUser_Course(User_Course us)
	 */
	
	@Test
	public void testDoUser_Course(){
	
		us.setCourse_id(1);
		us.setUser_name("3112002222");
		System.out.println(usdi.doUser_Course(us));
	}
	
	
	/*
	 * ����  public boolean updateUser_Course(User_Course us)
	 */
	
	@Test
	public void testUpdateUser_Course(){
		
		us.setId(5);;
		us.setCourse_id(2);
		us.setUser_name("3112002222");
		System.out.println(usdi.updateUser_Course(us));
	}
	
	/*
	 * ���� public boolean delUser_Course(int id) 
	 */
	@Test
	public void testDelUser_Course(){
		
		System.out.println(usdi.delUser_Course(5));
	}
	
	
	/*
	 * ���� public List<User_Course> findAllUser_Course()
	 */
	@Test
	public void testFindAllUser_Course(){
		list_userCourse = usdi.findAllUser_Course();
		for (User_Course us : list_userCourse) {
			System.out.println(us);
		}
		
	}
	
	/*
	 * ���� public List<User_Course> findUser_CourseByUserName
	 */
	@Test
	public void testFindUser_CourseByUserName(){
		list_userCourse = usdi.findUser_CourseByUserName("3112002222");
		 for (User_Course us : list_userCourse) {
			System.out.println(us);
		}
	}
	/*
	 * ���� 	public List<User_Course> findUser_CourseByCourseId(int courseId)
	 */
	@Test
	public void testFindUser_CourseByCourseId(){
		list_userCourse = usdi.findUser_CourseByCourseId(1);
		 for (User_Course us : list_userCourse) {
				System.out.println(us);
			}
	}
	
	/**
	 * ���� CourseDaoImpl
	 */
	
	/*
	 * ���� public boolean doCourse(Course c)
	 */
	@Test
	public void testDoCourse(){
		c.setCourse_name("Ӣ��");
		System.out.println(cdi.doCourse(c));
		
	}
	
	/*
	 * ����  public boolean updateCourse(Course c)
	 */
	@Test
	public void testUpdateCourse(){
		c.setId(3);
		c.setCourse_name("����");
		System.out.println(cdi.updateCourse(c));
	}
	
	/*
	 * ���� public Course findCourseById(int id)
	 */
	
	@Test
	public void testFindCourseById(){
		System.out.println(cdi.findCourseById(1));
	}
	/*
	 * ����  	public List<Course> findAllCourse()
	 */
	@Test
	public void testFindAllCourse(){
		list_course = cdi.findAllCourse();
		
		for (Course course : list_course) {
			System.out.println(course);
		}
	}
	
	/*
	 * ���� public boolean isExist(String courseName)
	 */
	@Test
	public void testIsExist(){
		System.out.println(cdi.isExist("����"));
		System.out.println(cdi.isExist("��ѧ"));
	}
	
	
	
	
	
	
	/*********************************************************************
	 * ���� IdentityDaoImpl
	 */
	IdentityDao idi = new IdentityDaoImpl();
	List<Identity> list_identity =null; 
	
	/*
	 * ���� public Identity findIdentityById(int id)
	 */
	@Test
	public void testFindIdentityById(){
		System.out.println(idi.findIdentityById(1));	
	}
	
	/*
	 * ���� public List<Identity> findAllIdentity()
	 */
	@Test
	public void testFindAllIdentity(){
		list_identity = idi.findAllIdentity();
		for (Identity i : list_identity) {
			System.out.println(i);
		}
	}
	
	/*
	 * ����  public int findIdentityByName(String name)
	 */
	@Test
	public void testFindIdentityByName(){
		System.out.println(idi.findIdentityByName("����Ա"));
		System.out.println(idi.findIdentityByName("ѧ��"));
		System.out.println(idi.findIdentityByName("��ʦ"));
	}
	
	
	/**
	 * ���� Singlechoice
	 */
	List<Singlechoice> list_singlechoice = null;
	Singlechoice sc =new Singlechoice();
	SinglechoiceDao schd = new SinglechoiceDaoImpl();
	/*
	 * 	public boolean doSinglechoice(Singlechoice sc) 
	 */
	@Test
	public void testDoSinglechoice(){
		sc.setName("1��	��ջS�Ͷ���Q�ĳ�ʼ״̬Ϊ�գ�Ԫ��e1,e2,e3,e4,e5,e6����ͨ��ջS��һ��Ԫ�س�ջ�󼴽������Q����6��Ԫ�س��ӵ�˳����e2,e4,e3,e6,e5,e1����ջS����������Ӧ����()    ����");
		sc.setOption_a("2");
		sc.setOption_b("3");
		sc.setOption_c("4");
		sc.setOption_d("6");
		sc.setDeff_degree(2.0);
		sc.setAnswer("B");
		sc.setCourse_id(1);
		System.out.println(schd.doSinglechoice(sc));
		
	}
	/*
	 * 	public boolean updateSinglechoiceById(Singlechoice sc) 
	 */
	@Test
	public void testUpdateSinglechoice(){
		sc.setId(1);
		sc.setAnswer("c");
		System.out.println(schd.updateSinglechoiceById(sc));
	}
	
	/*
	 * public boolean delSinglechoiceById(int id)
	 */
	
	@Test
	public void testDelSinglechoiceById(){
		List<Singlechoice> list =schd.findSinglechoiceByCourseId(1);
		for (Singlechoice singlechoice : list) {
			
			System.out.println(singlechoice);
		}
	
		System.out.println(schd.findSinglechoiceById(2));
		
	}
	
	
	@Test
	public void testImportQue() throws IOException{
		String path = "G:/study/��Ƕѧϰ/��Ŀ/���߿���ƽ̨/qlib/Singlechoicequestion.txt";
		BufferedReader bis = new BufferedReader(new FileReader(path));
		List<Singlechoice> list = new ArrayList<>();
		SinglechoiceDao schi = new SinglechoiceDaoImpl();
		Singlechoice sch = null;
		String str="";
		String tempStr = "";
		int num = 1;
		while((str=bis.readLine())!=null){
			sch = new Singlechoice();
			if(str.startsWith(num+".")||str.startsWith(num+"��")){
				str = str.substring(2,str.length());
				tempStr +=str;
				
				while(!((str=bis.readLine()).startsWith("ѡ��"))){
					tempStr+=str;
				}
				sch.setName(tempStr);
				tempStr = str;
				while(!(str=bis.readLine()).startsWith("��")){
					tempStr+=str;
				}

				tempStr = tempStr.trim();	
				String []tempStri1 =tempStr.split("ѡ�� ",2);
				String []tempStri2 =tempStri1[1].trim().split(" ");
				sch.setOption_a(tempStri2[0].split("A.",2)[1]);
				sch.setOption_b(tempStri2[1].split("B.",2)[1]);
				sch.setOption_c(tempStri2[2].split("C.",2)[1]);
				sch.setOption_d(tempStri2[3].split("D.",2)[1]);
				sch.setCourse_id(1);
				sch.setDeff_degree(3.0);
				
				if(str!=null){
					String []strAnswer = str.split("�� ",2);
					sch.setAnswer(strAnswer[1]);
				}
				
				list.add(sch);
				bis.readLine();
				tempStr="";
			}
			num++;
		}
		bis.close();
		for (Singlechoice sc : list) {
			if(!schi.doSinglechoice(sc)){
				System.out.println("��Ŀ\n"+sc.getName()+"\n���ʧ��");
			}
		}
	}
	
	@Test
	public void testImportMutilQue() throws IOException{
		String path = "G:/study/��Ƕѧϰ/��Ŀ/���߿���ƽ̨/qlib/Multiplequestion.txt";
		BufferedReader bis = new BufferedReader(new FileReader(path));
		List<Multiplechoice> list = new ArrayList<>();
		MultiplechoiceDao mchi =  new MultiplechoiceDaoImpl();
		Multiplechoice mch = null;
		String str="";
		String tempStr = "";
		int num = 1;
		while((str=bis.readLine())!=null){
			mch = new Multiplechoice();
			if(str.startsWith(num+".")||str.startsWith(num+"��")){
				str = str.substring(2,str.length());
				tempStr +=str;
				
				while(!((str=bis.readLine()).startsWith("ѡ��"))){
					tempStr+=str;
				}
				mch.setName(tempStr);
				tempStr = str.trim();
				while(!(str=bis.readLine()).startsWith("��")){
					tempStr+=" ";
					tempStr+=str.trim();
				}
			//	System.out.println(tempStr);
				tempStr = tempStr.trim();	
				String []tempStri1 =tempStr.split("ѡ�� ",2);
				String []tempStri2 =tempStri1[1].trim().split(" ");
				
				for (String string : tempStri2) {
					System.out.print(string+"*");
				}
				System.out.println();
				
				if(tempStri2.length==4){
					mch.setOption_a(tempStri2[0].split("A.",2)[1]);
					mch.setOption_b(tempStri2[1].split("B.",2)[1]);
					mch.setOption_c(tempStri2[2].split("C.",2)[1]);
					mch.setOption_d(tempStri2[3].split("D.",2)[1]);
					mch.setOption_e("empty");
					mch.setOption_f("empty");
				}else if(tempStri2.length==6){
					mch.setOption_a(tempStri2[0].split("A.",2)[1]);
					mch.setOption_b(tempStri2[1].split("B.",2)[1]);
					mch.setOption_c(tempStri2[2].split("C.",2)[1]);
					mch.setOption_d(tempStri2[3].split("D.",2)[1]);
					mch.setOption_e(tempStri2[4].split("E.",2)[1]);
					mch.setOption_f(tempStri2[5].split("F.",2)[1]);
				}
				
				
				mch.setCourse_id(1);
				mch.setDeff_degree(3.0);
				
				if(str!=null){
					String []strAnswer = str.split("�� ");
					mch.setAnswer(strAnswer[1]);
				}
				
				list.add(mch);
				bis.readLine();
				tempStr="";
			}
			num++;
		}
		bis.close();
		int count =0;
		for (Multiplechoice mch1 : list) {
			if(!mchi.doMultiplechoice(mch1)){
				System.out.println("��Ŀ\n"+mch1.getName()+"\n���ʧ��");
			}	else
				count++;
		}
		System.out.println("����"+count+"����Ŀ��ӳɹ���");
	}
	
	@Test
	public void testImortJudge() throws IOException{
		String path = "G:/study/��Ƕѧϰ/��Ŀ/���߿���ƽ̨/qlib/judgequestion.txt";
		BufferedReader bis = new BufferedReader(new FileReader(path));
		List<Judge> list = new ArrayList<>();
		JudgeDao jdi = new JudgeDaoImpl();
		Judge jd = null;
		String str="";
		String tempStr = "";
		int num = 1;
		while((str=bis.readLine())!=null){
			jd = new Judge();
			if(str.startsWith(num+".")||str.startsWith(num+"��")){
				str = str.substring(2,str.length());
				tempStr +=str;		
				while(!((str=bis.readLine()).startsWith("��"))){
					tempStr+=str;
				}
				jd.setName(tempStr);	
		
				if(str!=null){
					String []strAnswer = str.split("�� ",2);
					Integer i = new Integer(strAnswer[1].trim());
					jd.setAnswer(i);
				}
				jd.setCourse_id(1);
				jd.setDeff_degree(3.0);
				list.add(jd);
				bis.readLine();
				tempStr="";
			}
			num++;
		}
		bis.close();
		for (Judge jd1  : list) {
			if(!jdi.doJudge(jd1)){
				System.out.println("��Ŀ\n"+jd1.getName()+"\n���ʧ��");
			}
			System.out.println(jd1);
		}
		
		
	}
	
	
	
	@Test
	public void test0(){
		String str = "A.ABCDEFGHIJK";
		String str1[] = str.split("A.",2);
		for (String string : str1) {
			
			System.out.println(string);
		}
	}
	
	
	
	
	
	
	@Test
	public void test(){
	 List<Singlechoice> list = null;
	 SinglechoiceDao  sdi = new SinglechoiceDaoImpl();
	 list = sdi.findAllSinglechoice();
	 for (Singlechoice singlechoice : list) {
		System.out.println(singlechoice);
	}
		
	}
	@Test
	public void test01() throws IllegalArgumentException, IllegalAccessException, InstantiationException{
		Object obj = new Singlechoice();
		Class clazz = obj.getClass();
		Object o = clazz.newInstance();
		Field[] fields = clazz.getDeclaredFields();
		SinglechoiceDao schi = new SinglechoiceDaoImpl();
		Singlechoice sch =schi.findSinglechoiceById(2);
	
		if(sch!=null){
			List<Object> list = sch.getList();
			for(int i = 0;i<fields.length;i++){
				fields[i].setAccessible(true);
				fields[i].set(obj, list.get(i));
			}
		}
		System.out.println(obj);
	
	}
	
	/**
	 * ����TeacherBiz
	 */
	
	/*
	 * ���� public boolean doQuestion(Object obj,String nameType)
	 */

	@Test
	public void testDoQuestion(){
		TeacherBiz tb = new TeacherBiz();
		/*Judge judge = new Judge();
		JudgeDaoImpl jdi = new JudgeDaoImpl();
		judge = jdi.findJudgeById(10);
		System.out.println(tb.doQuestion(judge, "�ж���"));*/
		Singlechoice sing = new Singlechoice();
		SinglechoiceDaoImpl schi = new SinglechoiceDaoImpl();
		sing = schi.findSinglechoiceById(2);
		System.out.println(tb.doQuestion(sing, "��ѡ��"));
		
		Multiplechoice mch = new Multiplechoice();
		MultiplechoiceDaoImpl mchi = new MultiplechoiceDaoImpl();
		 mch = mchi.findMultiplechoiceById(10);
		 System.out.println( tb.doQuestion(mch, "��ѡ��"));
	}
	
	/**
	 * ���� AdminBiz
	 */
	
	@Test
	public void testAdminBizDoUser(){
		AdminBiz ab = new AdminBiz();
		User user = new User();
		user.setName("����");
		user.setIdentity_id(1);
		user.setUser_name("1001");
		user.setPassword("123456");
		user.setSex("��");
		 
		System.out.println(ab.doUser(user));
	}
	@Test
	public void testUpdatePwd(){
		AdminBiz ab = new AdminBiz();
		System.out.println(ab.updateUserPassword("1001", "123"));
	}
	@Test
	public void testUpdateUser(){
		AdminBiz ab = new AdminBiz();
		User user = new User();
		//user.setName("����123��");
		 user.setIdentity_id(2);
		  user.setUser_name("1001");
		//user.setPassword("12345asd6");
		//user.setSex("Ů");
		System.out.println(ab.updateUser(user));
	}
	@Test
	public void testDelUser(){
		AdminBiz ab = new AdminBiz();
		System.out.println(ab.delUser("45"));
	}
	
	@Test
	public void testGetLasiId(){
		SinglechoiceDaoImpl jdi = new SinglechoiceDaoImpl();
		System.out.println(jdi.getLastId());
	}
	@Test
	public void testRandomJudge(){
		TeacherBiz tb = new TeacherBiz();
		System.out.println(tb.getRandomJudge(10, 1).toString());
	}
	@Test
	public void testRandomSingleChoice(){
		TeacherBiz tb = new TeacherBiz();
		System.out.println(tb.getRandomJudge(10, 1).toString());
		System.out.println(tb.getRandomSinglechoice(10, 1).toString());
		System.out.println(tb.getRandomMutilChoice(10, 1).toString());
	}
	@Test
	public void testRandomExam(){
		OutPaper o = new OutPaper();
		TeacherBiz tb = new TeacherBiz();
		ExamDao edi = new ExamDaoImpl();
		o.setCourse_id(1);
		o.setDeff("��");
		o.setJud_number(20);
		o.setMch_number(20);
		o.setSch_number(20);
		o.setExam_time("120����");
		System.out.println(edi.doExam(tb.makeExam(o, 2) ));
		
	}
}

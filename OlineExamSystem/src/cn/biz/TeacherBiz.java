package cn.biz;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cn.bean.Exam;
import cn.bean.Judge;
import cn.bean.Multiplechoice;
import cn.bean.OutPaper;
import cn.bean.Singlechoice;
import cn.dao.JudgeDao;
import cn.dao.MultiplechoiceDao;
import cn.dao.SinglechoiceDao;
import cn.dao.impl.JudgeDaoImpl;
import cn.dao.impl.MultiplechoiceDaoImpl;
import cn.dao.impl.SinglechoiceDaoImpl;

public class TeacherBiz {
	/*
	 * �������
	 */
	public boolean doQuestion(Object obj,String nameType){
		boolean isFlag = false;
		if(nameType.equals("�ж���")){
			JudgeDao jdi = new JudgeDaoImpl();
			isFlag = jdi.doJudge((Judge)obj);
		}else if(nameType.equals("��ѡ��")){
			SinglechoiceDaoImpl schi = new SinglechoiceDaoImpl();
			isFlag=schi.doSinglechoice((Singlechoice) obj);
		}else if(nameType.equals("��ѡ��")){
			MultiplechoiceDao mchdi = new MultiplechoiceDaoImpl();
			isFlag = mchdi.doMultiplechoice((Multiplechoice)obj);
		}
		return isFlag;
	}
	
	/*
	 * ������Ŀ
	 */
	public int importQuestionByChoice(String path,int course_id) throws IOException{
		int count =0;
		BufferedReader bis = new BufferedReader(new FileReader(path));
		List<Singlechoice> list = new ArrayList<>();
		SinglechoiceDao schi = new SinglechoiceDaoImpl();
		Singlechoice sch = null;
		String str="";
		String tempStr = "";
		int num = 1;
		while((str=bis.readLine())!=null){
			sch = new Singlechoice();
			if(str.startsWith(num+".")||str.startsWith(num+"��")){ //�ж����
				str = str.substring(2,str.length());  //�и�ȥ�����
				tempStr +=str;
				
				while(!((str=bis.readLine()).startsWith("ѡ��"))){ //ѭ����ȡֱ��ѡ����
					tempStr+=str;
				}
				sch.setName(tempStr);  //��Ŀ¼��
				tempStr = str;         //ѡ�
				while(!(str=bis.readLine()).startsWith("��")){//ѭ����ȡֱ������
					tempStr+=str;
				}
				tempStr = tempStr.trim();	
				String []tempStri1 =tempStr.split("ѡ�� ",2);
				String []tempStri2 =tempStri1[1].trim().split(" ");	
				sch.setOption_a(tempStri2[0].split("A.",2)[1]);
				sch.setOption_b(tempStri2[1].split("B.",2)[1]);
				sch.setOption_c(tempStri2[2].split("C.",2)[1]);
				sch.setOption_d(tempStri2[3].split("D.",2)[1]);
				sch.setCourse_id(course_id);
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
			}else{
				count++;
			}
		}
		System.out.println("���ѳɹ�¼��"+count+"����Ŀ");
		return count;
		
	}
	public int importMutilQue(String path,int course_id) throws IOException{
		 
		int count =0;
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
				tempStr = tempStr.trim();	
				String []tempStri1 =tempStr.split("ѡ�� ",2);
				String []tempStri2 =tempStri1[1].trim().split(" ");
	
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
				mch.setCourse_id(course_id);
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
		
		for (Multiplechoice mch1 : list) {
			if(!mchi.doMultiplechoice(mch1)){
				System.out.println("��Ŀ\n"+mch1.getName()+"\n���ʧ��");
			}	else
				count++;
		}
		System.out.println("����"+count+"����Ŀ��ӳɹ���");
		return count;
	}
	public int importJugeQue(String path,int course_id) throws NumberFormatException, IOException{
		int count = 0;
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
		
		return count;
	}
	
	public boolean exportQuestion(String path){
		boolean isFlag = false;
		
		
		return isFlag;
	}
	
	
	public boolean delQuestion(int id,String nameType){
		boolean isFlag = false;
		if(nameType.equals("�ж���")){
			JudgeDao jdi = new JudgeDaoImpl();
			 isFlag = jdi.delJudge(id);
		}else if(nameType.equals("��ѡ��")){
			SinglechoiceDaoImpl schi = new SinglechoiceDaoImpl();
			 isFlag = schi.delSinglechoiceById(id);
		}else if(nameType.equals("��ѡ��")){
			MultiplechoiceDao mchdi = new MultiplechoiceDaoImpl();
			isFlag = mchdi.delMultiplechoice(id);
		}
		
		return isFlag;
	}
	
	public boolean updateQuestion(Object obj,String nameType){
		boolean isFlag = false;	
		if(nameType.equals("�ж���")){
			JudgeDao jdi = new JudgeDaoImpl();
			 isFlag = jdi.updateJudge ((Judge)obj);
		}else if(nameType.equals("��ѡ��")){
			SinglechoiceDaoImpl schi = new SinglechoiceDaoImpl();
			 isFlag = schi.updateSinglechoiceById((Singlechoice)obj);
		}else if(nameType.equals("��ѡ��")){
			MultiplechoiceDao mchdi = new MultiplechoiceDaoImpl();
			isFlag = mchdi.updateMultiplechoice((Multiplechoice)obj);
		}
		return isFlag;
	}



	public Exam makeExam(OutPaper o,int teacherId){
		Exam e = new Exam();
		int judNum = o.getJud_number();
		int schNum = o.getSch_number();
		int mchNum = o.getMch_number();
		int course_id = o.getCourse_id();
		e.setCourse_id(course_id);
		e.setTeacher_id(teacherId);
		e.setExam_time(o.getExam_time());
		e.setJud_list(getRandomJudge(judNum, course_id));
		e.setSch_list(getRandomSinglechoice(schNum, course_id));
		e.setMch_list(getRandomMutilChoice(mchNum, course_id));
		return e;
	}
	/*
	 * ��������ж��� num����Ŀ���� courseId����ĿId
	 */
	public String getRandomJudge(int num,int courseId){
		String str=null;
		JudgeDao jdi = new JudgeDaoImpl();
		int randNum=jdi.getLastId();
		int[] numId = new int[num];
		int randId =0;
		int count =-1; //��¼�����ɵ���Ŀ
		Random r = new Random(randNum);
		
		for(int i = 0 ;i<num;i++){
		while(true){
			 randId =r.nextInt(randNum);
			 if(jdi.findJudgeById(randId)!=null){
				if( !isExist(numId,randId, count)){
					numId[++count] =randId;	
					 break;
					
				}
			 }
		}	
		} 
		str = "";
		for (int i : numId) {
			str+=i+" ";
		}
		 
		
		return str;
	}
	public String getRandomSinglechoice(int num,int courseId){
		String str=null;
		SinglechoiceDao schi = new SinglechoiceDaoImpl();
		int randNum=schi.getLastId();
		int[] numId = new int[num];
		int randId =0;
		int count =-1; //��¼�����ɵ���Ŀ
		Random r = new Random(randNum);		
		for(int i = 0 ;i<num;i++){
		while(true){
			 randId =r.nextInt(randNum);
			 if(schi.findSinglechoiceById(randId)!=null){
				if( !isExist(numId,randId, count)){
					numId[++count] =randId;	
					 break;		
				}
			 }
		}	
		} 
		str = "";
		for (int i : numId) {
			str+=i+" ";
		}
		return str;
	}
	
	public String getRandomMutilChoice(int num,int courseId){
		String str=null;
		MultiplechoiceDao mchi = new MultiplechoiceDaoImpl();
		int randNum=mchi.getLastId();
		int[] numId = new int[num];
		int randId =0;
		int count =-1; //��¼�����ɵ���Ŀ
		Random r = new Random(randNum);		
		for(int i = 0 ;i<num;i++){
		while(true){
			 randId =r.nextInt(randNum);
			 if(mchi.findMultiplechoiceById (randId)!=null){
				if( !isExist(numId,randId, count)){
					numId[++count] =randId;	
					 break;		
				}
			 }
		}	
		} 
		str = "";
		for (int i : numId) {
			str+=i+" ";
		}
		
		return str;
	}
	
	
	
	
	
	
	
	
	
	/*
	 * �ж�id�Ƿ��Ѵ�������num��
	 */
	public boolean isExist(int []num,int id,int count){
		boolean isFlag = false;
		for(int i =0;i<=count;i++){
			if(num[i]==id){
				isFlag = true;
				break;
			}
		}
		return isFlag;
	}


}

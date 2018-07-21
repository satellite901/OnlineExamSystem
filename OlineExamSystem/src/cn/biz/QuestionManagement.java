package cn.biz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import cn.bean.Exam;
import cn.bean.Judge;
import cn.bean.Multiplechoice;
import cn.bean.Singlechoice;
import cn.dao.impl.JudgeDaoImpl;
import cn.dao.impl.MultiplechoiceDaoImpl;
import cn.dao.impl.SinglechoiceDaoImpl;

public class QuestionManagement {

	JudgeDaoImpl jdi=new JudgeDaoImpl();
	SinglechoiceDaoImpl sdi=new SinglechoiceDaoImpl();
	MultiplechoiceDaoImpl mdi=new MultiplechoiceDaoImpl();
	//添加考试科目
		public boolean doCourse()
		{
			boolean isflag=false;
			
			
			return isflag;		
		}
		
		//通过id导出判断题
		public void outputJudQuestion(String path,int id) throws IOException
		{
			Judge jud=null;
			JudgeDaoImpl jdi=new JudgeDaoImpl();
			Writer wt=new FileWriter(path);
			if(wt==null)
			{
				System.out.println("不能打开文件");
			}
			BufferedWriter bw= new BufferedWriter(wt); 
			jud=jdi.findJudgeById(id);
			String str="1.";
			str+=jud.getName();
			bw.write(str+"\r\n");
			str="答案 ";
			str+=jud.getAnswer()+"";
			bw.write(str);
			bw.close();
			wt.close();
					
			
		}
		//通过id导出单选题
		public void outputSchQuestion(String path,int id) throws IOException
		{
			Singlechoice sch=null;
			SinglechoiceDaoImpl sdi=new SinglechoiceDaoImpl();
			Writer wt=new FileWriter(path);
			if(wt==null)
			{
				System.out.println("不能打开文件");
				return;
			}
			BufferedWriter bw = new BufferedWriter(wt);	
			sch=sdi.findSinglechoiceById(id);
			String str="1.";
			str=str.trim();
			str+=sch.getName();
			bw.write(str+"\r\n");		
			str="选项  A.";
			str+=sch.getOption_a();
			str+=" B.";
			str+=sch.getOption_b();
			str+=" C.";
			str+=sch.getOption_c();
			str+=" D.";
			str+=sch.getOption_d();
		    bw.write(str+"\r\n");
			str="答案 ";
			str+=sch.getAnswer();
			bw.write(str+"\r\n\r\n");
			
			bw.close();
			wt.close();
			
		}
		//通过id导出多选题
		public void outputMchQuestion(String path,int id) throws IOException
		{
			Multiplechoice mch=null;
			MultiplechoiceDaoImpl mdi=new MultiplechoiceDaoImpl();
			Writer wt=new FileWriter(path);
			if(wt==null)
			{
				System.out.println("不能打开文件");
				return;
			}
			BufferedWriter bw = new BufferedWriter(wt);
			List<Multiplechoice> list=new ArrayList<Multiplechoice>();
			mch=mdi.findMultiplechoiceById(id);
		
			String str="1.";
			str=str.trim();
			str+=mch.getName();
			bw.write(str+"\r\n");
			
			str="选项  A.";
			str+=mch.getOption_a();
			str+=" B.";
			str+=mch.getOption_b();
			str+=" C.";
			str+=mch.getOption_c();
			str+=" D.";
			str+=mch.getOption_d();
			if(!(mch.getOption_e().equals("empty")))
			{
				str+=" E.";
				str+=mch.getOption_e();
				str+=" F.";
				str+=mch.getOption_f();
			}
		
		    bw.write(str+"\r\n");
			str="答案 ";
			str+=mch.getAnswer();
			bw.write(str+"\r\n\r\n");
			
			bw.close();
			wt.close();
			
		}
		//导出同一科目的所有判断题
		public void outputJudgeByCourseId(String path,int course_id) throws IOException
		{
			Judge jud=null;
			JudgeDaoImpl jdi=new JudgeDaoImpl();
			Writer wt=new FileWriter(path);
			if(wt==null)
			{
				System.out.println("不能打开文件");
			}
			BufferedWriter bw= new BufferedWriter(wt);
			List<Judge> list=new ArrayList<Judge>();		
			list=jdi.findJudgeByCourse_id(course_id);
			int num=1;
			String str="";
			
		  for(int i=0;i<list.size();i++)
			{
				
			
				jud=list.get(i);
			    str=num+".";
			    str+=jud.getName();		  
			    bw.write(str+"\r\n");
			    str="答案 ";
			    str+=jud.getAnswer()+"";
			    bw.write(str+"\r\n\r\n");
			    num++; 
			  
			}
			  bw.close();
			  wt.close();
			
		}
		//导出同一科目的所有单选题题目
		public void outputSchByCourseId(String path,int course_id) throws IOException
		{
			
			SinglechoiceDaoImpl sdi=new SinglechoiceDaoImpl();
			Writer wt=new FileWriter(path);
			if(wt==null)
			{
				System.out.println("不能打开文件");
				return;
			}
			BufferedWriter bw = new BufferedWriter(wt);	
			List<Singlechoice> list=new ArrayList<Singlechoice>();
			list=sdi.findSinglechoiceByCourseId(course_id);
			int num=1;
			String str="";		
			for (Singlechoice sch : list)
			{
				str=num+".";
				str=str.trim();
				str+=sch.getName();
				bw.write(str+"\r\n");		
				str="选项  A.";
				str+=sch.getOption_a();
				str+=" B.";
				str+=sch.getOption_b();
				str+=" C.";
				str+=sch.getOption_c();
				str+=" D.";
				str+=sch.getOption_d();
			    bw.write(str+"\r\n");
				str="答案 ";
				str+=sch.getAnswer();
				bw.write(str+"\r\n\r\n");
				num++;
			}
			bw.close();
			wt.close();
		}
		//导出同一科目的所有多选题题目
		public void outputMchByCourseId(String path,int course_id) throws IOException
		{
			
			MultiplechoiceDaoImpl mdi=new MultiplechoiceDaoImpl();
			Writer wt=new FileWriter(path);
			if(wt==null)
			{
				System.out.println("不能打开文件");
				return;
			}
			BufferedWriter bw = new BufferedWriter(wt);
			List<Multiplechoice> list=new ArrayList<Multiplechoice>();
		//	list=mdi.findMultiplechoiceById(id);
			list=mdi.findMultiplechoiceByCourseId(course_id);
			int num=1;
			String str="";
			for (Multiplechoice mch : list)
			{
				str=num+".";
				str=str.trim();
				str+=mch.getName();
				bw.write(str+"\r\n");
				
				str="选项  A.";
				str+=mch.getOption_a();
				str+=" B.";
				str+=mch.getOption_b();
				str+=" C.";
				str+=mch.getOption_c();
				str+=" D.";			
				str+=mch.getOption_d();
				if(!(mch.getOption_e().equals("empty")))
				{
					str+=" E.";
					str+=mch.getOption_e();
					str+=" F.";
					str+=mch.getOption_f();
				}
				
			    bw.write(str+"\r\n");
				str="答案 ";
				str+=mch.getAnswer();
				bw.write(str+"\r\n\r\n");
				num++;
			}
			
			
			bw.close();
			wt.close();
			
		}
		//导出试卷
		public Exam outputJudgeQuestion(String path,int course_id) throws IOException
		{
			Exam ex=new Exam();
			Writer wt=new FileWriter(path);
			BufferedWriter bw=new BufferedWriter(wt);
			List<Exam> list=new ArrayList<Exam>();
			
			String strJud_list=ex.getJud_list();
			String strSch_list=ex.getSch_list();
			String strMch_list=ex.getMch_list();
			
			String strJud[]=strJud_list.split(",");
			String strSch[]=strSch_list.split(",");
			String strMch[]=strMch_list.split(",");
			
			
			
			return ex;
		}
	
		//通过id查阅试题
		public void findQuestionById(String QuestionType,int id)
		{
			if(QuestionType.equals("判断题"))
			{
				jdi.findJudgeById(id);
			}
			else if(QuestionType.equals("单选题"))
			{
				sdi.findSinglechoiceById(id);
			}
			else if(QuestionType.equals("多选题"))
			{
				mdi.findMultiplechoiceById(id);
			}
		}
		//通过题目字符串查询试题
		public void findQuestionByStr(String QuestionType,String str)
		{
			if(QuestionType.equals("判断题"))
			{
				jdi.findStrJudge(str);
			}
			else if(QuestionType.equals("单选题"))
			{
				sdi.findSinglechoiceByStr(str);
			}
			else if(QuestionType.equals("多选题"))
			{
				mdi.findMultiplechoiceByStr(str);
			}
		}
		//查询全部题库
		public void findAllQuestion(String QuestionType)
		{
			if(QuestionType.equals("判断题"))
			{
				jdi.findAllJudge();
			}
			else if(QuestionType.equals("单选题"))
			{
				sdi.findAllSinglechoice();
			}
			else if(QuestionType.equals("多选题"))
			{
				mdi.findAllMultiplechoice();
			}
		}
		//删除试题
		public void delQuestion(String QuestionType,int id)
		{
		
			if(QuestionType.equals("判断题"))
			{
				jdi.delJudge(id);
			}
			else if (QuestionType.equals("单选题")) 
			{
				sdi.delSinglechoiceById(id);
			}
			else if(QuestionType.equals("多选题"))
	        {
				mdi.delMultiplechoice(id);
	        }
		
		


	    }
}

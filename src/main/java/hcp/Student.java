package hcp;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private String name;
	private int age;
	private String className;
	private List<Student> studentList;
	private Map<String,Student> studentMap;
	private Set<Student> studentSet;
	private Properties studentProperties;
	
	//更新1
	//更新1
	
	public Student(String name, int age, String className, List<Student> studentList, Map<String, Student> studentMap,
			Set<Student> studentSet, Properties studentProperties) {
		super();
		this.name = name;
		this.age = age;
		this.className = className;
		this.studentList = studentList;
		this.studentMap = studentMap;
		this.studentSet = studentSet;
		this.studentProperties = studentProperties;
	}

	public Properties getStudentProperties() {
		return studentProperties;
	}
	
	public void setStudentProperties(Properties studentProperties) {
		this.studentProperties = studentProperties;
	}
	
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public Map<String, Student> getStudentMap() {
		return studentMap;
	}
	public void setStudentMap(Map<String, Student> studentMap) {
		this.studentMap = studentMap;
	}
	public Set<Student> getStudentSet() {
		return studentSet;
	}
	public void setStudentSet(Set<Student> studentSet) {
		this.studentSet = studentSet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", className=" + className + ", studentList=" + studentList
				+ ", studentMap=" + studentMap + ", studentSet=" + studentSet + ", studentProperties="
				+ studentProperties + "]";
	}
	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	public void test() {
		System.out.println("测试方法");
	}

	public static Student StudentFactory(String name, int age, String className) {
		return new Student(name,age,className,null,null,null,null);
	}
	
	public Student studentFactory(String name, int age, String className) {
		return new Student(name,age,className,null,null,null,null);
	}
}

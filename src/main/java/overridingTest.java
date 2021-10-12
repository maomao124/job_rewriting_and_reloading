/**
 * Project name(项目名称)：作业 重写与重载
 * Package(包名): PACKAGE_NAME
 * Class(类名): overridingTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/12
 * Time(创建时间)： 19:19
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class overridingTest
{
    public static void main(String[] args)
    {
        // 实例化子类对象s，调用talk()方法打印信息
        /********* begin *********/
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        s.setSchool("哈佛大学");
        s.talk();

        /********* end *********/

    }
}

class Person
{
    /********* begin *********/
    private String name;
    private int age;

    public StringBuilder talk()
    {
        StringBuilder s = new StringBuilder();
        s.append("我是：").append(getName()).append("，今年：").append(getAge()).append("岁");
        System.out.println(s);
        return s;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    /********* end *********/
}

class Student extends Person
{
    /********* begin *********/
    private String school;

    public StringBuilder talk()
    {
        StringBuilder s = new StringBuilder();
        s.append("我是：").append(getName()).append("，今年：").append(getAge()).append("岁，我在").append(getSchool()).append("上学");
        System.out.println(s);
        return s;
    }

    public String getSchool()
    {
        return school;
    }

    public void setSchool(String school)
    {
        this.school = school;
    }
    /********* end *********/
}

package Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CriteriaDemo
 * @Description 过滤器测试
 * @Author zhukq
 * @Date 2020/3/23 10:35
 * @Version 1.0
 */
public class CriteriaDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);
        System.out.println("男性信息为:::"+male.meetCriteriaPerson(persons));
        System.out.println("女性信息为:"+female.meetCriteriaPerson(persons));
        System.out.println("单身人信息为:"+single.meetCriteriaPerson(persons));
        System.out.println("男性单身信息为:"+singleMale.meetCriteriaPerson(persons));
        System.out.println("女性或者单身信息为:"+singleOrFemale.meetCriteriaPerson(persons));

    }
}

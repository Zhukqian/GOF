package Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CriteriaSingle
 * @Description 单身的标准过滤器
 * @Author zhukq
 * @Date 2020/3/23 10:25
 * @Version 1.0
 */
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteriaPerson(List<Person> personList) {
        List<Person> list = new ArrayList<Person>();
        for(Person p :personList){
            if("single".equalsIgnoreCase(p.getMaritalStatus())){
                list.add(p);
            }
        }
        return list;
    }
}

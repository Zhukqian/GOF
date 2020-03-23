package Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CriteriaFemale
 * @Description 女性标准过滤器
 * @Author zhukq
 * @Date 2020/3/23 10:10
 * @Version 1.0
 */
public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCriteriaPerson(List<Person> personList) {
        List<Person> list = new ArrayList<Person>();

        for (Person p:personList){
            if("female".equalsIgnoreCase(p.getGender())){
                list.add(p);
            }
        }
        return list;
    }
}

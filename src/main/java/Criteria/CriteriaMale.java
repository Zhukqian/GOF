package Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CriteriaMale
 * @Description 男性标准过滤器
 * @Author zhukq
 * @Date 2020/3/23 10:06
 * @Version 1.0
 */
public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteriaPerson(List<Person> personList) {
        List<Person> malePerson = new ArrayList<Person>();
        for(Person  p :personList){
            if("male".equalsIgnoreCase(p.getGender())){
                malePerson.add(p);
            }
        }
        return malePerson;
    }
}

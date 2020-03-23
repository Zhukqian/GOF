package Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName OrCriteria
 * @Description TODO
 * @Author zhukq
 * @Date 2020/3/23 10:28
 * @Version 1.0
 */
public class OrCriteria implements Criteria{
    Criteria criteria;
    Criteria orCriteria;

    public OrCriteria(Criteria criteria, Criteria orCriteria) {
        this.criteria = criteria;
        this.orCriteria = orCriteria;
    }

    @Override
    public List<Person> meetCriteriaPerson(List<Person> personList) {
        List<Person> firstCriteriaPerson = criteria.meetCriteriaPerson(personList);
        List<Person> secondCriteriaPerson = orCriteria.meetCriteriaPerson(personList);

        for (Person p:firstCriteriaPerson){
            if(!secondCriteriaPerson.contains(p)){
                secondCriteriaPerson.add(p);
            }
        }
        return secondCriteriaPerson;
    }
}

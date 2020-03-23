package Criteria;

import java.util.List;

/**
 * @ClassName AndCriteria
 * @Description And和过来查询
 * @Author zhukq
 * @Date 2020/3/23 10:12
 * @Version 1.0
 */
public class AndCriteria implements Criteria{
    private Criteria criteria;
    private Criteria  otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteriaPerson(List<Person> personList) {
        List<Person> firstCriteriaPerson = criteria.meetCriteriaPerson(personList);
        return otherCriteria.meetCriteriaPerson(firstCriteriaPerson);
    }
}

package MyBatisStudy03.table01;

import MyBatisStudy03.bean.Card;

import java.util.List;

public interface OneToOneMapper {
    //查询全部
    public abstract List<Card> selectAll();
}

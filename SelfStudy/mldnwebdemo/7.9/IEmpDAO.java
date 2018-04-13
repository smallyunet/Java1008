package cn.mldn.lxh.dao;
import java.util.List;
import cn.mldn.lxh.vo.Emp;
public interface IEmpDAO {
    /**
     * 数据的增加操作
     * @author smallyu
     * @version 1.0
     */
    public boolean doCreate(Emp emp) throws Exception;
    /**
     * 查询全部数据
     * @author smallyu
     * @version 1.0
     */
    public List<Emp> findAll(String keyWord) throws Exception;
    /**
     * 根据id查询
     * @author smallyu
     * @version 1.0
     */
    public Emp findById(int empno) throws Exception;
}

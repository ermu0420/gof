import com.ermu.gof.framework.Factory;
import com.ermu.gof.framework.Product;
import com.ermu.gof.idcard.IdcardFactory;

/**
 * @author：xusonglin
 * ===============================
 * Created with IDEA.
 * Date：2019/1/3
 * Time：21:09
 * ================================
 */
public class FactoryMethodTest {
    public static void main(String[] args){
        Factory factory = new IdcardFactory();
        Product product1 = factory.create("一号");
        Product product2 = factory.create("二号");
        Product product3 = factory.create("三号");

        product1.use();
        product2.use();
        product3.use();
    }
}

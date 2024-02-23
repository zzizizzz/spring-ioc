package ioc;

/**
 * 상품정보 저장, 조회, 변경 작업에 대한 표전을 정의한다.
 * 
 * @author jhta
 *
 */
public interface ProductDao {

	void insertProduct();
	void getProduct();
	void updateProduct();
}

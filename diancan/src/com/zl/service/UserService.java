package com.zl.service;

/**
* @ClassName: UserService
* @Description: �û�������ؽӿ�
* @author ����
* @date 2018��4��5�� ����1:47:03
*
 */
public interface UserService {

	/**
	 * 
	* @Title: login
	* @Description: ��¼
	* @param username �û���
	* @param password ����
	* @return int  0Ϊ����Ա��1Ϊ��ͨ���̣�2Ϊ�û������������
	* @throws
	 */
	int login(String username,String password);
	
	/*void list();
	
	void delete(Integer id);
	
	void add(User user);
	
	void update(User user);*/
	
	
}

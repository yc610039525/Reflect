import java.lang.reflect.*;
import java.util.Arrays;
public class ArrayTester1 {
  public static void main(String args[])throws Exception {
    Class classType = Class.forName("java.lang.String");
    //����һ������Ϊ10���ַ�������
    String[] array = (String[]) Array.newInstance(classType, 10);
    //������λ��Ϊ5��Ԫ����Ϊ"hello"
    array = Arrays.copyOf(array, 12);
    System.out.println(array.length);
    Array.set(array, 11, "hello");
    //�������λ��Ϊ5��Ԫ�ص�ֵ
    String s = (String) Array.get(array, 11);
    System.out.println(s);
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java�����̾���>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

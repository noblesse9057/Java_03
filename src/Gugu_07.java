
public class Gugu_07 {

	public static void main(String[] args) {

		int intNum=0;
		
		intNum += 1; //1
		System.out.println(intNum); //1
		
		System.out.println(intNum); //1
		intNum +=1; // 13��° �� ǥ�ÿ� ������ ��ģ��
		
		System.out.println(intNum); // 2���
		
		intNum = 0;
		// ++�� �����ڿ� ������
		// �ٸ� ��ɹ����� ������ �Ǵ� ����
		// �ٸ� ��ɹ��� ��� ����� �� ���� ���� 1���� ��Ų��.
		// ���� ���� ����Ǵ� ��ɹ����� �ƹ��� ������ ��ġ�� �ʴ´�
		System.out.println(intNum++); // 0���
		
		// 21�� ��ɹ��� �����鼭 intNum�� 1���� ��Ų��������
		// 1�� ��µȴ�
		System.out.println(intNum); // 1���
		
		// ++ �� �ܵ�(�ܵ���ɹ�)���� ����ɶ���
		// �տ������� �ڿ������� �Ȱ���.
		intNum++;
		++intNum;
		
		// �ٸ���ɹ��� �Բ� ���϶��� ��ġ�� ���� ���� �޶�����.
		System.out.println(++intNum);
		
		
		
	}

}

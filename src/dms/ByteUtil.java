package dms;

public class ByteUtil {

    /**
     * �� Little-Endian ���ֽ�����תΪ int ���͵�����<br />
     * Little-Endian ��ʾ��λ�ֽ��ڸ�λ������
     * @param bys       �ֽ�����
     * @param start     ��Ҫת���Ŀ�ʼ����λ��
     * @param len       ��Ҫת�����ֽ�����
     * @return  ָ����ʼλ�úͳ����� LE ��ʽ��ʾ�� int ��ֵ
     */
    public static int bytes2IntLE(byte[] bys, int start, int len) {
        return bytes2Int(bys, start, len, false);
    }

    public static int bytes2IntLE(byte[] bys) {
        return bytes2Int(bys, 0, bys.length, false);
    }

    /**
     * �� Big-Endian ���ֽ�����תΪ int ���͵�����<br />
     * Big-Endian ��ʾ��λ�ֽ��ڵ�λ������
     * @param bys       �ֽ�����
     * @param start     ��Ҫת���Ŀ�ʼ����λ��
     * @param len       ��Ҫת�����ֽ�����
     * @return  ָ����ʼλ�úͳ����� BE ��ʽ��ʾ�� int ��ֵ
     */
    public static int bytes2IntBE(byte[] bys, int start, int len) {
        return bytes2Int(bys, start, len, true);
    }

    public static int bytes2IntBE(byte[] bys) {
        return bytes2Int(bys, 0, bys.length, true);
    }

    /**
     * ���ֽ�����תΪ Java �е� int ��ֵ
     * @param bys           �ֽ�����
     * @param start         ��Ҫת������ʼ������
     * @param len           ��Ҫת�����ֽڳ���
     * @param isBigEndian   �Ƿ��� BE��true -- BE ��false -- LE ��
     * @return
     */    
    private static int bytes2Int(byte[] bys, int start, int len, 
            boolean isBigEndian) {
        int n = 0;
        for(int i = start, k = start + len % (Integer.SIZE / Byte.SIZE + 1); i < k; i++) {
            n |= (bys[i] & 0xff) << ((isBigEndian ? (k - i - 1) : i) * Byte.SIZE);
        }
        return n;
    }
    public static void main(String[] args) {
		String s = new String();
	}
}
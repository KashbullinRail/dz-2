/**
 * SkyPro. My code dz#2
 *
 * @author �����
 * @version dated Apr 16, 2022
 */
public class ExampleTwo {
    public static void main(String[] args) {

        System.out.println();
        // ������� 1
        System.out.println("������� 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        } else System.out.println("���������� ������ ���������� ��� Android �� ������");
        System.out.println("");

        // ������� 2
        System.out.println("������� 2");
        int clientDeviceYear = 2014;
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
            } else System.out.println("���������� ������ ���������� ��� iOS �� ������");
        } else
            if (clientDeviceYear < 2015) {
                System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
            } else System.out.println("���������� ������ ���������� ��� Android �� ������");
        System.out.println("");

        // ������� 3
        System.out.println("������� 3");
        int year = 123456;
        if (year % 4 == 0 & (year % 100 != 0 || year % 400 == 0)) {
                System.out.println(year + " ��� �������� ����������");
        } else System.out.println(year + " ����� �� �������� ����������");
        System.out.println("");

        // ������� 4
        System.out.println("������� 4");
        int deliveryDistance = 60;
        if (deliveryDistance <= 100) {
            if (deliveryDistance <= 60 ) {
                if (deliveryDistance <= 20 ) {
                    System.out.println("����������� ����: 1");
                } else System.out.println("����������� ����: 2");
            } else System.out.println("����������� ����: 3");
        } else System.out.println("�������� �� ������������");
        System.out.println("");

        // ������� 5
        System.out.println("������� 5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " ����� - ��� ����.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " ����� - ��� �����.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " ����� - ��� ����.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " ����� - ��� �����.");
                break;
            default:
                System.out.println(monthNumber + " - ������ ������ �� ����������.");
        }
    }
}
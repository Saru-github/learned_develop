package exam01;

public class NoOOP {

	public static void main(String[] args) { // 모든데이터를 메모리에 할당하여 사용한다면 ?
		
		// 5명이 듣는 한 수업의 4개의 시험 총점과, 평균을 구하시오.
		
		
		int hongKilDong_Quiz1 = 85, hongKilDong_MidTerm = 80, hongKilDong_Quiz2 = 90, hongKilDong_FianlTerm = 95;   
		int kangKamChan_Quiz1 = 75, kangKamChan_MidTerm = 60, kangKamChan_Quiz2 = 80, kangKamChan_FianlTerm = 100;   
		int leeSunShin_Quiz1 = 95, leeSunShin_MidTerm = 90, leeSunShin_Quiz2 = 85, leeSunShin_FianlTerm = 80;   
		int youKanSun_Quiz1 = 75, youKanSun_MidTerm = 90, youKanSun_Quiz2 = 95, youKanSun_FianlTerm = 100;   
		int anJungKun_Quiz1 = 75, anJungKun_MidTerm = 80, anJungKun_Quiz2 = 85, anJungKun_FianlTerm = 80;   
		
		
		int hongKilDong_Sum = sum(hongKilDong_Quiz1, hongKilDong_MidTerm, hongKilDong_Quiz2, hongKilDong_FianlTerm);
		
		int hongKilDong_Avg = average(hongKilDong_Sum);
		
		
	}
	
	public static int sum(int n1, int n2, int n3, int n4) {
		
		return n1+n2+n3+n4;
	
		
	}
	
	public static int average(int s) {
		return s / 4;
	}
	
}

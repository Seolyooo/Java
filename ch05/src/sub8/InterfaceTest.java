package sub8;
/*
 * 2025/07/16
 * 설유진
 * 인터페이스 실습ㅎㅏㄱㅣ
 */



public class InterfaceTest {

	public static void main(String[] args) {

		//인터페이스 역할 1 - 통일된 표준화 설계
		RemoteControl lg = new RemoteLg();
		
		lg.powerOn();
		lg.chUp();
		lg.soundDown();
		lg.powerOff();
		
		RemoteControl s = new RemoteSamsung();
		
		s.powerOn();
		s.chDown();
		s.soundUp();
		s.powerOff();
		
		//인터페이스 역할 2 - 결합완화(유연성)
		
		Bulb b = new Bulb();
		Socket socket = new Power(b);
		
		socket.switchOn();
		socket.switchOff();
		
		
		//인터페이스 역할 3 - 다중 상속 효과
		SmartTv smartTv = new SmartTv();
		smartTv.process();
		
		
	}

}

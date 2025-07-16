package sub8;

public class RemoteLg implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("Lg poweron");

	}

	@Override
	public void powerOff() {
		System.out.println("Lg poweroff");

	}

	@Override
	public void chUp() {
		System.out.println("Lg chup");

	}

	@Override
	public void chDown() {
		System.out.println("Lg chdown");

	}

	@Override
	public void soundUp() {
		System.out.println("Lg soundon");

	}

	@Override
	public void soundDown() {
		System.out.println("Lg sounddown");

	}

}

package test4.sub3;
class MovieTicket {
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private Boolean isBooked;
	
	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		
		this.movieTitle= movieTitle;
		this.screenTime= screenTime;
		this.seatNumber=seatNumber;
		this.isBooked=false;
	}
	
	public void bookTicket() {
		if(!this.isBooked) {
			this.isBooked=true;
		}else {
			System.out.println("이미 예약됨");
			return;
		}
		
		
	}
	
	public void cancleBook() {
		if(this.isBooked) {
			this.isBooked=false;
		}else {
			System.out.println("예약안도ㅣㅁ");
			return;
		}
		
	}
	public void printTicketInfo() {
		System.out.println("영화제목 : "+ this.movieTitle);
		System.out.println("상영시간 : "+ this.screenTime);
		System.out.println("좌석번호 : "+ this.seatNumber);
		System.out.println("예약여부 : "+ (this.isBooked?"y":"n"));
	}
	
}



public class Main03 {
	public static void main(String[] args) {
		// 티켓 객체 생성
		MovieTicket ticket = new MovieTicket("타이타닉", "19:00", "A1");
		// 티켓 정보 출력
		ticket.printTicketInfo();
		System.out.println("-------------------------");
		// 예약 테스트
		ticket.bookTicket();
		System.out.println("-------------------------");
		// 티켓 정보 출력
		ticket.printTicketInfo();
		System.out.println("-------------------------");
		// 이미 예약된 경우
		ticket.bookTicket();
		System.out.println("-------------------------");
		// 취소 테스트
		ticket.cancleBook();
		System.out.println("-------------------------");
		// 티켓 정보 출력
		ticket.printTicketInfo();
		System.out.println("-------------------------");
		// 이미 취소된 경우
		ticket.cancleBook();
		System.out.println("-------------------------");
		}
		
	}


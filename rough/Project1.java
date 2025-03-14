//package rough;
//
//
//	import java.time.LocalDate;
//
//import javax.annotation.Generated;
//
//	
//
//	@Entity
//	public class Project1 {
//	@Id
//	@Generated(strategy=GenerationType.SEQUENCE)
//			private int bookingid;
//			private int movieId;
//			private String cusname;
//	        private int mobilenumber;
//	        private int numberofticket;
//	        private LocalDate ShowDate;
//	        private String moviename;
//			/**
//			 * @return the bookingid
//			 */
//			public int getBookingid() {
//				return bookingid;
//			}
//			/**
//			 * @param bookingid the bookingid to set
//			 */
//			public void setBookingid(int bookingid) {
//				this.bookingid = bookingid;
//			}
//			/**
//			 * @return the movieId
//			 */
//			public int getMovieId() {
//				return movieId;
//			}
//			/**
//			 * @param movieId the movieId to set
//			 */
//			public void setMovieId(int movieId) {
//				this.movieId = movieId;
//			}
//			/**
//			 * @return the cusname
//			 */
//			public String getCusname() {
//				return cusname;
//			}
//			/**
//			 * @param cusname the cusname to set
//			 */
//			public void setCusname(String cusname) {
//				this.cusname = cusname;
//			}
//			/**
//			 * @return the mobilenumber
//			 */
//			public int getMobilenumber() {
//				return mobilenumber;
//			}
//			/**
//			 * @param mobilenumber the mobilenumber to set
//			 */
//			public void setMobilenumber(int mobilenumber) {
//				this.mobilenumber = mobilenumber;
//			}
//			/**
//			 * @return the numberofticket
//			 */
//			public int getNumberofticket() {
//				return numberofticket;
//			}
//			/**
//			 * @param numberofticket the numberofticket to set
//			 */
//			public void setNumberofticket(int numberofticket) {
//				this.numberofticket = numberofticket;
//			}
//			/**
//			 * @return the showDate
//			 */
//			public LocalDate getShowDate() {
//				return ShowDate;
//			}
//			/**
//			 * @param showDate the showDate to set
//			 */
//			public void setShowDate(LocalDate showDate) {
//				ShowDate = showDate;
//			}
//			/**
//			 * @return the moviename
//			 */
//			public String getMoviename() {
//				return moviename;
//			}
//			/**
//			 * @param moviename the moviename to set
//			 */
//			public void setMoviename(String moviename) {
//				this.moviename = moviename;
//			}
//			/**
//			 * @param bookingid
//			 * @param movieId
//			 * @param cusname
//			 * @param mobilenumber
//			 * @param numberofticket
//			 * @param showDate
//			 * @param moviename
//			 * @return 
//			 */
//			public Ticket(int bookingid, int movieId, String cusname, int mobilenumber, int numberofticket,
//					LocalDate showDate, String moviename) {
//				//super();
//				this.bookingid = bookingid;
//				this.movieId = movieId;
//				this.cusname = cusname;
//				this.mobilenumber = mobilenumber;
//				this.numberofticket = numberofticket;
//				ShowDate = showDate;
//				this.moviename = moviename;
//			}
//			@Override
//			public String toString() {
//				return "Ticket [bookingid=" + bookingid + ", movieId=" + movieId + ", cusname=" + cusname
//						+ ", mobilenumber=" + mobilenumber + ", numberofticket=" + numberofticket + ", ShowDate=" + ShowDate
//						+ ", moviename=" + moviename + "]";
//			}
//
//
//
//
//
//
//	}
//
//
//	}

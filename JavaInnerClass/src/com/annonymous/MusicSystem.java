package com.annonymous;

public class MusicSystem {
	Speakers s=new Speakers();

	public void playsound(){
		System.out.println("play doly sound");

	}
	public void moreSound(){
		System.out.println("more sound");

	}
	Radio r=new Radio() {


		@Override
		public void msk() {
			// TODO Auto-generated method stub
			System.out.println("thi  is the radio method");

		}

		@Override
		public void sdk() {
			System.out.println("this is the sdk method");			
		}
		@Override
		public void frenchMusic(){
			System.out.println("this is french music method")
		}
	};
	public void playmusic(){
		System.out.println(" i circumstance play music method");
		s.playsound();
		r.msk();
		r.sdk();
		r.frenchMusic()



	}
	public static void main(String[] args) {
		MusicSystem m=new MusicSystem();
		m.playmusic();
		m.playsound();
		m.moreSound();


	}
}

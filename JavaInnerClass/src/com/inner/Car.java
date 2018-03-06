package com.inner;

import com.inner.Car.Engine.Bick;

public class Car {
	void move(){

		System.out.println("move");

	}

	public class Bus{
		void n(){
			System.out.println("n method");
		}
	}
	public  class Engine{
		int hp;
		int capacity ;
		public void start(){

			System.out.println("Engine==========");
		}
		public void stop(){
			System.out.println("================");
		}
		public void run(){
			System.out.println("=================");
		}
		public class Bick{
			void m(){
				System.out.println("bick");
			}

		}


	}



	public static void main(String[] args) {
		Car c=new Car();
		c.move();
		Engine e=c.new Engine();
		e.start();
		e.stop();
		e.run();

		Bick b=e.new Bick();
		b.m();

	}

}

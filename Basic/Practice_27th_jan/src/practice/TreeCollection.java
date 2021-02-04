package practice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Player{
	private String id;
	private String name;
	private int score;
	private float average;
	
	Player(String id,String name,int Score,float average){
		this.id=id;
		this.name=name;
		this.score=score;
		this.average=average;
		
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score=score;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average=average;
	}
	@Override
	public String toString() {
		return "Player[id=" +id+",name=" +name+",score="+score+",average="+average+"]";
	}

}

public class TreeCollection {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	public static void main(String[] args) {
      TreeSet t= new TreeSet(new MyComparator());
      Player p1=new Player("101","ABC",88,80.25F);
      Player p2=new Player("102","DEF",70,75.25F);
      Player p3=new Player("103","PQR",68,68.30F);
      Player p4=new Player("104","STU",58,58.00F);
      Player p5=new Player("105","XYZ",45,40.48F);
      
      t.add(p1);
      t.add(p2);
      t.add(p3);
      t.add(p4);
      t.add(p5);
      
      Iterator it=t.iterator();
      
      while(it.hasNext()) {
    	  System.out.println(it.next().toString());
    	  
      }
      
   	}

   }  

    class MyComparator implements Comparator<Object>{

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			Player p1=(Player)o1;
			Player p2=(Player)o2;
			
			
			Integer I1=(Integer)p1.getScore();
			
			Integer I2=(Integer)p2.getScore();
			if(I1<I2) {
				return 1;
			}
			
			else if(I1>I2) {
				return -1;
			}
			else
			return 0;
		}
    	
    }
      
      
   

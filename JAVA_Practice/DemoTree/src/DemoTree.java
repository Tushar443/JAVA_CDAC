import java.util.Comparator;
	import java.util.Iterator;
	import java.util.Scanner;
	import java.util.TreeSet;
public class DemoTree {
		public static void main(String[] args) {
			TreeSet<Player> players = new TreeSet<Player>(new The_comparator());
			Scanner sc = new Scanner(System.in);
			for(int i =0;i<5;i++) {
				Player p = new Player();
				int id = sc.nextInt();
				sc.next();
				String name = sc.next();
				int score =sc.nextInt();
				float average =sc.nextFloat();
				p.setId(id);
				p.setName(name);
				p.setScore(score);
				p.setAverage(average);
				
				players.add(p);
			}
			
			Iterator<Player> it = players.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}
	class The_comparator implements Comparator<Player>{
		@Override
		public int compare(Player o1, Player o2) {
			
			if(o1.getScore() > o2.getScore()) {
				return 1;
			}
			else {
				if(o1.getScore() > o2.getScore()) {
					return -1;
				}
			}
			return 0;
		}
	}
	class Player{
		private int id;
		private String name;
		private int score;
		private float average;
		
		public Player() {
			// TODO Auto-generated constructor stub
		}
		
		
		public Player(int id, String name, int score, float average) {
			super();
			this.id = id;
			this.name = name;
			this.score = score;
			this.average = average;
		}


		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public float getAverage() {
			return average;
		}
		public void setAverage(float average) {
			this.average = average;
		}
		@Override
		public String toString() {
			return "Player [id=" + id + ", name=" + name + ", score=" + score + ", average=" + average + "]";
		}	
	}

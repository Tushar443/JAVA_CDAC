
public class RunnableDemo {
		public class Player implements Comparable<Player>{

			private int id;
			private String name;
			private int score;
			private float average;

			public Player() {
				
			}

			public Player(int id, String name, int score, float average) {
				super();
				this.id = id;
				this.name = name;
				this.score = score;
				this.average = average;
			}

			@Override
			public String toString() {
				return "Player [id=" + id + ", name=" + name + ", score=" + score + ", average=" + average + "]";
			}

			@Override
			public int compareTo(Player o) {
				
				return o.score-this.score;
			}

			
		public static void main(String[] args) {
				TreeSet<Player> t=new TreeSet<Player>();
				t.add(new Player(1,"prakash",45,30.5F));
				t.add(new Player(2,"akash",50,40.5F));
				t.add(new Player(3,"rakesh",58,52.5F));
				t.add(new Player(4,"ram",65,59.5F));
				t.add(new Player(5,"sham",60,49.5F));
				
				Iterator<Player> it=t.iterator();
				while(it.hasNext()) {
					Player o=it.next();
					System.out.println(o);
				}
				
			}

		}
	}

}

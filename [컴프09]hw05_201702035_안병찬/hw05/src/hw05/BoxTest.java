package hw05;
		class Box{
			public int width;
			public int length;
			public int height;
			public int getVolume()
			{
				int volume;
				volume = width*length*height;
				return volume;
			}
			void print(){
				System.out.println("("+width+","+length+","+height+")");
			}
			public int getWidth() {
				return width;
			}
			public void setWidth(int w){
				width = w;
			}
			public int getLength(){
				return length;
			}
			public void setLength(int l){
				length = l;
			}
			public int getHeight(){return height;}
			public void setHeight(int h){height = h;}
		}
		public class BoxTest {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Box myBox = new Box();
				myBox.setWidth(10);
				myBox.setLength(20);
				myBox.setHeight(50);
				myBox.print();
				
				System.out.println("상자의 부피는 "+myBox.getVolume());

			}
			

	}




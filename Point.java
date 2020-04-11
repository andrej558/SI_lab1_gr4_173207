class Point {
	String id
	double x,y;

	//TODO add new variable
	String pointsColor;

		//TODO constructor

	public Point(String id, double x, double y, String pointsColor) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.pointsColor = pointsColor;
	}


	//TODO setters and getters


	public String getId() {
		return id;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String getPointsColor() {
		return pointsColor;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setPointsColor(String pointsColor) {
		this.pointsColor = pointsColor;
	}

	public void move (char xDirection, char yDirection) {
		//TODO
		if(xDirection=='R' && yDirection=='U'){
			x++;
			y++;
		}
		if(xDirection=='R' && yDirection=='D'){
			x++;
			y--;
		}
		if(xDirection=='L' && yDirection=='U'){
			x--;
			y++;
		}
		if(xDirection=='L' && yDirection=='D'){
			x--;
			y--;
		}
		if(xDirection=='R' && yDirection==' '){
			x++;
		}
		if(xDirection=='L' && yDirection==' '){
			x--;
		}
		if(xDirection==' ' && yDirection=='U'){
			y++;
		}
		if(xDirection==' ' && yDirection=='D'){
			y--;
		}
	}

	public void draw () {
		//TODO
		System.out.println("Tochka: "+ "("+ id+","+x+","+y+ ","+pointsColor+")");
	}
}
class Canvas {
	List<Point> points;
	double x,y;
	String id;
	String pointsColor;
	public Canvas() {
		this.points = new ArrayList<>();
		this.id = id;
		this.x = x;
		this.y = y;
		this.pointsColor = pointsColor;
	}
	public void addPoint(String id,double x,double y,String pointsColor){
		points.add(new Point(id,x,y,pointsColor));
		System.out.println("("+id+","+x+","+y+","+pointsColor+")");
	}
	public void drawPoints(){
		for (Point p:points){
			p.draw();
		}
	}
	public void removePoint(int i){
		points.remove(points.get(i));
	}
	public void movePoints(char xD,char yD){
		for(Point p:points){
			p.move(xD,yD);
			System.out.println("Pomestena: ("+p.id+','+p.x+','+p.y+","+p.pointsColor+")");
		}
	}
	public void averagePoint(){
		int sumaX=0;
		for(int i=0;i<points.size();i++){
			sumaX +=points.get(i).x;
		}
		int sumaY=0;
		for(int i=0;i<points.size();i++) {
			sumaY += points.get(i).y;
		}
		float prosekX = (float)sumaX/points.size();
		float prosekY = (float)sumaY/points.size();
		System.out.println(String.format("Serdna tochka: (%.2f,%.2f)",prosekX,prosekY));
	}
	public void total(){
		System.out.println(points.size());
	}
}
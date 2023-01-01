
public class Players {
String name;
int place;
GameOfLife obj=new GameOfLife();
String[] dish;
Players()
{
	
}
public String[] getDish() {
	return dish;
}
public void setDish(String[] dish) {
	this.dish = dish;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPlace() {
	return place;
}
public void setPlace(int place) {
	this.place = place;
}
public GameOfLife getObj() {
	return obj;
}
public void setObj(GameOfLife obj) {
	this.obj = obj;
}
}

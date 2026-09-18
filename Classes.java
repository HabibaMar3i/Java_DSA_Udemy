class Cookie{
    private String color;
    public Cookie(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
public class Classes{
    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("red");           
        Cookie cookieTwo = new Cookie("blue");          
        System.out.println(cookieOne.getColor());
        cookieTwo.setColor("yellow");
        System.out.println(cookieTwo.getColor());
    }
}
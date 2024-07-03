public class House {
    private String type;
    private int area;

    public House() {
        this.type = "";
        this.area = 0;
    }

    public House(String type, int area) {
        this.type = type;
        this.area = area;
    }

    public String getType() {
        if (type.length() < 3) {
            return new StringBuilder(type).reverse().toString();
        } else {
            String lastThreeChars = type.substring(type.length() - 3);
            return new StringBuilder(lastThreeChars).reverse().toString();
        }
    }

    public int getArea() {
        return area;
    }

    public void setArea(int newArea) {
        this.area = 3 * newArea;
    }
}

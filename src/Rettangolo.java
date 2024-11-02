public class Rettangolo {
    private int height = 0;
    private int width = 0;
    private String color;


    public Rettangolo(int height, int width, String color) {
        this.height = 0;
        this.width = 0;
        this.color = "#FFFFFF";
        setHeight(height);
        setWidth(width);
        setColor(color);
        System.out.println("Rettangolo created");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 0) {
            System.out.println("Height cannot be negative");
        } else this.height = height;

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0) {
            System.out.println("Width cannot be negative");
        } else this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color.toUpperCase();
        if (color.length() == 7 && color.charAt(0) == '#') {
            for (int i = 1; i < color.length(); i++) {
                char c = color.charAt(i);
                if (c > 'F' || c < '0' || (c > '9' && c < 'A')) {
                    System.out.println("Invalid color: " + color);
                }
                this.color = color;

            }
        } else {
            System.out.println("Invalid color: " + color);
        }

    }


}

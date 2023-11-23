public class Parallelepiped {
//    Параллелепипед:
//
//            - Фигуранын аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width));
//
//- Фигуранын коломун эсептеген формула: (length*width*height);
//
//-Формулалар Parallelepiped классында жазылуусу керек
    private int height;
    private int length;
    private int width;

    public Parallelepiped() {
    }

    public Parallelepiped(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public  int Aiynt(){
        return  2*((height * length) + (length * width) + (height * width));


    }
    public int Kolom(){
        return  (length*width*height);


    }
}

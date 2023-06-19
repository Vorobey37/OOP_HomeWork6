public class LiskovSubstitutionPrinciple {
    //Переписать код в соответствии с Liskov Substitution Principle
    
}

//было так:
class Rectangle {

    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
        }

    public void setHeight(int height) {
        this.height = height;
        }

    public int area() {
        return this.width * this.height;
        }
}
class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        super.width = width;
        super.height = width;
        }

    @Override
    public void setHeight(int height) {
        super.width = height;
        super.height = height;
        }
}

//стало так:
//по сути дела в классе квадрат нужно убрать переопределения, т.к. у квадрата
//всё тоже самое, просто значения сетов будут одинаковые.
//Можно ещё проверить равны ли стороны.
// Если убрать переопределения у квадрата, то потомок и так будет всё делать, что и родитель.
class Rectangle1 {

    private int width;
    private int height;

        public void setWidth(int width) {
        this.width = width;
        }

    public void setHeight(int height) {
        this.height = height;
        }

    public int area() {
        return this.width * this.height;
        }
}
class Square1 extends Rectangle1 {

    @Override
    public int area() {
        if (super.width == super.height){
            return super.area();
        } else {
            throw new RuntimeException("У квадрата не могут быть разные стороны");
        }
    }

    
  
    
}
package Polymorphism;

public class Shape {
    void draw(){
        System.out.println("drawing");
    }

    static class Rectangle extends Shape{
        void draw(){
            System.out.println("drawing Rectangle");
        }

        static class Circle extends Shape{
            void draw(){
                System.out.println("drawing circle");
            }
            static class Triangle extends Shape{
                void draw(){
                    System.out.println("drawing triangle");
                }
            class polymorphism2{

                public void main(String[] args) {
                    Shape s;
                    s = new Rectangle();
                    s.draw();
                }
            }

            }
        }

    }

}

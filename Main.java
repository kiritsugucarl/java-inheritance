class GTech
{
    public static void realFine()
    {
        System.out.println("Features Real Fine Pen Writing found in exclusive pens only");//feature of GTech
    }
}

class Panda
{
    public static void cheap()
    {
        System.out.println("Cheap is the new sexy, the easier access, the better");//feature of Panda
    }
}

class HBW
{
    public static void clickable()
    {
        boolean clickable = true;
        boolean click = true;

        //feature of HBW having clickable pens
        if (click = true)
        {
            System.out.println("Im clicked");
        }
        else
        {
            System.out.println("Im hiding");
        }
    }
}

public class Main extends Pen//inherits Pen
{
    public static void main(String[] args)
    {
        Pen pen = new Pen();
        GTech pen1 = new GTech();
        Panda pen2 = new Panda();
        HBW pen3 = new HBW();

        pen.penName("Gtech");
        pen.tipSize(3);
        pen.color("Black");
        pen.penType("Gel Pen");
        pen1.realFine();
        System.out.println("");
        pen.penName("HBW");
        pen.tipSize(7);
        pen.color("Black");
        pen.penType("Normal Pen");
        pen3.clickable();
        System.out.println("");
        pen.penName("Panda");
        pen.tipSize(8);
        pen.color("Blue");
        pen.penType("Semi Gel Pen");
        pen2.cheap();
    }
}

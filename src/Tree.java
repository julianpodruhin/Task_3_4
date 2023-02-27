public class Tree
{
    private int age;
    private boolean alive;
    private String name_tree ;

    public Tree(int age, String name_tree)
    {
        this.age=age;
        this.name_tree=name_tree;
    }
    public Tree(int age, String name_tree, boolean alive)
    {
        this.age=age;
        this.name_tree=name_tree;
        this.alive=alive;
    }
    public Tree()
    {
        System.out.println("Пустой конструктор без параметров сработал");
    }
    public String toString() {
        return "Дерево{" +
                "Возраст='" + age + '\'' +
                ", Имя=" + name_tree +
                ", Живое ли =" + alive +
                '}';
    }
}

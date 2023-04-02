public class Main {
    //1 Создайте класс Student, содержащий поля name и group. Поля сделайте приватными.
//2 Создайте геттеры и сеттеры для этих полей.
//3 Создайте конструктор, который принимает значения для инициализации поля name.
//4 Создайте конструктор, который принимает значения для инициализации обоих полей.
//  Инициализацию имени конструктор должен делегировать в конструктор из пункта 3, а затем инициализировать оставшееся поле group.
//5 Создайте клонирующий конструктор, который принимает объект типа Student и создаёт нового студента на его основе.
//6 В основной программе создайте переменную student1, проинициализируйте её с помощью оператора new и с помощью конструктора.
//7 В переменную student2 присвойте значение student1.
//8 В переменную student3 присвойте значение, полученное с помощью клонирующего конструктора.
//9 Измените значение поля name у student1.
//10 Выведите на консоль значения полей student1, student2 и student3.
    public static void main(String[] args) {
      Student student1 = new Student("Valdis", 1);
      Student student2 = student1;
      Student student3 = new Student(student1);
      student1.setName("Vlad");
        System.out.println(student1.getName() + student1.getGroup());
        System.out.println(student2.getName() + student2.getGroup());
        System.out.println(student3.getName() + student3.getGroup());

    }
}

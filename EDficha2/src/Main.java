public class Main {

    public static void main(String[] args) {
        Person pessoa1=new Person("Abilio","casa");
        Person pessoa2=new Person("Alberto","casa2");
        Person pessoa3=new Person("Joao","casa3");
        Person pessoa4=new Person("Tiago","casa4");
        Person pessoa5=new Person("Alfredo","casa5");
        ListaLigada lista=new ListaLigada();
        lista.add(pessoa1);//0
        lista.add(pessoa2);//1
        lista.add(pessoa3);//2
        lista.add(pessoa4);//3
        lista.add(pessoa5,4);
        lista.remove(pessoa1);
        lista.printList();
    }
}

public class ListaLigada {
    private Person first;
    private Person last;

    public ListaLigada() {
        this.first = null;
        this.last = null;
    }
    public ListaLigada(Person first) {
        this.first = first;
        this.last = first;
    }

    public void addFirst(Person novo) {
        if (this.first == null) {
            this.first = novo;
            this.last = novo;
        } else {
            novo.setNext(this.first);
            this.first = novo;

        }
    }
    public void add(Person novo) {
        if (this.first == null) {
            this.first = novo;
            this.last = novo;
        } else {
            this.last.setNext(novo);
            this.last = novo;
        }
    }
    public void add(Person novo,int pos){
        int i = 0;
        if (this.first == null) {
            this.first = novo;
            this.last = novo;
        }else if(pos==0){
            novo.setNext(this.first);
            this.first = novo;

        } else {
            Person aux = this.first;
            Person aux2;
            while (i!=pos-1 && aux != null) {
                aux=aux.getNext();
                i++;
            }
            if(aux==null){

            }else{
                aux2=aux.getNext();
                aux.setNext(novo);
                novo.setNext(aux2);
            }

        }
    }

    public Person remove(int pos){
        int i = 0;
        if (this.first == null) {
            return null;
        }else if(pos==0){
            Person aux=this.first;
            this.first=this.first.getNext();
            return aux;
        } else {
            Person aux = this.first;
            Person aux2=this.first;
            while (i!=pos && aux != null) {
                aux=aux2;
                aux2 = aux2.getNext();
                i++;
            }
            if(aux==null){
                return null;
            }else{
                aux.setNext(aux2.getNext());
                return aux2;
            }

        }
    }
    public boolean remove(Person person){
        if (this.first == null) {
            return false;
        }else if(this.first.equals(person)){
            this.first=this.first.getNext();
            return true;
        } else {
            Person aux = this.first;
            Person aux2=this.first;
            while (aux2.equals(person)!=true && aux != null) {
                aux=aux2;
                aux2 = aux2.getNext();
            }
            if(aux==null){
                return false;
            }else{
                aux.setNext(aux2.getNext());
                return true;
            }
        }
    }

    public int totalItems() {
        int i = 0;
        if (this.first == null) {

        } else {
            Person aux = this.first;

            while (aux != null) {
                i++;
                aux = aux.getNext();
            }

        }
        return i;
    }
    public void printList() {
        if (this.first == null) {
            System.out.println("Lista Vazia");
        } else {
            Person aux = this.first;
            int i = 0;
            while (aux != null) {
                System.out.println("Posição n.º" + i++ + " : " + aux.getName());
                aux = aux.getNext();
            }
        }
    }

    public Person getFirst() {
        return first;
    }
    public Person getLast() {
        return last;
    }
}

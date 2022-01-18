public class Logica {
    //BASTA COPIAR E COLAR NO LINK DO HACKERRANK E RODAR
    //https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem
    static boolean hasCycle(SinglyLinkedListNode head) {
        if(head == null) return false;

        SinglyLinkedListNode lento = head;
        SinglyLinkedListNode rapido = head;

        while(rapido != null && rapido.next != null){
            lento = lento.next;
            rapido = rapido.next.next;
            if(lento == rapido){
                return true;
            }
        }
        return false;
    }
}

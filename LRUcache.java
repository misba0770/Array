class Node{
    Node prev;
    Node next;
    int key;
    int val;
    Node(int key,int val){
        this.key=key;
        this.val=val;
    }
    
}
class LRUCache
{
   HashMap<Integer,Node> hm=new HashMap<>();
   Node head=new Node(-1,-1);
   Node tail=new Node(-1,-1);
   int capacity;
    LRUCache(int cap)
    {
       capacity=cap;
       head.next=tail;
       tail.prev=head;
    }
    public void remove(Node x){
        hm.remove(x.key);
        x.prev.next=x.next;
        x.next.prev=x.prev;
    }
    
    public int get(int key)
    {
         if(!hm.containsKey(key))return -1;
       
            Node x= hm.get(key);
            remove(x);
            insert(x);
            return x.val;
        
        
    }

    
    public void set(int key, int value)
    {
    //   if(hm.containsKey(key)){
    //       remove(hm.get(key));
    //   }
    //   if(hm.size()==capacity){
    //       remove(tail.prev);
    //   }
    //   insert(new Node(key,value));
    if(hm.containsKey(key)) {
      remove(hm.get(key));
    }
    if(hm.size() == capacity) {
      remove(tail.prev);
    }
    insert(new Node(key, value));
    }
    public void insert(Node x){
        hm.put(x.key,x);
        x.next=head.next;
        x.next.prev=x;
        head.next=x;
        x.prev=head;
    }
}

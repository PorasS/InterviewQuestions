class Trie {
    
    Node root = null;

    public Trie() {
        root =  new Node('a');
    }
    
    public void insert(String word) {
        
        Node cur = root;
        
        for(int i = 0; i<word.length();i++){
            char c = word.charAt(i);
            if(cur.childs[c-'a']==null){
                Node node = new Node('c');
                cur.childs[c-'a'] = node;
                cur = node;
            }else{
                cur = cur.childs[c-'a'];
            }
        }
         
                
        cur.isWord = true;
    }
    
    public Node getNode(String word){
        Node cur = root;
        
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            
            if(cur.childs[c-'a']==null){
                return null;
            }else{
                cur = cur.childs[c-'a'];
            }
        }  
        
        return cur;
    }
    
    public boolean search(String word) {
        Node cur = getNode(word);
        return cur!=null&&cur.isWord;
    }
    
    public boolean startsWith(String prefix) {
        
        Node cur = getNode(prefix);
        return cur!=null;
    }
    
    class Node{
        char c;
        Node[] childs;
        boolean isWord;
        
        Node(char c){
            c= this.c;
            isWord = false;
            childs = new Node[26];
        }
    }
}

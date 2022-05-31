class WordDictionary {
    
    Node root = null;

    public WordDictionary() {
        root = new Node('a');
    }
    
    public void addWord(String word) {
        
        Node cur = root;
        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            if(cur.childs[c-'a']==null){
            Node node = new Node(c);
            cur.childs[c-'a'] = node;
            cur= node;
            }else{
                cur = cur.childs[c-'a'];
            }
        }
        
        cur.isWord = true;

    }
    
    public boolean search(String word) {
       return dfs(0,root, word);
    }
    
    public boolean dfs(int j, Node cur, String word){
        for(int i = j; i< word.length(); i++){
            char c = word.charAt(i);
            if(c=='.'){
                for(int k = 0; k<26;k++){   
                    if(cur.childs[k]!=null && dfs(i+1, cur.childs[k], word)){
                        return true;
                    } 
                } 
                return false;
            }else{
                 if(cur.childs[c-'a']==null){
                    return false;
                 }
                cur = cur.childs[c-'a'];
            }   
        }
        return cur.isWord;
    }
    
    class Node {
        char c;
        Node[] childs;
        boolean isWord;

        Node(char c){
            this.c = c;
            isWord = false;
            childs = new Node[26];
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */

package LRU;

import java.util.HashMap;

/**
 * @author lixt
 */
public class LRUCache {
    private int capacity;
    HashMap<String, CacheNode> cache = new HashMap<>();
    private CacheNode head, tail;


    public LRUCache(int capacity) {
        this.capacity = capacity;

        head = new CacheNode();
        tail = new CacheNode();
        head.setPre(null);
        head.setPost(tail);
        tail.setPre(head);
        tail.setPost(null);
    }

    /**
     * get
     */
    public int get(String key) {
        CacheNode cacheNode = cache.get(key);
        if (cacheNode == null) {
            return -1;
        }
        //将该节点移动到头部
    }

    private void moveToHead(CacheNode node) {
        //删除当前节点
        removeNode(node);
        //将当前节点重新加入

    }

    public void set(String key, int value) {
        //当前是否已存在
        CacheNode cacheNode = cache.get(key);
        if (cacheNode != null) {
            //已存在
            cacheNode.setValue(value);
            moveToHead(cacheNode);

        } else {
            cacheNode = new CacheNode();
            cacheNode.setKey(key);
            cacheNode.setValue(value);
            cache.put(key, cacheNode);
            addNode(cacheNode);
           //容量不够弹出最后
            
        }
    }

    private void addNode(CacheNode node) {
        node.pre = head;
        node.post = head.post;
        head.post.pre = node;
        head.post = node;
    }

    private void removeNode(CacheNode node) {
        CacheNode pre = node.getPre();
        CacheNode post = node.getPost();
        post.setPre(pre);
        pre.setPost(post);
    }


}

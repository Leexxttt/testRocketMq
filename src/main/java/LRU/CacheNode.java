package LRU;

/**
 * @author lixt
 * @description
 * @date 2020/10/19 0019
 */
public class CacheNode {
    private String key;
    private int value;
    CacheNode pre;
    CacheNode post;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public CacheNode getPre() {
        return pre;
    }

    public void setPre(CacheNode pre) {
        this.pre = pre;
    }

    public CacheNode getPost() {
        return post;
    }

    public void setPost(CacheNode post) {
        this.post = post;
    }
}

package WorkWithDB;

import java.util.List;
import java.util.Objects;

public class MadeTree {
    private int itemid;
    private  int parentid;
    private String text;
    private List<MadeTree> children;

    public MadeTree(int itemid, int parentid, String text) {
        this.itemid = itemid;
        this.parentid = parentid;
        this.text = text;
    }

    public void addElement(MadeTree madeTree){
        children.add(madeTree);
    }

    public String printAll(){
        String outputString = "empty";
        if(!children.isEmpty()) {
            for (MadeTree treeItem : children) {
                outputString = treeItem.getText();
            }
        }
        return outputString;
    }

    @Override
    public String toString() {
        return "MadeTree{" +
                "itemid=" + itemid +
                ", parentid=" + parentid +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MadeTree madeTree = (MadeTree) o;
        return itemid == madeTree.itemid &&
                parentid == madeTree.parentid &&
                Objects.equals(text, madeTree.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemid, parentid, text);
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

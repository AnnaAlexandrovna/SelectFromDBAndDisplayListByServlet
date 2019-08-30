package WorkWithDB;

import java.util.Objects;

public class ContentOfDB {
private int itemID;
private int parentID;
private String text;

    public ContentOfDB(int itemID, int parentID, String text) {
        this.itemID = itemID;
        this.parentID = parentID;
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContentOfDB that = (ContentOfDB) o;
        return itemID == that.itemID &&
                parentID == that.parentID &&
                Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemID, parentID, text);
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getItemID() {
        return itemID;
    }

    public int getParentID() {
        return parentID;
    }

    public String getText() {
        return text;
    }
}

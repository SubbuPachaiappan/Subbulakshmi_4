package arrays_26_04;

public class DataStorage {
    private int lengthOfTheArray;
    private int unSortedArray[] = new int[lengthOfTheArray];
    private int arraySortedInAscendingOrder[] = new int[lengthOfTheArray];
    private int arraySortedInDescendingOrder[] = new int[lengthOfTheArray];
    public int getLengthOfTheArray() {
        return lengthOfTheArray;
    }
    public void setLengthOfTheArray(int lengthOfTheArray) {
        this.lengthOfTheArray = lengthOfTheArray;
    }
    public int[] getUnSortedArray() {
        return unSortedArray;
    }
    public void setUnSortedArray(int[] unSortedArray) {
        this.unSortedArray = unSortedArray;
    }
    public int[] getArraySortedInAscendingOrder() {
        return arraySortedInAscendingOrder;
    }
    public void setArraySortedInAscendingOrder(int[] arraySortedInAscendingOrder) {
        this.arraySortedInAscendingOrder = arraySortedInAscendingOrder;
    }
    public int[] getArraySortedInDescendingOrder() {
        return arraySortedInDescendingOrder;
    }
    public void setArraySortedInDescendingOrder(int[] arraySortedInDescendingOrder) {
        this.arraySortedInDescendingOrder = arraySortedInDescendingOrder;
    }
}

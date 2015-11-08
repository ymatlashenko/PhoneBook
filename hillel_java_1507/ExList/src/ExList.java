
public interface ExList 
{
	int size();
	void init(int[] ini);
	int[] toArray();
	void clear();
	int get(int pos);
	void set(int pos, int val);

	void addStart(int val);
	void addEnd(int val);
	void addPos(int pos, int val);

	void delStart();
	void delEnd();
	void delPos(int pos);

	int min();
	int max();
	int minIndex();
	int maxIndex();

	void sort();
	void reverse();
	void halfReverse();

	void setArray(int[] a);
	int[] getArray();

}

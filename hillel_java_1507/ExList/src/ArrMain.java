

public class ArrMain 
{
	public static void main(String[] aa)
	{
		int[] rr = {10,30,54,77,11,22,99,3};
		AList0 pp = new AList0();
		pp.init( rr );
		int res = pp.min();
		System.out.println(res);
		int val=108;
		int pos =2;
		pp.size();
		pp.clear();
		pp.print();
		pp.addStart(val);
		pp.addEnd(val);
		pp.addPos(pos, val);
		pp.delStart();
		pp.delEnd();
		pp.delPos(pos);
		pp.max();
		pp.min();
		pp.minIndex();
		pp.maxIndex();
		pp.reverse();
		pp.sort();
		pp.halfreverse();

					
	}
}


public class ArrMain 
{
	public static void main(String[] aa)
	{
		int[] rr = {10,30,54,2,77,11,22,99,3};
		AList0 pp = new AList0();
		pp.init( rr );
		int resMin = pp.min();
		int resMax = pp.max();
		int resMinID = pp.minID();
		int resMaxID = pp.maxID();
		int resSize = pp.size();

		
		System.out.println(resMin);
		System.out.println(resMax);
		System.out.println(resMinID);
		System.out.println(resMaxID);
		System.out.println(resSize);


		pp.print();
		pp.addEnd(108);
		pp.print();
		pp.addStart(5);
		pp.print();
		pp.sort();
		pp.print();
		
		//pp.clear();
		pp.delStart();
		pp.print();
		pp.delEnd();
		pp.print();
		pp.delPos(4);
		pp.print();
		pp.addPos(7, 153);
		pp.print();
		
	}
}

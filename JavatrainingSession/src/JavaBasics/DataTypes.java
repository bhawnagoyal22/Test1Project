package JavaBasics;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i[]= new int[4];
		int count =3;
		
		i[0] =20;
		i[1]=30;
		i[2]=40;
		i[3]=50;
		
		for (int j=0; j<=count + 1; j++ ) {
			
			 int temp= i[0];
			 System.out.println("temp" + temp);
			for (int k=0; k<(i.length-1); k++) {
				
				 i[k] =i [k + 1];
				// i[(i.length)-1] = temp;
				 System.out.println("shifting " + i[k]);
			}
			//System.out.println(i.length);
			i[(i.length)-1] = temp;
			//System.out.println(i[j]);
		}
		
		for (int m=0; m<i.length-1; m++ ) {
		System.out.println(i[m]);
		}
	}

}

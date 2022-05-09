import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) throws IOException {
		ArrayList<Stocks>list=new ArrayList<>();
		BufferedReader br=null;
		try {
			FileInputStream fis=new FileInputStream("List.txt");
			InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
			br=new BufferedReader(isr);
		} catch (Exception e) {
			e.printStackTrace();
			String line;
			while((line=br.readLine())!=null) {
				String[] params=line.split(",");
				Stocks stocks=new Stocks(params[0]);
				list.add(stocks);
			}
			br.close();
			showInfo(list);
		}
	}
	static void showInfo(ArrayList<Stocks> list) {
	for(Stocks s:list)	{
		s.showInfo();
	}
	}
}
class Stocks{
	String code;
	Stocks(String code){
		this.code=code;
	}
	void showInfo() {
		System.out.println(code);
	}
}

